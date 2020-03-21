package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.FlowType, 'type'> */
trait IntersectionTypeAnnotation extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.IntersectionTypeAnnotation
  var types: js.Array[FlowTypeKind]
}

object IntersectionTypeAnnotation {
  @scala.inline
  def apply(
    `type`: typingsSlinky.astTypes.astTypesStrings.IntersectionTypeAnnotation,
    types: js.Array[FlowTypeKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): IntersectionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionTypeAnnotation]
  }
}

