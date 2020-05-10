package typingsSlinky.nanomsg.mod

import typingsSlinky.nanomsg.nanomsgStrings.binary
import typingsSlinky.nanomsg.nanomsgStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var chan: js.UndefOr[js.Array[String]] = js.native
  var ipv6: js.UndefOr[Boolean] = js.native
  var linger: js.UndefOr[Double] = js.native
  var maxreconn: js.UndefOr[Double] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var rcvbuf: js.UndefOr[Double] = js.native
  var rcvmaxsize: js.UndefOr[Double] = js.native
  var rcvprio: js.UndefOr[Double] = js.native
  var rcvtimeo: js.UndefOr[Double] = js.native
  var reconn: js.UndefOr[Double] = js.native
  var sndbuf: js.UndefOr[Double] = js.native
  var sndprio: js.UndefOr[Double] = js.native
  var sndtimeo: js.UndefOr[Double] = js.native
  var tcpnodelay: js.UndefOr[Boolean] = js.native
  var wsopt: js.UndefOr[text | binary] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChan(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chan")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6")(js.undefined)
        ret
    }
    @scala.inline
    def withLinger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linger")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxreconn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxreconn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxreconn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxreconn")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withRcvbuf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcvbuf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRcvbuf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcvbuf")(js.undefined)
        ret
    }
    @scala.inline
    def withRcvmaxsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcvmaxsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRcvmaxsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcvmaxsize")(js.undefined)
        ret
    }
    @scala.inline
    def withRcvprio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcvprio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRcvprio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcvprio")(js.undefined)
        ret
    }
    @scala.inline
    def withRcvtimeo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcvtimeo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRcvtimeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcvtimeo")(js.undefined)
        ret
    }
    @scala.inline
    def withReconn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconn")(js.undefined)
        ret
    }
    @scala.inline
    def withSndbuf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sndbuf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSndbuf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sndbuf")(js.undefined)
        ret
    }
    @scala.inline
    def withSndprio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sndprio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSndprio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sndprio")(js.undefined)
        ret
    }
    @scala.inline
    def withSndtimeo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sndtimeo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSndtimeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sndtimeo")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpnodelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpnodelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpnodelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpnodelay")(js.undefined)
        ret
    }
    @scala.inline
    def withWsopt(value: text | binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsopt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsopt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsopt")(js.undefined)
        ret
    }
  }
  
}

