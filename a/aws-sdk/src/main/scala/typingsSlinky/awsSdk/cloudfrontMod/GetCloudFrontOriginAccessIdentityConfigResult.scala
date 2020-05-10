package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCloudFrontOriginAccessIdentityConfigResult extends js.Object {
  /**
    * The origin access identity's configuration information. 
    */
  var CloudFrontOriginAccessIdentityConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityConfig] = js.native
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}

object GetCloudFrontOriginAccessIdentityConfigResult {
  @scala.inline
  def apply(): GetCloudFrontOriginAccessIdentityConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigResult]
  }
  @scala.inline
  implicit class GetCloudFrontOriginAccessIdentityConfigResultOps[Self <: GetCloudFrontOriginAccessIdentityConfigResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFrontOriginAccessIdentityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudFrontOriginAccessIdentityConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFrontOriginAccessIdentityConfig")(js.undefined)
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

