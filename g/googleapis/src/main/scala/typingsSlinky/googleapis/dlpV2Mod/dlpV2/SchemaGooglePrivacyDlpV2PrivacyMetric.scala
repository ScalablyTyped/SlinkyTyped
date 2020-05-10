package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Privacy metric to compute for reidentification risk analysis.
  */
@js.native
trait SchemaGooglePrivacyDlpV2PrivacyMetric extends js.Object {
  var categoricalStatsConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CategoricalStatsConfig] = js.native
  var deltaPresenceEstimationConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig] = js.native
  var kAnonymityConfig: js.UndefOr[SchemaGooglePrivacyDlpV2KAnonymityConfig] = js.native
  var kMapEstimationConfig: js.UndefOr[SchemaGooglePrivacyDlpV2KMapEstimationConfig] = js.native
  var lDiversityConfig: js.UndefOr[SchemaGooglePrivacyDlpV2LDiversityConfig] = js.native
  var numericalStatsConfig: js.UndefOr[SchemaGooglePrivacyDlpV2NumericalStatsConfig] = js.native
}

object SchemaGooglePrivacyDlpV2PrivacyMetric {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PrivacyMetric]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2PrivacyMetricOps[Self <: SchemaGooglePrivacyDlpV2PrivacyMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalStatsConfig(value: SchemaGooglePrivacyDlpV2CategoricalStatsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalStatsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoricalStatsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalStatsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaPresenceEstimationConfig(value: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaPresenceEstimationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaPresenceEstimationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaPresenceEstimationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withKAnonymityConfig(value: SchemaGooglePrivacyDlpV2KAnonymityConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kAnonymityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKAnonymityConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kAnonymityConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withKMapEstimationConfig(value: SchemaGooglePrivacyDlpV2KMapEstimationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kMapEstimationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMapEstimationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kMapEstimationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLDiversityConfig(value: SchemaGooglePrivacyDlpV2LDiversityConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lDiversityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLDiversityConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lDiversityConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericalStatsConfig(value: SchemaGooglePrivacyDlpV2NumericalStatsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericalStatsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericalStatsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericalStatsConfig")(js.undefined)
        ret
    }
  }
  
}

