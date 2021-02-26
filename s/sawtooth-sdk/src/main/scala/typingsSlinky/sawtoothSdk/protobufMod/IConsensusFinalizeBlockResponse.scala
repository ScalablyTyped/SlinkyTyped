package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusFinalizeBlockResponse extends StObject {
  
  /** ConsensusFinalizeBlockResponse blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  
  /** ConsensusFinalizeBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IConsensusFinalizeBlockResponse {
  
  @scala.inline
  def apply(): IConsensusFinalizeBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusFinalizeBlockResponse]
  }
  
  @scala.inline
  implicit class IConsensusFinalizeBlockResponseMutableBuilder[Self <: IConsensusFinalizeBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    @scala.inline
    def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
