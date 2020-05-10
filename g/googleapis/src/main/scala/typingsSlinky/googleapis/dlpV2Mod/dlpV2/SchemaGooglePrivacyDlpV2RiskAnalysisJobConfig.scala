package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a risk analysis job. See
  * https://cloud.google.com/dlp/docs/concepts-risk-analysis to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig extends js.Object {
  /**
    * Actions to execute at the completion of the job. Are executed in the
    * order provided.
    */
  var actions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Action]] = js.native
  /**
    * Privacy metric to compute.
    */
  var privacyMetric: js.UndefOr[SchemaGooglePrivacyDlpV2PrivacyMetric] = js.native
  /**
    * Input dataset to compute metrics over.
    */
  var sourceTable: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}

object SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RiskAnalysisJobConfigOps[Self <: SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig] (val x: Self) extends AnyVal {
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
    def withPrivacyMetric(value: SchemaGooglePrivacyDlpV2PrivacyMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTable")(js.undefined)
        ret
    }
  }
  
}

