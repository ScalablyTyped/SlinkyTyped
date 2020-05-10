package typingsSlinky.arcgisRestApi.mod

import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriPFS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureFillSymbol
  extends Symbol
     with PictureSourced {
  var outline: js.UndefOr[SimpleLineSymbol] = js.native
  @JSName("type")
  var type_PictureFillSymbol: esriPFS = js.native
   // if outline has been specified
  var xscale: js.UndefOr[Double] = js.native
  var yscale: js.UndefOr[Double] = js.native
}

object PictureFillSymbol {
  @scala.inline
  def apply(`type`: esriPFS): PictureFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFillSymbol]
  }
  @scala.inline
  implicit class PictureFillSymbolOps[Self <: PictureFillSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: esriPFS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutline(value: SimpleLineSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withXscale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xscale")(js.undefined)
        ret
    }
    @scala.inline
    def withYscale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yscale")(js.undefined)
        ret
    }
  }
  
}

