package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateS3ResourcesRequest extends js.Object {
  /**
    * The AWS ID of the Amazon Macie member account whose S3 resources' classification types you want to update. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.native
  /**
    * The S3 resources whose classification types you want to update.
    */
  var s3ResourcesUpdate: S3ResourcesClassificationUpdate = js.native
}

object UpdateS3ResourcesRequest {
  @scala.inline
  def apply(s3ResourcesUpdate: S3ResourcesClassificationUpdate): UpdateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(s3ResourcesUpdate = s3ResourcesUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateS3ResourcesRequest]
  }
  @scala.inline
  implicit class UpdateS3ResourcesRequestOps[Self <: UpdateS3ResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3ResourcesUpdate(value: S3ResourcesClassificationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ResourcesUpdate")(value.asInstanceOf[js.Any])
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

