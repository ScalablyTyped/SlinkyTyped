package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1RiskAnalysisOperationResult extends js.Object {
  var categoricalStatsResult: js.UndefOr[GooglePrivacyDlpV2beta1CategoricalStatsResult] = js.native
  var kAnonymityResult: js.UndefOr[GooglePrivacyDlpV2beta1KAnonymityResult] = js.native
  var lDiversityResult: js.UndefOr[GooglePrivacyDlpV2beta1LDiversityResult] = js.native
  var numericalStatsResult: js.UndefOr[GooglePrivacyDlpV2beta1NumericalStatsResult] = js.native
}

object GooglePrivacyDlpV2beta1RiskAnalysisOperationResult {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1RiskAnalysisOperationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RiskAnalysisOperationResult]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1RiskAnalysisOperationResultOps[Self <: GooglePrivacyDlpV2beta1RiskAnalysisOperationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalStatsResult(value: GooglePrivacyDlpV2beta1CategoricalStatsResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalStatsResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoricalStatsResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalStatsResult")(js.undefined)
        ret
    }
    @scala.inline
    def withKAnonymityResult(value: GooglePrivacyDlpV2beta1KAnonymityResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kAnonymityResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKAnonymityResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kAnonymityResult")(js.undefined)
        ret
    }
    @scala.inline
    def withLDiversityResult(value: GooglePrivacyDlpV2beta1LDiversityResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lDiversityResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLDiversityResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lDiversityResult")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericalStatsResult(value: GooglePrivacyDlpV2beta1NumericalStatsResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericalStatsResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericalStatsResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericalStatsResult")(js.undefined)
        ret
    }
  }
  
}

