package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceError extends js.Object {
  
  /**
    * The message for the error.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * The error type.
    */
  var Type: js.UndefOr[NamespaceErrorType] = js.native
}
object NamespaceError {
  
  @scala.inline
  def apply(): NamespaceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceError]
  }
  
  @scala.inline
  implicit class NamespaceErrorOps[Self <: NamespaceError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setType(value: NamespaceErrorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
