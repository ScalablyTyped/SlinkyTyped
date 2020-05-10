package typingsSlinky.hapiH2o2.mod

import typingsSlinky.hapiBoom.mod.Boom
import typingsSlinky.hapiH2o2.hapiH2o2Booleans.`false`
import typingsSlinky.hapiH2o2.hapiH2o2Strings.http
import typingsSlinky.hapiH2o2.hapiH2o2Strings.https
import typingsSlinky.hapiH2o2.hapiH2o2Strings.upstream
import typingsSlinky.hapiHapi.mod.Lifecycle.ReturnValue
import typingsSlinky.hapiHapi.mod.Request
import typingsSlinky.hapiHapi.mod.ResponseToolkit
import typingsSlinky.hapiHapi.mod.RouteOptions
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyHandlerOptions extends js.Object {
  /** acceptEncoding - if set to false, does not pass-through the 'Accept-Encoding' HTTP header which is useful for the onResponse post-processing to avoid receiving an encoded response. Can only be used together with passThrough. Defaults to true (passing header). */
  var acceptEncoding: js.UndefOr[Boolean] = js.native
  /** agent - a node http(s) agent to be used for connections to upstream server. @see {@link https://nodejs.org/api/http.html#http_class_http_agent} */
  var agent: js.UndefOr[Agent] = js.native
  /** host - upstream service host to proxy requests to. It will have the same path as the client request. */
  var host: js.UndefOr[String] = js.native
  /** localStatePassThrough - if set tofalse, any locally defined state is removed from incoming requests before being sent to the upstream service. This value can be overridden on a per state basis via the server.state()``passThrough option. Defaults to false */
  var localStatePassThrough: js.UndefOr[Boolean] = js.native
  /** mapUri - a function used to map the request URI to the target `uri` and optional `headers` with which to make that request. Cannot be used together with `host`, `port`, `protocol`, or `uri`.
    * @param request - is the incoming request object.
    */
  var mapUri: js.UndefOr[
    js.ThisFunction1[/* this */ ProxyHandlerOptions, /* request */ Request, js.Promise[ProxyTarget]]
  ] = js.native
  /** maxSockets - sets the maximum number of sockets available per outgoing proxy host connection. false means use the wreck module default value (Infinity). Does not affect non-proxy outgoing client connections. Defaults to Infinity. */
  var maxSockets: js.UndefOr[`false` | Double] = js.native
  /**
    * onResponse - a custom function for processing the response from the upstream service before sending to the client. Useful for custom error handling of responses from the proxied endpoint or other payload manipulation.
    * @param err - internal or upstream error returned from attempting to contact the upstream proxy.  TODO: check this is of type BoomError or just Error.
    * @param res - the node response object received from the upstream service. res is a readable stream (use the wreck module read method to easily convert it to a Buffer or string).
    * @param request - is the incoming request object.
    * @param h - Hapi's response toolkit.
    * @param settings - the proxy handler configuration.
    * @param ttl - the upstream TTL in milliseconds if proxy.ttl it set to 'upstream' and the upstream response included a valid 'Cache-Control' header with 'max-age'.
    */
  var onResponse: js.UndefOr[
    js.ThisFunction6[
      /* this */ RouteOptions, 
      /* err */ Null | Boom[_], 
      /* res */ IncomingMessage, 
      /* req */ Request, 
      /* h */ ResponseToolkit, 
      /* settings */ ProxyHandlerOptions, 
      /* ttl */ Double, 
      ReturnValue
    ]
  ] = js.native
  /** passThrough - if set to true, it forwards the headers from the client to the upstream service, headers sent from the upstream service will also be forwarded to the client. Defaults to false. */
  var passThrough: js.UndefOr[Boolean] = js.native
  /** port - upstream service port. */
  var port: js.UndefOr[Double | String] = js.native
  /** protocol - protocol to use when making the request to the proxied host: */
  var protocol: js.UndefOr[http | https] = js.native
  /** redirects - the maximum number of HTTP redirections allowed to be followed automatically by the handler. Set to false or 0 to disable all redirections (the response will contain the redirection received from the upstream service). If redirections are enabled, no redirections (301, 302, 307, 308) will be passed along to the client, and reaching the maximum allowed redirections will return an error response. Defaults to false. */
  var redirects: js.UndefOr[Double | `false`] = js.native
  /** rejectUnauthorized - sets the rejectUnauthorized property on the https agent making the request. This value is only used when the proxied server uses TLS/SSL. If set it will override the node.js rejectUnauthorized property. If false then ssl errors will be ignored. When true the server certificate is verified and an 500 response will be sent when verification fails. This shouldn't be used alongside the agent setting as the agent will be used instead. Defaults to the https agent default value of true. */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /** timeout - number of milliseconds before aborting the upstream request. Defaults to 180000 (3 minutes). */
  var timeout: js.UndefOr[Double] = js.native
  /** ttl - if set to 'upstream', applies the upstream response caching policy to the response using the response.ttl() method (or passed as an argument to the onResponse method if provided). */
  var ttl: js.UndefOr[upstream] = js.native
  /** uri - absolute URI used instead of host, port, protocol, path, and query. Cannot be used with host, port, protocol, or mapUri. */
  var uri: js.UndefOr[String] = js.native
  /** xforward - if set to true, sets the 'X-Forwarded-For', 'X-Forwarded-Port', 'X-Forwarded-Proto', 'X-Forwarded-Host' headers when making a request to the proxied upstream endpoint. Defaults to false. */
  var xforward: js.UndefOr[Boolean] = js.native
}

object ProxyHandlerOptions {
  @scala.inline
  def apply(): ProxyHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyHandlerOptions]
  }
  @scala.inline
  implicit class ProxyHandlerOptionsOps[Self <: ProxyHandlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptEncoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptEncoding")(js.undefined)
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
    def withLocalStatePassThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStatePassThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalStatePassThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStatePassThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withMapUri(
      value: js.ThisFunction1[/* this */ ProxyHandlerOptions, /* request */ Request, js.Promise[ProxyTarget]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapUri")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSockets(value: `false` | Double): Self = {
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
    def withOnResponse(
      value: js.ThisFunction6[
          /* this */ RouteOptions, 
          /* err */ Null | Boom[_], 
          /* res */ IncomingMessage, 
          /* req */ Request, 
          /* h */ ResponseToolkit, 
          /* settings */ ProxyHandlerOptions, 
          /* ttl */ Double, 
          ReturnValue
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withPassThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passThrough")(js.undefined)
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
    def withProtocol(value: http | https): Self = {
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
    def withRedirects(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirects")(js.undefined)
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
    def withTtl(value: upstream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withXforward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xforward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXforward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xforward")(js.undefined)
        ret
    }
  }
  
}

