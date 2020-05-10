package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentParameterValue extends js.Object {
  /**
    * The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't specify the StringValue parameter.
    */
  var NumberValue: js.UndefOr[DoubleParameterValue] = js.native
  /**
    * The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't specify the NumberValue parameter.
    */
  var StringValue: js.UndefOr[StringParameterValue] = js.native
}

object TrialComponentParameterValue {
  @scala.inline
  def apply(): TrialComponentParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentParameterValue]
  }
  @scala.inline
  implicit class TrialComponentParameterValueOps[Self <: TrialComponentParameterValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberValue(value: DoubleParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: StringParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValue")(js.undefined)
        ret
    }
  }
  
}

