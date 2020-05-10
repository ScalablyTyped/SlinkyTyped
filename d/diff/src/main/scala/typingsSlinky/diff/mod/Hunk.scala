package typingsSlinky.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hunk extends js.Object {
  var linedelimiters: js.Array[String] = js.native
  var lines: js.Array[String] = js.native
  var newLines: Double = js.native
  var newStart: Double = js.native
  var oldLines: Double = js.native
  var oldStart: Double = js.native
}

object Hunk {
  @scala.inline
  def apply(
    linedelimiters: js.Array[String],
    lines: js.Array[String],
    newLines: Double,
    newStart: Double,
    oldLines: Double,
    oldStart: Double
  ): Hunk = {
    val __obj = js.Dynamic.literal(linedelimiters = linedelimiters.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], newLines = newLines.asInstanceOf[js.Any], newStart = newStart.asInstanceOf[js.Any], oldLines = oldLines.asInstanceOf[js.Any], oldStart = oldStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hunk]
  }
  @scala.inline
  implicit class HunkOps[Self <: Hunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinedelimiters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linedelimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

