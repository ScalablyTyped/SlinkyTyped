package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkforceRequest extends js.Object {
  /**
    * The name of the private workforce whose access you want to restrict. WorkforceName is automatically set to default when a workforce is created and cannot be modified. 
    */
  var WorkforceName: typingsSlinky.awsSdk.sagemakerMod.WorkforceName = js.native
}

object DescribeWorkforceRequest {
  @scala.inline
  def apply(WorkforceName: WorkforceName): DescribeWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkforceRequest]
  }
  @scala.inline
  implicit class DescribeWorkforceRequestOps[Self <: DescribeWorkforceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkforceName(value: WorkforceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkforceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

