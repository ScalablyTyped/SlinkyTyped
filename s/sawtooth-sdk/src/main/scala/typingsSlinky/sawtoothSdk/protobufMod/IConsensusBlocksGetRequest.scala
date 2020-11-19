package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusBlocksGetRequest extends js.Object {
  
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
  implicit class IConsensusBlocksGetRequestOps[Self <: IConsensusBlocksGetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockIdsVarargs(value: js.typedarray.Uint8Array*): Self = this.set("blockIds", js.Array(value :_*))
    
    @scala.inline
    def setBlockIds(value: js.Array[js.typedarray.Uint8Array]): Self = this.set("blockIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockIds: Self = this.set("blockIds", js.undefined)
    
    @scala.inline
    def setBlockIdsNull: Self = this.set("blockIds", null)
  }
}
