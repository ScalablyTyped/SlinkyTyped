package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusBlock extends StObject {
  
  /** ConsensusBlock blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  
  /** ConsensusBlock blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** ConsensusBlock payload */
  var payload: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  
  /** ConsensusBlock previousId */
  var previousId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  
  /** ConsensusBlock signerId */
  var signerId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  
  /** ConsensusBlock summary */
  var summary: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}
object IConsensusBlock {
  
  @scala.inline
  def apply(): IConsensusBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBlock]
  }
  
  @scala.inline
  implicit class IConsensusBlockMutableBuilder[Self <: IConsensusBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    @scala.inline
    def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
    
    @scala.inline
    def setBlockNum(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = StObject.set(x, "blockNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNumNull: Self = StObject.set(x, "blockNum", null)
    
    @scala.inline
    def setBlockNumUndefined: Self = StObject.set(x, "blockNum", js.undefined)
    
    @scala.inline
    def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setPreviousId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "previousId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousIdNull: Self = StObject.set(x, "previousId", null)
    
    @scala.inline
    def setPreviousIdUndefined: Self = StObject.set(x, "previousId", js.undefined)
    
    @scala.inline
    def setSignerId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerIdNull: Self = StObject.set(x, "signerId", null)
    
    @scala.inline
    def setSignerIdUndefined: Self = StObject.set(x, "signerId", js.undefined)
    
    @scala.inline
    def setSummary(value: js.typedarray.Uint8Array): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
