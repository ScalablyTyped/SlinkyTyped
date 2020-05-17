package typingsSlinky.googleMapReact.mod

import typingsSlinky.googleMapReact.anon.Opacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heatmap extends js.Object {
  var options: Opacity = js.native
  var positions: js.Array[Position] = js.native
}

object Heatmap {
  @scala.inline
  def apply(options: Opacity, positions: js.Array[Position]): Heatmap = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heatmap]
  }
  @scala.inline
  implicit class HeatmapOps[Self <: Heatmap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: Opacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositions(value: js.Array[Position]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

