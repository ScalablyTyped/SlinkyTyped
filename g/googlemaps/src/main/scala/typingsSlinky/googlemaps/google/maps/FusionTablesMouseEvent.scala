package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FusionTablesMouseEvent extends js.Object {
  var infoWindowHtml: js.UndefOr[String] = js.native
  var latLng: js.UndefOr[LatLng] = js.native
  var pixelOffset: js.UndefOr[Size] = js.native
  var row: js.UndefOr[js.Object] = js.native
}

object FusionTablesMouseEvent {
  @scala.inline
  def apply(): FusionTablesMouseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesMouseEvent]
  }
  @scala.inline
  implicit class FusionTablesMouseEventOps[Self <: FusionTablesMouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoWindowHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoWindowHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoWindowHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoWindowHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withLatLng(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLng")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelOffset(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
  }
  
}

