package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Statement, 'type'> */
trait LabeledStatement extends ASTNode {
  var body: StatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var label: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.LabeledStatement
}

object LabeledStatement {
  @scala.inline
  def apply(
    body: StatementKind,
    label: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.LabeledStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledStatement]
  }
}

