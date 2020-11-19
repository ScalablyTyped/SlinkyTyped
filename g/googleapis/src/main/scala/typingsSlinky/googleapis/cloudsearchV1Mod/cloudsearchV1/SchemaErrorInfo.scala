package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error information about the response.
  */
@js.native
trait SchemaErrorInfo extends js.Object {
  
  var errorMessages: js.UndefOr[js.Array[SchemaErrorMessage]] = js.native
}
object SchemaErrorInfo {
  
  @scala.inline
  def apply(): SchemaErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorInfo]
  }
  
  @scala.inline
  implicit class SchemaErrorInfoOps[Self <: SchemaErrorInfo] (val x: Self) extends AnyVal {
    
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
    def setErrorMessagesVarargs(value: SchemaErrorMessage*): Self = this.set("errorMessages", js.Array(value :_*))
    
    @scala.inline
    def setErrorMessages(value: js.Array[SchemaErrorMessage]): Self = this.set("errorMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessages: Self = this.set("errorMessages", js.undefined)
  }
}
