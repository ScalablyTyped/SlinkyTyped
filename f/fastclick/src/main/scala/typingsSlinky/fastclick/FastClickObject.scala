package typingsSlinky.fastclick

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastClickObject extends js.Object {
  var lastTouchIdentifier: Double = js.native
  var layer: Element = js.native
  var tapDelay: Double = js.native
  var targetElement: js.Any = js.native
  var touchBoundary: Double = js.native
  var touchStartX: Double = js.native
  var touchStartY: Double = js.native
  var trackingClick: Boolean = js.native
  var trackingClickStart: Double = js.native
  def destroy(): Unit = js.native
  def determineEventType(targetElement: js.Any): String = js.native
  def findControl(labelElement: js.Any): js.Any = js.native
  def focus(targetElement: js.Any): Unit = js.native
  def getTargetElementFromEventTarget(eventTarget: EventTarget): js.Any = js.native
  def needsClick(target: js.Any): Boolean = js.native
  def needsFocus(target: js.Any): Boolean = js.native
}

object FastClickObject {
  @scala.inline
  def apply(
    destroy: () => Unit,
    determineEventType: js.Any => String,
    findControl: js.Any => js.Any,
    focus: js.Any => Unit,
    getTargetElementFromEventTarget: EventTarget => js.Any,
    lastTouchIdentifier: Double,
    layer: Element,
    needsClick: js.Any => Boolean,
    needsFocus: js.Any => Boolean,
    tapDelay: Double,
    targetElement: js.Any,
    touchBoundary: Double,
    touchStartX: Double,
    touchStartY: Double,
    trackingClick: Boolean,
    trackingClickStart: Double
  ): FastClickObject = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), determineEventType = js.Any.fromFunction1(determineEventType), findControl = js.Any.fromFunction1(findControl), focus = js.Any.fromFunction1(focus), getTargetElementFromEventTarget = js.Any.fromFunction1(getTargetElementFromEventTarget), lastTouchIdentifier = lastTouchIdentifier.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], needsClick = js.Any.fromFunction1(needsClick), needsFocus = js.Any.fromFunction1(needsFocus), tapDelay = tapDelay.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any], touchBoundary = touchBoundary.asInstanceOf[js.Any], touchStartX = touchStartX.asInstanceOf[js.Any], touchStartY = touchStartY.asInstanceOf[js.Any], trackingClick = trackingClick.asInstanceOf[js.Any], trackingClickStart = trackingClickStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastClickObject]
  }
  @scala.inline
  implicit class FastClickObjectOps[Self <: FastClickObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetermineEventType(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("determineEventType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindControl(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findControl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFocus(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTargetElementFromEventTarget(value: EventTarget => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetElementFromEventTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLastTouchIdentifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTouchIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedsClick(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNeedsFocus(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTapDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchBoundary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStartX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchStartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStartY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackingClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackingClickStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingClickStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

