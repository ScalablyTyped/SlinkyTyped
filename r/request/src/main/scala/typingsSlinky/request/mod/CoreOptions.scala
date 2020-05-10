package typingsSlinky.request.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.AgentOptions
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.request.requestNumbers.`4`
import typingsSlinky.request.requestNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreOptions extends js.Object {
  var agent: js.UndefOr[Agent | typingsSlinky.node.httpsMod.Agent] = js.native
  var agentClass: js.UndefOr[js.Any] = js.native
  var agentOptions: js.UndefOr[AgentOptions | typingsSlinky.node.httpsMod.AgentOptions] = js.native
  var auth: js.UndefOr[AuthOptions] = js.native
  var aws: js.UndefOr[AWSOptions] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var body: js.UndefOr[js.Any] = js.native
  var ca: js.UndefOr[String | Buffer | (js.Array[Buffer | String])] = js.native
  var callback: js.UndefOr[RequestCallback] = js.native
  var cert: js.UndefOr[Buffer] = js.native
  var encoding: js.UndefOr[String | Null] = js.native
  var family: js.UndefOr[`4` | `6`] = js.native
  var followAllRedirects: js.UndefOr[Boolean] = js.native
  var followOriginalHttpMethod: js.UndefOr[Boolean] = js.native
  var followRedirect: js.UndefOr[Boolean | (js.Function1[/* response */ IncomingMessage, Boolean])] = js.native
  var forever: js.UndefOr[js.Any] = js.native
  var form: js.UndefOr[StringDictionary[js.Any] | String] = js.native
  var formData: js.UndefOr[StringDictionary[js.Any]] = js.native
  var gzip: js.UndefOr[Boolean] = js.native
  var har: js.UndefOr[HttpArchiveRequest] = js.native
  var hawk: js.UndefOr[HawkOptions] = js.native
  var headers: js.UndefOr[Headers] = js.native
  var host: js.UndefOr[String] = js.native
  var jar: js.UndefOr[CookieJar | Boolean] = js.native
  var json: js.UndefOr[js.Any] = js.native
  var jsonReplacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  var jsonReviver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  var key: js.UndefOr[Buffer] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var maxRedirects: js.UndefOr[Double] = js.native
  var method: js.UndefOr[String] = js.native
  var multipart: js.UndefOr[js.Array[RequestPart] | Multipart] = js.native
  var oauth: js.UndefOr[OAuthOptions] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var pool: js.UndefOr[PoolOptions] = js.native
  var port: js.UndefOr[Double] = js.native
  var postambleCRLF: js.UndefOr[Boolean] = js.native
  var preambleCRLF: js.UndefOr[Boolean] = js.native
  var proxy: js.UndefOr[js.Any] = js.native
  var qs: js.UndefOr[js.Any] = js.native
  var qsParseOptions: js.UndefOr[js.Any] = js.native
  var qsStringifyOptions: js.UndefOr[js.Any] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var removeRefererHeader: js.UndefOr[Boolean] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var tunnel: js.UndefOr[Boolean] = js.native
  var useQuerystring: js.UndefOr[Boolean] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object CoreOptions {
  @scala.inline
  def apply(): CoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreOptions]
  }
  @scala.inline
  implicit class CoreOptionsOps[Self <: CoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: Agent | typingsSlinky.node.httpsMod.Agent): Self = {
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
    def withAgentClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentOptions(value: AgentOptions | typingsSlinky.node.httpsMod.AgentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: AuthOptions): Self = {
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
    def withAws(value: AWSOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAws: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws")(js.undefined)
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
    def withBody(value: js.Any): Self = {
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
    def withCa(value: String | Buffer | (js.Array[Buffer | String])): Self = {
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
    def withCallback(value: (/* error */ js.Any, /* response */ Response, /* body */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: Buffer): Self = {
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
    def withEncodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(null)
        ret
    }
    @scala.inline
    def withFamily(value: `4` | `6`): Self = {
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
    def withFollowOriginalHttpMethod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followOriginalHttpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowOriginalHttpMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followOriginalHttpMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowRedirectFunction1(value: /* response */ IncomingMessage => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFollowRedirect(value: Boolean | (js.Function1[/* response */ IncomingMessage, Boolean])): Self = {
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
    def withForever(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forever")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForever: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forever")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: StringDictionary[js.Any] | String): Self = {
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
    def withFormData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(js.undefined)
        ret
    }
    @scala.inline
    def withGzip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGzip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(js.undefined)
        ret
    }
    @scala.inline
    def withHar(value: HttpArchiveRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("har")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("har")(js.undefined)
        ret
    }
    @scala.inline
    def withHawk(value: HawkOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hawk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHawk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hawk")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
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
    def withJar(value: CookieJar | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jar")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: js.Any): Self = {
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
    def withJsonReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonReplacer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutJsonReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonReplacer")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonReviver(value: (/* key */ String, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonReviver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutJsonReviver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonReviver")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Buffer): Self = {
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
    def withMaxRedirects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(js.undefined)
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
    def withMultipart(value: js.Array[RequestPart] | Multipart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth(value: OAuthOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth")(js.undefined)
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
    def withPool(value: PoolOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
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
    def withPostambleCRLF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postambleCRLF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostambleCRLF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postambleCRLF")(js.undefined)
        ret
    }
    @scala.inline
    def withPreambleCRLF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preambleCRLF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreambleCRLF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preambleCRLF")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withQs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qs")(js.undefined)
        ret
    }
    @scala.inline
    def withQsParseOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qsParseOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQsParseOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qsParseOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withQsStringifyOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qsStringifyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQsStringifyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qsStringifyOptions")(js.undefined)
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
    def withRemoveRefererHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRefererHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveRefererHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRefererHeader")(js.undefined)
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
    def withTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
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
    def withTunnel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(js.undefined)
        ret
    }
    @scala.inline
    def withUseQuerystring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQuerystring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseQuerystring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQuerystring")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

