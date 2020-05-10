package typingsSlinky.diff2html.Diff2Html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  var header: String = js.native
  var lines: js.Array[Line] = js.native
  var newStartLine: Double = js.native
  var oldStartLine: Double = js.native
  var oldStartLine2: js.UndefOr[Double] = js.native
}

object Block {
  @scala.inline
  def apply(header: String, lines: js.Array[Line], newStartLine: Double, oldStartLine: Double): Block = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], newStartLine = newStartLine.asInstanceOf[js.Any], oldStartLine = oldStartLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: js.Array[Line]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewStartLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStartLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldStartLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldStartLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldStartLine2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldStartLine2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldStartLine2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldStartLine2")(js.undefined)
        ret
    }
  }
  
}

