package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FusionTablesStyle extends js.Object {
  var markerOptions: js.UndefOr[FusionTablesMarkerOptions] = js.native
  var polygonOptions: js.UndefOr[FusionTablesPolygonOptions] = js.native
  var polylineOptions: js.UndefOr[FusionTablesPolylineOptions] = js.native
  var where: js.UndefOr[String] = js.native
}

object FusionTablesStyle {
  @scala.inline
  def apply(): FusionTablesStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesStyle]
  }
  @scala.inline
  implicit class FusionTablesStyleOps[Self <: FusionTablesStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkerOptions(value: FusionTablesMarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonOptions(value: FusionTablesPolygonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylineOptions(value: FusionTablesPolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

