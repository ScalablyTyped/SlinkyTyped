package typingsSlinky.astDashTypes

import typingsSlinky.astDashTypes.astDashTypesStrings.`++`
import typingsSlinky.astDashTypes.astDashTypesStrings.`--`
import typingsSlinky.astDashTypes.genKindsMod.CommentKind
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentCommentsLoc extends js.Object {
  var argument: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: `++` | `--`
  var prefix: Boolean
}

object Anon_ArgumentCommentsLoc {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: `++` | `--`,
    prefix: Boolean,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_ArgumentCommentsLoc = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgumentCommentsLoc]
  }
}

