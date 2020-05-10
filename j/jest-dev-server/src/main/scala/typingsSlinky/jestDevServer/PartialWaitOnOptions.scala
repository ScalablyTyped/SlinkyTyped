package typingsSlinky.jestDevServer

import typingsSlinky.std.Record
import typingsSlinky.waitOn.mod.HttpSignature
import typingsSlinky.waitOn.mod.WaitOnAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<wait-on.wait-on.WaitOnOptions> */
@js.native
trait PartialWaitOnOptions extends js.Object {
  var auth: js.UndefOr[WaitOnAuth] = js.native
  var delay: js.UndefOr[Double] = js.native
  var followAllRedirects: js.UndefOr[Boolean] = js.native
  var followRedirect: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[Record[String, _]] = js.native
  var httpSignature: js.UndefOr[HttpSignature] = js.native
  var httpTimeout: js.UndefOr[Double] = js.native
  var interval: js.UndefOr[Double] = js.native
  var log: js.UndefOr[Boolean] = js.native
  var resources: js.UndefOr[js.Array[String]] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var simultaneous: js.UndefOr[Double] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var tcpTimeout: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var window: js.UndefOr[Double] = js.native
}

object PartialWaitOnOptions {
  @scala.inline
  def apply(): PartialWaitOnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWaitOnOptions]
  }
  @scala.inline
  implicit class PartialWaitOnOptionsOps[Self <: PartialWaitOnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: WaitOnAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowAllRedirects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followAllRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowAllRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followAllRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowRedirect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpSignature(value: HttpSignature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withSimultaneous(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimultaneous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneous")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictSSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictSSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

