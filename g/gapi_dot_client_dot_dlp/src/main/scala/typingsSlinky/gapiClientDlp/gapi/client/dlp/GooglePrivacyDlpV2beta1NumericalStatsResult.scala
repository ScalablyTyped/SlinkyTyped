package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1NumericalStatsResult extends js.Object {
  /** Maximum value appearing in the column. */
  var maxValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
  /** Minimum value appearing in the column. */
  var minValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
  /**
    * List of 99 values that partition the set of field values into 100 equal
    * sized buckets.
    */
  var quantileValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.native
}

object GooglePrivacyDlpV2beta1NumericalStatsResult {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1NumericalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1NumericalStatsResult]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1NumericalStatsResultOps[Self <: GooglePrivacyDlpV2beta1NumericalStatsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxValue(value: GooglePrivacyDlpV2beta1Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: GooglePrivacyDlpV2beta1Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantileValues(value: js.Array[GooglePrivacyDlpV2beta1Value]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantileValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantileValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantileValues")(js.undefined)
        ret
    }
  }
  
}

