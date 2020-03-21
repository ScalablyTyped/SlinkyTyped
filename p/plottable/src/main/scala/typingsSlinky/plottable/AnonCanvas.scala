package typingsSlinky.plottable

import typingsSlinky.plottable.plottableStrings.canvas
import typingsSlinky.plottable.plottableStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanvas extends js.Object {
  var canvas: typingsSlinky.plottable.plottableStrings.canvas
  var svg: typingsSlinky.plottable.plottableStrings.svg
}

object AnonCanvas {
  @scala.inline
  def apply(canvas: canvas, svg: svg): AnonCanvas = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCanvas]
  }
}

