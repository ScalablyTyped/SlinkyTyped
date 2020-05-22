package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Statement, 'type'> */
trait BreakStatement extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var label: IdentifierKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.BreakStatement
}

object BreakStatement {
  @scala.inline
  def apply(
    `type`: typingsSlinky.astTypes.astTypesStrings.BreakStatement,
    comments: js.Array[CommentKind] = null,
    label: IdentifierKind = null,
    loc: SourceLocationKind = null
  ): BreakStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakStatement]
  }
}

