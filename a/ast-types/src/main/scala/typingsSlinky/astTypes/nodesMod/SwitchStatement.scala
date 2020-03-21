package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SwitchCaseKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Statement, 'type'> */
trait SwitchStatement extends ASTNode {
  var cases: js.Array[SwitchCaseKind]
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var discriminant: ExpressionKind
  var lexical: Boolean
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.SwitchStatement
}

object SwitchStatement {
  @scala.inline
  def apply(
    cases: js.Array[SwitchCaseKind],
    discriminant: ExpressionKind,
    lexical: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.SwitchStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], lexical = lexical.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchStatement]
  }
}

