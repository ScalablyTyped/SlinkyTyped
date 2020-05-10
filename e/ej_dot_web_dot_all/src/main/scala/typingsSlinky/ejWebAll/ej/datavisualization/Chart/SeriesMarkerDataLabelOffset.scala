package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesMarkerDataLabelOffset extends js.Object {
  /** X value or horizontal offset to position the labels in chart.
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.native
  /** Y value or vertical offset to position the labels.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.native
}

object SeriesMarkerDataLabelOffset {
  @scala.inline
  def apply(): SeriesMarkerDataLabelOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMarkerDataLabelOffset]
  }
  @scala.inline
  implicit class SeriesMarkerDataLabelOffsetOps[Self <: SeriesMarkerDataLabelOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

