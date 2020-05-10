package typingsSlinky.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDns extends js.Object {
  var dns: Double = js.native
  var download: Double = js.native
  var firstByte: Double = js.native
  var tcp: Double = js.native
  var total: Double = js.native
  @JSName("wait")
  var wait_FAnonDns: Double = js.native
}

object AnonDns {
  @scala.inline
  def apply(dns: Double, download: Double, firstByte: Double, tcp: Double, total: Double, wait: Double): AnonDns = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], firstByte = firstByte.asInstanceOf[js.Any], tcp = tcp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDns]
  }
  @scala.inline
  implicit class AnonDnsOps[Self <: AnonDns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstByte(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTcp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

