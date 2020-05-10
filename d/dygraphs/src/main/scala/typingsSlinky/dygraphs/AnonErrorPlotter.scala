package typingsSlinky.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorPlotter extends js.Object {
  var errorPlotter: js.Any = js.native
  var fillPlotter: js.Any = js.native
  var linePlotter: js.Any = js.native
}

object AnonErrorPlotter {
  @scala.inline
  def apply(errorPlotter: js.Any, fillPlotter: js.Any, linePlotter: js.Any): AnonErrorPlotter = {
    val __obj = js.Dynamic.literal(errorPlotter = errorPlotter.asInstanceOf[js.Any], fillPlotter = fillPlotter.asInstanceOf[js.Any], linePlotter = linePlotter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorPlotter]
  }
  @scala.inline
  implicit class AnonErrorPlotterOps[Self <: AnonErrorPlotter] (val x: Self) extends AnyVal {
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

