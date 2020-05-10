package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusFailBlockRequest extends js.Object {
  /** ConsensusFailBlockRequest blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}

object IConsensusFailBlockRequest {
  @scala.inline
  def apply(): IConsensusFailBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusFailBlockRequest]
  }
  @scala.inline
  implicit class IConsensusFailBlockRequestOps[Self <: IConsensusFailBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockId(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockId")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockId")(null)
        ret
    }
  }
  
}

