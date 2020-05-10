package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the numerical stats computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2NumericalStatsResult extends js.Object {
  /**
    * Maximum value appearing in the column.
    */
  var maxValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  /**
    * Minimum value appearing in the column.
    */
  var minValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  /**
    * List of 99 values that partition the set of field values into 100 equal
    * sized buckets.
    */
  var quantileValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}

object SchemaGooglePrivacyDlpV2NumericalStatsResult {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2NumericalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2NumericalStatsResult]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2NumericalStatsResultOps[Self <: SchemaGooglePrivacyDlpV2NumericalStatsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxValue(value: SchemaGooglePrivacyDlpV2Value): Self = {
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
    def withMinValue(value: SchemaGooglePrivacyDlpV2Value): Self = {
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
    def withQuantileValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = {
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

