package typingsSlinky.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object plugins {
  
  type AuditLoggerContext = js.Function4[
    /* req */ typingsSlinky.restify.mod.Request, 
    /* res */ typingsSlinky.restify.mod.Response, 
    /* route */ js.Any, 
    /* error */ js.Any, 
    js.Any
  ]
  
  type MetricsCallback = js.Function5[
    /* err */ js.Error, 
    /* metrics */ typingsSlinky.restify.mod.plugins.MetricsCallbackOptions, 
    /* req */ typingsSlinky.restify.mod.Request, 
    /* res */ typingsSlinky.restify.mod.Response, 
    /* route */ typingsSlinky.restify.mod.Route, 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.restify.restifyStrings.close
    - typingsSlinky.restify.restifyStrings.aborted
    - js.UndefOr[scala.Nothing]
  */
  type TMetricsCallback = js.UndefOr[typingsSlinky.restify.mod.plugins._TMetricsCallback]
  
  // *************** This module includes the following header parser plugins:
  /**
    * Check the client's Accept header can be handled by this server.
    */
  @scala.inline
  def acceptParser(accepts: js.Array[java.lang.String]): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("acceptParser")(accepts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * An audit logger for recording all handled requests
    */
  @scala.inline
  def auditLogger(options: typingsSlinky.restify.mod.plugins.AuditLoggerOptions): js.Function1[/* repeated */ js.Any, scala.Unit] = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("auditLogger")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  
  /**
    * Authorization header
    */
  @scala.inline
  def authorizationParser(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("authorizationParser")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def authorizationParser(options: js.Any): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("authorizationParser")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Parses POST bodies to req.body. automatically uses one of the following parsers based on content type.
    */
  @scala.inline
  def bodyParser(): js.Array[typingsSlinky.restify.mod.RequestHandler] = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("bodyParser")().asInstanceOf[js.Array[typingsSlinky.restify.mod.RequestHandler]]
  @scala.inline
  def bodyParser(options: typingsSlinky.restify.mod.plugins.BodyParserOptions): js.Array[typingsSlinky.restify.mod.RequestHandler] = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("bodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.restify.mod.RequestHandler]]
  
  /**
    * Reads the body of the request.
    */
  @scala.inline
  def bodyReader(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("bodyReader")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def bodyReader(options: typingsSlinky.restify.anon.MaxBodySize): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("bodyReader")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  @scala.inline
  def conditionalHandler(candidates: js.Array[typingsSlinky.restify.mod.plugins.HandlerCandidate]): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("conditionalHandler")(candidates.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  /**
    * Runs first handler that matches to the condition
    */
  @scala.inline
  def conditionalHandler(candidates: typingsSlinky.restify.mod.plugins.HandlerCandidate): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("conditionalHandler")(candidates.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Conditional headers (If-*)
    */
  @scala.inline
  def conditionalRequest(): js.Array[typingsSlinky.restify.mod.RequestHandler] = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("conditionalRequest")().asInstanceOf[js.Array[typingsSlinky.restify.mod.RequestHandler]]
  
  /**
    * Cpu Throttle middleware
    */
  @scala.inline
  def cpuUsageThrottle(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("cpuUsageThrottle")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def cpuUsageThrottle(opts: typingsSlinky.restify.mod.plugins.CpuUsageThrottleOptions): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("cpuUsageThrottle")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  // ******************** The module includes the following response plugins:
  /**
    * expires requests based on current time + delta
    * @param delta - age in seconds
    */
  @scala.inline
  def dateParser(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("dateParser")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def dateParser(delta: scala.Double): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("dateParser")(delta.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Handles disappeared CORS headers
    */
  @scala.inline
  def fullResponse(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("fullResponse")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * gzips the response if client send `accept-encoding: gzip`
    * @param options options to pass to gzlib
    */
  @scala.inline
  def gzipResponse(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("gzipResponse")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def gzipResponse(options: typingsSlinky.node.zlibMod.ZlibOptions): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("gzipResponse")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  @scala.inline
  def inflightRequestThrottle(opts: typingsSlinky.restify.mod.plugins.InflightRequestThrottleOptions): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("inflightRequestThrottle")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Parses JSON POST bodies
    */
  @scala.inline
  def jsonBodyParser(): js.Array[typingsSlinky.restify.mod.RequestHandler] = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("jsonBodyParser")().asInstanceOf[js.Array[typingsSlinky.restify.mod.RequestHandler]]
  @scala.inline
  def jsonBodyParser(options: typingsSlinky.restify.mod.plugins.JsonBodyParserOptions): js.Array[typingsSlinky.restify.mod.RequestHandler] = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("jsonBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.restify.mod.RequestHandler]]
  
  /**
    * Parses JSONP callback
    */
  @scala.inline
  def jsonp(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Listens to the server's after event and emits information about that request (5.x compatible only).
    *
    * ```
    * server.on('after', plugins.metrics({ server }, (err, metrics, req, res, route) =>
    * {
    *    // metrics is an object containing information about the request
    * }));
    * ```
    */
  @scala.inline
  def metrics(
    opts: typingsSlinky.restify.anon.Server,
    callback: typingsSlinky.restify.mod.plugins.MetricsCallback
  ): js.Function1[/* repeated */ js.Any, scala.Unit] = (typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("metrics")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  
  /**
    * Parses JSONP callback
    */
  @scala.inline
  def multipartBodyParser(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("multipartBodyParser")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def multipartBodyParser(options: typingsSlinky.restify.mod.plugins.MultipartBodyParser_): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("multipartBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Parse the client's request for an OAUTH2 access tokensTable
    *
    * Subsequent handlers will see `req.oauth2`, which looks like:
    * ```
    * {
    *    oauth2: {accessToken: 'mF_9.B5f-4.1JqM&p=q'}
    * }
    * ```
    */
  @scala.inline
  def oauth2TokenParser(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("oauth2TokenParser")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Parses URL query parameters into `req.query`. Many options correspond directly to option defined for the underlying [qs.parse](https://github.com/ljharb/qs)
    */
  @scala.inline
  def queryParser(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("queryParser")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def queryParser(options: typingsSlinky.restify.mod.plugins.QueryParserOptions): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("queryParser")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * A request expiry will use headers to tell if the incoming request has expired or not.
    *
    * There are two options for this plugin:
    *   1. Absolute Time
    *     * Time in Milliseconds since the Epoch when this request should be considered expired
    *   2. Timeout
    *     * The request start time is supplied
    *     * A timeout, in milliseconds, is given
    *     * The timeout is added to the request start time to arrive at the absolute time
    *       in which the request is considered expires
    */
  @scala.inline
  def requestExpiry(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("requestExpiry")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def requestExpiry(options: typingsSlinky.restify.mod.plugins.RequestExpiryOptions): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("requestExpiry")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Adds timers for each handler in your request chain
    *
    * `options.properties` properties to pass to bunyan's `log.child()` method
    */
  @scala.inline
  def requestLogger(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def requestLogger(options: typingsSlinky.restify.mod.plugins.RequestLogger_): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Used to serve static files
    */
  @scala.inline
  def serveStatic(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def serveStatic(options: typingsSlinky.restify.mod.plugins.ServeStatic_): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Used to serve static files from a given directory
    */
  @scala.inline
  def serveStaticFiles(dir: java.lang.String): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("serveStaticFiles")(dir.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def serveStaticFiles(dir: java.lang.String, options: typingsSlinky.restify.mod.plugins.ServeStaticFiles_): typingsSlinky.restify.mod.RequestHandler = (typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("serveStaticFiles")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    *  throttles responses
    */
  @scala.inline
  def throttle(): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("throttle")().asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  @scala.inline
  def throttle(options: typingsSlinky.restify.mod.plugins.ThrottleOptions): typingsSlinky.restify.mod.RequestHandler = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.restify.mod.RequestHandler]
  
  /**
    * Parse the HTTP request body IFF the contentType is application/x-www-form-urlencoded.
    *
    * If req.params already contains a given key, that key is skipped and an
    * error is logged.
    */
  @scala.inline
  def urlEncodedBodyParser(): js.Array[typingsSlinky.restify.mod.RequestHandler] = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodedBodyParser")().asInstanceOf[js.Array[typingsSlinky.restify.mod.RequestHandler]]
  @scala.inline
  def urlEncodedBodyParser(options: typingsSlinky.restify.mod.plugins.UrlEncodedBodyParserOptions): js.Array[typingsSlinky.restify.mod.RequestHandler] = typingsSlinky.restify.mod.plugins.^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodedBodyParser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.restify.mod.RequestHandler]]
}
