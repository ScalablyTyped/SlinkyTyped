package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results of an inspect DataSource job.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectDataSourceDetails extends js.Object {
  /**
    * The configuration used for this job.
    */
  var requestedOptions: js.UndefOr[SchemaGooglePrivacyDlpV2RequestedOptions] = js.native
  /**
    * A summary of the outcome of this inspect job.
    */
  var result: js.UndefOr[SchemaGooglePrivacyDlpV2Result] = js.native
}

object SchemaGooglePrivacyDlpV2InspectDataSourceDetails {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectDataSourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectDataSourceDetails]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectDataSourceDetailsOps[Self <: SchemaGooglePrivacyDlpV2InspectDataSourceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestedOptions(value: SchemaGooglePrivacyDlpV2RequestedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: SchemaGooglePrivacyDlpV2Result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

