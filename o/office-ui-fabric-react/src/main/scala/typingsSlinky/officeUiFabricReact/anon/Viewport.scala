package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewport extends js.Object {
  
  var viewport: js.UndefOr[IViewport] = js.native
}
object Viewport {
  
  @scala.inline
  def apply(): Viewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport]
  }
  
  @scala.inline
  implicit class ViewportOps[Self <: Viewport] (val x: Self) extends AnyVal {
    
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
    def setViewport(value: IViewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
}
