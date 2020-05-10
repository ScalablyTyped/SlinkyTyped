package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOptionSetting extends js.Object {
  /**
    * Indicates the acceptable values for the option group option.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * The DB engine specific parameter type for the option group option.
    */
  var ApplyType: js.UndefOr[String] = js.native
  /**
    * The default value for the option group option.
    */
  var DefaultValue: js.UndefOr[String] = js.native
  /**
    * Boolean value where true indicates that this option group option can be changed from the default value.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  /**
    * Boolean value where true indicates that a value must be specified for this option setting of the option group option.
    */
  var IsRequired: js.UndefOr[Boolean] = js.native
  /**
    * The minimum DB engine version required for the corresponding allowed value for this option setting.
    */
  var MinimumEngineVersionPerAllowedValue: js.UndefOr[MinimumEngineVersionPerAllowedValueList] = js.native
  /**
    * The description of the option group option.
    */
  var SettingDescription: js.UndefOr[String] = js.native
  /**
    * The name of the option group option.
    */
  var SettingName: js.UndefOr[String] = js.native
}

object OptionGroupOptionSetting {
  @scala.inline
  def apply(): OptionGroupOptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupOptionSetting]
  }
  @scala.inline
  implicit class OptionGroupOptionSettingOps[Self <: OptionGroupOptionSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModifiable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsModifiable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModifiable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsModifiable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumEngineVersionPerAllowedValue(value: MinimumEngineVersionPerAllowedValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumEngineVersionPerAllowedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumEngineVersionPerAllowedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumEngineVersionPerAllowedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingName")(js.undefined)
        ret
    }
  }
  
}

