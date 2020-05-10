package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of inspecting an item.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectContentResponse extends js.Object {
  /**
    * The findings.
    */
  var result: js.UndefOr[SchemaGooglePrivacyDlpV2InspectResult] = js.native
}

object SchemaGooglePrivacyDlpV2InspectContentResponse {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectContentResponse]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectContentResponseOps[Self <: SchemaGooglePrivacyDlpV2InspectContentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: SchemaGooglePrivacyDlpV2InspectResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

