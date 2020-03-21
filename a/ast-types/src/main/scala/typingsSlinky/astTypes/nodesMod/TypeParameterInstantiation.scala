package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait TypeParameterInstantiation extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var params: js.Array[FlowTypeKind]
  var `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameterInstantiation
}

object TypeParameterInstantiation {
  @scala.inline
  def apply(
    params: js.Array[FlowTypeKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameterInstantiation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterInstantiation]
  }
}

