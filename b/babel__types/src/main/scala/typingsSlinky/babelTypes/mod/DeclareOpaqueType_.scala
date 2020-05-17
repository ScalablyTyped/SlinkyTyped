package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.DeclareOpaqueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait DeclareOpaqueType_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier_ = js.native
  var supertype: FlowType | Null = js.native
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  @JSName("type")
  var type_DeclareOpaqueType_ : DeclareOpaqueType = js.native
}

object DeclareOpaqueType_ {
  @scala.inline
  def apply(id: Identifier_, `type`: DeclareOpaqueType): DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareOpaqueType_]
  }
  @scala.inline
  implicit class DeclareOpaqueType_Ops[Self <: DeclareOpaqueType_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DeclareOpaqueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupertype(value: FlowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supertype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupertypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supertype")(null)
        ret
    }
    @scala.inline
    def withTypeParameters(value: TypeParameterDeclaration_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(null)
        ret
    }
  }
  
}

