package typingsSlinky.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShowCounter extends js.Object {
  var defaultValue: js.Any = js.native
  var showCounter: Boolean = js.native
}

object AnonShowCounter {
  @scala.inline
  def apply(defaultValue: js.Any, showCounter: Boolean): AnonShowCounter = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], showCounter = showCounter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShowCounter]
  }
  @scala.inline
  implicit class AnonShowCounterOps[Self <: AnonShowCounter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCounter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCounter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

