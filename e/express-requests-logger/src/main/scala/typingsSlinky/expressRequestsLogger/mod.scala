package typingsSlinky.expressRequestsLogger

import typingsSlinky.expressRequestsLogger.expressRequestsLoggerStrings.debug
import typingsSlinky.expressRequestsLogger.expressRequestsLoggerStrings.error
import typingsSlinky.expressRequestsLogger.expressRequestsLoggerStrings.info
import typingsSlinky.expressRequestsLogger.expressRequestsLoggerStrings.trace
import typingsSlinky.expressRequestsLogger.expressRequestsLoggerStrings.warn
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.qs.mod.ParsedQs
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Middleware for logging request/responses in Express apps
    */
  @JSImport("express-requests-logger", JSImport.Namespace)
  @js.native
  def apply(): NextFunction = js.native
  @JSImport("express-requests-logger", JSImport.Namespace)
  @js.native
  def apply(options: Options): NextFunction = js.native
  
  @js.native
  trait CommonOptions extends StObject {
    
    /**
      * `true` - include request in audit, `false` - don't.
      * {@link https://github.com/PayU/express-request-logger#audit}
      */
    var audit: js.UndefOr[Boolean] = js.native
    
    /**
      * pass the fields you wish to exclude in the body of the requests (sensitive data like passwords, credit cards numbers etc..). * field - exclude all body
      * {@link https://github.com/PayU/express-request-logger#excludebody}
      */
    var excludeBody: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * pass the header names you wish to exclude from the audit (senstitive data like authorization headers etc..). * field - exclude all headers
      * {@link https://github.com/PayU/express-request-logger#excludeheaders}
      */
    var excludeHeaders: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * pass the fields you wish to mask in the body of the requests (sensitive data like passwords, credit cards numbers etc..).
      * {@link https://github.com/PayU/express-request-logger#maskbody}
      */
    var maskBody: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * pass the fields you wish to mask in the headers of the requests (senstitive data like authorization headers etc..).
      * {@link https://github.com/PayU/express-request-logger#maskheaders}
      */
    var maskHeaders: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * pass the fields you wish to mask in the query of the requests (sensitive data like passwords, credit cards numbers etc..).
      * {@link https://github.com/PayU/express-request-logger#maskquery}
      */
    var maskQuery: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Restrict request body's logged content length (inputs other than positive integers will be ignored).
      * {@link https://github.com/PayU/express-request-logger#maxbodylength}
      */
    var maxBodyLength: js.UndefOr[Double] = js.native
  }
  object CommonOptions {
    
    @scala.inline
    def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    @scala.inline
    implicit class CommonOptionsMutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudit(value: Boolean): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuditUndefined: Self = StObject.set(x, "audit", js.undefined)
      
      @scala.inline
      def setExcludeBody(value: js.Array[String]): Self = StObject.set(x, "excludeBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeBodyUndefined: Self = StObject.set(x, "excludeBody", js.undefined)
      
      @scala.inline
      def setExcludeBodyVarargs(value: String*): Self = StObject.set(x, "excludeBody", js.Array(value :_*))
      
      @scala.inline
      def setExcludeHeaders(value: js.Array[String]): Self = StObject.set(x, "excludeHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeHeadersUndefined: Self = StObject.set(x, "excludeHeaders", js.undefined)
      
      @scala.inline
      def setExcludeHeadersVarargs(value: String*): Self = StObject.set(x, "excludeHeaders", js.Array(value :_*))
      
      @scala.inline
      def setMaskBody(value: js.Array[String]): Self = StObject.set(x, "maskBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskBodyUndefined: Self = StObject.set(x, "maskBody", js.undefined)
      
      @scala.inline
      def setMaskBodyVarargs(value: String*): Self = StObject.set(x, "maskBody", js.Array(value :_*))
      
      @scala.inline
      def setMaskHeaders(value: js.Array[String]): Self = StObject.set(x, "maskHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskHeadersUndefined: Self = StObject.set(x, "maskHeaders", js.undefined)
      
      @scala.inline
      def setMaskHeadersVarargs(value: String*): Self = StObject.set(x, "maskHeaders", js.Array(value :_*))
      
      @scala.inline
      def setMaskQuery(value: js.Array[String]): Self = StObject.set(x, "maskQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskQueryUndefined: Self = StObject.set(x, "maskQuery", js.undefined)
      
      @scala.inline
      def setMaskQueryVarargs(value: String*): Self = StObject.set(x, "maskQuery", js.Array(value :_*))
      
      @scala.inline
      def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBodyLengthUndefined: Self = StObject.set(x, "maxBodyLength", js.undefined)
    }
  }
  
  @js.native
  trait Logger extends StObject {
    
    def info(obj: js.Object, params: js.Any*): Unit = js.native
  }
  object Logger {
    
    @scala.inline
    def apply(info: (js.Object, /* repeated */ js.Any) => Unit): Logger = {
      val __obj = js.Dynamic.literal(info = js.Any.fromFunction2(info))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: (js.Object, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * {@link https://github.com/PayU/express-request-logger#options}
    */
  @js.native
  trait Options extends CommonOptions {
    
    /**
      * Additional to mask options, you can add your own functionality to mask request body.
      * This function will execute as a masking function before the package functions.
      * The custom function gets the full express request and should return the masked body.
      * {@link https://github.com/PayU/express-request-logger#custommaskbodyfunc}
      */
    var customMaskBodyFunc: js.UndefOr[js.Function1[/* req */ Request[ParamsDictionary, _, _, ParsedQs], String]] = js.native
    
    /**
      * `true` - log once the request arrives (request details), and log after response is sent (both request and response).
      * Useful if there is a concern that the server will crash during the request and there is a need to log the request before it's processed.
      * `false` - log only after the response is sent.
      * {@link https://github.com/PayU/express-request-logger#doubleaudit}
      */
    var doubleAudit: js.UndefOr[Boolean] = js.native
    
    /**
      * if the request url matches one of the values in the array, the request/response won't be logged.
      * {@link https://github.com/PayU/express-request-logger#excludeurls}
      */
    var excludeURLs: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The logger to use for logging the request/response.
      * Package tested only with `bunyan` logger, but should work with any logger which has a info method which takes an object.
      * {@link https://github.com/PayU/express-request-logger#logger}
      */
    var logger: js.UndefOr[Logger] = js.native
    
    /**
      * Specific configuration for requests
      * {@link https://github.com/PayU/express-request-logger#request}
      */
    var request: js.UndefOr[js.Any] = js.native
    
    /**
      * Specific configuration for responses
      * {@link https://github.com/PayU/express-request-logger#response}
      */
    var response: js.UndefOr[ResponseOptions] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomMaskBodyFunc(value: /* req */ Request[ParamsDictionary, _, _, ParsedQs] => String): Self = StObject.set(x, "customMaskBodyFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomMaskBodyFuncUndefined: Self = StObject.set(x, "customMaskBodyFunc", js.undefined)
      
      @scala.inline
      def setDoubleAudit(value: Boolean): Self = StObject.set(x, "doubleAudit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleAuditUndefined: Self = StObject.set(x, "doubleAudit", js.undefined)
      
      @scala.inline
      def setExcludeURLs(value: js.Array[String]): Self = StObject.set(x, "excludeURLs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeURLsUndefined: Self = StObject.set(x, "excludeURLs", js.undefined)
      
      @scala.inline
      def setExcludeURLsVarargs(value: String*): Self = StObject.set(x, "excludeURLs", js.Array(value :_*))
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setResponse(value: ResponseOptions): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  @js.native
  trait ResponseOptions extends CommonOptions {
    
    /**
      * Map of statusCodes to log levels.
      * By default the audit is logged with level 'info'.
      * It is possible to override it by configuration according to the statusCode of the response
      */
    var levels: js.UndefOr[StatusCodeMap] = js.native
  }
  object ResponseOptions {
    
    @scala.inline
    def apply(): ResponseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseOptions]
    }
    
    @scala.inline
    implicit class ResponseOptionsMutableBuilder[Self <: ResponseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevels(value: StatusCodeMap): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    }
  }
  
  type StatusCodeMap = Record[String, trace | debug | info | warn | error]
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        val maxBodyLength: Double = js.native
      }
      object Request {
        
        @scala.inline
        def apply(maxBodyLength: Double): typingsSlinky.expressRequestsLogger.mod.global.Express.Request = {
          val __obj = js.Dynamic.literal(maxBodyLength = maxBodyLength.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsSlinky.expressRequestsLogger.mod.global.Express.Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: typingsSlinky.expressRequestsLogger.mod.global.Express.Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Response extends StObject {
        
        val maxBodyLength: Double = js.native
        
        val timestamp: js.Date = js.native
      }
      object Response {
        
        @scala.inline
        def apply(maxBodyLength: Double, timestamp: js.Date): Response = {
          val __obj = js.Dynamic.literal(maxBodyLength = maxBodyLength.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
          __obj.asInstanceOf[Response]
        }
        
        @scala.inline
        implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
