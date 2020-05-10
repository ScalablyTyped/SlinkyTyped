package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateCredentialReportResponse extends js.Object {
  /**
    * Information about the credential report.
    */
  var Description: js.UndefOr[ReportStateDescriptionType] = js.native
  /**
    * Information about the state of the credential report.
    */
  var State: js.UndefOr[ReportStateType] = js.native
}

object GenerateCredentialReportResponse {
  @scala.inline
  def apply(): GenerateCredentialReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateCredentialReportResponse]
  }
  @scala.inline
  implicit class GenerateCredentialReportResponseOps[Self <: GenerateCredentialReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: ReportStateDescriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ReportStateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

