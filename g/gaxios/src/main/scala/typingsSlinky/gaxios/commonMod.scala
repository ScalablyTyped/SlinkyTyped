package typingsSlinky.gaxios

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.gaxios.gaxiosStrings.CONNECT
import typingsSlinky.gaxios.gaxiosStrings.DELETE
import typingsSlinky.gaxios.gaxiosStrings.GET
import typingsSlinky.gaxios.gaxiosStrings.HEAD
import typingsSlinky.gaxios.gaxiosStrings.OPTIONS
import typingsSlinky.gaxios.gaxiosStrings.PATCH
import typingsSlinky.gaxios.gaxiosStrings.POST
import typingsSlinky.gaxios.gaxiosStrings.PUT
import typingsSlinky.gaxios.gaxiosStrings.TRACE
import typingsSlinky.gaxios.gaxiosStrings.arraybuffer
import typingsSlinky.gaxios.gaxiosStrings.blob
import typingsSlinky.gaxios.gaxiosStrings.json
import typingsSlinky.gaxios.gaxiosStrings.stream
import typingsSlinky.gaxios.gaxiosStrings.text
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("gaxios/build/src/common", "GaxiosError")
  @js.native
  class GaxiosError[T] protected () extends Error {
    def this(message: String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var config: GaxiosOptions = js.native
    
    var response: js.UndefOr[GaxiosResponse[T]] = js.native
  }
  
  @js.native
  trait GaxiosOptions extends StObject {
    
    /**
      * Optional method to override making the actual HTTP request. Useful
      * for writing tests.
      */
    var adapter: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* defaultAdapter */ js.Function1[/* options */ this.type, GaxiosPromise[_]], 
          GaxiosPromise[_]
        ]
      ] = js.native
    
    var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.native
    
    var baseURL: js.UndefOr[String] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var body: js.UndefOr[js.Any] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var follow: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    /**
      * The maximum size of the http response content in bytes allowed.
      */
    var maxContentLength: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of redirects to follow. Defaults to 20.
      */
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH] = js.native
    
    var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
    
    var paramsSerializer: js.UndefOr[js.Function1[/* params */ StringDictionary[String | Double], String]] = js.native
    
    var responseType: js.UndefOr[arraybuffer | blob | json | text | stream] = js.native
    
    var retry: js.UndefOr[Boolean] = js.native
    
    var retryConfig: js.UndefOr[RetryConfig] = js.native
    
    var signal: js.UndefOr[AbortSignal] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var validateStatus: js.UndefOr[js.Function1[/* status */ Double, Boolean]] = js.native
  }
  object GaxiosOptions {
    
    @scala.inline
    def apply(): GaxiosOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GaxiosOptions]
    }
    
    @scala.inline
    implicit class GaxiosOptionsMutableBuilder[Self <: GaxiosOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(
        value: (GaxiosOptions, /* defaultAdapter */ js.Function1[GaxiosOptions, GaxiosPromise[_]]) => GaxiosPromise[_]
      ): Self = StObject.set(x, "adapter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setAgent(value: Agent | (js.Function1[/* parsedUrl */ URL_, Agent])): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentFunction1(value: /* parsedUrl */ URL_ => Agent): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMaxContentLength(value: Double): Self = StObject.set(x, "maxContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxContentLengthUndefined: Self = StObject.set(x, "maxContentLength", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMethod(value: GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOnUploadProgress(value: /* progressEvent */ js.Any => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsSerializer(value: /* params */ StringDictionary[String | Double] => String): Self = StObject.set(x, "paramsSerializer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParamsSerializerUndefined: Self = StObject.set(x, "paramsSerializer", js.undefined)
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setResponseType(value: arraybuffer | blob | json | text | stream): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryConfig(value: RetryConfig): Self = StObject.set(x, "retryConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryConfigUndefined: Self = StObject.set(x, "retryConfig", js.undefined)
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setValidateStatus(value: /* status */ Double => Boolean): Self = StObject.set(x, "validateStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
    }
  }
  
  type GaxiosPromise[T] = js.Promise[GaxiosResponse[T]]
  
  @js.native
  trait GaxiosResponse[T] extends StObject {
    
    var config: GaxiosOptions = js.native
    
    var data: T = js.native
    
    var headers: Headers = js.native
    
    var request: GaxiosXMLHttpRequest = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
  }
  object GaxiosResponse {
    
    @scala.inline
    def apply[T](
      config: GaxiosOptions,
      data: T,
      headers: Headers,
      request: GaxiosXMLHttpRequest,
      status: Double,
      statusText: String
    ): GaxiosResponse[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaxiosResponse[T]]
    }
    
    @scala.inline
    implicit class GaxiosResponseMutableBuilder[Self <: GaxiosResponse[_], T] (val x: Self with GaxiosResponse[T]) extends AnyVal {
      
      @scala.inline
      def setConfig(value: GaxiosOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: GaxiosXMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GaxiosXMLHttpRequest extends StObject {
    
    var responseURL: String = js.native
  }
  object GaxiosXMLHttpRequest {
    
    @scala.inline
    def apply(responseURL: String): GaxiosXMLHttpRequest = {
      val __obj = js.Dynamic.literal(responseURL = responseURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaxiosXMLHttpRequest]
    }
    
    @scala.inline
    implicit class GaxiosXMLHttpRequestMutableBuilder[Self <: GaxiosXMLHttpRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponseURL(value: String): Self = StObject.set(x, "responseURL", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[js.Any]
  
  @js.native
  trait RetryConfig extends StObject {
    
    /**
      * The number of retries already attempted.
      */
    var currentRetryAttempt: js.UndefOr[Double] = js.native
    
    /**
      * The HTTP Methods that will be automatically retried.
      * Defaults to ['GET','PUT','HEAD','OPTIONS','DELETE']
      */
    var httpMethodsToRetry: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * When there is no response, the number of retries to attempt. Defaults to 2.
      */
    var noResponseRetries: js.UndefOr[Double] = js.native
    
    /**
      * Function to invoke when a retry attempt is made.
      */
    var onRetryAttempt: js.UndefOr[js.Function1[/* err */ GaxiosError[_], js.Promise[Unit] | Unit]] = js.native
    
    /**
      * The number of times to retry the request.  Defaults to 3.
      */
    var retry: js.UndefOr[Double] = js.native
    
    /**
      * The amount of time to initially delay the retry, in ms.  Defaults to 100ms.
      */
    var retryDelay: js.UndefOr[Double] = js.native
    
    /**
      * Function to invoke which determines if you should retry
      */
    var shouldRetry: js.UndefOr[js.Function1[/* err */ GaxiosError[_], js.Promise[Boolean] | Boolean]] = js.native
    
    /**
      * The HTTP response status codes that will automatically be retried.
      * Defaults to: [[100, 199], [429, 429], [500, 599]]
      */
    var statusCodesToRetry: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  }
  object RetryConfig {
    
    @scala.inline
    def apply(): RetryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryConfig]
    }
    
    @scala.inline
    implicit class RetryConfigMutableBuilder[Self <: RetryConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentRetryAttempt(value: Double): Self = StObject.set(x, "currentRetryAttempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentRetryAttemptUndefined: Self = StObject.set(x, "currentRetryAttempt", js.undefined)
      
      @scala.inline
      def setHttpMethodsToRetry(value: js.Array[String]): Self = StObject.set(x, "httpMethodsToRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodsToRetryUndefined: Self = StObject.set(x, "httpMethodsToRetry", js.undefined)
      
      @scala.inline
      def setHttpMethodsToRetryVarargs(value: String*): Self = StObject.set(x, "httpMethodsToRetry", js.Array(value :_*))
      
      @scala.inline
      def setNoResponseRetries(value: Double): Self = StObject.set(x, "noResponseRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResponseRetriesUndefined: Self = StObject.set(x, "noResponseRetries", js.undefined)
      
      @scala.inline
      def setOnRetryAttempt(value: /* err */ GaxiosError[_] => js.Promise[Unit] | Unit): Self = StObject.set(x, "onRetryAttempt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRetryAttemptUndefined: Self = StObject.set(x, "onRetryAttempt", js.undefined)
      
      @scala.inline
      def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setShouldRetry(value: /* err */ GaxiosError[_] => js.Promise[Boolean] | Boolean): Self = StObject.set(x, "shouldRetry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldRetryUndefined: Self = StObject.set(x, "shouldRetry", js.undefined)
      
      @scala.inline
      def setStatusCodesToRetry(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "statusCodesToRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodesToRetryUndefined: Self = StObject.set(x, "statusCodesToRetry", js.undefined)
      
      @scala.inline
      def setStatusCodesToRetryVarargs(value: js.Array[Double]*): Self = StObject.set(x, "statusCodesToRetry", js.Array(value :_*))
    }
  }
}
