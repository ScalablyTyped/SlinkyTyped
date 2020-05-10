package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.argumentArgumentMod._Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2DateTime extends _Argument {
  /**
    * Date value
    */
  var date: js.UndefOr[GoogleTypeDate] = js.native
  /**
    * Time value
    */
  var time: js.UndefOr[GoogleTypeTimeOfDay] = js.native
}

object GoogleActionsV2DateTime {
  @scala.inline
  def apply(): GoogleActionsV2DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DateTime]
  }
  @scala.inline
  implicit class GoogleActionsV2DateTimeOps[Self <: GoogleActionsV2DateTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: GoogleTypeDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: GoogleTypeTimeOfDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

