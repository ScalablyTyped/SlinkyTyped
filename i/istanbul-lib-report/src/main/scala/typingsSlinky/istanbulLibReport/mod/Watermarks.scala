package typingsSlinky.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watermarks extends js.Object {
  var branches: Watermark = js.native
  var functions: Watermark = js.native
  var lines: Watermark = js.native
  var statements: Watermark = js.native
}

object Watermarks {
  @scala.inline
  def apply(branches: Watermark, functions: Watermark, lines: Watermark, statements: Watermark): Watermarks = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Watermarks]
  }
  @scala.inline
  implicit class WatermarksOps[Self <: Watermarks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranches(value: Watermark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctions(value: Watermark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: Watermark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatements(value: Watermark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

