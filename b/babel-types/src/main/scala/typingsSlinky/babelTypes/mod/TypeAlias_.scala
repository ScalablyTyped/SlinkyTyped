package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAlias_
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier_ = js.native
  var right: FlowTypeAnnotation = js.native
  var typeParameters: TypeParameterDeclaration_ = js.native
  @JSName("type")
  var type_TypeAlias_ : TypeAlias = js.native
}

object TypeAlias_ {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    `type`: TypeAlias,
    typeParameters: TypeParameterDeclaration_
  ): TypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAlias_]
  }
  @scala.inline
  implicit class TypeAlias_Ops[Self <: TypeAlias_] (val x: Self) extends AnyVal {
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
    def withRight(value: FlowTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TypeAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParameters(value: TypeParameterDeclaration_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

