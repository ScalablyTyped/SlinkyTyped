package typingsSlinky.ncom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComServerOptions extends js.Object {
  
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  
  var pauseOnConnect: js.UndefOr[Boolean] = js.native
}
object ComServerOptions {
  
  @scala.inline
  def apply(): ComServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComServerOptions]
  }
  
  @scala.inline
  implicit class ComServerOptionsOps[Self <: ComServerOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowHalfOpen(value: Boolean): Self = this.set("allowHalfOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHalfOpen: Self = this.set("allowHalfOpen", js.undefined)
    
    @scala.inline
    def setPauseOnConnect(value: Boolean): Self = this.set("pauseOnConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseOnConnect: Self = this.set("pauseOnConnect", js.undefined)
  }
}
