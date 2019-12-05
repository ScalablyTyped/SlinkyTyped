package typingsSlinky.reactDashPlotlyDotJs.reactDashPlotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsMod.Data
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.Frame
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.Layout
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Figure extends js.Object {
  var data: js.Array[Data]
  var frames: js.Array[Frame] | Null
  var layout: Partial[Layout]
}

object Figure {
  @scala.inline
  def apply(data: js.Array[Data], layout: Partial[Layout], frames: js.Array[Frame] = null): Figure = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Figure]
  }
}

