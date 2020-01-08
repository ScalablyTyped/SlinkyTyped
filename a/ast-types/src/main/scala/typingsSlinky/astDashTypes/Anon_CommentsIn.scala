package typingsSlinky.astDashTypes

import typingsSlinky.astDashTypes.astDashTypesStrings.Ampersand
import typingsSlinky.astDashTypes.astDashTypesStrings.Asterisk
import typingsSlinky.astDashTypes.astDashTypesStrings.AsteriskAsterisk
import typingsSlinky.astDashTypes.astDashTypesStrings.EqualssignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.Greaterthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.Lessthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.LessthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.LessthansignLessthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.Percentsign
import typingsSlinky.astDashTypes.astDashTypesStrings.Plussign
import typingsSlinky.astDashTypes.astDashTypesStrings.Slash
import typingsSlinky.astDashTypes.astDashTypesStrings.Verticalline
import typingsSlinky.astDashTypes.astDashTypesStrings.^
import typingsSlinky.astDashTypes.astDashTypesStrings.`-_`
import typingsSlinky.astDashTypes.astDashTypesStrings.in
import typingsSlinky.astDashTypes.astDashTypesStrings.instanceof
import typingsSlinky.astDashTypes.genKindsMod.CommentKind
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIn extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var left: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof
  var right: ExpressionKind
}

object Anon_CommentsIn {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    right: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsIn = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsIn]
  }
}

