package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10NetworkProxyServer extends js.Object {
  // Address to the proxy server. Specify an address in the format [':']
  var address: js.UndefOr[String] = js.native
  /**
    * Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with
    * what is specified in this node.
    */
  var exceptions: js.UndefOr[js.Array[String]] = js.native
  // Specifies whether the proxy server should be used for local (intranet) addresses.
  var useForLocalAddresses: js.UndefOr[Boolean] = js.native
}

object Windows10NetworkProxyServer {
  @scala.inline
  def apply(): Windows10NetworkProxyServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10NetworkProxyServer]
  }
  @scala.inline
  implicit class Windows10NetworkProxyServerOps[Self <: Windows10NetworkProxyServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withExceptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUseForLocalAddresses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useForLocalAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseForLocalAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useForLocalAddresses")(js.undefined)
        ret
    }
  }
  
}

