package typingsSlinky.rmcNukaCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBeginValue extends js.Object {
  var beginValue: js.Any = js.native
  var delay: js.Any = js.native
  var duration: js.Any = js.native
  var easing: js.Any = js.native
  var endValue: js.Any = js.native
  var onEnd: js.Any = js.native
  var stackBehavior: js.Any = js.native
}

object AnonBeginValue {
  @scala.inline
  def apply(
    beginValue: js.Any,
    delay: js.Any,
    duration: js.Any,
    easing: js.Any,
    endValue: js.Any,
    onEnd: js.Any,
    stackBehavior: js.Any
  ): AnonBeginValue = {
    val __obj = js.Dynamic.literal(beginValue = beginValue.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], endValue = endValue.asInstanceOf[js.Any], onEnd = onEnd.asInstanceOf[js.Any], stackBehavior = stackBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeginValue]
  }
  @scala.inline
  implicit class AnonBeginValueOps[Self <: AnonBeginValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackBehavior(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackBehavior")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

