package typingsSlinky.playcanvas.pc

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Touch
  * @classdesc A instance of a single point touch on a {@link pc.TouchDevice}.
  * @description Create a new Touch object from the browser Touch.
  * @param {Touch} touch - The browser Touch object.
  * @property {number} id The identifier of the touch.
  * @property {number} x The x co-ordinate relative to the element that the TouchDevice is attached to.
  * @property {number} y The y co-ordinate relative to the element that the TouchDevice is attached to.
  * @property {Element} target The target element of the touch event.
  * @property {Touch} touch The original browser Touch object.
  */
@js.native
trait Touch extends js.Object {
  /**
    * The identifier of the touch.
    */
  var id: Double = js.native
  /**
    * The target element of the touch event.
    */
  var target: Element = js.native
  /**
    * The original browser Touch object.
    */
  var touch: Touch = js.native
  /**
    * The x co-ordinate relative to the element that the TouchDevice is attached to.
    */
  var x: Double = js.native
  /**
    * The y co-ordinate relative to the element that the TouchDevice is attached to.
    */
  var y: Double = js.native
}

object Touch {
  @scala.inline
  def apply(id: Double, target: Element, touch: Touch, x: Double, y: Double): Touch = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch]
  }
  @scala.inline
  implicit class TouchOps[Self <: Touch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouch(value: Touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

