package typingsSlinky.nextReactDevOverlay.errorsMod

import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayBooleans.`true`
import typingsSlinky.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadyRuntimeError extends js.Object {
  
  var error: js.Error = js.native
  
  var frames: js.Array[OriginalStackFrame] = js.native
  
  var id: Double = js.native
  
  var runtime: `true` = js.native
}
object ReadyRuntimeError {
  
  @scala.inline
  def apply(error: js.Error, frames: js.Array[OriginalStackFrame], id: Double, runtime: `true`): ReadyRuntimeError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadyRuntimeError]
  }
  
  @scala.inline
  implicit class ReadyRuntimeErrorOps[Self <: ReadyRuntimeError] (val x: Self) extends AnyVal {
    
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
    def setError(value: js.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesVarargs(value: OriginalStackFrame*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[OriginalStackFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: `true`): Self = this.set("runtime", value.asInstanceOf[js.Any])
  }
}
