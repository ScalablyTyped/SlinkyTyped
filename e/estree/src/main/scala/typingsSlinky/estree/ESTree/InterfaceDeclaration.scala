package typingsSlinky.estree.ESTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ @js.native
trait InterfaceDeclaration extends js.Object {
  var body: ObjectTypeAnnotation = js.native
  var `extends`: js.Array[InterfaceExtends] = js.native
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any = js.native
  var typeParameters: js.UndefOr[TypeParameterDeclaration | Null] = js.native
}

object InterfaceDeclaration {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    `extends`: js.Array[InterfaceExtends],
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
  ): InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDeclaration]
  }
  @scala.inline
  implicit class InterfaceDeclarationOps[Self <: InterfaceDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: ObjectTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtends(value: js.Array[InterfaceExtends]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParameters(value: TypeParameterDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(js.undefined)
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

