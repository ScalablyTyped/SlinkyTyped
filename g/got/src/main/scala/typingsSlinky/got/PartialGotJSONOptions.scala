package typingsSlinky.got

import typingsSlinky.got.gotBooleans.`true`
import typingsSlinky.got.mod.AgentOptions
import typingsSlinky.got.mod.Cache
import typingsSlinky.got.mod.GotJSONOptions
import typingsSlinky.got.mod.Hooks
import typingsSlinky.got.mod.RequestFunction
import typingsSlinky.got.mod.RetryOptions
import typingsSlinky.got.mod.TimeoutOptions
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequestArgs
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.tlsMod.KeyObject
import typingsSlinky.node.tlsMod.PxfObject
import typingsSlinky.node.tlsMod.SecureVersion
import typingsSlinky.node.urlMod.URLSearchParams
import typingsSlinky.std.Record
import typingsSlinky.toughCookie.mod.CookieJar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<got.got.GotJSONOptions> */
@js.native
trait PartialGotJSONOptions extends js.Object {
  var _defaultAgent: js.UndefOr[Agent] = js.native
  var agent: js.UndefOr[Agent | Boolean | AgentOptions] = js.native
  var auth: js.UndefOr[String] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var body: js.UndefOr[js.Object] = js.native
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var cache: js.UndefOr[Cache] = js.native
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var ciphers: js.UndefOr[String] = js.native
  var clientCertEngine: js.UndefOr[String] = js.native
  var cookieJar: js.UndefOr[CookieJar] = js.native
  var createConnection: js.UndefOr[
    js.Function2[
      /* options */ ClientRequestArgs, 
      /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit], 
      Socket
    ]
  ] = js.native
  var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var decompress: js.UndefOr[Boolean] = js.native
  var defaultPort: js.UndefOr[Double | String] = js.native
  var dhparam: js.UndefOr[String | Buffer] = js.native
  var ecdhCurve: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var family: js.UndefOr[Double] = js.native
  var followRedirect: js.UndefOr[Boolean] = js.native
  var form: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
  var honorCipherOrder: js.UndefOr[Boolean] = js.native
  var hooks: js.UndefOr[Hooks[GotJSONOptions, js.Object]] = js.native
  var host: js.UndefOr[String] = js.native
  var hostname: js.UndefOr[String] = js.native
  var json: js.UndefOr[`true`] = js.native
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var maxHeaderSize: js.UndefOr[Double] = js.native
  var maxVersion: js.UndefOr[SecureVersion] = js.native
  var method: js.UndefOr[String] = js.native
  var minVersion: js.UndefOr[SecureVersion] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.native
  var port: js.UndefOr[Double | String] = js.native
  var privateKeyEngine: js.UndefOr[String] = js.native
  var privateKeyIdentifier: js.UndefOr[String] = js.native
  var protocol: js.UndefOr[String] = js.native
  var query: js.UndefOr[(Record[String, _]) | URLSearchParams | String] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var request: js.UndefOr[RequestFunction] = js.native
  var retry: js.UndefOr[Double | RetryOptions] = js.native
  var secureOptions: js.UndefOr[Double] = js.native
  var secureProtocol: js.UndefOr[String] = js.native
  var servername: js.UndefOr[String] = js.native
  var sessionIdContext: js.UndefOr[String] = js.native
  var setHost: js.UndefOr[Boolean] = js.native
  var sigalgs: js.UndefOr[String] = js.native
  var socketPath: js.UndefOr[String] = js.native
  var throwHttpErrors: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double | TimeoutOptions] = js.native
  var useElectronNet: js.UndefOr[Boolean] = js.native
}

object PartialGotJSONOptions {
  @scala.inline
  def apply(): PartialGotJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGotJSONOptions]
  }
  @scala.inline
  implicit class PartialGotJSONOptionsOps[Self <: PartialGotJSONOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_defaultAgent(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withAgent(value: Agent | Boolean | AgentOptions): Self = {
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
    def withAuth(value: String): Self = {
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
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCa(value: String | Buffer | (js.Array[String | Buffer])): Self = {
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
    def withCache(value: Cache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String | Buffer | (js.Array[String | Buffer])): Self = {
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
    def withClientCertEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieJar(value: CookieJar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieJar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieJar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieJar")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateConnection(
      value: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]) => Socket
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createConnection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crl")(js.undefined)
        ret
    }
    @scala.inline
    def withDecompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompress")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPort(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPort")(js.undefined)
        ret
    }
    @scala.inline
    def withDhparam(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhparam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDhparam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhparam")(js.undefined)
        ret
    }
    @scala.inline
    def withEcdhCurve(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecdhCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcdhCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecdhCurve")(js.undefined)
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
    def withFamily(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
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
    def withForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: OutgoingHttpHeaders): Self = {
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
    def withHonorCipherOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorCipherOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorCipherOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorCipherOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks(value: Hooks[GotJSONOptions, js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = {
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
    def withMaxHeaderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeaderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVersion(value: SecureVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVersion(value: SecureVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVersion")(js.undefined)
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
    def withPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = {
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
    def withPort(value: Double | String): Self = {
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
    def withPrivateKeyEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeyEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKeyIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeyIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: (Record[String, _]) | URLSearchParams | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
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
    def withRequest(value: RequestFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: Double | RetryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureOptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withServername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionIdContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIdContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionIdContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIdContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHost")(js.undefined)
        ret
    }
    @scala.inline
    def withSigalgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigalgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigalgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigalgs")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowHttpErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwHttpErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowHttpErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwHttpErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double | TimeoutOptions): Self = {
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
    def withUseElectronNet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useElectronNet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseElectronNet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useElectronNet")(js.undefined)
        ret
    }
  }
  
}

