package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for setting a breakpoint.
  */
@js.native
trait SchemaSetBreakpointResponse extends js.Object {
  
  /**
    * Breakpoint resource. The field `id` is guaranteed to be set (in addition
    * to the echoed fileds).
    */
  var breakpoint: js.UndefOr[SchemaBreakpoint] = js.native
}
object SchemaSetBreakpointResponse {
  
  @scala.inline
  def apply(): SchemaSetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetBreakpointResponse]
  }
  
  @scala.inline
  implicit class SchemaSetBreakpointResponseOps[Self <: SchemaSetBreakpointResponse] (val x: Self) extends AnyVal {
    
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
    def setBreakpoint(value: SchemaBreakpoint): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpoint: Self = this.set("breakpoint", js.undefined)
  }
}
