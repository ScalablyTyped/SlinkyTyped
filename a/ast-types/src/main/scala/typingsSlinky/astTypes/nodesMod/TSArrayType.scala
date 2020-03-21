package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.TSType, 'type'> */
trait TSArrayType extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var elementType: TSTypeKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSArrayType
}

object TSArrayType {
  @scala.inline
  def apply(
    elementType: TSTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSArrayType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSArrayType]
  }
}

