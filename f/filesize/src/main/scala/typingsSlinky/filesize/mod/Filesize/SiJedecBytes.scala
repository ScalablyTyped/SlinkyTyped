package typingsSlinky.filesize.mod.Filesize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiJedecBytes extends js.Object {
  
  var B: js.UndefOr[String] = js.native
  
  var EB: js.UndefOr[String] = js.native
  
  var GB: js.UndefOr[String] = js.native
  
  var KB: js.UndefOr[String] = js.native
  
  var MB: js.UndefOr[String] = js.native
  
  var PB: js.UndefOr[String] = js.native
  
  var TB: js.UndefOr[String] = js.native
  
  var YB: js.UndefOr[String] = js.native
  
  var ZB: js.UndefOr[String] = js.native
}
object SiJedecBytes {
  
  @scala.inline
  def apply(): SiJedecBytes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiJedecBytes]
  }
  
  @scala.inline
  implicit class SiJedecBytesOps[Self <: SiJedecBytes] (val x: Self) extends AnyVal {
    
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
    def setB(value: String): Self = this.set("B", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("B", js.undefined)
    
    @scala.inline
    def setEB(value: String): Self = this.set("EB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEB: Self = this.set("EB", js.undefined)
    
    @scala.inline
    def setGB(value: String): Self = this.set("GB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGB: Self = this.set("GB", js.undefined)
    
    @scala.inline
    def setKB(value: String): Self = this.set("KB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKB: Self = this.set("KB", js.undefined)
    
    @scala.inline
    def setMB(value: String): Self = this.set("MB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMB: Self = this.set("MB", js.undefined)
    
    @scala.inline
    def setPB(value: String): Self = this.set("PB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePB: Self = this.set("PB", js.undefined)
    
    @scala.inline
    def setTB(value: String): Self = this.set("TB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTB: Self = this.set("TB", js.undefined)
    
    @scala.inline
    def setYB(value: String): Self = this.set("YB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYB: Self = this.set("YB", js.undefined)
    
    @scala.inline
    def setZB(value: String): Self = this.set("ZB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZB: Self = this.set("ZB", js.undefined)
  }
}
