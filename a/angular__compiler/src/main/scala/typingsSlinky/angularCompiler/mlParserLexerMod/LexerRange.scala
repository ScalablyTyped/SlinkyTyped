package typingsSlinky.angularCompiler.mlParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexerRange extends js.Object {
  var endPos: Double = js.native
  var startCol: Double = js.native
  var startLine: Double = js.native
  var startPos: Double = js.native
}

object LexerRange {
  @scala.inline
  def apply(endPos: Double, startCol: Double, startLine: Double, startPos: Double): LexerRange = {
    val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexerRange]
  }
  @scala.inline
  implicit class LexerRangeOps[Self <: LexerRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

