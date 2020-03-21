package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait ObjectTypeInternalSlot extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var method: Boolean
  var optional: Boolean
  var static: Boolean
  var `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeInternalSlot
  var value: FlowTypeKind
}

object ObjectTypeInternalSlot {
  @scala.inline
  def apply(
    id: IdentifierKind,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeInternalSlot,
    value: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ObjectTypeInternalSlot = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeInternalSlot]
  }
}

