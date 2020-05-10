package typingsSlinky.amapJsApi.AMap.TileLayer.WMS

import typingsSlinky.amapJsApi.amapJsApiStrings.FALSE
import typingsSlinky.amapJsApi.amapJsApiStrings.TRUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  var BGCOLOR: js.UndefOr[String] = js.native
  var ELEVATION: js.UndefOr[String] = js.native
  var EXCEPTIONS: js.UndefOr[String] = js.native
  var FORMAT: js.UndefOr[String] = js.native
  var LAYERS: js.UndefOr[String] = js.native
  var STYLES: js.UndefOr[String] = js.native
  var TIME: js.UndefOr[String] = js.native
  var TRANSPARENT: js.UndefOr[TRUE | FALSE] = js.native
  var VERSION: js.UndefOr[String] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBGCOLOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BGCOLOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBGCOLOR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BGCOLOR")(js.undefined)
        ret
    }
    @scala.inline
    def withELEVATION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ELEVATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutELEVATION: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ELEVATION")(js.undefined)
        ret
    }
    @scala.inline
    def withEXCEPTIONS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXCEPTIONS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEXCEPTIONS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXCEPTIONS")(js.undefined)
        ret
    }
    @scala.inline
    def withFORMAT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FORMAT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFORMAT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FORMAT")(js.undefined)
        ret
    }
    @scala.inline
    def withLAYERS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LAYERS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLAYERS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LAYERS")(js.undefined)
        ret
    }
    @scala.inline
    def withSTYLES(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STYLES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSTYLES: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STYLES")(js.undefined)
        ret
    }
    @scala.inline
    def withTIME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTIME: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIME")(js.undefined)
        ret
    }
    @scala.inline
    def withTRANSPARENT(value: TRUE | FALSE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSPARENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTRANSPARENT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSPARENT")(js.undefined)
        ret
    }
    @scala.inline
    def withVERSION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVERSION: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(js.undefined)
        ret
    }
  }
  
}

