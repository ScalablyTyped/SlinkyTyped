package typingsSlinky.astTypes.nodesMod

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

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Function, 'type' | 'body'> */
trait ClassMethod extends ASTNode {
  var `abstract`: Boolean | Null
  var access: public | `private` | `protected` | Null
  var accessibility: public | `private` | `protected` | Null
  var async: Boolean
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: Boolean
  var decorators: js.Array[DecoratorKind] | Null
  var defaults: js.Array[ExpressionKind | Null]
  var expression: Boolean
  var generator: Boolean
  var id: js.UndefOr[IdentifierKind] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: get | set | method | constructor
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var optional: Boolean | Null
  var params: js.Array[PatternKind]
  var rest: js.UndefOr[IdentifierKind] = js.undefined
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.undefined
  var static: Boolean | Null
  var `type`: typingsSlinky.astTypes.astTypesStrings.ClassMethod
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind] = js.undefined
}

object ClassMethod {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatementKind,
    computed: Boolean,
    defaults: js.Array[ExpressionKind | Null],
    expression: Boolean,
    generator: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: get | set | method | constructor,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassMethod,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    rest: IdentifierKind = null,
    returnType: TypeAnnotationKind | TSTypeAnnotationKind = null,
    static: js.UndefOr[Boolean] = js.undefined,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ClassMethod = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassMethod]
  }
}

