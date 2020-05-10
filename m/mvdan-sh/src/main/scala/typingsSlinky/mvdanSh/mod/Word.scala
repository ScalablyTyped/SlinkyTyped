package typingsSlinky.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Word extends Node {
  var Parts: js.Array[WordPart] = js.native
  def Lit(): String = js.native
}

object Word {
  @scala.inline
  def apply(End: () => Pos, Lit: () => String, Parts: js.Array[WordPart], Pos: () => Pos): Word = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Lit = js.Any.fromFunction0(Lit), Parts = Parts.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos))
    __obj.asInstanceOf[Word]
  }
  @scala.inline
  implicit class WordOps[Self <: Word] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLit(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParts(value: js.Array[WordPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

