package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation uses the default value that is specified in your template.
    */
  var ParameterKey: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ParameterKey] = js.native
  /**
    * The input value associated with the parameter.
    */
  var ParameterValue: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ParameterValue] = js.native
  /**
    * Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for  SSM parameter types in the template.
    */
  var ResolvedValue: js.UndefOr[ParameterValue] = js.native
  /**
    * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you specify true, do not specify a parameter value.
    */
  var UsePreviousValue: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.UsePreviousValue] = js.native
}

object Parameter {
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterKey(value: ParameterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterKey")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterValue(value: ParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterValue")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedValue(value: ParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePreviousValue(value: UsePreviousValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsePreviousValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePreviousValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsePreviousValue")(js.undefined)
        ret
    }
  }
  
}

