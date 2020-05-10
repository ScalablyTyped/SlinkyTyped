package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusStateGetRequest extends js.Object {
  /** ConsensusStateGetRequest addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.native
  /** ConsensusStateGetRequest blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}

object IConsensusStateGetRequest {
  @scala.inline
  def apply(): IConsensusStateGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusStateGetRequest]
  }
  @scala.inline
  implicit class IConsensusStateGetRequestOps[Self <: IConsensusStateGetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(null)
        ret
    }
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

