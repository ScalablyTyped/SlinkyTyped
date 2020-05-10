package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tuple of values for the quasi-identifier columns.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues extends js.Object {
  /**
    * The estimated probability that a given individual sharing these
    * quasi-identifier values is in the dataset. This value, typically called
    * δ, is the ratio between the number of records in the dataset with these
    * quasi-identifier values, and the total number of individuals (inside
    * *and* outside the dataset) with these quasi-identifier values. For
    * example, if there are 15 individuals in the dataset who share the same
    * quasi-identifier values, and an estimated 100 people in the entire
    * population with these values, then δ is 0.15.
    */
  var estimatedProbability: js.UndefOr[Double] = js.native
  /**
    * The quasi-identifier values.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}

object SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesOps[Self <: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedProbability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedProbability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedProbability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedProbability")(js.undefined)
        ret
    }
    @scala.inline
    def withQuasiIdsValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quasiIdsValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuasiIdsValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quasiIdsValues")(js.undefined)
        ret
    }
  }
  
}

