package typingsSlinky.astDashTypes

import typingsSlinky.astDashTypes.astDashTypesStrings.AmpersandEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.AsteriskEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.Equalssign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.LessthansignLessthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.PercentsignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.PlussignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.SlashEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.VerticallineEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.`-Equalssign`
import typingsSlinky.astDashTypes.astDashTypesStrings.`^Equalssign`
import typingsSlinky.astDashTypes.genKindsMod.CommentKind
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.MemberExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLeft extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var left: PatternKind | MemberExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  var right: ExpressionKind
}

object Anon_CommentsLeft {
  @scala.inline
  def apply(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsLeft]
  }
}

