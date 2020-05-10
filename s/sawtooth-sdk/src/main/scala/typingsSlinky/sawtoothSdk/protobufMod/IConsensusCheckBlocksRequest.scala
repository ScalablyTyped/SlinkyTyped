package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusCheckBlocksRequest extends js.Object {
  /** ConsensusCheckBlocksRequest blockIds */
  var blockIds: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.native
}

object IConsensusCheckBlocksRequest {
  @scala.inline
  def apply(): IConsensusCheckBlocksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusCheckBlocksRequest]
  }
  @scala.inline
  implicit class IConsensusCheckBlocksRequestOps[Self <: IConsensusCheckBlocksRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockIds(value: js.Array[js.typedarray.Uint8Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIds")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIds")(null)
        ret
    }
  }
  
}

