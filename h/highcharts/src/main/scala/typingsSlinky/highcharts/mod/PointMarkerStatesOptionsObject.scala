package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointMarkerStatesOptionsObject extends js.Object {
  /**
    * The hover state for a single point marker.
    */
  var hover: PointStatesHoverOptionsObject = js.native
  var inactive: PointStatesInactiveOptionsObject = js.native
  /**
    * The normal state of a single point marker. Currently only used for
    * setting animation when returning to normal state from hover.
    */
  var normal: PointStatesNormalOptionsObject = js.native
  /**
    * The appearance of the point marker when selected. In order to allow a
    * point to be selected, set the `series.allowPointSelect` option to true.
    */
  var select: PointStatesSelectOptionsObject = js.native
}

object PointMarkerStatesOptionsObject {
  @scala.inline
  def apply(
    hover: PointStatesHoverOptionsObject,
    inactive: PointStatesInactiveOptionsObject,
    normal: PointStatesNormalOptionsObject,
    select: PointStatesSelectOptionsObject
  ): PointMarkerStatesOptionsObject = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointMarkerStatesOptionsObject]
  }
  @scala.inline
  implicit class PointMarkerStatesOptionsObjectOps[Self <: PointMarkerStatesOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHover(value: PointStatesHoverOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactive(value: PointStatesInactiveOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: PointStatesNormalOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: PointStatesSelectOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

