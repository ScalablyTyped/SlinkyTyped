package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateS3ResourcesRequest extends js.Object {
  /**
    * The ID of the Amazon Macie member account whose resources you want to associate with Macie. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.native
  /**
    * The S3 resources that you want to associate with Amazon Macie for monitoring and data classification. 
    */
  var s3Resources: S3ResourcesClassification = js.native
}

object AssociateS3ResourcesRequest {
  @scala.inline
  def apply(s3Resources: S3ResourcesClassification): AssociateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(s3Resources = s3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateS3ResourcesRequest]
  }
  @scala.inline
  implicit class AssociateS3ResourcesRequestOps[Self <: AssociateS3ResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Resources(value: S3ResourcesClassification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberAccountId(value: AWSAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberAccountId")(js.undefined)
        ret
    }
  }
  
}

