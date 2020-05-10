package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TypeParameterInstantiation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait TypeParameterInstantiation_
  extends Flow
     with BaseNode {
  var params: js.Array[FlowType] = js.native
  @JSName("type")
  var type_TypeParameterInstantiation_ : TypeParameterInstantiation = js.native
}

object TypeParameterInstantiation_ {
  @scala.inline
  def apply(params: js.Array[FlowType], `type`: TypeParameterInstantiation): TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterInstantiation_]
  }
  @scala.inline
  implicit class TypeParameterInstantiation_Ops[Self <: TypeParameterInstantiation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: js.Array[FlowType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TypeParameterInstantiation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

