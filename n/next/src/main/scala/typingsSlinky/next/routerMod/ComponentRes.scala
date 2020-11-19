package typingsSlinky.next.routerMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentRes extends js.Object {
  
  var mod: js.Any = js.native
  
  var page: ReactComponentClass[js.Object] = js.native
}
object ComponentRes {
  
  @scala.inline
  def apply(mod: js.Any, page: ReactComponentClass[js.Object]): ComponentRes = {
    val __obj = js.Dynamic.literal(mod = mod.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRes]
  }
  
  @scala.inline
  implicit class ComponentResOps[Self <: ComponentRes] (val x: Self) extends AnyVal {
    
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
    def setMod(value: js.Any): Self = this.set("mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: ReactComponentClass[js.Object]): Self = this.set("page", value.asInstanceOf[js.Any])
  }
}
