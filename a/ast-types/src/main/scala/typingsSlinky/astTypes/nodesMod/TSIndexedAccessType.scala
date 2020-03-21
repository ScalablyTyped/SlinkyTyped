package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.TSType, 'type'> */
trait TSIndexedAccessType extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var indexType: TSTypeKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var objectType: TSTypeKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSIndexedAccessType
}

object TSIndexedAccessType {
  @scala.inline
  def apply(
    indexType: TSTypeKind,
    objectType: TSTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSIndexedAccessType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSIndexedAccessType]
  }
}

