package typingsSlinky.engineIo.mod

import typingsSlinky.engineIo.engineIoStrings.uws
import typingsSlinky.engineIo.engineIoStrings.ws
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  /**
  		 * A function that receives a given handshake or upgrade request as its first parameter,
  		 * and can decide whether to continue or not. The second argument is a function that needs
  		 * to be called with the decided information: fn(err, success), where success is a boolean
  		 * value where false means that the request is rejected, and err is an error code.
  		 */
  var allowRequest: js.UndefOr[AllowRequestFunction] = js.native
  /**
  		 * whether to allow transport upgrades (true)
  		 */
  var allowUpgrades: js.UndefOr[Boolean] = js.native
  /**
  		 * name of the HTTP cookie that contains the client sid to send as part of handshake response headers. Set to false to not send one. (io)
  		 */
  var cookie: js.UndefOr[String | Boolean] = js.native
  /**
  		 * If true HttpOnly io cookie cannot be accessed by client-side APIs,
  		 * such as JavaScript. (true) This option has no effect
  		 * if cookie or cookiePath is set to false.
  		 */
  var cookieHttpOnly: js.UndefOr[Boolean] = js.native
  /**
  		 * path of the above cookie option. If false, no path will be sent,
  		 * which means browsers will only send the cookie on the engine.io
  		 * attached path (/engine.io). Set false to not save io cookie
  		 * on all requests. (/)
  		 */
  var cookiePath: js.UndefOr[String | Boolean] = js.native
  /**
  		 * parameters of the http compression for the polling transports (see zlib api docs). Set to false to disable. (true)
  		 */
  var httpCompression: js.UndefOr[js.Any] = js.native
  /**
  		 * an optional packet which will be concatenated to the handshake packet emitted by Engine.IO.
  		 */
  var initialPacket: js.UndefOr[Message] = js.native
  /**
  		 * how many bytes or characters a message can be, before closing the session (to avoid DoS). Default value is 10E7.
  		 */
  var maxHttpBufferSize: js.UndefOr[Double] = js.native
  /**
  		 * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable. (true)
  		 */
  var perMessageDeflate: js.UndefOr[js.Any] = js.native
  /**
  		 * how many ms before sending a new ping packet (25000)
  		 */
  var pingInterval: js.UndefOr[Double] = js.native
  /**
  		 * how many ms without a pong packet to consider the connection closed (60000)
  		 */
  var pingTimeout: js.UndefOr[Double] = js.native
  /**
  		 * to allow connections to (['polling', 'websocket'])
  		 */
  var transports: js.UndefOr[js.Array[Transport]] = js.native
  /**
  		 * how many ms before an uncompleted transport upgrade is cancelled (10000)
  		 */
  var upgradeTimeout: js.UndefOr[Double] = js.native
  /**
  		 * what WebSocket server implementation to use. Specified module must
  		 * conform to the ws interface (see ws module api docs). Default value is ws.
  		 * An alternative c++ addon is also available by installing uws module.
  		 */
  var wsEngine: js.UndefOr[ws | uws] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowRequest(
      value: (/* req */ IncomingMessage, /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAllowRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUpgrades(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUpgrades")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUpgrades: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUpgrades")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieHttpOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieHttpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieHttpOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieHttpOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withCookiePath(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookiePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiePath")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpCompression(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCompression")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPacketArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPacket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialPacketArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPacket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialPacket(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPacket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPacket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPacket")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHttpBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHttpBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHttpBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHttpBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPerMessageDeflate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perMessageDeflate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerMessageDeflate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perMessageDeflate")(js.undefined)
        ret
    }
    @scala.inline
    def withPingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPingTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransports(value: js.Array[Transport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWsEngine(value: ws | uws): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsEngine")(js.undefined)
        ret
    }
  }
  
}

