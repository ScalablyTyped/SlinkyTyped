package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsElliottWaveTypePointsOptions extends js.Object {
  var controlPoint: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var label: js.UndefOr[AnnotationsElliottWaveTypePointsLabelOptions] = js.native
  /**
    * (Highstock) The x position of the point.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The y position of the point.
    */
  var y: js.UndefOr[Double] = js.native
}

object AnnotationsElliottWaveTypePointsOptions {
  @scala.inline
  def apply(): AnnotationsElliottWaveTypePointsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsElliottWaveTypePointsOptions]
  }
  @scala.inline
  implicit class AnnotationsElliottWaveTypePointsOptionsOps[Self <: AnnotationsElliottWaveTypePointsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnnotationsElliottWaveTypePointsLabelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
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

