package typingsSlinky.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Udp extends js.Object {
  var drops: String = js.native
  var inode: String = js.native
  var local_address: String = js.native
  var pointer: String = js.native
  var ref: String = js.native
  var rem_address: String = js.native
  var retrnsmt: String = js.native
  var rx_queue: String = js.native
  var sl: String = js.native
  var st: String = js.native
  var timeout: String = js.native
  @JSName("tm->when")
  var `tm-Greaterthansignwhen`: String = js.native
  var tr: String = js.native
  var tx_queue: String = js.native
  var uid: String = js.native
}

object Udp {
  @scala.inline
  def apply(
    drops: String,
    inode: String,
    local_address: String,
    pointer: String,
    ref: String,
    rem_address: String,
    retrnsmt: String,
    rx_queue: String,
    sl: String,
    st: String,
    timeout: String,
    `tm-Greaterthansignwhen`: String,
    tr: String,
    tx_queue: String,
    uid: String
  ): Udp = {
    val __obj = js.Dynamic.literal(drops = drops.asInstanceOf[js.Any], inode = inode.asInstanceOf[js.Any], local_address = local_address.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rem_address = rem_address.asInstanceOf[js.Any], retrnsmt = retrnsmt.asInstanceOf[js.Any], rx_queue = rx_queue.asInstanceOf[js.Any], sl = sl.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], tx_queue = tx_queue.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("tm->when")(`tm-Greaterthansignwhen`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Udp]
  }
  @scala.inline
  implicit class UdpOps[Self <: Udp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrops(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRem_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rem_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetrnsmt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrnsmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx_queue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx_queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("st")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTm-Greaterthansignwhen`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tm->when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTx_queue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx_queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

