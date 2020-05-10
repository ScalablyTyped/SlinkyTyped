package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOptions extends BrowserOptions {
  /**
    * A browser url to connect to, in format `http://${host}:${port}`.
    * Use interchangeably with browserWSEndpoint to let Puppeteer fetch it from metadata endpoint.
    */
  var browserURL: js.UndefOr[String] = js.native
  /** A browser websocket endpoint to connect to. */
  var browserWSEndpoint: js.UndefOr[String] = js.native
  /**
    * **Experimental** Specify a custom transport object for Puppeteer to use.
    */
  var transport: js.UndefOr[ConnectionTransport] = js.native
}

object ConnectOptions {
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserURL")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserWSEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserWSEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserWSEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserWSEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: ConnectionTransport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
  }
  
}

