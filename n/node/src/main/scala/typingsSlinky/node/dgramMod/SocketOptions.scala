package typingsSlinky.node.dgramMod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.dnsMod.LookupOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketOptions extends js.Object {
  /**
    * @default false
    */
  var ipv6Only: js.UndefOr[Boolean] = js.native
  var lookup: js.UndefOr[
    js.Function3[
      /* hostname */ String, 
      /* options */ LookupOneOptions, 
      /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit], 
      Unit
    ]
  ] = js.native
  var recvBufferSize: js.UndefOr[Double] = js.native
  var reuseAddr: js.UndefOr[Boolean] = js.native
  var sendBufferSize: js.UndefOr[Double] = js.native
  var `type`: SocketType = js.native
}

object SocketOptions {
  @scala.inline
  def apply(`type`: SocketType): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: SocketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv6Only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Only")(js.undefined)
        ret
    }
    @scala.inline
    def withLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.undefined)
        ret
    }
    @scala.inline
    def withRecvBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recvBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecvBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recvBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReuseAddr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reuseAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReuseAddr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reuseAddr")(js.undefined)
        ret
    }
    @scala.inline
    def withSendBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendBufferSize")(js.undefined)
        ret
    }
  }
  
}

