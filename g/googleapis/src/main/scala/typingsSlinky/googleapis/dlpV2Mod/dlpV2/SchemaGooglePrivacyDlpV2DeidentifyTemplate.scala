package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The DeidentifyTemplates contains instructions on how to deidentify content.
  * See https://cloud.google.com/dlp/docs/concepts-templates to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeidentifyTemplate extends js.Object {
  /**
    * The creation timestamp of a inspectTemplate, output only field.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * ///////////// // The core content of the template  // ///////////////
    */
  var deidentifyConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyConfig] = js.native
  /**
    * Short description (max 256 chars).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Display name (max 256 chars).
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The template name. Output only.  The template will have one of the
    * following formats: `projects/PROJECT_ID/deidentifyTemplates/TEMPLATE_ID`
    * OR `organizations/ORGANIZATION_ID/deidentifyTemplates/TEMPLATE_ID`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The last update timestamp of a inspectTemplate, output only field.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2DeidentifyTemplate {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeidentifyTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeidentifyTemplateOps[Self <: SchemaGooglePrivacyDlpV2DeidentifyTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

