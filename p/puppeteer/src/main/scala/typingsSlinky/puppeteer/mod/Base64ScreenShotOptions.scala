package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.puppeteerStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base64ScreenShotOptions extends ScreenshotOptions {
  @JSName("encoding")
  var encoding_Base64ScreenShotOptions: base64 = js.native
}

object Base64ScreenShotOptions {
  @scala.inline
  def apply(encoding: base64): Base64ScreenShotOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64ScreenShotOptions]
  }
  @scala.inline
  implicit class Base64ScreenShotOptionsOps[Self <: Base64ScreenShotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

