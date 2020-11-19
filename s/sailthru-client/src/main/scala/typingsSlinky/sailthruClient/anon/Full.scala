package typingsSlinky.sailthruClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Full extends js.Object {
  
  var full: js.UndefOr[Url] = js.native
  
  var thumb: js.UndefOr[Url] = js.native
}
object Full {
  
  @scala.inline
  def apply(): Full = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit class FullOps[Self <: Full] (val x: Self) extends AnyVal {
    
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
    def setFull(value: Url): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    
    @scala.inline
    def setThumb(value: Url): Self = this.set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
  }
}
