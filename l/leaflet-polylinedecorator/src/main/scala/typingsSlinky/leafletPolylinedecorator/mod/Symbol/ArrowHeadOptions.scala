package typingsSlinky.leafletPolylinedecorator.mod.Symbol

import typingsSlinky.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowHeadOptions extends js.Object {
  var headAngle: js.UndefOr[Double] = js.native
  var pathOptions: js.UndefOr[PathOptions] = js.native
  var pixelSize: js.UndefOr[Double] = js.native
  var polygon: js.UndefOr[Boolean] = js.native
}

object ArrowHeadOptions {
  @scala.inline
  def apply(): ArrowHeadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowHeadOptions]
  }
  @scala.inline
  implicit class ArrowHeadOptionsOps[Self <: ArrowHeadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeadAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withPathOptions(value: PathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(js.undefined)
        ret
    }
  }
  
}

