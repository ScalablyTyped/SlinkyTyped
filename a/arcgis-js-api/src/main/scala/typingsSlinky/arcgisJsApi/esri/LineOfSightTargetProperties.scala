package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineOfSightTargetProperties extends js.Object {
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location of the target. Once the location is set, a new line of sight analysis will synchronously calculate the intersection and the visibility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.native
}

object LineOfSightTargetProperties {
  @scala.inline
  def apply(): LineOfSightTargetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOfSightTargetProperties]
  }
  @scala.inline
  implicit class LineOfSightTargetPropertiesOps[Self <: LineOfSightTargetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: PointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

