package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait SwitchCase extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var consequent: js.Array[StatementKind]
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var test: ExpressionKind | Null
  var `type`: typingsSlinky.astTypes.astTypesStrings.SwitchCase
}

object SwitchCase {
  @scala.inline
  def apply(
    consequent: js.Array[StatementKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.SwitchCase,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    test: ExpressionKind = null
  ): SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchCase]
  }
}

