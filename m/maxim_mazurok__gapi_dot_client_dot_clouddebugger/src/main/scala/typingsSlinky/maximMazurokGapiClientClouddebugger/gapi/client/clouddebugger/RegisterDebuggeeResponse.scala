package typingsSlinky.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterDebuggeeResponse extends js.Object {
  
  /** A unique ID generated for the agent. Each RegisterDebuggee request will generate a new agent ID. */
  var agentId: js.UndefOr[String] = js.native
  
  /**
    * Debuggee resource. The field `id` is guaranteed to be set (in addition to the echoed fields). If the field `is_disabled` is set to `true`, the agent should disable itself by
    * removing all breakpoints and detaching from the application. It should however continue to poll `RegisterDebuggee` until reenabled.
    */
  var debuggee: js.UndefOr[Debuggee] = js.native
}
object RegisterDebuggeeResponse {
  
  @scala.inline
  def apply(): RegisterDebuggeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDebuggeeResponse]
  }
  
  @scala.inline
  implicit class RegisterDebuggeeResponseOps[Self <: RegisterDebuggeeResponse] (val x: Self) extends AnyVal {
    
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
    def setAgentId(value: String): Self = this.set("agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentId: Self = this.set("agentId", js.undefined)
    
    @scala.inline
    def setDebuggee(value: Debuggee): Self = this.set("debuggee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebuggee: Self = this.set("debuggee", js.undefined)
  }
}
