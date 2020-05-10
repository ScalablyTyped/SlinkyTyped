package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultDate extends js.Object {
  var date: js.Any = js.native
  var defaultDate: js.Any = js.native
}

object AnonDefaultDate {
  @scala.inline
  def apply(date: js.Any, defaultDate: js.Any): AnonDefaultDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultDate]
  }
  @scala.inline
  implicit class AnonDefaultDateOps[Self <: AnonDefaultDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

