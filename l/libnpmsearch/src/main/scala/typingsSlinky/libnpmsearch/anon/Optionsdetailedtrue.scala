package typingsSlinky.libnpmsearch.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.libnpmsearch.libnpmsearchBooleans.`true`
import typingsSlinky.libnpmsearch.libnpmsearchStrings.maintenance
import typingsSlinky.libnpmsearch.libnpmsearchStrings.optimal
import typingsSlinky.libnpmsearch.libnpmsearchStrings.popularity
import typingsSlinky.libnpmsearch.libnpmsearchStrings.quality
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.npmPackageArg.mod.Result
import typingsSlinky.npmRegistryFetch.anon.PartialAuthOptions
import typingsSlinky.npmRegistryFetch.anon.PartialFetchRetryOptions
import typingsSlinky.npmlog.mod.Logger
import typingsSlinky.ssri.mod.Integrity
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined libnpmsearch.libnpmsearch.Options & {  detailed  :true} */
@js.native
trait Optionsdetailedtrue
  extends /* key */ StringDictionary[js.Any] {
  /**
    * @deprecated
    * This is a legacy authentication token supported only for
    * compatibility. Please use `opts.token` instead.
    */
  var _auth: js.UndefOr[String] = js.native
  /**
    * Alias for `token`.
    */
  var _authToken: js.UndefOr[String] = js.native
  /**
    * Alias for `password`
    */
  var _password: js.UndefOr[String] = js.native
  /**
    * An `Agent` instance to be shared across requests. This allows
    * multiple concurrent fetch requests to happen on the same socket.
    *
    * You do not need to provide this option unless you want something
    * particularly specialized, since proxy configurations and http/https
    * agents are already automatically managed internally when this option
    * is not passed through.
    */
  var agent: js.UndefOr[Agent] = js.native
  var `always-auth`: js.UndefOr[Boolean] = js.native
  var alwaysAuth: js.UndefOr[Boolean] = js.native
  /**
    * Request body to send through the outgoing request. Buffers and
    * Streams will be passed through as-is, with a default `content-type`
    * of `application/octet-stream`. Plain JavaScript objects will be
    * `JSON.stringify`ed and the `content-type` will default to
    * `application/json`.
    *
    * Use `opts.headers` to set the content-type to something else.
    */
  var body: js.UndefOr[Buffer | Stream | js.Object | String] = js.native
  /**
    * The Certificate Authority signing certificate that is trusted for SSL
    * connections to the registry. Values should be in PEM format (Windows
    * calls it "Base-64 encoded X.509 (.CER)") with newlines replaced by
    * the string `'\n'`. For example:
    *
    * ```typescript
    * {
    * ca: '-----BEGIN CERTIFICATE-----\nXXXX\nXXXX\n-----END CERTIFICATE-----'
    * }
    * ```
    *
    * Set to `null` to only allow "known" registrars, or to a specific CA
    * cert to trust only that specific signing authority.
    *
    * Multiple CAs can be trusted by specifying an array of certificates
    * instead of a single string.
    *
    * See also `opts.strictSSL`, `opts.ca` and `opts.key`
    */
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer]) | Null] = js.native
  /**
    * The location of the http cache directory. If provided, certain
    * cachable requests will be cached according to
    * [IETF RFC 7234](https://tools.ietf.org/html/rfc7234) rules. This will
    * speed up future requests, as well as make the cached data available
    * offline if necessary/requested.
    *
    * See also `offline`, `preferOffline`, and `preferOnline`.
    */
  var cache: js.UndefOr[String] = js.native
  /**
    * A client certificate to pass when accessing the registry. Values
    * should be in PEM format (Windows calls it "Base-64 encoded X.509
    * (.CER)") with newlines replaced by the string `'\n'`. For example:
    *
    * ```typescript
    * {
    * cert: '-----BEGIN CERTIFICATE-----\nXXXX\nXXXX\n-----END CERTIFICATE-----'
    * }
    * ```
    *
    * It is *not* the path to a certificate file (and there is no "certfile"
    * option).
    *
    * See also: `opts.ca` and `opts.key`
    */
  var cert: js.UndefOr[String] = js.native
  /**
    * If true, returns an object with `package`, `score`, and `searchScore`
    * fields, with `package` being what would usually be returned, and the
    * other two containing details about how that package scored. Useful
    * for UIs. Default: `false`
    */
  var detailed: js.UndefOr[Boolean with `true`] = js.native
  var email: js.UndefOr[String] = js.native
  /**
    * The "retries" config for `retry` to use when fetching packages from
    * the registry.
    *
    * See also `opts.retry` to provide all retry options as a single object.
    */
  var fetchRetries: js.UndefOr[Double] = js.native
  /**
    * The "factor" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryFactor: js.UndefOr[Double] = js.native
  /**
    * The "maxTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryMaxtimeout: js.UndefOr[Double] = js.native
  /**
    * The "minTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryMintimeout: js.UndefOr[Double] = js.native
  /**
    * If present, other auth-related values in `opts` will be completely
    * ignored, including `alwaysAuth`, `email`, and `otp`, when calculating
    * auth for a request, and the auth details in `opts.forceAuth` will be
    * used instead.
    */
  var forceAuth: js.UndefOr[PartialAuthOptions] = js.native
  /**
    * Offset number for results. Used with `opts.limit` for pagination.
    * Default: `0`
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * If true, `npm-registry-fetch` will set the `Content-Encoding` header
    * to `gzip` and use `zlib.gzip()` or `zlib.createGzip()` to gzip-encode
    * `opts.body`.
    */
  var gzip: js.UndefOr[Boolean] = js.native
  /**
    * Additional headers for the outgoing request. This option can also be
    * used to override headers automatically generated by
    * `npm-registry-fetch`, such as `Content-Type`.
    */
  var headers: js.UndefOr[Record[String, String]] = js.native
  /**
    * If true, the response body will be thrown away and `res.body` set to
    * `null`. This will prevent dangling response sockets for requests
    * where you don't usually care what the response body is.
    */
  var ignoreBody: js.UndefOr[Boolean] = js.native
  /**
    * If provided, the response body's will be verified against this
    * integrity string, using [`ssri`](https://npm.im/ssri). If
    * verification succeeds, the response will complete as normal. If
    * verification fails, the response body will error with an `EINTEGRITY`
    * error.
    *
    * Body integrity is only verified if the body is actually consumed to
    * completion -- that is, if you use `res.json()`/`res.buffer()`, or if
    * you consume the default `res` stream data to its end.
    *
    * Cached data will have its integrity automatically verified using the
    * previously-generated integrity hash for the saved request
    * information, so `EINTEGRITY` errors can happen if `opts.cache` is
    * used, even if `opts.integrity` is not passed in.
    */
  var integrity: js.UndefOr[String | Integrity] = js.native
  /**
    * This is used to populate the `npm-in-ci` request header sent to the
    * registry.
    */
  var isFromCI: js.UndefOr[Boolean] = js.native
  /**
    * A client key to pass when accessing the registry. Values should be in
    * PEM format with newlines replaced by the string `'\n'`. For example:
    *
    * ```typescript
    * {
    * key: '-----BEGIN PRIVATE KEY-----\nXXXX\nXXXX\n-----END PRIVATE KEY-----'
    * }
    * ```
    *
    * It is *not* the path to a key file (and there is no "keyfile"
    * option).
    *
    * See also: `opts.ca` and `opts.cert`
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Number of results to limit the query to. Default: `20`
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The IP address of the local interface to use when making connections
    * to the registry.
    *
    * See also `opts.proxy`
    */
  var localAddress: js.UndefOr[String] = js.native
  /**
    * Logger object to use for logging operation details.
    */
  var log: js.UndefOr[Logger] = js.native
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `maintenance` metrics when scoring and sorting packages.
    * Default: `0.65` (same as `opts.sortBy: 'optimal'`)
    */
  var maintenance: js.UndefOr[Double] = js.native
  /**
    * When using `fetch.json.stream()` (NOT `fetch.json()`), this will be
    * passed down to `JSONStream` as the second argument to
    * `JSONStream.parse`, and can be used to transform stream data before
    * output.
    */
  var mapJSON: js.UndefOr[js.Function1[/* v */ js.Any, _]] = js.native
  /**
    * Maximum number of sockets to keep open during requests. Has no effect
    * if `opts.agent` is used.
    */
  var maxSockets: js.UndefOr[Double] = js.native
  /**
    * HTTP method to use for the outgoing request. Case-insensitive.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * If true, proxying will be disabled even if `opts.proxy` is used.
    */
  var noproxy: js.UndefOr[Boolean] = js.native
  /**
    * If provided, will be sent in the `npm-session` header. This header is
    * used by the npm registry to identify individual user sessions
    * (usually individual invocations of the CLI).
    */
  var npmSession: js.UndefOr[String] = js.native
  /**
    * Force offline mode: no network requests will be done during install.
    * To allow `npm-registry-fetch` to fill in missing cache data, see
    * `opts.preferOffline`.
    *
    * This option is only really useful if you're also using `opts.cache`.
    */
  var offline: js.UndefOr[Boolean] = js.native
  /**
    * This is a one-time password from a two-factor authenticator. It is
    * required for certain registry interactions when two-factor auth is
    * enabled for a user account.
    */
  var otp: js.UndefOr[Double | String] = js.native
  /**
    * Password used for basic authentication. For the more modern
    * authentication method, please use the (more secure) `opts.token`
    *
    * Can optionally be scoped to a registry by using a "nerf dart" for
    * that registry. That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:password': 't0k3nH34r'
    * }
    * ```
    *
    * See also `opts.username`
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `popularity` metrics when scoring and sorting packages.
    * Default: `0.98` (same as `opts.sortBy: 'optimal'`)
    */
  var popularity: js.UndefOr[Double] = js.native
  /**
    * If true, staleness checks for cached data will be bypassed, but
    * missing data will be requested from the server. To force full offline
    * mode, use `opts.offline`.
    *
    * This option is generally only useful if you're also using `opts.cache`.
    */
  var preferOffline: js.UndefOr[Boolean] = js.native
  /**
    * If true, staleness checks for cached data will be forced, making the
    * CLI look for updates immediately even for fresh package data.
    *
    * This option is generally only useful if you're also using `opts.cache`.
    */
  var preferOnline: js.UndefOr[Boolean] = js.native
  /**
    * If provided, will be sent in the npm-scope header. This header is
    * used by the npm registry to identify the toplevel package scope that
    * a particular project installation is using.
    */
  var projectScope: js.UndefOr[String] = js.native
  /**
    * A proxy to use for outgoing http requests. If not passed in, the
    * `HTTP(S)_PROXY` environment variable will be used.
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `quality` metrics when scoring and sorting packages.
    * Default: `0.5` (same as `opts.sortBy: 'optimal'`)
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * If provided, the request URI will have a query string appended to it
    * using this query. If `opts.query` is an object, it will be converted
    * to a query string using [`querystring.stringify()`](https://nodejs.org/api/querystring.html#querystring_querystring_stringify_obj_sep_eq_options).
    *
    * If the request URI already has a query string, it will be merged with
    * `opts.query`, preferring `opts.query` values.
    */
  var query: js.UndefOr[String | js.Object] = js.native
  /**
    * Registry configuration for a request. If a request URL only includes
    * the URL path, this registry setting will be prepended. This
    * configuration is also used to determine authentication details, so
    * even if the request URL references a completely different host,
    * `opts.registry` will be used to find the auth details for that
    * request.
    *
    * See also `opts.scope`, `opts.spec`, and `opts.<scope>:registry` which
    * can all affect the actual registry URL used by the outgoing request.
    */
  var registry: js.UndefOr[String] = js.native
  /**
    * Single-object configuration for request retry settings. If passed in,
    * will override individually-passed `fetchRetry*` settings.
    */
  var retry: js.UndefOr[PartialFetchRetryOptions] = js.native
  /**
    * Associate an operation with a scope for a scoped registry. This
    * option can force lookup of scope-specific registries and
    * authentication.
    *
    * See also `opts.<scope>:registry` and `opts.spec` for interactions
    * with this option.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * Used as a shorthand to set `opts.quality`, `opts.maintenance`, and
    * `opts.popularity` with values that prioritize each one.
    */
  var sortBy: js.UndefOr[optimal | quality | maintenance | popularity] = js.native
  /**
    * If provided, can be used to automatically configure `opts.scope`
    * based on a specific package name. Non-registry package specs will
    * throw an error.
    */
  var spec: js.UndefOr[String | Result] = js.native
  /**
    * Whether or not to do SSL key validation when making requests to the
    * registry via https.
    *
    * See also `opts.ca`.
    */
  var strictSSL: js.UndefOr[Boolean] = js.native
  /**
    * Time before a hanging request times out.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Authentication token string.
    *
    * Can be scoped to a registry by using a "nerf dart" for that registry.
    * That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:token': 't0k3nH34r'
    * }
    * ```
    */
  var token: js.UndefOr[String] = js.native
  /**
    * User agent string to send in the `User-Agent` header.
    */
  var userAgent: js.UndefOr[String] = js.native
  /**
    * Username used for basic authentication. For the more modern
    * authentication method, please use the (more secure) `opts.token`
    *
    * Can optionally be scoped to a registry by using a "nerf dart" for
    * that registry. That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:username': 't0k3nH34r'
    * }
    * ```
    *
    * See also `opts.password`
    */
  var username: js.UndefOr[String] = js.native
}

object Optionsdetailedtrue {
  @scala.inline
  def apply(): Optionsdetailedtrue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionsdetailedtrue]
  }
  @scala.inline
  implicit class OptionsdetailedtrueOps[Self <: Optionsdetailedtrue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_auth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_auth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_auth")(js.undefined)
        ret
    }
    @scala.inline
    def with_authToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_authToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_authToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_authToken")(js.undefined)
        ret
    }
    @scala.inline
    def with_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_password: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_password")(js.undefined)
        ret
    }
    @scala.inline
    def withAgent(value: Agent): Self = {
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
    def `withAlways-auth`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always-auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAlways-auth`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always-auth")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: Buffer | Stream | js.Object | String): Self = {
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
    def withCaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(null)
        ret
    }
    @scala.inline
    def withCache(value: String): Self = {
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
    def withDetailed(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchRetryFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchRetryFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchRetryMaxtimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryMaxtimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchRetryMaxtimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryMaxtimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchRetryMintimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryMintimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchRetryMintimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryMintimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withForceAuth(value: PartialAuthOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
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
    def withHeaders(value: Record[String, String]): Self = {
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
    def withIgnoreBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBody")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrity(value: String | Integrity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFromCI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFromCI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFromCI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFromCI")(js.undefined)
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
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
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
    def withLog(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenance")(js.undefined)
        ret
    }
    @scala.inline
    def withMapJSON(value: /* v */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(js.undefined)
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
    def withNoproxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noproxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoproxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noproxy")(js.undefined)
        ret
    }
    @scala.inline
    def withNpmSession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npmSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNpmSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npmSession")(js.undefined)
        ret
    }
    @scala.inline
    def withOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(js.undefined)
        ret
    }
    @scala.inline
    def withOtp(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otp")(js.undefined)
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
    def withPopularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popularity")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferOffline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferOffline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferOffline")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferOnline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferOnline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferOnline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferOnline")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectScope")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
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
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String | js.Object): Self = {
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
    def withRegistry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: PartialFetchRetryOptions): Self = {
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
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBy(value: optimal | quality | maintenance | popularity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSpec(value: String | Result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.undefined)
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
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

