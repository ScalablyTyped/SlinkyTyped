package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGooglePrivacyDlpV2InspectJobConfig extends js.Object {
  /**
    * Actions to execute at the completion of the job. Are executed in the
    * order provided.
    */
  var actions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Action]] = js.native
  /**
    * How and what to scan for.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
  /**
    * If provided, will be used as the default for all values in InspectConfig.
    * `inspect_config` will be merged into the values persisted as part of the
    * template.
    */
  var inspectTemplateName: js.UndefOr[String] = js.native
  /**
    * The data to scan.
    */
  var storageConfig: js.UndefOr[SchemaGooglePrivacyDlpV2StorageConfig] = js.native
}

object SchemaGooglePrivacyDlpV2InspectJobConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectJobConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectJobConfigOps[Self <: SchemaGooglePrivacyDlpV2InspectJobConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[SchemaGooglePrivacyDlpV2Action]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
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
    def withStorageConfig(value: SchemaGooglePrivacyDlpV2StorageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageConfig")(js.undefined)
        ret
    }
  }
  
}

