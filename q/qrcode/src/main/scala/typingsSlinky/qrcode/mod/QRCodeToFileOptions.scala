package typingsSlinky.qrcode.mod

import typingsSlinky.qrcode.AnonDeflateLevel
import typingsSlinky.qrcode.qrcodeStrings.png
import typingsSlinky.qrcode.qrcodeStrings.svg
import typingsSlinky.qrcode.qrcodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeToFileOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[AnonDeflateLevel] = js.native
  /**
    * Output format.
    * Default: png
    */
  var `type`: js.UndefOr[png | svg | utf8] = js.native
}

object QRCodeToFileOptions {
  @scala.inline
  def apply(): QRCodeToFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToFileOptions]
  }
  @scala.inline
  implicit class QRCodeToFileOptionsOps[Self <: QRCodeToFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRendererOpts(value: AnonDeflateLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendererOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: png | svg | utf8): Self = {
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

