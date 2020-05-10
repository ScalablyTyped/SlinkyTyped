package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusRegisterResponse extends js.Object {
  /** ConsensusRegisterResponse chainHead */
  var chainHead: js.UndefOr[IConsensusBlock | Null] = js.native
  /** ConsensusRegisterResponse peers */
  var peers: js.UndefOr[js.Array[IConsensusPeerInfo] | Null] = js.native
  /** ConsensusRegisterResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IConsensusRegisterResponse {
  @scala.inline
  def apply(): IConsensusRegisterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusRegisterResponse]
  }
  @scala.inline
  implicit class IConsensusRegisterResponseOps[Self <: IConsensusRegisterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChainHead(value: IConsensusBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainHead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChainHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainHead")(js.undefined)
        ret
    }
    @scala.inline
    def withChainHeadNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainHead")(null)
        ret
    }
    @scala.inline
    def withPeers(value: js.Array[IConsensusPeerInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peers")(js.undefined)
        ret
    }
    @scala.inline
    def withPeersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peers")(null)
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

