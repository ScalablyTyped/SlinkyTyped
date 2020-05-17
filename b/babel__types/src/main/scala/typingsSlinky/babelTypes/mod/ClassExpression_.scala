package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait ClassExpression_
  extends Class
     with BaseNode
     with Expression
     with Scopable {
  var body: ClassBody_ = js.native
  var decorators: js.Array[Decorator_] | Null = js.native
  var id: Identifier_ | Null = js.native
  var implements: (js.Array[TSExpressionWithTypeArguments_ | ClassImplements_]) | Null = js.native
  var mixins: js.Any = js.native
  var superClass: Expression | Null = js.native
  var superTypeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null = js.native
  var typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ | Null = js.native
  @JSName("type")
  var type_ClassExpression_ : ClassExpression = js.native
}

object ClassExpression_ {
  @scala.inline
  def apply(body: ClassBody_, mixins: js.Any, `type`: ClassExpression): ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression_]
  }
  @scala.inline
  implicit class ClassExpression_Ops[Self <: ClassExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: ClassBody_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ClassExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecorators(value: js.Array[Decorator_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoratorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(null)
        ret
    }
    @scala.inline
    def withId(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
        ret
    }
    @scala.inline
    def withImplements(value: js.Array[TSExpressionWithTypeArguments_ | ClassImplements_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplementsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implements")(null)
        ret
    }
    @scala.inline
    def withSuperClass(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperClassNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superClass")(null)
        ret
    }
    @scala.inline
    def withSuperTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superTypeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperTypeParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superTypeParameters")(null)
        ret
    }
    @scala.inline
    def withTypeParameters(value: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_): Self = {
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

