package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetTypeEnum extends js.Object {
  var ClassProperty: TargetType = js.native
  var ConstructorArgument: TargetType = js.native
  var Variable: TargetType = js.native
}

object TargetTypeEnum {
  @scala.inline
  def apply(ClassProperty: TargetType, ConstructorArgument: TargetType, Variable: TargetType): TargetTypeEnum = {
    val __obj = js.Dynamic.literal(ClassProperty = ClassProperty.asInstanceOf[js.Any], ConstructorArgument = ConstructorArgument.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTypeEnum]
  }
  @scala.inline
  implicit class TargetTypeEnumOps[Self <: TargetTypeEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassProperty(value: TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstructorArgument(value: TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstructorArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariable(value: TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

