package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1PrivacyMetric extends js.Object {
  var categoricalStatsConfig: js.UndefOr[GooglePrivacyDlpV2beta1CategoricalStatsConfig] = js.native
  var kAnonymityConfig: js.UndefOr[GooglePrivacyDlpV2beta1KAnonymityConfig] = js.native
  var lDiversityConfig: js.UndefOr[GooglePrivacyDlpV2beta1LDiversityConfig] = js.native
  var numericalStatsConfig: js.UndefOr[GooglePrivacyDlpV2beta1NumericalStatsConfig] = js.native
}

object GooglePrivacyDlpV2beta1PrivacyMetric {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PrivacyMetric]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1PrivacyMetricOps[Self <: GooglePrivacyDlpV2beta1PrivacyMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalStatsConfig(value: GooglePrivacyDlpV2beta1CategoricalStatsConfig): Self = {
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
    def withKAnonymityConfig(value: GooglePrivacyDlpV2beta1KAnonymityConfig): Self = {
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
    def withLDiversityConfig(value: GooglePrivacyDlpV2beta1LDiversityConfig): Self = {
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
    def withNumericalStatsConfig(value: GooglePrivacyDlpV2beta1NumericalStatsConfig): Self = {
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

