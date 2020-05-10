package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersTime extends js.Object {
  /**
    * ISO 8601 representation of time indicator: could be a duration, date or
    * exact datetime.
    */
  var timeIso8601: js.UndefOr[String] = js.native
  /**
    * Type of time indicator.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersTimeType] = js.native
}

object GoogleActionsV2OrdersTime {
  @scala.inline
  def apply(): GoogleActionsV2OrdersTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersTime]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersTimeOps[Self <: GoogleActionsV2OrdersTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeIso8601(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeIso8601")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeIso8601: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeIso8601")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsV2OrdersTimeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

