package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetApplicationsOutput extends js.Object {
  /**
    * Information about the applications.
    */
  var applicationsInfo: js.UndefOr[ApplicationsInfoList] = js.native
}

object BatchGetApplicationsOutput {
  @scala.inline
  def apply(): BatchGetApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetApplicationsOutput]
  }
  @scala.inline
  implicit class BatchGetApplicationsOutputOps[Self <: BatchGetApplicationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationsInfo(value: ApplicationsInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationsInfo")(js.undefined)
        ret
    }
  }
  
}

