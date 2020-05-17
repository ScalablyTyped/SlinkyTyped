package typingsSlinky.lyricParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineNum extends js.Object {
  var lineNum: Double = js.native
  var txt: String = js.native
}

object LineNum {
  @scala.inline
  def apply(lineNum: Double, txt: String): LineNum = {
    val __obj = js.Dynamic.literal(lineNum = lineNum.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineNum]
  }
  @scala.inline
  implicit class LineNumOps[Self <: LineNum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTxt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

