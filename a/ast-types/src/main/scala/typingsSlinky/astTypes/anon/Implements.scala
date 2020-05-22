package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.ClassBodyKind
import typingsSlinky.astTypes.kindsMod.ClassImplementsKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSExpressionWithTypeArgumentsKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Implements extends js.Object {
  var body: ClassBodyKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind | Null
  var implements: js.UndefOr[js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var superClass: js.UndefOr[ExpressionKind | Null] = js.undefined
  var superTypeParameters: js.UndefOr[TypeParameterInstantiationKind | TSTypeParameterInstantiationKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}

object Implements {
  @scala.inline
  def apply(
    body: ClassBodyKind,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    id: IdentifierKind = null,
    implements: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind] = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    superClass: js.UndefOr[Null | ExpressionKind] = js.undefined,
    superTypeParameters: js.UndefOr[Null | TypeParameterInstantiationKind | TSTypeParameterInstantiationKind] = js.undefined,
    typeParameters: js.UndefOr[Null | TypeParameterDeclarationKind | TSTypeParameterDeclarationKind] = js.undefined
  ): Implements = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (implements != null) __obj.updateDynamic("implements")(implements.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(superClass)) __obj.updateDynamic("superClass")(superClass.asInstanceOf[js.Any])
    if (!js.isUndefined(superTypeParameters)) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Implements]
  }
}

