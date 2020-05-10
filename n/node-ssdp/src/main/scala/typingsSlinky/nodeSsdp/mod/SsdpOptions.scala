package typingsSlinky.nodeSsdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SsdpOptions extends js.Object {
  /** A logger function to use instead of the default. The first argument to the function can contain a format string. */
  var customLogger: js.UndefOr[js.Function2[/* format */ String, /* repeated */ js.Any, Unit]] = js.native
  /** Path to SSDP description file */
  var description: js.UndefOr[String] = js.native
  /** Additional headers */
  var headers: js.UndefOr[SsdpHeaders] = js.native
  /**
  	 * SSDP multicast group
  	 * @default '239.255.255.250'
  	 */
  var ssdpIp: js.UndefOr[String] = js.native
  /**
  	 * SSDP port
  	 * @default 1900
  	 */
  var ssdpPort: js.UndefOr[Double] = js.native
  /**
  	 * SSDP signature
  	 * @default 'node.js/NODE_VERSION UPnP/1.1 node-ssdp/PACKAGE_VERSION'
  	 */
  var ssdpSig: js.UndefOr[String] = js.native
  /**
  	 * Multicast TTL
  	 * @default 4
  	 */
  var ssdpTtl: js.UndefOr[Double] = js.native
}

object SsdpOptions {
  @scala.inline
  def apply(): SsdpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsdpOptions]
  }
  @scala.inline
  implicit class SsdpOptionsOps[Self <: SsdpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomLogger(value: (/* format */ String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLogger")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLogger")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: SsdpHeaders): Self = {
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
    def withSsdpIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssdpIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsdpIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssdpIp")(js.undefined)
        ret
    }
    @scala.inline
    def withSsdpPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssdpPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsdpPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssdpPort")(js.undefined)
        ret
    }
    @scala.inline
    def withSsdpSig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssdpSig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsdpSig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssdpSig")(js.undefined)
        ret
    }
    @scala.inline
    def withSsdpTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssdpTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsdpTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssdpTtl")(js.undefined)
        ret
    }
  }
  
}

