package typingsSlinky.engineIoClient.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.engineIoClient.engineIoClientBooleans.`false`
import typingsSlinky.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketOptions extends js.Object {
  /**
  		 * http.Agent to use, defaults to false (NodeJS only)
  		 */
  var agent: js.UndefOr[Agent | `false`] = js.native
  /**
  		 * An authority certificate or array of authority certificates to check the remote host against.
  		 * Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var ca: js.UndefOr[String | js.Array[String]] = js.native
  /**
  		 * Public x509 certificate to use. Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var cert: js.UndefOr[String] = js.native
  /**
  		 * A string describing the ciphers to use or exclude. Consult the cipher format list for details on the format.
  		 * Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var ciphers: js.UndefOr[String] = js.native
  /**
  		 * enables XDomainRequest for IE8 to avoid loading bar flashing with click sound. default to false because XDomainRequest has a flaw of not sending cookie.
  		 */
  var enablesXDR: js.UndefOr[Boolean] = js.native
  /**
  		 * Headers that will be passed for each request to the server (via xhr-polling and via websockets).
  		 * These values then can be used during handshake or for special proxies. Can only be used in Node.js client environment.
  		 */
  var extraHeaders: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		 * forces base 64 encoding for polling transport even when XHR2 responseType is available and WebSocket even if the used standard supports binary.
  		 */
  var forceBase64: js.UndefOr[Boolean] = js.native
  /**
  		 * forces JSONP for polling transport.
  		 */
  var forceJSONP: js.UndefOr[Boolean] = js.native
  /**
  		 * Uses NodeJS implementation for websockets - even if there is a native Browser-Websocket available,
  		 * which is preferred by default over the NodeJS implementation. (This is useful when using hybrid platforms
  		 * like nw.js or electron) (false, NodeJS only)
  		 */
  var forceNode: js.UndefOr[Boolean] = js.native
  /**
  		 * determines whether to use JSONP when necessary for polling.
  		 * If disabled (by settings to false) an error will be emitted (saying "No transports available")
  		 * if no other transports are available. If another transport is available
  		 * for opening a connection (e.g. WebSocket) that transport will be used instead.
  		 */
  var jsonp: js.UndefOr[Boolean] = js.native
  /**
  		 * Private key to use for SSL. Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var key: js.UndefOr[String] = js.native
  /**
  		 * the local IP address to connect to
  		 */
  var localAddress: js.UndefOr[String] = js.native
  /**
  		 * whether transport upgrades should be restricted to transports supporting binary data (false)
  		 */
  var onlyBinaryUpgrades: js.UndefOr[Boolean] = js.native
  /**
  		 * A string of passphrase for the private key or pfx. Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var passphrase: js.UndefOr[String] = js.native
  /**
  		 * path to connect to, default is /engine.io
  		 */
  var path: js.UndefOr[String] = js.native
  /**
  		 * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable. (true)
  		 */
  var perMessageDeflate: js.UndefOr[js.Any] = js.native
  /**
  		 * Certificate, Private key and CA certificates to use for SSL. Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var pfx: js.UndefOr[String] = js.native
  /**
  		 * port the policy server listens on (843)
  		 */
  var policyPort: js.UndefOr[Double] = js.native
  /**
  		 * If true, the server certificate is verified against the list of supplied CAs.
  		 * An 'error' event is emitted if verification fails. Verification happens at the connection level,
  		 * before the HTTP request is sent. Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /**
  		 * defaults to false. If true and if the previous websocket connection to the server succeeded,
  		 * the connection attempt will bypass the normal upgrade process and will initially try websocket.
  		 * A connection attempt following a transport error will use the normal upgrade process.
  		 * It is recommended you turn this on only when using SSL/TLS connections,
  		 * or if you know that your network does not block websockets.
  		 */
  var rememberUpgrade: js.UndefOr[Boolean] = js.native
  /**
  		 * timestamp parameter (t)
  		 */
  var timestampParam: js.UndefOr[String] = js.native
  /**
  		 * whether to add the timestamp with each transport request. Note: polling requests are always stamped unless this option is explicitly set to false (false)
  		 */
  var timestampRequests: js.UndefOr[Boolean] = js.native
  /**
  		 * hash of options, indexed by transport name, overriding the common options for the given transport
  		 */
  var transportOptions: js.UndefOr[StringDictionary[SocketOptions]] = js.native
  /**
  		 * a list of transports to try (in order). Defaults to ['polling', 'websocket']. Engine always attempts to connect directly with the first one, provided the feature detection test for it passes.
  		 */
  var transports: js.UndefOr[js.Array[Transport]] = js.native
  /**
  		 * defaults to true, whether the client should try to upgrade the transport from long-polling to something better.
  		 */
  var upgrade: js.UndefOr[Boolean] = js.native
}

object SocketOptions {
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: Agent | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withCa(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withCiphers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablesXDR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablesXDR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablesXDR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablesXDR")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withForceBase64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceBase64")(js.undefined)
        ret
    }
    @scala.inline
    def withForceJSONP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceJSONP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceJSONP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceJSONP")(js.undefined)
        ret
    }
    @scala.inline
    def withForceNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNode")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
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
    def withOnlyBinaryUpgrades(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyBinaryUpgrades")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyBinaryUpgrades: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyBinaryUpgrades")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
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
    def withPfx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyPort")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withRememberUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRememberUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampParam")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportOptions(value: StringDictionary[SocketOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportOptions")(js.undefined)
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
    def withUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(js.undefined)
        ret
    }
  }
  
}

