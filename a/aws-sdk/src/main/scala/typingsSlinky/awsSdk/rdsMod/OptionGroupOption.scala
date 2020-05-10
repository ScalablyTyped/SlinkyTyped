package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOption extends js.Object {
  /**
    * If the option requires a port, specifies the default port for the option.
    */
  var DefaultPort: js.UndefOr[IntegerOptional] = js.native
  /**
    * The description of the option.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the engine that this option can be applied to.
    */
  var EngineName: js.UndefOr[String] = js.native
  /**
    * Indicates the major engine version that the option is available for.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.native
  /**
    * The minimum required engine version for the option to be applied.
    */
  var MinimumRequiredMinorEngineVersion: js.UndefOr[String] = js.native
  /**
    * The name of the option.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The option settings that are available (and the default value) for each option in an option group.
    */
  var OptionGroupOptionSettings: js.UndefOr[OptionGroupOptionSettingsList] = js.native
  /**
    * The versions that are available for the option.
    */
  var OptionGroupOptionVersions: js.UndefOr[OptionGroupOptionVersionsList] = js.native
  /**
    * The options that conflict with this option.
    */
  var OptionsConflictsWith: js.UndefOr[typingsSlinky.awsSdk.rdsMod.OptionsConflictsWith] = js.native
  /**
    * The options that are prerequisites for this option.
    */
  var OptionsDependedOn: js.UndefOr[typingsSlinky.awsSdk.rdsMod.OptionsDependedOn] = js.native
  /**
    * Permanent options can never be removed from an option group. An option group containing a permanent option can't be removed from a DB instance.
    */
  var Permanent: js.UndefOr[Boolean] = js.native
  /**
    * Persistent options can't be removed from an option group while DB instances are associated with the option group. If you disassociate all DB instances from the option group, your can remove the persistent option from the option group.
    */
  var Persistent: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the option requires a port.
    */
  var PortRequired: js.UndefOr[Boolean] = js.native
  /**
    * If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use this option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by modifying your DB instance later. 
    */
  var RequiresAutoMinorEngineVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * If true, you can change the option to an earlier version of the option. This only applies to options that have different versions available. 
    */
  var SupportsOptionVersionDowngrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * If true, you can only use this option with a DB instance that is in a VPC. 
    */
  var VpcOnly: js.UndefOr[Boolean] = js.native
}

object OptionGroupOption {
  @scala.inline
  def apply(): OptionGroupOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupOption]
  }
  @scala.inline
  implicit class OptionGroupOptionOps[Self <: OptionGroupOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultPort(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultPort")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineName")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorEngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumRequiredMinorEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumRequiredMinorEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumRequiredMinorEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumRequiredMinorEngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionGroupOptionSettings(value: OptionGroupOptionSettingsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupOptionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupOptionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupOptionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionGroupOptionVersions(value: OptionGroupOptionVersionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupOptionVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupOptionVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupOptionVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsConflictsWith(value: OptionsConflictsWith): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionsConflictsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsConflictsWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionsConflictsWith")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsDependedOn(value: OptionsDependedOn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionsDependedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsDependedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionsDependedOn")(js.undefined)
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
    def withPortRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresAutoMinorEngineVersionUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresAutoMinorEngineVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresAutoMinorEngineVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresAutoMinorEngineVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsOptionVersionDowngrade(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsOptionVersionDowngrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsOptionVersionDowngrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsOptionVersionDowngrade")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcOnly")(js.undefined)
        ret
    }
  }
  
}

