package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionConfiguration extends js.Object {
  /**
    * A list of DBSecurityGroupMembership name strings used for this option.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList] = js.native
  /**
    * The configuration of options to include in a group.
    */
  var OptionName: String = js.native
  /**
    * The option settings to include in an option group.
    */
  var OptionSettings: js.UndefOr[OptionSettingsList] = js.native
  /**
    * The version for the option.
    */
  var OptionVersion: js.UndefOr[String] = js.native
  /**
    * The optional port for the option.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of VpcSecurityGroupMembership name strings used for this option.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object OptionConfiguration {
  @scala.inline
  def apply(OptionName: String): OptionConfiguration = {
    val __obj = js.Dynamic.literal(OptionName = OptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionConfiguration]
  }
  @scala.inline
  implicit class OptionConfigurationOps[Self <: OptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDBSecurityGroupMemberships(value: DBSecurityGroupNameList): Self = {
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
    def withOptionSettings(value: OptionSettingsList): Self = {
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
    def withVpcSecurityGroupMemberships(value: VpcSecurityGroupIdList): Self = {
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

