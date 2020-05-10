package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.puppeteerStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryScreenShotOptions extends ScreenshotOptions {
  @JSName("encoding")
  var encoding_BinaryScreenShotOptions: js.UndefOr[binary] = js.native
}

object BinaryScreenShotOptions {
  @scala.inline
  def apply(): BinaryScreenShotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinaryScreenShotOptions]
  }
  @scala.inline
  implicit class BinaryScreenShotOptionsOps[Self <: BinaryScreenShotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: binary): Self = {
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
  }
  
}

