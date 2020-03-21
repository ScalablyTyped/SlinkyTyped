package typingsSlinky.astTypes

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

trait AnonImplements extends js.Object {
  var body: ClassBodyKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind | Null
  var implements: js.UndefOr[js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var superClass: js.UndefOr[ExpressionKind | Null] = js.undefined
  var superTypeParameters: js.UndefOr[TypeParameterInstantiationKind | TSTypeParameterInstantiationKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}

object AnonImplements {
  @scala.inline
  def apply(
    body: ClassBodyKind,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    implements: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind] = null,
    loc: SourceLocationKind = null,
    superClass: ExpressionKind = null,
    superTypeParameters: TypeParameterInstantiationKind | TSTypeParameterInstantiationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): AnonImplements = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implements != null) __obj.updateDynamic("implements")(implements.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (superClass != null) __obj.updateDynamic("superClass")(superClass.asInstanceOf[js.Any])
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImplements]
  }
}

