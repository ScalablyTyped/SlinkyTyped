package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest extends js.Object {
  /** Privacy metric to compute. */
  var privacyMetric: js.UndefOr[GooglePrivacyDlpV2beta1PrivacyMetric] = js.native
  /** Input dataset to compute metrics over. */
  var sourceTable: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.native
}

object GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequestOps[Self <: GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivacyMetric(value: GooglePrivacyDlpV2beta1PrivacyMetric): Self = {
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
    def withSourceTable(value: GooglePrivacyDlpV2beta1BigQueryTable): Self = {
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

