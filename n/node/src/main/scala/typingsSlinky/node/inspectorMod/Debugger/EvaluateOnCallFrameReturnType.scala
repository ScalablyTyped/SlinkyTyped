package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.ExceptionDetails
import typingsSlinky.node.inspectorMod.Runtime.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluateOnCallFrameReturnType extends js.Object {
  
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.native
  
  /**
    * Object wrapper for the evaluation result.
    */
  var result: RemoteObject = js.native
}
object EvaluateOnCallFrameReturnType {
  
  @scala.inline
  def apply(result: RemoteObject): EvaluateOnCallFrameReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnCallFrameReturnType]
  }
  
  @scala.inline
  implicit class EvaluateOnCallFrameReturnTypeOps[Self <: EvaluateOnCallFrameReturnType] (val x: Self) extends AnyVal {
    
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
    def setResult(value: RemoteObject): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = this.set("exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptionDetails: Self = this.set("exceptionDetails", js.undefined)
  }
}
