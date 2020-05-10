package typingsSlinky.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends Node {
  var Last: js.Array[Stmt] = js.native
  var Name: String = js.native
  var Stmts: js.UndefOr[js.Array[Stmt]] = js.native
}

object File {
  @scala.inline
  def apply(End: () => Pos, Last: js.Array[Stmt], Name: String, Pos: () => Pos): File = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Last = Last.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos))
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast(value: js.Array[Stmt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStmts(value: js.Array[Stmt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stmts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStmts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stmts")(js.undefined)
        ret
    }
  }
  
}

