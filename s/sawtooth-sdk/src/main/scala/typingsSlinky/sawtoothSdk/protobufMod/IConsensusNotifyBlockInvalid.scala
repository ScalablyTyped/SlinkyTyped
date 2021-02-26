package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusNotifyBlockInvalid extends StObject {
  
  /** ConsensusNotifyBlockInvalid blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}
object IConsensusNotifyBlockInvalid {
  
  @scala.inline
  def apply(): IConsensusNotifyBlockInvalid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyBlockInvalid]
  }
  
  @scala.inline
  implicit class IConsensusNotifyBlockInvalidMutableBuilder[Self <: IConsensusNotifyBlockInvalid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    @scala.inline
    def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
  }
}
