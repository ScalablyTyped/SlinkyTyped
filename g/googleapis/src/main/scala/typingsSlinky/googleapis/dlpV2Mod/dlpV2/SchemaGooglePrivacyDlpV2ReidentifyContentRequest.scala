package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to re-identify an item.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ReidentifyContentRequest extends js.Object {
  /**
    * Configuration for the inspector.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
  /**
    * Optional template to use. Any configuration directly specified in
    * `inspect_config` will override those set in the template. Singular fields
    * that are set in this request will replace their corresponding fields in
    * the template. Repeated fields are appended. Singular sub-messages and
    * groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.native
  /**
    * The item to re-identify. Will be treated as text.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.native
  /**
    * Configuration for the re-identification of the content item. This field
    * shares the same proto message type that is used for de-identification,
    * however its usage here is for the reversal of the previous
    * de-identification. Re-identification is performed by examining the
    * transformations used to de-identify the items and executing the reverse.
    * This requires that only reversible transformations be provided here. The
    * reversible transformations are:   - `CryptoReplaceFfxFpeConfig`
    */
  var reidentifyConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyConfig] = js.native
  /**
    * Optional template to use. References an instance of `DeidentifyTemplate`.
    * Any configuration directly specified in `reidentify_config` or
    * `inspect_config` will override those set in the template. Singular fields
    * that are set in this request will replace their corresponding fields in
    * the template. Repeated fields are appended. Singular sub-messages and
    * groups are recursively merged.
    */
  var reidentifyTemplateName: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ReidentifyContentRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ReidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReidentifyContentRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ReidentifyContentRequestOps[Self <: SchemaGooglePrivacyDlpV2ReidentifyContentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspectConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withInspectTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspectTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectTemplateName")(js.undefined)
        ret
    }
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
    def withReidentifyConfig(value: SchemaGooglePrivacyDlpV2DeidentifyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reidentifyConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReidentifyConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reidentifyConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withReidentifyTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reidentifyTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReidentifyTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reidentifyTemplateName")(js.undefined)
        ret
    }
  }
  
}

