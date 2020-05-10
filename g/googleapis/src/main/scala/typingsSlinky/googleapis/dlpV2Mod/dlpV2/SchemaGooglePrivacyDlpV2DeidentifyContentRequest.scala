package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to de-identify a list of items.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeidentifyContentRequest extends js.Object {
  /**
    * Configuration for the de-identification of the content item. Items
    * specified here will override the template referenced by the
    * deidentify_template_name argument.
    */
  var deidentifyConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyConfig] = js.native
  /**
    * Optional template to use. Any configuration directly specified in
    * deidentify_config will override those set in the template. Singular
    * fields that are set in this request will replace their corresponding
    * fields in the template. Repeated fields are appended. Singular
    * sub-messages and groups are recursively merged.
    */
  var deidentifyTemplateName: js.UndefOr[String] = js.native
  /**
    * Configuration for the inspector. Items specified here will override the
    * template referenced by the inspect_template_name argument.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
  /**
    * Optional template to use. Any configuration directly specified in
    * inspect_config will override those set in the template. Singular fields
    * that are set in this request will replace their corresponding fields in
    * the template. Repeated fields are appended. Singular sub-messages and
    * groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.native
  /**
    * The item to de-identify. Will be treated as text.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.native
}

object SchemaGooglePrivacyDlpV2DeidentifyContentRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyContentRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeidentifyContentRequestOps[Self <: SchemaGooglePrivacyDlpV2DeidentifyContentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeidentifyConfig(value: SchemaGooglePrivacyDlpV2DeidentifyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deidentifyConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeidentifyConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deidentifyConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDeidentifyTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deidentifyTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeidentifyTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deidentifyTemplateName")(js.undefined)
        ret
    }
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
  }
  
}

