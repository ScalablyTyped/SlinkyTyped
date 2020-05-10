package typingsSlinky.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stmt extends Node {
  var Background: Boolean = js.native
  var Cmd: Command = js.native
  var Comments: js.Array[Comment] = js.native
  var Coprocess: Boolean = js.native
  var Negated: Boolean = js.native
  var Position: Pos = js.native
  var Semicolon: Pos = js.native
}

object Stmt {
  @scala.inline
  def apply(
    Background: Boolean,
    Cmd: Command,
    Comments: js.Array[Comment],
    Coprocess: Boolean,
    End: () => Pos,
    Negated: Boolean,
    Pos: () => Pos,
    Position: Pos,
    Semicolon: Pos
  ): Stmt = {
    val __obj = js.Dynamic.literal(Background = Background.asInstanceOf[js.Any], Cmd = Cmd.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Coprocess = Coprocess.asInstanceOf[js.Any], End = js.Any.fromFunction0(End), Negated = Negated.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos), Position = Position.asInstanceOf[js.Any], Semicolon = Semicolon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stmt]
  }
  @scala.inline
  implicit class StmtOps[Self <: Stmt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmd(value: Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoprocess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Coprocess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Negated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Pos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemicolon(value: Pos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Semicolon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

