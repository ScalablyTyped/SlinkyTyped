package typingsSlinky.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectRequest extends js.Object {
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId = js.native
  /**
    *  If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS CloudFormation stacks in the AWS Mobile Hub project. 
    */
  var syncFromResources: js.UndefOr[Boolean] = js.native
}

object DescribeProjectRequest {
  @scala.inline
  def apply(projectId: ProjectId): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  @scala.inline
  implicit class DescribeProjectRequestOps[Self <: DescribeProjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: ProjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncFromResources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncFromResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncFromResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncFromResources")(js.undefined)
        ret
    }
  }
  
}

