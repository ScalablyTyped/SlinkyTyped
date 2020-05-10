package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsMeasureTypeCrosshairYOptions extends js.Object {
  /**
    * (Highstock) The dash or dot style of the crosshair's line. For possible
    * values, see this demonstration.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highstock) Enable or disable the vertical crosshair.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) The marker-end defines the arrowhead that will be drawn at
    * the final vertex of the given crosshair's path.
    */
  var markerEnd: js.UndefOr[OptionsMarkerEndValue] = js.native
  /**
    * (Highstock) The Z index of the crosshair in annotation.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object AnnotationsMeasureTypeCrosshairYOptions {
  @scala.inline
  def apply(): AnnotationsMeasureTypeCrosshairYOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeCrosshairYOptions]
  }
  @scala.inline
  implicit class AnnotationsMeasureTypeCrosshairYOptionsOps[Self <: AnnotationsMeasureTypeCrosshairYOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashStyle(value: DashStyleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerEnd(value: OptionsMarkerEndValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

