package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGooglePrivacyDlpV2TimeZone extends js.Object {
  /**
    * Set only if the offset can be determined. Positive for time ahead of UTC.
    * E.g. For &quot;UTC-9&quot;, this value is -540.
    */
  var offsetMinutes: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2TimeZone {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimeZone]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TimeZoneOps[Self <: SchemaGooglePrivacyDlpV2TimeZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffsetMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetMinutes")(js.undefined)
        ret
    }
  }
  
}

