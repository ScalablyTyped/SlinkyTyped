package typingsSlinky.naja.najaMod

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NajaEventMap extends js.Object {
  
  var abort: CustomEvent = js.native
  
  var before: CustomEvent = js.native
  
  var complete: CustomEvent = js.native
  
  var error: CustomEvent = js.native
  
  var init: CustomEvent = js.native
  
  var start: CustomEvent = js.native
  
  var success: CustomEvent = js.native
}
object NajaEventMap {
  
  @scala.inline
  def apply(
    abort: CustomEvent,
    before: CustomEvent,
    complete: CustomEvent,
    error: CustomEvent,
    init: CustomEvent,
    start: CustomEvent,
    success: CustomEvent
  ): NajaEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[NajaEventMap]
  }
  
  @scala.inline
  implicit class NajaEventMapOps[Self <: NajaEventMap] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: CustomEvent): Self = this.set("abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: CustomEvent): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: CustomEvent): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: CustomEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: CustomEvent): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: CustomEvent): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: CustomEvent): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
