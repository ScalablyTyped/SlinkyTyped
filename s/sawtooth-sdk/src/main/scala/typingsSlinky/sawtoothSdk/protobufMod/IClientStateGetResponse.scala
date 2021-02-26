package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientStateGetResponse extends StObject {
  
  /** ClientStateGetResponse stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.native
  
  /** ClientStateGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
  
  /** ClientStateGetResponse value */
  var value: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}
object IClientStateGetResponse {
  
  @scala.inline
  def apply(): IClientStateGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateGetResponse]
  }
  
  @scala.inline
  implicit class IClientStateGetResponseMutableBuilder[Self <: IClientStateGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateRootNull: Self = StObject.set(x, "stateRoot", null)
    
    @scala.inline
    def setStateRootUndefined: Self = StObject.set(x, "stateRoot", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
