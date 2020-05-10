package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewLines extends js.Object {
  var newLines: Double = js.native
  var newStart: Double = js.native
  var oldLines: Double = js.native
  var oldStart: Double = js.native
}

object AnonNewLines {
  @scala.inline
  def apply(newLines: Double, newStart: Double, oldLines: Double, oldStart: Double): AnonNewLines = {
    val __obj = js.Dynamic.literal(newLines = newLines.asInstanceOf[js.Any], newStart = newStart.asInstanceOf[js.Any], oldLines = oldLines.asInstanceOf[js.Any], oldStart = oldStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewLines]
  }
  @scala.inline
  implicit class AnonNewLinesOps[Self <: AnonNewLines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

