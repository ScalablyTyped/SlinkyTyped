package typingsSlinky.miniprogram

import typingsSlinky.miniprogram.anon.BarCode
import typingsSlinky.miniprogram.miniprogramStrings.bar
import typingsSlinky.miniprogram.miniprogramStrings.qr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanArgs extends AsyncCallback[BarCode] {
  
  /**
    * Hide album entry or not. If it is false, there will be an entry
    * for user to select a picture from the album as the scanned picture.
    * Otherwise, user will use camera to scan the content directly. By default, its value is false.
    */
  var hideAlbum: js.UndefOr[Boolean] = js.native
  
  /**
    * Type for scanning (qr by default):
    * 1. qr: two-dimensional QR scanning frame.
    * 2. bar: Linear barcode scanning frame.
    */
  var `type`: js.UndefOr[qr | bar] = js.native
}
object ScanArgs {
  
  @scala.inline
  def apply(): ScanArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanArgs]
  }
  
  @scala.inline
  implicit class ScanArgsOps[Self <: ScanArgs] (val x: Self) extends AnyVal {
    
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
    def setHideAlbum(value: Boolean): Self = this.set("hideAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideAlbum: Self = this.set("hideAlbum", js.undefined)
    
    @scala.inline
    def setType(value: qr | bar): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
