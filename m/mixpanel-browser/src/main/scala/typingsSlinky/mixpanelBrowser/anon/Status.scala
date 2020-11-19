package typingsSlinky.mixpanelBrowser.anon

import typingsSlinky.mixpanelBrowser.mixpanelBrowserNumbers.`0`
import typingsSlinky.mixpanelBrowser.mod.VerboseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends VerboseResponse {
  
  var error: String = js.native
  
  var status: `0` = js.native
}
object Status {
  
  @scala.inline
  def apply(error: String, status: `0`): Status = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `0`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
