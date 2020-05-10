package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  /**
    * If the option requires access to a port, then this DB security group allows access to the port.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.native
  /**
    * The description of the option.
    */
  var OptionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[String] = js.native
  /**
    * The option settings for this option.
    */
  var OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.native
  /**
    * The version of the option.
    */
  var OptionVersion: js.UndefOr[String] = js.native
  /**
    * Indicate if this option is permanent.
    */
  var Permanent: js.UndefOr[Boolean] = js.native
  /**
    * Indicate if this option is persistent.
    */
  var Persistent: js.UndefOr[Boolean] = js.native
  /**
    * If required, the port configured for this option to use.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * If the option requires access to a port, then this VPC security group allows access to the port.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object Option {
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSecurityGroupMemberships(value: DBSecurityGroupMembershipList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroupMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSecurityGroupMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroupMemberships")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionName")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionSettings(value: OptionSettingConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPermanent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permanent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermanent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permanent")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Persistent")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupMemberships(value: VpcSecurityGroupMembershipList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupMemberships")(js.undefined)
        ret
    }
  }
  
}

