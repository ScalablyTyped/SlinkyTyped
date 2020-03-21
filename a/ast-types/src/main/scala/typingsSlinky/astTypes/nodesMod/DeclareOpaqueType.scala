package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.TypeAlias, 'type'> */
trait DeclareOpaqueType extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var right: FlowTypeKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclareOpaqueType
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind] = js.undefined
}

object DeclareOpaqueType {
  @scala.inline
  def apply(
    id: IdentifierKind,
    right: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareOpaqueType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): DeclareOpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareOpaqueType]
  }
}

