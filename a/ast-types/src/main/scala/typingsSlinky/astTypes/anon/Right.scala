package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.astTypesStrings.Ampersand
import typingsSlinky.astTypes.astTypesStrings.Asterisk
import typingsSlinky.astTypes.astTypesStrings.AsteriskAsterisk
import typingsSlinky.astTypes.astTypesStrings.EqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Greaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.astTypes.astTypesStrings.Lessthansign
import typingsSlinky.astTypes.astTypesStrings.LessthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.LessthansignLessthansign
import typingsSlinky.astTypes.astTypesStrings.Percentsign
import typingsSlinky.astTypes.astTypesStrings.Plussign
import typingsSlinky.astTypes.astTypesStrings.Slash
import typingsSlinky.astTypes.astTypesStrings.Verticalline
import typingsSlinky.astTypes.astTypesStrings.^
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.astTypesStrings.in
import typingsSlinky.astTypes.astTypesStrings.instanceof
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Right extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var left: ExpressionKind = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof = js.native
  var right: ExpressionKind = js.native
}

object Right {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    right: ExpressionKind
  ): Right = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
  @scala.inline
  implicit class RightOps[Self <: Right] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(
      value: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[CommentKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(null)
        ret
    }
    @scala.inline
    def withLoc(value: SourceLocationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
    @scala.inline
    def withLocNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(null)
        ret
    }
  }
  
}

