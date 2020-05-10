package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconOptions extends js.Object {
  var anchor: js.UndefOr[Size] = js.native
  var imageOffset: js.UndefOr[Size] = js.native
  var infoWindowAnchor: js.UndefOr[Size] = js.native
  var printImageUrl: js.UndefOr[String] = js.native
}

object IconOptions {
  @scala.inline
  def apply(): IconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconOptions]
  }
  @scala.inline
  implicit class IconOptionsOps[Self <: IconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withImageOffset(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoWindowAnchor(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoWindowAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoWindowAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoWindowAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printImageUrl")(js.undefined)
        ret
    }
  }
  
}

