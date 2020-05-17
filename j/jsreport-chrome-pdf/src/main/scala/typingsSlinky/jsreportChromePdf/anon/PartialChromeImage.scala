package typingsSlinky.jsreportChromePdf.anon

import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.base64
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.binary
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.jpeg
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.ChromeImage> */
@js.native
trait PartialChromeImage extends js.Object {
  var clip: js.UndefOr[Height] = js.native
  var encoding: js.UndefOr[base64 | binary] = js.native
  var fullPage: js.UndefOr[Boolean] = js.native
  var omitBackground: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  var quality: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[jpeg | png] = js.native
}

object PartialChromeImage {
  @scala.inline
  def apply(): PartialChromeImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChromeImage]
  }
  @scala.inline
  implicit class PartialChromeImageOps[Self <: PartialChromeImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClip(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: base64 | binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFullPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPage")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: jpeg | png): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

