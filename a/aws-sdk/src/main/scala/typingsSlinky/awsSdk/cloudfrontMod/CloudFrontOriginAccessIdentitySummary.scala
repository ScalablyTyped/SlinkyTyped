package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontOriginAccessIdentitySummary extends js.Object {
  /**
    * The comment for this origin access identity, as originally specified when created.
    */
  var Comment: String = js.native
  /**
    * The ID for the origin access identity. For example: E74FTE3AJFJ256A.
    */
  var Id: String = js.native
  /**
    * The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin access identity read permission to an object in Amazon S3.
    */
  var S3CanonicalUserId: String = js.native
}

object CloudFrontOriginAccessIdentitySummary {
  @scala.inline
  def apply(Comment: String, Id: String, S3CanonicalUserId: String): CloudFrontOriginAccessIdentitySummary = {
    val __obj = js.Dynamic.literal(Comment = Comment.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], S3CanonicalUserId = S3CanonicalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontOriginAccessIdentitySummary]
  }
  @scala.inline
  implicit class CloudFrontOriginAccessIdentitySummaryOps[Self <: CloudFrontOriginAccessIdentitySummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3CanonicalUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3CanonicalUserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

