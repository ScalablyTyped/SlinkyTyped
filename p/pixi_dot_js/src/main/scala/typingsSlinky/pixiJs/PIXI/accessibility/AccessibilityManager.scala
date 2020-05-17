package typingsSlinky.pixiJs.PIXI.accessibility

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.pixiJs.PIXI.AbstractRenderer
import typingsSlinky.pixiJs.PIXI.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Accessibility manager recreates the ability to tab and have content read by screen readers.
  * This is very important as it can possibly help people with disabilities access PixiJS content.
  *
  * A DisplayObject can be made accessible just like it can be made interactive. This manager will map the
  * events as if the mouse was being used, minimizing the effort required to implement.
  *
  * An instance of this class is automatically created by default, and can be found at `renderer.plugins.accessibility`
  *
  * @class
  * @memberof PIXI.accessibility
  */
@js.native
trait AccessibilityManager extends js.Object {
  /**
    * Setting this to true will visually show the divs.
    *
    * @type {boolean}
    */
  var debug: Boolean = js.native
  /**
    * A flag
    * @type {boolean}
    * @readonly
    */
  val isActive: Boolean = js.native
  /**
    * A flag
    * @type {boolean}
    * @readonly
    */
  val isMobileAccessibility: Boolean = js.native
  /**
    * The renderer this accessibility manager works for.
    *
    * @member {PIXI.AbstractRenderer} PIXI.accessibility.AccessibilityManager#renderer
    */
  var renderer: AbstractRenderer = js.native
  /**
    * Adjust the hit area based on the bounds of a display object
    *
    * @param {PIXI.Rectangle} hitArea - Bounds of the child
    */
  def capHitArea(hitArea: Rectangle): Unit = js.native
  /**
    * Destroys the accessibility manager
    *
    */
  def destroy(): Unit = js.native
  /**
    * private function that will visually add the information to the
    * accessability div
    *
    * @param {HTMLDivElement} div
    */
  def updateDebugHTML(div: HTMLDivElement): Unit = js.native
}

object AccessibilityManager {
  @scala.inline
  def apply(
    capHitArea: Rectangle => Unit,
    debug: Boolean,
    destroy: () => Unit,
    isActive: Boolean,
    isMobileAccessibility: Boolean,
    renderer: AbstractRenderer,
    updateDebugHTML: HTMLDivElement => Unit
  ): AccessibilityManager = {
    val __obj = js.Dynamic.literal(capHitArea = js.Any.fromFunction1(capHitArea), debug = debug.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isActive = isActive.asInstanceOf[js.Any], isMobileAccessibility = isMobileAccessibility.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], updateDebugHTML = js.Any.fromFunction1(updateDebugHTML))
    __obj.asInstanceOf[AccessibilityManager]
  }
  @scala.inline
  implicit class AccessibilityManagerOps[Self <: AccessibilityManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapHitArea(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capHitArea")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMobileAccessibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobileAccessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: AbstractRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDebugHTML(value: HTMLDivElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDebugHTML")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

