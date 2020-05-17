package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlternateComments extends js.Object {
  var alternate: ExpressionKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var consequent: ExpressionKind = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var test: ExpressionKind = js.native
}

object AlternateComments {
  @scala.inline
  def apply(alternate: ExpressionKind, consequent: ExpressionKind, test: ExpressionKind): AlternateComments = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternateComments]
  }
  @scala.inline
  implicit class AlternateCommentsOps[Self <: AlternateComments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternate(value: ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsequent(value: ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consequent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
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

