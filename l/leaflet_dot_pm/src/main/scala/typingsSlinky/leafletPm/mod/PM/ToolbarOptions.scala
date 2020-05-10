package typingsSlinky.leafletPm.mod.PM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarOptions extends js.Object {
  var deleteLayer: js.UndefOr[Boolean] = js.native
   // topleft | topright | bottomleft | bottomright
  var drawMarker: js.UndefOr[Boolean] = js.native
  var drawPolygon: js.UndefOr[Boolean] = js.native
  var drawPolyline: js.UndefOr[Boolean] = js.native
  var editPolygon: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[String] = js.native
}

object ToolbarOptions {
  @scala.inline
  def apply(): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarOptions]
  }
  @scala.inline
  implicit class ToolbarOptionsOps[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawMarker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawPolygon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPolygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawPolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPolygon")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawPolyline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPolyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawPolyline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPolyline")(js.undefined)
        ret
    }
    @scala.inline
    def withEditPolygon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editPolygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditPolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editPolygon")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

