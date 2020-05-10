package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusNotifyPeerConnected extends js.Object {
  /** ConsensusNotifyPeerConnected peerInfo */
  var peerInfo: js.UndefOr[IConsensusPeerInfo | Null] = js.native
}

object IConsensusNotifyPeerConnected {
  @scala.inline
  def apply(): IConsensusNotifyPeerConnected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyPeerConnected]
  }
  @scala.inline
  implicit class IConsensusNotifyPeerConnectedOps[Self <: IConsensusNotifyPeerConnected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeerInfo(value: IConsensusPeerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerInfo")(null)
        ret
    }
  }
  
}

