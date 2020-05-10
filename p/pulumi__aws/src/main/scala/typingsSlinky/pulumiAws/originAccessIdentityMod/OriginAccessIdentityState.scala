package typingsSlinky.pulumiAws.originAccessIdentityMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginAccessIdentityState extends js.Object {
  /**
    * Internal value used by CloudFront to allow future
    * updates to the origin access identity.
    */
  val callerReference: js.UndefOr[Input[String]] = js.native
  /**
    * A shortcut to the full path for the
    * origin access identity to use in CloudFront, see below.
    */
  val cloudfrontAccessIdentityPath: js.UndefOr[Input[String]] = js.native
  /**
    * An optional comment for the origin access identity.
    */
  val comment: js.UndefOr[Input[String]] = js.native
  /**
    * The current version of the origin access identity's information.
    * For example: `E2QWRUHAPOMQZL`.
    */
  val etag: js.UndefOr[Input[String]] = js.native
  /**
    * A pre-generated ARN for use in S3 bucket policies (see below).
    * Example: `arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity
    * E2QWRUHAPOMQZL`.
    */
  val iamArn: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon S3 canonical user ID for the origin
    * access identity, which you use when giving the origin access identity read
    * permission to an object in Amazon S3.
    */
  val s3CanonicalUserId: js.UndefOr[Input[String]] = js.native
}

object OriginAccessIdentityState {
  @scala.inline
  def apply(): OriginAccessIdentityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginAccessIdentityState]
  }
  @scala.inline
  implicit class OriginAccessIdentityStateOps[Self <: OriginAccessIdentityState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerReference(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallerReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerReference")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudfrontAccessIdentityPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudfrontAccessIdentityPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudfrontAccessIdentityPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudfrontAccessIdentityPath")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withIamArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamArn")(js.undefined)
        ret
    }
    @scala.inline
    def withS3CanonicalUserId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3CanonicalUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3CanonicalUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3CanonicalUserId")(js.undefined)
        ret
    }
  }
  
}

