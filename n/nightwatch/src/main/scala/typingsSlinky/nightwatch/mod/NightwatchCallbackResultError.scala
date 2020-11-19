package typingsSlinky.nightwatch.mod

import typingsSlinky.nightwatch.anon.Class
import typingsSlinky.nightwatch.nightwatchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchCallbackResultError
  extends NightwatchCallbackResult[js.Any] {
  
  var state: js.Error | String = js.native
  
  var status: `1` = js.native
  
   // we cannot use `number` so giving it a "symbolic" value allows to disjoint the union
  var value: Class = js.native
}
object NightwatchCallbackResultError {
  
  @scala.inline
  def apply(state: js.Error | String, status: `1`, value: Class): NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchCallbackResultError]
  }
  
  @scala.inline
  implicit class NightwatchCallbackResultErrorOps[Self <: NightwatchCallbackResultError] (val x: Self) extends AnyVal {
    
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
    def setStateError(value: js.Error): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Error | String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `1`): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Class): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
