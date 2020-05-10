package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassExpression_
  extends Node
     with Class
     with Expression
     with Pureish
     with Scopable {
  var body: ClassBody_ = js.native
  var decorators: js.UndefOr[js.Array[Decorator_]] = js.native
  var id: Identifier_ = js.native
  var implements: js.UndefOr[js.Array[ClassImplements_]] = js.native
  var mixins: js.UndefOr[js.Array[_]] = js.native
  var superClass: Expression = js.native
  var superTypeParameters: js.UndefOr[TypeParameterInstantiation_] = js.native
  var typeParameters: js.UndefOr[TypeParameterDeclaration_] = js.native
  @JSName("type")
  var type_ClassExpression_ : ClassExpression = js.native
}

object ClassExpression_ {
  @scala.inline
  def apply(
    body: ClassBody_,
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    superClass: Expression,
    `type`: ClassExpression
  ): ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
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
    def withId(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperClass(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superClass")(value.asInstanceOf[js.Any])
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
    def withoutDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(js.undefined)
        ret
    }
    @scala.inline
    def withImplements(value: js.Array[ClassImplements_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implements")(js.undefined)
        ret
    }
    @scala.inline
    def withMixins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperTypeParameters(value: TypeParameterInstantiation_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superTypeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperTypeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superTypeParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeParameters(value: TypeParameterDeclaration_): Self = {
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
  }
  
}

