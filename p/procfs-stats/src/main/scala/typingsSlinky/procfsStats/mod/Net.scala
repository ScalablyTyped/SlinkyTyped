package typingsSlinky.procfsStats.mod

import typingsSlinky.procfsStats.anon.Receive
import typingsSlinky.procfsStats.anon.ReceiveString
import typingsSlinky.procfsStats.anon.Transmit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Net extends js.Object {
  var Interface: String = js.native
  var bytes: Receive = js.native
  var carrier: Transmit = js.native
  var colls: Transmit = js.native
  var compressed: Receive = js.native
  var drop: Receive = js.native
  var errs: Receive = js.native
  var fifo: Receive = js.native
  var frame: ReceiveString = js.native
  var multicast: ReceiveString = js.native
  var packets: Receive = js.native
}

object Net {
  @scala.inline
  def apply(
    Interface: String,
    bytes: Receive,
    carrier: Transmit,
    colls: Transmit,
    compressed: Receive,
    drop: Receive,
    errs: Receive,
    fifo: Receive,
    frame: ReceiveString,
    multicast: ReceiveString,
    packets: Receive
  ): Net = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], colls = colls.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], errs = errs.asInstanceOf[js.Any], fifo = fifo.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], multicast = multicast.asInstanceOf[js.Any], packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Net]
  }
  @scala.inline
  implicit class NetOps[Self <: Net] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytes(value: Receive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCarrier(value: Transmit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColls(value: Transmit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressed(value: Receive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrop(value: Receive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrs(value: Receive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFifo(value: Receive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fifo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: ReceiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulticast(value: ReceiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackets(value: Receive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

