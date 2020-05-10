package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsochronousTransferInfo extends js.Object {
  /** The length of each of the packets in this transfer. */
  var packetLength: integer = js.native
  /** The total number of packets in this transfer. */
  var packets: integer = js.native
  /**
    * Transfer parameters.
    * The transfer length or data buffer specified in this parameter block is split
    * along packetLength boundaries to form the individual packets of the transfer.
    */
  var transferInfo: GenericTransferInfo = js.native
}

object IsochronousTransferInfo {
  @scala.inline
  def apply(packetLength: integer, packets: integer, transferInfo: GenericTransferInfo): IsochronousTransferInfo = {
    val __obj = js.Dynamic.literal(packetLength = packetLength.asInstanceOf[js.Any], packets = packets.asInstanceOf[js.Any], transferInfo = transferInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsochronousTransferInfo]
  }
  @scala.inline
  implicit class IsochronousTransferInfoOps[Self <: IsochronousTransferInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPacketLength(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackets(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferInfo(value: GenericTransferInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

