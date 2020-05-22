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
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrivateNameKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractAccess extends js.Object {
  var `abstract`: js.UndefOr[Boolean | Null] = js.undefined
  var access: js.UndefOr[public | `private` | `protected` | Null] = js.undefined
  var accessibility: js.UndefOr[public | `private` | `protected` | Null] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.undefined
  var expression: js.UndefOr[Boolean] = js.undefined
  var generator: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  var key: PrivateNameKind
  var kind: js.UndefOr[get | set | method | constructor] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  var params: js.Array[PatternKind]
  var rest: js.UndefOr[IdentifierKind | Null] = js.undefined
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
  var static: js.UndefOr[Boolean | Null] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}

object AbstractAccess {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    `abstract`: js.UndefOr[Null | Boolean] = js.undefined,
    access: js.UndefOr[Null | public | `private` | `protected`] = js.undefined,
    accessibility: js.UndefOr[Null | public | `private` | `protected`] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    computed: js.UndefOr[Boolean] = js.undefined,
    decorators: js.UndefOr[Null | js.Array[DecoratorKind]] = js.undefined,
    defaults: js.Array[ExpressionKind | Null] = null,
    expression: js.UndefOr[Boolean] = js.undefined,
    generator: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Null | IdentifierKind] = js.undefined,
    kind: get | set | method | constructor = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    optional: js.UndefOr[Null | Boolean] = js.undefined,
    rest: js.UndefOr[Null | IdentifierKind] = js.undefined,
    returnType: js.UndefOr[Null | TypeAnnotationKind | TSTypeAnnotationKind] = js.undefined,
    static: js.UndefOr[Null | Boolean] = js.undefined,
    typeParameters: js.UndefOr[Null | TypeParameterDeclarationKind | TSTypeParameterDeclarationKind] = js.undefined
  ): AbstractAccess = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (!js.isUndefined(access)) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibility)) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decorators)) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(rest)) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (!js.isUndefined(returnType)) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractAccess]
  }
}

