package typingsSlinky.divaJs.interfacesMod

import typingsSlinky.divaJs.AnonD
import typingsSlinky.divaJs.AnonH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  var api: Double = js.native
  var canvas: String = js.native
  var d: AnonH = js.native
  var f: String = js.native
  var facingPages: Boolean = js.native
  var il: String = js.native
  var l: String = js.native
  var m: Double = js.native
  var otherImages: AnonD = js.native
  var paged: Boolean = js.native
  var url: String = js.native
  var xoffset: Double = js.native
  var yoffset: Double = js.native
}

object Page {
  @scala.inline
  def apply(
    api: Double,
    canvas: String,
    d: AnonH,
    f: String,
    facingPages: Boolean,
    il: String,
    l: String,
    m: Double,
    otherImages: AnonD,
    paged: Boolean,
    url: String,
    xoffset: Double,
    yoffset: Double
  ): Page = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], facingPages = facingPages.asInstanceOf[js.Any], il = il.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], otherImages = otherImages.asInstanceOf[js.Any], paged = paged.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvas(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: AnonH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacingPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facingPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("il")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherImages(value: AnonD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXoffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYoffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

