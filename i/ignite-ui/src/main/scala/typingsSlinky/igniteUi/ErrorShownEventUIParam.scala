package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorShownEventUIParam extends StObject {
  
  /**
    * Populated with options for the specific field in the collection or null.
    */
  var fieldOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the text of message.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to the target of the message.
    */
  var target: js.UndefOr[String] = js.native
}
object ErrorShownEventUIParam {
  
  @scala.inline
  def apply(): ErrorShownEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorShownEventUIParam]
  }
  
  @scala.inline
  implicit class ErrorShownEventUIParamMutableBuilder[Self <: ErrorShownEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldOptions(value: js.Any): Self = StObject.set(x, "fieldOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldOptionsUndefined: Self = StObject.set(x, "fieldOptions", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
