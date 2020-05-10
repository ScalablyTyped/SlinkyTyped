package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workforce extends js.Object {
  /**
    * The most recent date that was used to successfully add one or more IP address ranges (CIDRs) to a private workforce's allow list.
    */
  var LastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * A list of one to four IP address ranges (CIDRs) to be added to the workforce allow list.
    */
  var SourceIpConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SourceIpConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the private workforce.
    */
  var WorkforceArn: typingsSlinky.awsSdk.sagemakerMod.WorkforceArn = js.native
  /**
    * The name of the private workforce whose access you want to restrict. WorkforceName is automatically set to default when a workforce is created and cannot be modified. 
    */
  var WorkforceName: typingsSlinky.awsSdk.sagemakerMod.WorkforceName = js.native
}

object Workforce {
  @scala.inline
  def apply(WorkforceArn: WorkforceArn, WorkforceName: WorkforceName): Workforce = {
    val __obj = js.Dynamic.literal(WorkforceArn = WorkforceArn.asInstanceOf[js.Any], WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workforce]
  }
  @scala.inline
  implicit class WorkforceOps[Self <: Workforce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkforceArn(value: WorkforceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkforceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkforceName(value: WorkforceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkforceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceIpConfig(value: SourceIpConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIpConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIpConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIpConfig")(js.undefined)
        ret
    }
  }
  
}

