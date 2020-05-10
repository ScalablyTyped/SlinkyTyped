package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata extends js.Object {
  /** The time which this request was started. */
  var createTime: js.UndefOr[String] = js.native
  /** Privacy metric to compute. */
  var requestedPrivacyMetric: js.UndefOr[GooglePrivacyDlpV2beta1PrivacyMetric] = js.native
  /** Input dataset to compute metrics over. */
  var requestedSourceTable: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.native
}

object GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadataOps[Self <: GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata] (val x: Self) extends AnyVal {
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
    def withRequestedPrivacyMetric(value: GooglePrivacyDlpV2beta1PrivacyMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedPrivacyMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedPrivacyMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedPrivacyMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedSourceTable(value: GooglePrivacyDlpV2beta1BigQueryTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedSourceTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedSourceTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedSourceTable")(js.undefined)
        ret
    }
  }
  
}

