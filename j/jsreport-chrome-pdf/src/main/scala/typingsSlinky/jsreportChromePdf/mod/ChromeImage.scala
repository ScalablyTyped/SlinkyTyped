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
trait ChromeImage extends js.Object {
  var clip: Height
  var encoding: base64 | binary
      // 0-100
  var fullPage: Boolean
  var omitBackground: Boolean
  var path: String
  var quality: Double
  var `type`: jpeg | png
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
}

