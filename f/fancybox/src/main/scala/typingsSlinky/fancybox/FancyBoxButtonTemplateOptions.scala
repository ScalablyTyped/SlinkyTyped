package typingsSlinky.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxButtonTemplateOptions extends js.Object {
  var arrowLeft: js.UndefOr[String] = js.native
  var arrowRight: js.UndefOr[String] = js.native
  var close: js.UndefOr[String] = js.native
  var download: js.UndefOr[String] = js.native
  /**
    * This small close button will be appended to your html/inline/ajax content by default,
    * if "smallBtn" option is not set to false
    */
  var smallBtn: js.UndefOr[String] = js.native
  var zoom: js.UndefOr[String] = js.native
}

object FancyBoxButtonTemplateOptions {
  @scala.inline
  def apply(): FancyBoxButtonTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxButtonTemplateOptions]
  }
  @scala.inline
  implicit class FancyBoxButtonTemplateOptionsOps[Self <: FancyBoxButtonTemplateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRight")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withDownload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallBtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

