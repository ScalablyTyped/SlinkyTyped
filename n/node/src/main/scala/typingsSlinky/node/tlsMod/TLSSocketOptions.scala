package typingsSlinky.node.tlsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TLSSocketOptions
  extends SecureContextOptions
     with CommonConnectionOptions {
  /**
    * If true the TLS socket will be instantiated in server-mode.
    * Defaults to false.
    */
  var isServer: js.UndefOr[Boolean] = js.native
  /**
    * If true, specifies that the OCSP status request extension will be
    * added to the client hello and an 'OCSPResponse' event will be
    * emitted on the socket before establishing a secure communication
    */
  var requestOCSP: js.UndefOr[Boolean] = js.native
  /**
    * An optional net.Server instance.
    */
  var server: js.UndefOr[typingsSlinky.node.netMod.Server] = js.native
  /**
    * An optional Buffer instance containing a TLS session.
    */
  var session: js.UndefOr[Buffer] = js.native
}

object TLSSocketOptions {
  @scala.inline
  def apply(): TLSSocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSSocketOptions]
  }
  @scala.inline
  implicit class TLSSocketOptionsOps[Self <: TLSSocketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isServer")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOCSP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOCSP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOCSP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOCSP")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: typingsSlinky.node.netMod.Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

