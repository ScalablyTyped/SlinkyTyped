package typingsSlinky.alexaSdk.anon

import typingsSlinky.alexaSdk.mod.ListItemObjectStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Href extends js.Object {
  
  var href: String = js.native
  
  var status: ListItemObjectStatus = js.native
}
object Href {
  
  @scala.inline
  def apply(href: String, status: ListItemObjectStatus): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  
  @scala.inline
  implicit class HrefOps[Self <: Href] (val x: Self) extends AnyVal {
    
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ListItemObjectStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
