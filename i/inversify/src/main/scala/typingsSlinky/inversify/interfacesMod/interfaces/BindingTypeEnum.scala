package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingTypeEnum extends js.Object {
  var ConstantValue: BindingType = js.native
  var Constructor: BindingType = js.native
  var DynamicValue: BindingType = js.native
  var Factory: BindingType = js.native
  var Function: BindingType = js.native
  var Instance: BindingType = js.native
  var Invalid: BindingType = js.native
  var Provider: BindingType = js.native
}

object BindingTypeEnum {
  @scala.inline
  def apply(
    ConstantValue: BindingType,
    Constructor: BindingType,
    DynamicValue: BindingType,
    Factory: BindingType,
    Function: BindingType,
    Instance: BindingType,
    Invalid: BindingType,
    Provider: BindingType
  ): BindingTypeEnum = {
    val __obj = js.Dynamic.literal(ConstantValue = ConstantValue.asInstanceOf[js.Any], Constructor = Constructor.asInstanceOf[js.Any], DynamicValue = DynamicValue.asInstanceOf[js.Any], Factory = Factory.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], Instance = Instance.asInstanceOf[js.Any], Invalid = Invalid.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingTypeEnum]
  }
  @scala.inline
  implicit class BindingTypeEnumOps[Self <: BindingTypeEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstantValue(value: BindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstantValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstructor(value: BindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamicValue(value: BindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactory(value: BindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunction(value: BindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: BindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid(value: BindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: BindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Provider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

