package typingsSlinky.astTypes.nodesMod

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

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait ClassDeclaration extends ASTNode {
  var body: ClassBodyKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: IdentifierKind | Null
  var implements: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var superClass: ExpressionKind | Null
  var superTypeParameters: TypeParameterInstantiationKind | TSTypeParameterInstantiationKind | Null
  var `type`: typingsSlinky.astTypes.astTypesStrings.ClassDeclaration
  var typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null
}

object ClassDeclaration {
  @scala.inline
  def apply(
    body: ClassBodyKind,
    implements: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassDeclaration,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    superClass: ExpressionKind = null,
    superTypeParameters: TypeParameterInstantiationKind | TSTypeParameterInstantiationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (superClass != null) __obj.updateDynamic("superClass")(superClass.asInstanceOf[js.Any])
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassDeclaration]
  }
}

