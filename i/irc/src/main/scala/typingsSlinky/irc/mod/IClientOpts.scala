package typingsSlinky.irc.mod

import typingsSlinky.node.tlsMod.SecureContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientOpts extends js.Object {
  /**
    * Should we auto-reconnect to networks?
    * @default true
    */
  var autoConnect: js.UndefOr[Boolean] = js.native
  /**
    * Should we auto-rejoin channels?
    * @default false
    */
  var autoRejoin: js.UndefOr[Boolean] = js.native
  /**
    * Should we accept expired certificates?
    * @default false
    */
  var certExpired: js.UndefOr[Boolean] = js.native
  /**
    * Channel prefix
    * @default '&#'
    */
  var channelPrefixes: js.UndefOr[String] = js.native
  /**
    * Channels to join
    * @default []
    */
  var channels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Should we output debug messages to STDOUT?
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Encoding to use. See
    * https://nodejs.org/api/stream.html#stream_readable_setencoding_encoding
    * @default 'utf-8'
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * Should we queue our messages to ensure we don't get kicked?
    * @default false
    */
  var floodProtection: js.UndefOr[Boolean] = js.native
  /**
    * Delay between messages when flood protection is active
    * @default 1000
    */
  var floodProtectionDelay: js.UndefOr[Double] = js.native
  /**
    * Local interface to bind to for network connections. See
    * https://nodejs.org/api/net.html#net_socket_localaddress
    */
  var localAddress: js.UndefOr[String] = js.native
  /**
    * Characters to split a message at.
    * @default 512
    */
  var messageSplit: js.UndefOr[Double] = js.native
  /**
    * IRC username
    * @default ''
    */
  var password: js.UndefOr[String] = js.native
  /**
    * IRC connection port. See
    * https://nodejs.org/api/net.html#net_socket_remoteport
    * @default 6667
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * IRC "real name"
    * @default 'nodeJS IRC client'
    */
  var realName: js.UndefOr[String] = js.native
  /**
    * Should we use SASL authentication?
    * @default false
    */
  var sasl: js.UndefOr[Boolean] = js.native
  /**
    * Should SSL be used? Can either be true or crypto credentials.
    * @default false
    */
  var secure: js.UndefOr[Boolean | SecureContext] = js.native
  /**
    * Should we accept self-signed certificates?
    * @default false
    */
  var selfSigned: js.UndefOr[Boolean] = js.native
  /**
    * Should we output IRC errors?
    * @default false
    */
  var showErrors: js.UndefOr[Boolean] = js.native
  /**
    * Should we strip mIRC colors from the output messages?
    * @default false
    */
  var stripColors: js.UndefOr[Boolean] = js.native
  /**
    * IRC username
    * @default 'nodebot'
    */
  var userName: js.UndefOr[String] = js.native
}

object IClientOpts {
  @scala.inline
  def apply(): IClientOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientOpts]
  }
  @scala.inline
  implicit class IClientOptsOps[Self <: IClientOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRejoin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRejoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRejoin")(js.undefined)
        ret
    }
    @scala.inline
    def withCertExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certExpired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertExpired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certExpired")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelPrefixes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodProtection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodProtectionDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodProtectionDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodProtectionDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodProtectionDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageSplit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSplit")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withRealName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realName")(js.undefined)
        ret
    }
    @scala.inline
    def withSasl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sasl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSasl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sasl")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean | SecureContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfSigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfSigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfSigned")(js.undefined)
        ret
    }
    @scala.inline
    def withShowErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withStripColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripColors")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(js.undefined)
        ret
    }
  }
  
}

