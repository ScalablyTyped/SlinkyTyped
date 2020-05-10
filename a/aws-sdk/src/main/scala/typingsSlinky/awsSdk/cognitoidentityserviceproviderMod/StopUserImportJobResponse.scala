package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopUserImportJobResponse extends js.Object {
  /**
    * The job object that represents the user import job.
    */
  var UserImportJob: js.UndefOr[UserImportJobType] = js.native
}

object StopUserImportJobResponse {
  @scala.inline
  def apply(): StopUserImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopUserImportJobResponse]
  }
  @scala.inline
  implicit class StopUserImportJobResponseOps[Self <: StopUserImportJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserImportJob(value: UserImportJobType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserImportJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserImportJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserImportJob")(js.undefined)
        ret
    }
  }
  
}

