package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For use with `Date`, `Timestamp`, and `TimeOfDay`, extract or preserve a
  * portion of the value.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TimePartConfig extends js.Object {
  var partToExtract: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2TimePartConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TimePartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimePartConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TimePartConfigOps[Self <: SchemaGooglePrivacyDlpV2TimePartConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartToExtract(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partToExtract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartToExtract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partToExtract")(js.undefined)
        ret
    }
  }
  
}

