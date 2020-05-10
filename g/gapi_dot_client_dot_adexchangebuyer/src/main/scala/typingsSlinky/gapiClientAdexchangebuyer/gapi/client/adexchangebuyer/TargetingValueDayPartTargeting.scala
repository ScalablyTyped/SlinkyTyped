package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetingValueDayPartTargeting extends js.Object {
  var dayParts: js.UndefOr[js.Array[TargetingValueDayPartTargetingDayPart]] = js.native
  var timeZoneType: js.UndefOr[String] = js.native
}

object TargetingValueDayPartTargeting {
  @scala.inline
  def apply(): TargetingValueDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueDayPartTargeting]
  }
  @scala.inline
  implicit class TargetingValueDayPartTargetingOps[Self <: TargetingValueDayPartTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayParts(value: js.Array[TargetingValueDayPartTargetingDayPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayParts")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneType")(js.undefined)
        ret
    }
  }
  
}

