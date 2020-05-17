package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait TypeParameterDeclaration_
  extends Flow
     with BaseNode {
  var params: js.Array[TypeParameter_] = js.native
  @JSName("type")
  var type_TypeParameterDeclaration_ : TypeParameterDeclaration = js.native
}

object TypeParameterDeclaration_ {
  @scala.inline
  def apply(params: js.Array[TypeParameter_], `type`: TypeParameterDeclaration): TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterDeclaration_]
  }
  @scala.inline
  implicit class TypeParameterDeclaration_Ops[Self <: TypeParameterDeclaration_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: js.Array[TypeParameter_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TypeParameterDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

