package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusInitializeBlockRequest extends StObject {
  
  /** ConsensusInitializeBlockRequest previousId */
  var previousId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}
object IConsensusInitializeBlockRequest {
  
  @scala.inline
  def apply(): IConsensusInitializeBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusInitializeBlockRequest]
  }
  
  @scala.inline
  implicit class IConsensusInitializeBlockRequestMutableBuilder[Self <: IConsensusInitializeBlockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviousId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "previousId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousIdNull: Self = StObject.set(x, "previousId", null)
    
    @scala.inline
    def setPreviousIdUndefined: Self = StObject.set(x, "previousId", js.undefined)
  }
}
