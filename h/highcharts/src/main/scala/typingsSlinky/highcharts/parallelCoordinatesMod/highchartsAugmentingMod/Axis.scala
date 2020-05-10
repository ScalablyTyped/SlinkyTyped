package typingsSlinky.highcharts.parallelCoordinatesMod.highchartsAugmentingMod

import typingsSlinky.highcharts.mod.AxisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends js.Object {
  /**
    * Set predefined left+width and top+height (inverted) for yAxes. This
    * method modifies options param.
    *
    * @param axisPosition
    *        ['left', 'width', 'height', 'top'] or ['top', 'height',
    *        'width', 'left'] for an inverted chart.
    *
    * @param options
    *        Highcharts.Axis#options.
    */
  def setParallelPosition(axisPosition: js.Array[String], options: AxisOptions): Unit = js.native
}

object Axis {
  @scala.inline
  def apply(setParallelPosition: (js.Array[String], AxisOptions) => Unit): Axis = {
    val __obj = js.Dynamic.literal(setParallelPosition = js.Any.fromFunction2(setParallelPosition))
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetParallelPosition(value: (js.Array[String], AxisOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParallelPosition")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

