package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCloudFrontOriginAccessIdentityResult extends js.Object {
  /**
    * The origin access identity's information.
    */
  var CloudFrontOriginAccessIdentity: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentity] = js.native
  /**
    * The current version of the origin access identity created.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The fully qualified URI of the new origin access identity just created. For example: https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateCloudFrontOriginAccessIdentityResult {
  @scala.inline
  def apply(): CreateCloudFrontOriginAccessIdentityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCloudFrontOriginAccessIdentityResult]
  }
  @scala.inline
  implicit class CreateCloudFrontOriginAccessIdentityResultOps[Self <: CreateCloudFrontOriginAccessIdentityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudFrontOriginAccessIdentity(value: CloudFrontOriginAccessIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFrontOriginAccessIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudFrontOriginAccessIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFrontOriginAccessIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutETag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(js.undefined)
        ret
    }
  }
  
}

