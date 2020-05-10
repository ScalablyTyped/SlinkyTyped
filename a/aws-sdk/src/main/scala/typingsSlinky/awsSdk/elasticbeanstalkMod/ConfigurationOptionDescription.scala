package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationOptionDescription extends js.Object {
  /**
    * An indication of which action is required if the value for this configuration option changes:    NoInterruption : There is no interruption to the environment or application availability.    RestartEnvironment : The environment is entirely restarted, all AWS resources are deleted and recreated, and the environment is unavailable during the process.    RestartApplicationServer : The environment is available the entire time. However, a short application outage occurs when the application servers on the running Amazon EC2 instances are restarted.  
    */
  var ChangeSeverity: js.UndefOr[ConfigurationOptionSeverity] = js.native
  /**
    * The default value for this configuration option.
    */
  var DefaultValue: js.UndefOr[ConfigurationOptionDefaultValue] = js.native
  /**
    * If specified, the configuration option must be a string value no longer than this value.
    */
  var MaxLength: js.UndefOr[OptionRestrictionMaxLength] = js.native
  /**
    * If specified, the configuration option must be a numeric value less than this value.
    */
  var MaxValue: js.UndefOr[OptionRestrictionMaxValue] = js.native
  /**
    * If specified, the configuration option must be a numeric value greater than this value.
    */
  var MinValue: js.UndefOr[OptionRestrictionMinValue] = js.native
  /**
    * The name of the configuration option.
    */
  var Name: js.UndefOr[ConfigurationOptionName] = js.native
  /**
    * A unique namespace identifying the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.native
  /**
    * If specified, the configuration option must be a string value that satisfies this regular expression.
    */
  var Regex: js.UndefOr[OptionRestrictionRegex] = js.native
  /**
    * An indication of whether the user defined this configuration option:    true : This configuration option was defined by the user. It is a valid choice for specifying if this as an Option to Remove when updating configuration settings.     false : This configuration was not defined by the user.    Constraint: You can remove only UserDefined options from a configuration.   Valid Values: true | false 
    */
  var UserDefined: js.UndefOr[UserDefinedOption] = js.native
  /**
    * If specified, values for the configuration option are selected from this list.
    */
  var ValueOptions: js.UndefOr[ConfigurationOptionPossibleValues] = js.native
  /**
    * An indication of which type of values this option has and whether it is allowable to select one or more than one of the possible values:    Scalar : Values for this option are a single selection from the possible values, or an unformatted string, or numeric value governed by the MIN/MAX/Regex constraints.    List : Values for this option are multiple selections from the possible values.    Boolean : Values for this option are either true or false .    Json : Values for this option are a JSON representation of a ConfigDocument.  
    */
  var ValueType: js.UndefOr[ConfigurationOptionValueType] = js.native
}

object ConfigurationOptionDescription {
  @scala.inline
  def apply(): ConfigurationOptionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionDescription]
  }
  @scala.inline
  implicit class ConfigurationOptionDescriptionOps[Self <: ConfigurationOptionDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSeverity(value: ConfigurationOptionSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSeverity")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: ConfigurationOptionDefaultValue): Self = {
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
    def withMaxLength(value: OptionRestrictionMaxLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: OptionRestrictionMaxValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: OptionRestrictionMinValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinValue")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ConfigurationOptionName): Self = {
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
    def withNamespace(value: OptionNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: OptionRestrictionRegex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Regex")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDefined(value: UserDefinedOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDefined")(js.undefined)
        ret
    }
    @scala.inline
    def withValueOptions(value: ConfigurationOptionPossibleValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withValueType(value: ConfigurationOptionValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueType")(js.undefined)
        ret
    }
  }
  
}

