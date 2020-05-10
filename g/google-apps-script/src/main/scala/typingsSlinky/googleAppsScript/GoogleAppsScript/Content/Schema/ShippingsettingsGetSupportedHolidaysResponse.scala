package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingsettingsGetSupportedHolidaysResponse extends js.Object {
  var holidays: js.UndefOr[js.Array[HolidaysHoliday]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object ShippingsettingsGetSupportedHolidaysResponse {
  @scala.inline
  def apply(): ShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsGetSupportedHolidaysResponse]
  }
  @scala.inline
  implicit class ShippingsettingsGetSupportedHolidaysResponseOps[Self <: ShippingsettingsGetSupportedHolidaysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHolidays(value: js.Array[HolidaysHoliday]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolidays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidays")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

