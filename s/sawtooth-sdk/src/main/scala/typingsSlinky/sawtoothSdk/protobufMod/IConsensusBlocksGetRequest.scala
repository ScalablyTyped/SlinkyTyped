package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusBlocksGetRequest extends StObject {
  
  /** ConsensusBlocksGetRequest blockIds */
  var blockIds: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.native
}
object IConsensusBlocksGetRequest {
  
  @scala.inline
  def apply(): IConsensusBlocksGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBlocksGetRequest]
  }
  
  @scala.inline
  implicit class IConsensusBlocksGetRequestMutableBuilder[Self <: IConsensusBlocksGetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockIds(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "blockIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdsNull: Self = StObject.set(x, "blockIds", null)
    
    @scala.inline
    def setBlockIdsUndefined: Self = StObject.set(x, "blockIds", js.undefined)
    
    @scala.inline
    def setBlockIdsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "blockIds", js.Array(value :_*))
  }
}
