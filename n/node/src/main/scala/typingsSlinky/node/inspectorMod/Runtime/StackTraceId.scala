package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If <code>debuggerId</code> is set stack trace comes from another debugger and can be resolved there. This allows to track cross-debugger calls. See <code>Runtime.StackTrace</code> and <code>Debugger.paused</code> for usages.
  * @experimental
  */
@js.native
trait StackTraceId extends js.Object {
  
  var debuggerId: js.UndefOr[UniqueDebuggerId] = js.native
  
  var id: String = js.native
}
object StackTraceId {
  
  @scala.inline
  def apply(id: String): StackTraceId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTraceId]
  }
  
  @scala.inline
  implicit class StackTraceIdOps[Self <: StackTraceId] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerId(value: UniqueDebuggerId): Self = this.set("debuggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebuggerId: Self = this.set("debuggerId", js.undefined)
  }
}
