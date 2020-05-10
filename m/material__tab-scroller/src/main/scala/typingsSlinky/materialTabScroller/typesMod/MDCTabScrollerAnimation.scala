package typingsSlinky.materialTabScroller.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabScrollerAnimation extends js.Object {
  var finalScrollPosition: Double = js.native
  var scrollDelta: Double = js.native
}

object MDCTabScrollerAnimation {
  @scala.inline
  def apply(finalScrollPosition: Double, scrollDelta: Double): MDCTabScrollerAnimation = {
    val __obj = js.Dynamic.literal(finalScrollPosition = finalScrollPosition.asInstanceOf[js.Any], scrollDelta = scrollDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCTabScrollerAnimation]
  }
  @scala.inline
  implicit class MDCTabScrollerAnimationOps[Self <: MDCTabScrollerAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinalScrollPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalScrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDelta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

