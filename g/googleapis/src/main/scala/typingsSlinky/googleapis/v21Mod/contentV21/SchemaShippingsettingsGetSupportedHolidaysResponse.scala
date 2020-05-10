package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaShippingsettingsGetSupportedHolidaysResponse extends js.Object {
  /**
    * A list of holidays applicable for delivery guarantees. May be empty.
    */
  var holidays: js.UndefOr[js.Array[SchemaHolidaysHoliday]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsGetSupportedHolidaysResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaShippingsettingsGetSupportedHolidaysResponse {
  @scala.inline
  def apply(): SchemaShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedHolidaysResponse]
  }
  @scala.inline
  implicit class SchemaShippingsettingsGetSupportedHolidaysResponseOps[Self <: SchemaShippingsettingsGetSupportedHolidaysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHolidays(value: js.Array[SchemaHolidaysHoliday]): Self = {
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

