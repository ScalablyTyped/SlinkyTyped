package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCloudFrontOriginAccessIdentityResult extends js.Object {
  /**
    * The origin access identity's information.
    */
  var CloudFrontOriginAccessIdentity: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentity] = js.native
  /**
    * The current version of the origin access identity's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}

object GetCloudFrontOriginAccessIdentityResult {
  @scala.inline
  def apply(): GetCloudFrontOriginAccessIdentityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityResult]
  }
  @scala.inline
  implicit class GetCloudFrontOriginAccessIdentityResultOps[Self <: GetCloudFrontOriginAccessIdentityResult] (val x: Self) extends AnyVal {
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
  }
  
}

