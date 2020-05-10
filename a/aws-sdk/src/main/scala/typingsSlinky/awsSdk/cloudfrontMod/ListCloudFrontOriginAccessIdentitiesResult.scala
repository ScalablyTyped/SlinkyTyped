package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCloudFrontOriginAccessIdentitiesResult extends js.Object {
  /**
    * The CloudFrontOriginAccessIdentityList type. 
    */
  var CloudFrontOriginAccessIdentityList: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityList] = js.native
}

object ListCloudFrontOriginAccessIdentitiesResult {
  @scala.inline
  def apply(): ListCloudFrontOriginAccessIdentitiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCloudFrontOriginAccessIdentitiesResult]
  }
  @scala.inline
  implicit class ListCloudFrontOriginAccessIdentitiesResultOps[Self <: ListCloudFrontOriginAccessIdentitiesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudFrontOriginAccessIdentityList(value: CloudFrontOriginAccessIdentityList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFrontOriginAccessIdentityList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudFrontOriginAccessIdentityList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFrontOriginAccessIdentityList")(js.undefined)
        ret
    }
  }
  
}

