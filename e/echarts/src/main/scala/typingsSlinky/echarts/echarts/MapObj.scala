package typingsSlinky.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapObj extends js.Object {
  /**
    * geoJson data for map
    */
  var geoJson: js.Object = js.native
  /**
    * special areas fro map
    */
  var specialAreas: js.Object = js.native
}

object MapObj {
  @scala.inline
  def apply(geoJson: js.Object, specialAreas: js.Object): MapObj = {
    val __obj = js.Dynamic.literal(geoJson = geoJson.asInstanceOf[js.Any], specialAreas = specialAreas.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapObj]
  }
  @scala.inline
  implicit class MapObjOps[Self <: MapObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoJson(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecialAreas(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialAreas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

