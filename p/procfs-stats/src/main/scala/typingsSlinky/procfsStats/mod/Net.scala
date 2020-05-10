package typingsSlinky.procfsStats.mod

import typingsSlinky.procfsStats.AnonReceive
import typingsSlinky.procfsStats.AnonReceiveString
import typingsSlinky.procfsStats.AnonTransmit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Net extends js.Object {
  var Interface: String = js.native
  var bytes: AnonReceive = js.native
  var carrier: AnonTransmit = js.native
  var colls: AnonTransmit = js.native
  var compressed: AnonReceive = js.native
  var drop: AnonReceive = js.native
  var errs: AnonReceive = js.native
  var fifo: AnonReceive = js.native
  var frame: AnonReceiveString = js.native
  var multicast: AnonReceiveString = js.native
  var packets: AnonReceive = js.native
}

object Net {
  @scala.inline
  def apply(
    Interface: String,
    bytes: AnonReceive,
    carrier: AnonTransmit,
    colls: AnonTransmit,
    compressed: AnonReceive,
    drop: AnonReceive,
    errs: AnonReceive,
    fifo: AnonReceive,
    frame: AnonReceiveString,
    multicast: AnonReceiveString,
    packets: AnonReceive
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
    def withBytes(value: AnonReceive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCarrier(value: AnonTransmit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColls(value: AnonTransmit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressed(value: AnonReceive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrop(value: AnonReceive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrs(value: AnonReceive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFifo(value: AnonReceive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fifo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: AnonReceiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulticast(value: AnonReceiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackets(value: AnonReceive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

