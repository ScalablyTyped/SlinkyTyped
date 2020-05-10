package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionSetting extends js.Object {
  /**
    * The allowed values of the option setting.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * The DB engine specific parameter type.
    */
  var ApplyType: js.UndefOr[String] = js.native
  /**
    * The data type of the option setting.
    */
  var DataType: js.UndefOr[String] = js.native
  /**
    * The default value of the option setting.
    */
  var DefaultValue: js.UndefOr[String] = js.native
  /**
    * The description of the option setting.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates if the option setting is part of a collection.
    */
  var IsCollection: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that, when true, indicates the option setting can be modified from the default.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  /**
    * The name of the option that has settings that you can set.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The current value of the option setting.
    */
  var Value: js.UndefOr[String] = js.native
}

object OptionSetting {
  @scala.inline
  def apply(): OptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionSetting]
  }
  @scala.inline
  implicit class OptionSettingOps[Self <: OptionSetting] (val x: Self) extends AnyVal {
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
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(js.undefined)
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
    def withIsCollection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCollection")(js.undefined)
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
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

