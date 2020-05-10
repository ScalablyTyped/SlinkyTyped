package typingsSlinky.leafletPolylinedecorator.mod.Symbol

import typingsSlinky.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashOptions extends js.Object {
  var pathOptions: js.UndefOr[PathOptions] = js.native
  var pixelSize: js.UndefOr[Double] = js.native
}

object DashOptions {
  @scala.inline
  def apply(): DashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashOptions]
  }
  @scala.inline
  implicit class DashOptionsOps[Self <: DashOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

