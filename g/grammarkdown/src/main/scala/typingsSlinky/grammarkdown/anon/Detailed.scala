package typingsSlinky.grammarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detailed extends js.Object {
  
  var detailed: js.UndefOr[Boolean] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
}
object Detailed {
  
  @scala.inline
  def apply(): Detailed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detailed]
  }
  
  @scala.inline
  implicit class DetailedOps[Self <: Detailed] (val x: Self) extends AnyVal {
    
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
    def setDetailed(value: Boolean): Self = this.set("detailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailed: Self = this.set("detailed", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
}
