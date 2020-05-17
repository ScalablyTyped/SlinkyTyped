package typingsSlinky.flatpickr.minMaxTimePluginMod

import typingsSlinky.flatpickr.globalsMod.global.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var defaults: MinMaxTime = js.native
  var tableDateFormat: String = js.native
  def formatDate(date: Date, f: String): String = js.native
}

object State {
  @scala.inline
  def apply(defaults: MinMaxTime, formatDate: (Date, String) => String, tableDateFormat: String): State = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], formatDate = js.Any.fromFunction2(formatDate), tableDateFormat = tableDateFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: MinMaxTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatDate(value: (Date, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTableDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

