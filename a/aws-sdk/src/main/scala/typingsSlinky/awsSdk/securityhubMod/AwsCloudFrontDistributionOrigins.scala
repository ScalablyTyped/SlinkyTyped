package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudFrontDistributionOrigins extends js.Object {
  /**
    * A complex type that contains origins or origin groups for this distribution.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginItemList] = js.native
}

object AwsCloudFrontDistributionOrigins {
  @scala.inline
  def apply(): AwsCloudFrontDistributionOrigins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOrigins]
  }
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginsOps[Self <: AwsCloudFrontDistributionOrigins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: AwsCloudFrontDistributionOriginItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(js.undefined)
        ret
    }
  }
  
}

