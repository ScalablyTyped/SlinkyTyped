package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tuple of values for the quasi-identifier columns.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues extends js.Object {
  /**
    * The estimated anonymity for these quasi-identifier values.
    */
  var estimatedAnonymity: js.UndefOr[String] = js.native
  /**
    * The quasi-identifier values.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}

object SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValuesOps[Self <: SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedAnonymity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedAnonymity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedAnonymity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedAnonymity")(js.undefined)
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

