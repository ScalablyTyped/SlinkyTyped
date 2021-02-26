package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusCause extends StObject {
  
  /**
    * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed. Fields
    * may appear more than once in an array of causes due to fields having multiple errors. Optional. Examples: "name" - the field "name" on the current resource "items[0].name" - the
    * field "name" on the first array entry in "items" +optional
    */
  var field: js.UndefOr[String] = js.native
  
  /** A human-readable description of the cause of the error. This field may be presented as-is to a reader. +optional */
  var message: js.UndefOr[String] = js.native
  
  /** A machine-readable description of the cause of the error. If this value is empty there is no information available. +optional */
  var reason: js.UndefOr[String] = js.native
}
object StatusCause {
  
  @scala.inline
  def apply(): StatusCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusCause]
  }
  
  @scala.inline
  implicit class StatusCauseMutableBuilder[Self <: StatusCause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
