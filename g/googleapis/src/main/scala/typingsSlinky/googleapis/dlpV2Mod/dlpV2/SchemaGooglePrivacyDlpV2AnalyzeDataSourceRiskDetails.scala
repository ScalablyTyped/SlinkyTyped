package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of a risk analysis operation request.
  */
@js.native
trait SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails extends js.Object {
  var categoricalStatsResult: js.UndefOr[SchemaGooglePrivacyDlpV2CategoricalStatsResult] = js.native
  var deltaPresenceEstimationResult: js.UndefOr[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult] = js.native
  var kAnonymityResult: js.UndefOr[SchemaGooglePrivacyDlpV2KAnonymityResult] = js.native
  var kMapEstimationResult: js.UndefOr[SchemaGooglePrivacyDlpV2KMapEstimationResult] = js.native
  var lDiversityResult: js.UndefOr[SchemaGooglePrivacyDlpV2LDiversityResult] = js.native
  var numericalStatsResult: js.UndefOr[SchemaGooglePrivacyDlpV2NumericalStatsResult] = js.native
  /**
    * Privacy metric to compute.
    */
  var requestedPrivacyMetric: js.UndefOr[SchemaGooglePrivacyDlpV2PrivacyMetric] = js.native
  /**
    * Input dataset to compute metrics over.
    */
  var requestedSourceTable: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}

object SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsOps[Self <: SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalStatsResult(value: SchemaGooglePrivacyDlpV2CategoricalStatsResult): Self = {
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
    def withDeltaPresenceEstimationResult(value: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaPresenceEstimationResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaPresenceEstimationResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaPresenceEstimationResult")(js.undefined)
        ret
    }
    @scala.inline
    def withKAnonymityResult(value: SchemaGooglePrivacyDlpV2KAnonymityResult): Self = {
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
    def withKMapEstimationResult(value: SchemaGooglePrivacyDlpV2KMapEstimationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kMapEstimationResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMapEstimationResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kMapEstimationResult")(js.undefined)
        ret
    }
    @scala.inline
    def withLDiversityResult(value: SchemaGooglePrivacyDlpV2LDiversityResult): Self = {
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
    def withNumericalStatsResult(value: SchemaGooglePrivacyDlpV2NumericalStatsResult): Self = {
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
    @scala.inline
    def withRequestedPrivacyMetric(value: SchemaGooglePrivacyDlpV2PrivacyMetric): Self = {
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
    def withRequestedSourceTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = {
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

