package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStylesOptions extends js.Object {
  /** Sets the options for all polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.native
  /** Sets the options for all polylines. */
  var polylineOptions: js.UndefOr[IPolylineOptions] = js.native
  /** Sets the options for all pushpins. */
  var pushpinOptions: js.UndefOr[IPushpinOptions] = js.native
}

object IStylesOptions {
  @scala.inline
  def apply(): IStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStylesOptions]
  }
  @scala.inline
  implicit class IStylesOptionsOps[Self <: IStylesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolygonOptions(value: IPolygonOptions): Self = {
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
    def withPolylineOptions(value: IPolylineOptions): Self = {
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
    def withPushpinOptions(value: IPushpinOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushpinOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushpinOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushpinOptions")(js.undefined)
        ret
    }
  }
  
}

