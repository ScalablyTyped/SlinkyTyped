package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusBlocksGetResponse extends js.Object {
  /** ConsensusBlocksGetResponse blocks */
  var blocks: js.UndefOr[js.Array[IConsensusBlock] | Null] = js.native
  /** ConsensusBlocksGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IConsensusBlocksGetResponse {
  @scala.inline
  def apply(): IConsensusBlocksGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBlocksGetResponse]
  }
  @scala.inline
  implicit class IConsensusBlocksGetResponseOps[Self <: IConsensusBlocksGetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocks(value: js.Array[IConsensusBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(js.undefined)
        ret
    }
    @scala.inline
    def withBlocksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(null)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(null)
        ret
    }
  }
  
}

