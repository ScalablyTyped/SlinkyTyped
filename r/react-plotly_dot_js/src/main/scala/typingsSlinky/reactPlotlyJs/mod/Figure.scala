package typingsSlinky.reactPlotlyJs.mod

import typingsSlinky.plotlyJs.mod.Data
import typingsSlinky.plotlyJs.mod.Frame
import typingsSlinky.reactPlotlyJs.anon.PartialLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Figure extends js.Object {
  var data: js.Array[Data] = js.native
  var frames: js.Array[Frame] | Null = js.native
  var layout: PartialLayout = js.native
}

object Figure {
  @scala.inline
  def apply(data: js.Array[Data], layout: PartialLayout): Figure = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Figure]
  }
  @scala.inline
  implicit class FigureOps[Self <: Figure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[Data]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: PartialLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrames(value: js.Array[Frame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(null)
        ret
    }
  }
  
}

