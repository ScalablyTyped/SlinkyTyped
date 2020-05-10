package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateS3ResourcesRequest extends js.Object {
  /**
    * The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon Macie. 
    */
  var associatedS3Resources: S3Resources = js.native
  /**
    * The ID of the Amazon Macie member account whose resources you want to remove from being monitored by Amazon Macie. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.native
}

object DisassociateS3ResourcesRequest {
  @scala.inline
  def apply(associatedS3Resources: S3Resources): DisassociateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(associatedS3Resources = associatedS3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateS3ResourcesRequest]
  }
  @scala.inline
  implicit class DisassociateS3ResourcesRequestOps[Self <: DisassociateS3ResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedS3Resources(value: S3Resources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedS3Resources")(value.asInstanceOf[js.Any])
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

