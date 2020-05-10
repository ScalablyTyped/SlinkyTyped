package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassicLinkDnsSupport extends js.Object {
  /**
    * Indicates whether ClassicLink DNS support is enabled for the VPC.
    */
  var ClassicLinkDnsSupported: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object ClassicLinkDnsSupport {
  @scala.inline
  def apply(): ClassicLinkDnsSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLinkDnsSupport]
  }
  @scala.inline
  implicit class ClassicLinkDnsSupportOps[Self <: ClassicLinkDnsSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassicLinkDnsSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassicLinkDnsSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassicLinkDnsSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassicLinkDnsSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

