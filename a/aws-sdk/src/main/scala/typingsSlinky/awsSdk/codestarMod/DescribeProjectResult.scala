package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the project.
    */
  var arn: js.UndefOr[ProjectArn] = js.native
  /**
    * A user- or system-generated token that identifies the entity that requested project creation. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The date and time the project was created, in timestamp format.
    */
  var createdTimeStamp: js.UndefOr[js.Date] = js.native
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.native
  /**
    * The ID of the project.
    */
  var id: js.UndefOr[ProjectId] = js.native
  /**
    * The display name for the project.
    */
  var name: js.UndefOr[ProjectName] = js.native
  /**
    * The ID for the AWS CodeStar project template used to create the project.
    */
  var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.native
  /**
    * The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
    */
  var stackId: js.UndefOr[StackId] = js.native
  /**
    * The project creation or deletion status.
    */
  var status: js.UndefOr[ProjectStatus] = js.native
}

object DescribeProjectResult {
  @scala.inline
  def apply(): DescribeProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectResult]
  }
  @scala.inline
  implicit class DescribeProjectResultOps[Self <: DescribeProjectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: ProjectArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTimeStamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTimeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ProjectDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ProjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ProjectName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectTemplateId(value: ProjectTemplateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ProjectStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

