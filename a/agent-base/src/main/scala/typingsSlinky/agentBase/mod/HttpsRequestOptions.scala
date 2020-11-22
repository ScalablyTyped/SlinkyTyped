package typingsSlinky.agentBase.mod

import typingsSlinky.agentBase.agentBaseBooleans.`true`
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.ClientRequestArgs
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.tlsMod.KeyObject
import typingsSlinky.node.tlsMod.PxfObject
import typingsSlinky.node.tlsMod.SecureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent agent-base.agent-base.AgentRequestOptions */
/* Inlined parent std.Omit<node.https.RequestOptions, keyof agent-base.agent-base.AgentRequestOptions> */
@js.native
trait HttpsRequestOptions extends RequestOptions {
  
  var _defaultAgent: js.UndefOr[typingsSlinky.node.httpMod.Agent] = js.native
  
  var agent: js.UndefOr[typingsSlinky.node.httpMod.Agent | Boolean] = js.native
  
  var auth: js.UndefOr[String | Null] = js.native
  
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var ciphers: js.UndefOr[String] = js.native
  
  var clientCertEngine: js.UndefOr[String] = js.native
  
  var createConnection: js.UndefOr[
    js.Function2[
      /* options */ ClientRequestArgs, 
      /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit], 
      Socket
    ]
  ] = js.native
  
  var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var defaultPort: js.UndefOr[Double | String] = js.native
  
  var dhparam: js.UndefOr[String | Buffer] = js.native
  
  var ecdhCurve: js.UndefOr[String] = js.native
  
  var family: js.UndefOr[Double] = js.native
  
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  var honorCipherOrder: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var hostname: js.UndefOr[String | Null] = js.native
  
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.native
  
  var localAddress: js.UndefOr[String] = js.native
  
  var maxHeaderSize: js.UndefOr[Double] = js.native
  
  var maxVersion: js.UndefOr[SecureVersion] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var minVersion: js.UndefOr[SecureVersion] = js.native
  
  var passphrase: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.native
  
  var port: Double = js.native
  
  var privateKeyEngine: js.UndefOr[String] = js.native
  
  var privateKeyIdentifier: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[String | Null] = js.native
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  var secureEndpoint: `true` = js.native
  
  var secureOptions: js.UndefOr[Double] = js.native
  
  var secureProtocol: js.UndefOr[String] = js.native
  
  var servername: js.UndefOr[String] = js.native
  
  var sessionIdContext: js.UndefOr[String] = js.native
  
  var sessionTimeout: js.UndefOr[Double] = js.native
  
  var setHost: js.UndefOr[Boolean] = js.native
  
  var sigalgs: js.UndefOr[String] = js.native
  
  var socketPath: js.UndefOr[String] = js.native
  
  var ticketKeys: js.UndefOr[Buffer] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object HttpsRequestOptions {
  
  @scala.inline
  def apply(port: Double, secureEndpoint: `true`): HttpsRequestOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsRequestOptions]
  }
  
  @scala.inline
  implicit class HttpsRequestOptionsOps[Self <: HttpsRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureEndpoint(value: `true`): Self = this.set("secureEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultAgent(value: typingsSlinky.node.httpMod.Agent): Self = this.set("_defaultAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultAgent: Self = this.set("_defaultAgent", js.undefined)
    
    @scala.inline
    def setAgent(value: typingsSlinky.node.httpMod.Agent | Boolean): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setAuthNull: Self = this.set("auth", null)
    
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setCertVarargs(value: (String | Buffer)*): Self = this.set("cert", js.Array(value :_*))
    
    @scala.inline
    def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    
    @scala.inline
    def setClientCertEngine(value: String): Self = this.set("clientCertEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertEngine: Self = this.set("clientCertEngine", js.undefined)
    
    @scala.inline
    def setCreateConnection(
      value: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]) => Socket
    ): Self = this.set("createConnection", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateConnection: Self = this.set("createConnection", js.undefined)
    
    @scala.inline
    def setCrlVarargs(value: (String | Buffer)*): Self = this.set("crl", js.Array(value :_*))
    
    @scala.inline
    def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("crl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrl: Self = this.set("crl", js.undefined)
    
    @scala.inline
    def setDefaultPort(value: Double | String): Self = this.set("defaultPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPort: Self = this.set("defaultPort", js.undefined)
    
    @scala.inline
    def setDhparam(value: String | Buffer): Self = this.set("dhparam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDhparam: Self = this.set("dhparam", js.undefined)
    
    @scala.inline
    def setEcdhCurve(value: String): Self = this.set("ecdhCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcdhCurve: Self = this.set("ecdhCurve", js.undefined)
    
    @scala.inline
    def setFamily(value: Double): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHonorCipherOrder(value: Boolean): Self = this.set("honorCipherOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHonorCipherOrder: Self = this.set("honorCipherOrder", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setHostnameNull: Self = this.set("hostname", null)
    
    @scala.inline
    def setKeyVarargs(value: (Buffer | KeyObject)*): Self = this.set("key", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setMaxHeaderSize(value: Double): Self = this.set("maxHeaderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeaderSize: Self = this.set("maxHeaderSize", js.undefined)
    
    @scala.inline
    def setMaxVersion(value: SecureVersion): Self = this.set("maxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVersion: Self = this.set("maxVersion", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMinVersion(value: SecureVersion): Self = this.set("minVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVersion: Self = this.set("minVersion", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = this.set("pfx", js.Array(value :_*))
    
    @scala.inline
    def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = this.set("pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    
    @scala.inline
    def setPrivateKeyEngine(value: String): Self = this.set("privateKeyEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyEngine: Self = this.set("privateKeyEngine", js.undefined)
    
    @scala.inline
    def setPrivateKeyIdentifier(value: String): Self = this.set("privateKeyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyIdentifier: Self = this.set("privateKeyIdentifier", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setProtocolNull: Self = this.set("protocol", null)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setSecureOptions(value: Double): Self = this.set("secureOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureOptions: Self = this.set("secureOptions", js.undefined)
    
    @scala.inline
    def setSecureProtocol(value: String): Self = this.set("secureProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureProtocol: Self = this.set("secureProtocol", js.undefined)
    
    @scala.inline
    def setServername(value: String): Self = this.set("servername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServername: Self = this.set("servername", js.undefined)
    
    @scala.inline
    def setSessionIdContext(value: String): Self = this.set("sessionIdContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionIdContext: Self = this.set("sessionIdContext", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
    
    @scala.inline
    def setSetHost(value: Boolean): Self = this.set("setHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetHost: Self = this.set("setHost", js.undefined)
    
    @scala.inline
    def setSigalgs(value: String): Self = this.set("sigalgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigalgs: Self = this.set("sigalgs", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setTicketKeys(value: Buffer): Self = this.set("ticketKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicketKeys: Self = this.set("ticketKeys", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
