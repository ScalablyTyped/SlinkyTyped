package typingsSlinky.qrcode.mod

import typingsSlinky.qrcode.anon.DeflateLevel
import typingsSlinky.qrcode.qrcodeStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRCodeToFileStreamOptions extends QRCodeRenderersOptions {
  
  var rendererOpts: js.UndefOr[DeflateLevel] = js.native
  
  /**
    * Output format. Only png supported for file stream
    */
  var `type`: js.UndefOr[png] = js.native
}
object QRCodeToFileStreamOptions {
  
  @scala.inline
  def apply(): QRCodeToFileStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToFileStreamOptions]
  }
  
  @scala.inline
  implicit class QRCodeToFileStreamOptionsOps[Self <: QRCodeToFileStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRendererOpts(value: DeflateLevel): Self = this.set("rendererOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendererOpts: Self = this.set("rendererOpts", js.undefined)
    
    @scala.inline
    def setType(value: png): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
