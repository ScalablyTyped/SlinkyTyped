package typingsSlinky.highcharts.parallelCoordinatesMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart extends js.Object {
  /**
    * Flag used in parallel coordinates plot to check if chart has
    * ||-coords (parallel coords).
    */
  var hasParallelCoordinates: Boolean = js.native
}

object Chart {
  @scala.inline
  def apply(hasParallelCoordinates: Boolean): Chart = {
    val __obj = js.Dynamic.literal(hasParallelCoordinates = hasParallelCoordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart]
  }
  @scala.inline
  implicit class ChartOps[Self <: Chart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasParallelCoordinates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasParallelCoordinates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

