package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DirectiveKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Statement, 'type'> */
trait BlockStatement extends ASTNode {
  var body: js.Array[StatementKind]
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var directives: js.Array[DirectiveKind]
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.BlockStatement
}

object BlockStatement {
  @scala.inline
  def apply(
    body: js.Array[StatementKind],
    directives: js.Array[DirectiveKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.BlockStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement]
  }
}

