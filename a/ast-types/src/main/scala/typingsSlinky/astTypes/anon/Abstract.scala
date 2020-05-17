package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.astTypesStrings.`private`
import typingsSlinky.astTypes.astTypesStrings.`protected`
import typingsSlinky.astTypes.astTypesStrings.constructor
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.method
import typingsSlinky.astTypes.astTypesStrings.public
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DecoratorKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Abstract extends js.Object {
  var `abstract`: js.UndefOr[Boolean | Null] = js.native
  var access: js.UndefOr[public | `private` | `protected` | Null] = js.native
  var accessibility: js.UndefOr[public | `private` | `protected` | Null] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var body: BlockStatementKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var computed: js.UndefOr[Boolean] = js.native
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.native
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.native
  var expression: js.UndefOr[Boolean] = js.native
  var generator: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[IdentifierKind | Null] = js.native
  var key: LiteralKind | IdentifierKind | ExpressionKind = js.native
  var kind: js.UndefOr[get | set | method | constructor] = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var optional: js.UndefOr[Boolean | Null] = js.native
  var params: js.Array[PatternKind] = js.native
  var rest: js.UndefOr[IdentifierKind | Null] = js.native
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.native
  var static: js.UndefOr[Boolean | Null] = js.native
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.native
}

object Abstract {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind]
  ): Abstract = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abstract]
  }
  @scala.inline
  implicit class AbstractOps[Self <: Abstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: BlockStatementKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: LiteralKind | IdentifierKind | ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Array[PatternKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbstract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbstract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(js.undefined)
        ret
    }
    @scala.inline
    def withAbstractNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(null)
        ret
    }
    @scala.inline
    def withAccess(value: public | `private` | `protected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(null)
        ret
    }
    @scala.inline
    def withAccessibility(value: public | `private` | `protected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(null)
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: js.Array[CommentKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(null)
        ret
    }
    @scala.inline
    def withComputed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorators(value: js.Array[DecoratorKind]): Self = {
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
    def withDecoratorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(null)
        ret
    }
    @scala.inline
    def withDefaults(value: js.Array[ExpressionKind | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withExpression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: IdentifierKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
        ret
    }
    @scala.inline
    def withKind(value: get | set | method | constructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc(value: SourceLocationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
    @scala.inline
    def withLocNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(null)
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(null)
        ret
    }
    @scala.inline
    def withRest(value: IdentifierKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(js.undefined)
        ret
    }
    @scala.inline
    def withRestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(null)
        ret
    }
    @scala.inline
    def withReturnType(value: TypeAnnotationKind | TSTypeAnnotationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(null)
        ret
    }
    @scala.inline
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(null)
        ret
    }
    @scala.inline
    def withTypeParameters(value: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind): Self = {
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

