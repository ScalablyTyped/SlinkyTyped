package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsLeftLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var left: IdentifierKind | TSQualifiedNameKind = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var right: IdentifierKind | TSQualifiedNameKind = js.native
}

object CommentsLeftLoc {
  @scala.inline
  def apply(left: IdentifierKind | TSQualifiedNameKind, right: IdentifierKind | TSQualifiedNameKind): CommentsLeftLoc = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsLeftLoc]
  }
  @scala.inline
  implicit class CommentsLeftLocOps[Self <: CommentsLeftLoc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: IdentifierKind | TSQualifiedNameKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: IdentifierKind | TSQualifiedNameKind): Self = {
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

