package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DhcpOptions extends js.Object {
  /**
    * One or more DHCP options in the set.
    */
  var DhcpConfigurations: js.UndefOr[DhcpConfigurationList] = js.native
  /**
    * The ID of the set of DHCP options.
    */
  var DhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the DHCP options set.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object DhcpOptions {
  @scala.inline
  def apply(): DhcpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DhcpOptions]
  }
  @scala.inline
  implicit class DhcpOptionsOps[Self <: DhcpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDhcpConfigurations(value: DhcpConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DhcpConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDhcpConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DhcpConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withDhcpOptionsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DhcpOptionsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDhcpOptionsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DhcpOptionsId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

