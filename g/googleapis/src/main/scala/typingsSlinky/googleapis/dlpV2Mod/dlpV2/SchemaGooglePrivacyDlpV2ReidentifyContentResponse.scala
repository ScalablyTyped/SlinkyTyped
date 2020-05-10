package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of re-identifying a item.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ReidentifyContentResponse extends js.Object {
  /**
    * The re-identified item.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.native
  /**
    * An overview of the changes that were made to the `item`.
    */
  var overview: js.UndefOr[SchemaGooglePrivacyDlpV2TransformationOverview] = js.native
}

object SchemaGooglePrivacyDlpV2ReidentifyContentResponse {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ReidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReidentifyContentResponse]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ReidentifyContentResponseOps[Self <: SchemaGooglePrivacyDlpV2ReidentifyContentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: SchemaGooglePrivacyDlpV2ContentItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withOverview(value: SchemaGooglePrivacyDlpV2TransformationOverview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
  }
  
}

