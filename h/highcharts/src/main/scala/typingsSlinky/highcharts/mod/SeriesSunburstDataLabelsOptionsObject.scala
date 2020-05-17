package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesSunburstDataLabelsOptionsObject extends DataLabelsOptionsObject {
  @JSName("align")
  var align_SeriesSunburstDataLabelsOptionsObject: js.UndefOr[scala.Nothing] = js.native
  @JSName("allowOverlap")
  var allowOverlap_SeriesSunburstDataLabelsOptionsObject: js.UndefOr[scala.Nothing] = js.native
  /**
    * Decides how the data label will be rotated relative to the perimeter of
    * the sunburst. Valid values are `auto`, `parallel` and `perpendicular`.
    * When `auto`, the best fit will be computed for the point.
    *
    * The `series.rotation` option takes precedence over `rotationMode`.
    */
  var rotationMode: js.UndefOr[SeriesSunburstDataLabelsRotationValue] = js.native
}

object SeriesSunburstDataLabelsOptionsObject {
  @scala.inline
  def apply(): SeriesSunburstDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSunburstDataLabelsOptionsObject]
  }
  @scala.inline
  implicit class SeriesSunburstDataLabelsOptionsObjectOps[Self <: SeriesSunburstDataLabelsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRotationMode(value: SeriesSunburstDataLabelsRotationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationMode")(js.undefined)
        ret
    }
  }
  
}

