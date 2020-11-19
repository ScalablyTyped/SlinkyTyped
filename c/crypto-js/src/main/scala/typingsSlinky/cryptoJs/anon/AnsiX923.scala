package typingsSlinky.cryptoJs.anon

import typingsSlinky.cryptoJs.mod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnsiX923 extends js.Object {
  
  var AnsiX923: Padding = js.native
  
  var Iso10126: Padding = js.native
  
  var Iso97971: Padding = js.native
  
  var NoPadding: Padding = js.native
  
  var Pkcs7: Padding = js.native
  
  var ZeroPadding: Padding = js.native
}
object AnsiX923 {
  
  @scala.inline
  def apply(
    AnsiX923: Padding,
    Iso10126: Padding,
    Iso97971: Padding,
    NoPadding: Padding,
    Pkcs7: Padding,
    ZeroPadding: Padding
  ): AnsiX923 = {
    val __obj = js.Dynamic.literal(AnsiX923 = AnsiX923.asInstanceOf[js.Any], Iso10126 = Iso10126.asInstanceOf[js.Any], Iso97971 = Iso97971.asInstanceOf[js.Any], NoPadding = NoPadding.asInstanceOf[js.Any], Pkcs7 = Pkcs7.asInstanceOf[js.Any], ZeroPadding = ZeroPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnsiX923]
  }
  
  @scala.inline
  implicit class AnsiX923Ops[Self <: AnsiX923] (val x: Self) extends AnyVal {
    
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
    def setAnsiX923(value: Padding): Self = this.set("AnsiX923", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso10126(value: Padding): Self = this.set("Iso10126", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso97971(value: Padding): Self = this.set("Iso97971", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoPadding(value: Padding): Self = this.set("NoPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkcs7(value: Padding): Self = this.set("Pkcs7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroPadding(value: Padding): Self = this.set("ZeroPadding", value.asInstanceOf[js.Any])
  }
}
