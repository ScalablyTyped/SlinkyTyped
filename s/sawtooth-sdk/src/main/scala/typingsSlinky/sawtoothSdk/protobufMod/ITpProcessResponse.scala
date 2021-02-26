package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpProcessResponse extends StObject {
  
  /** TpProcessResponse extendedData */
  var extendedData: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  
  /** TpProcessResponse message */
  var message: js.UndefOr[String | Null] = js.native
  
  /** TpProcessResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object ITpProcessResponse {
  
  @scala.inline
  def apply(): ITpProcessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpProcessResponse]
  }
  
  @scala.inline
  implicit class ITpProcessResponseMutableBuilder[Self <: ITpProcessResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "extendedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedDataNull: Self = StObject.set(x, "extendedData", null)
    
    @scala.inline
    def setExtendedDataUndefined: Self = StObject.set(x, "extendedData", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
