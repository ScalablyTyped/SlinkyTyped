package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Init extends js.Object {
  var body: StatementKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var init: VariableDeclarationKind | ExpressionKind | Null = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var test: ExpressionKind | Null = js.native
  var update: ExpressionKind | Null = js.native
}

object Init {
  @scala.inline
  def apply(body: StatementKind): Init = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Init]
  }
  @scala.inline
  implicit class InitOps[Self <: Init] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: StatementKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
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
    def withInit(value: VariableDeclarationKind | ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(null)
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
    @scala.inline
    def withTest(value: ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(null)
        ret
    }
    @scala.inline
    def withUpdate(value: ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(null)
        ret
    }
  }
  
}

