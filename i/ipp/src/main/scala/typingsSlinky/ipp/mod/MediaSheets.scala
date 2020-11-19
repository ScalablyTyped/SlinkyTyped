package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSheets extends js.Object {
  
  var blank: js.UndefOr[Double] = js.native
  
  var `full-color`: js.UndefOr[Double] = js.native
  
  var `highlight-color`: js.UndefOr[Double] = js.native
  
  var monochrome: js.UndefOr[Double] = js.native
}
object MediaSheets {
  
  @scala.inline
  def apply(): MediaSheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSheets]
  }
  
  @scala.inline
  implicit class MediaSheetsOps[Self <: MediaSheets] (val x: Self) extends AnyVal {
    
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
    def setBlank(value: Double): Self = this.set("blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlank: Self = this.set("blank", js.undefined)
    
    @scala.inline
    def `setFull-color`(value: Double): Self = this.set("full-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFull-color`: Self = this.set("full-color", js.undefined)
    
    @scala.inline
    def `setHighlight-color`(value: Double): Self = this.set("highlight-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHighlight-color`: Self = this.set("highlight-color", js.undefined)
    
    @scala.inline
    def setMonochrome(value: Double): Self = this.set("monochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonochrome: Self = this.set("monochrome", js.undefined)
  }
}
