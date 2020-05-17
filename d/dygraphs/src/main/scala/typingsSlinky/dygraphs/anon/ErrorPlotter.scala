package typingsSlinky.dygraphs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorPlotter extends js.Object {
  var errorPlotter: js.Any = js.native
  var fillPlotter: js.Any = js.native
  var linePlotter: js.Any = js.native
}

object ErrorPlotter {
  @scala.inline
  def apply(errorPlotter: js.Any, fillPlotter: js.Any, linePlotter: js.Any): ErrorPlotter = {
    val __obj = js.Dynamic.literal(errorPlotter = errorPlotter.asInstanceOf[js.Any], fillPlotter = fillPlotter.asInstanceOf[js.Any], linePlotter = linePlotter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorPlotter]
  }
  @scala.inline
  implicit class ErrorPlotterOps[Self <: ErrorPlotter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorPlotter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPlotter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillPlotter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillPlotter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinePlotter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linePlotter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

