package typingsSlinky.jsreportChromePdf.mod

import typingsSlinky.jsreportChromePdf.anon.Height
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.base64
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.binary
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.jpeg
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://jsreport.net/learn/chrome-image
// https://github.com/puppeteer/puppeteer/blob/v1.11.0/docs/api.md#pagescreenshotoptions
@js.native
trait ChromeImage extends js.Object {
  var clip: Height = js.native
  var encoding: base64 | binary = js.native
  	// 0-100
  var fullPage: Boolean = js.native
  var omitBackground: Boolean = js.native
  var path: String = js.native
  var quality: Double = js.native
  var `type`: jpeg | png = js.native
}

object ChromeImage {
  @scala.inline
  def apply(
    clip: Height,
    encoding: base64 | binary,
    fullPage: Boolean,
    omitBackground: Boolean,
    path: String,
    quality: Double,
    `type`: jpeg | png
  ): ChromeImage = {
    val __obj = js.Dynamic.literal(clip = clip.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fullPage = fullPage.asInstanceOf[js.Any], omitBackground = omitBackground.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeImage]
  }
  @scala.inline
  implicit class ChromeImageOps[Self <: ChromeImage] (val x: Self) extends AnyVal {
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
    def withEncoding(value: base64 | binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOmitBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: jpeg | png): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

