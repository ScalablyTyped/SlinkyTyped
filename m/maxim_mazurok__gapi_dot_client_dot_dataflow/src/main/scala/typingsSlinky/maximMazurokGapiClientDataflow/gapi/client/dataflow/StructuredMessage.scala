package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructuredMessage extends StObject {
  
  /** Identifier for this message type. Used by external systems to internationalize or personalize message. */
  var messageKey: js.UndefOr[String] = js.native
  
  /** Human-readable version of message. */
  var messageText: js.UndefOr[String] = js.native
  
  /** The structured data associated with this message. */
  var parameters: js.UndefOr[js.Array[Parameter]] = js.native
}
object StructuredMessage {
  
  @scala.inline
  def apply(): StructuredMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredMessage]
  }
  
  @scala.inline
  implicit class StructuredMessageMutableBuilder[Self <: StructuredMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
    
    @scala.inline
    def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[Parameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
