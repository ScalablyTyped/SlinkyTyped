package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/nodes.TSHasOptionalTypeParameters */
trait TSTypeAliasDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var declare: Boolean
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAliasDeclaration
  var typeAnnotation: TSTypeKind
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

object TSTypeAliasDeclaration {
  @scala.inline
  def apply(
    declare: Boolean,
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAliasDeclaration,
    typeAnnotation: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeAliasDeclaration]
  }
}

