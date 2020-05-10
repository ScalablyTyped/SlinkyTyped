package typingsSlinky.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOption extends js.Object {
  /**
    * A list of DB Security Groups for which the option is enabled.
    */
  var dbSecurityGroupMemberships: js.UndefOr[js.Array[String]] = js.native
  /**
    * The Name of the Option (e.g. MEMCACHED).
    */
  var optionName: String = js.native
  /**
    * A list of option settings to apply.
    */
  var optionSettings: js.UndefOr[js.Array[OptionGroupOptionOptionSetting]] = js.native
  /**
    * The Port number when connecting to the Option (e.g. 11211).
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * The version of the option (e.g. 13.1.0.0).
    */
  var version: js.UndefOr[String] = js.native
  /**
    * A list of VPC Security Groups for which the option is enabled.
    */
  var vpcSecurityGroupMemberships: js.UndefOr[js.Array[String]] = js.native
}

object OptionGroupOption {
  @scala.inline
  def apply(optionName: String): OptionGroupOption = {
    val __obj = js.Dynamic.literal(optionName = optionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupOption]
  }
  @scala.inline
  implicit class OptionGroupOptionOps[Self <: OptionGroupOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbSecurityGroupMemberships(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSecurityGroupMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbSecurityGroupMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSecurityGroupMemberships")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionSettings(value: js.Array[OptionGroupOptionOptionSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupMemberships(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupMemberships")(js.undefined)
        ret
    }
  }
  
}

