package typingsSlinky.qrcode.mod

import typingsSlinky.qrcode.anon.Quality
import typingsSlinky.qrcode.qrcodeStrings.imageSlashjpeg
import typingsSlinky.qrcode.qrcodeStrings.imageSlashpng
import typingsSlinky.qrcode.qrcodeStrings.imageSlashwebp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeToDataURLOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[Quality] = js.native
  /**
    * Data URI format.
    * Default: image/png
    */
  var `type`: js.UndefOr[imageSlashpng | imageSlashjpeg | imageSlashwebp] = js.native
}

object QRCodeToDataURLOptions {
  @scala.inline
  def apply(): QRCodeToDataURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToDataURLOptions]
  }
  @scala.inline
  implicit class QRCodeToDataURLOptionsOps[Self <: QRCodeToDataURLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRendererOpts(value: Quality): Self = {
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
    def withType(value: imageSlashpng | imageSlashjpeg | imageSlashwebp): Self = {
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

