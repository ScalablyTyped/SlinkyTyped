package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.canvas
import typingsSlinky.plottable.plottableStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canvas extends js.Object {
  var canvas: typingsSlinky.plottable.plottableStrings.canvas = js.native
  var svg: typingsSlinky.plottable.plottableStrings.svg = js.native
}

object Canvas {
  @scala.inline
  def apply(canvas: canvas, svg: svg): Canvas = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  @scala.inline
  implicit class CanvasOps[Self <: Canvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvas(value: canvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvg(value: svg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

