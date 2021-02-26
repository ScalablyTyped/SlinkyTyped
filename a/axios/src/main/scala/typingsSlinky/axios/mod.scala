package typingsSlinky.axios

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.axios.anon.Password
import typingsSlinky.axios.anon.Request
import typingsSlinky.axios.axiosBooleans.`false`
import typingsSlinky.axios.axiosStrings.delete_
import typingsSlinky.axios.axiosStrings.get_
import typingsSlinky.axios.axiosStrings.head_
import typingsSlinky.axios.axiosStrings.link_
import typingsSlinky.axios.axiosStrings.options_
import typingsSlinky.axios.axiosStrings.patch_
import typingsSlinky.axios.axiosStrings.post_
import typingsSlinky.axios.axiosStrings.purge_
import typingsSlinky.axios.axiosStrings.put_
import typingsSlinky.axios.axiosStrings.unlink_
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("axios", JSImport.Default)
    @js.native
    val ^ : AxiosStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("axios", "default.Cancel")
    @js.native
    class CancelCls () extends Cancel {
      def this(message: String) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("axios", "default.CancelToken")
    @js.native
    class CancelTokenCls protected () extends CancelToken {
      def this(executor: js.Function1[/* cancel */ Canceler, Unit]) = this()
    }
    
    type _To = AxiosStatic
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: AxiosStatic = ^
  }
  
  type AxiosAdapter = js.Function1[/* config */ AxiosRequestConfig, AxiosPromise[js.Any]]
  
  @js.native
  trait AxiosBasicCredentials extends StObject {
    
    var password: String = js.native
    
    var username: String = js.native
  }
  object AxiosBasicCredentials {
    
    @scala.inline
    def apply(password: String, username: String): AxiosBasicCredentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxiosBasicCredentials]
    }
    
    @scala.inline
    implicit class AxiosBasicCredentialsMutableBuilder[Self <: AxiosBasicCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AxiosError[T] extends Error {
    
    var code: js.UndefOr[String] = js.native
    
    var config: AxiosRequestConfig = js.native
    
    var isAxiosError: Boolean = js.native
    
    var request: js.UndefOr[js.Any] = js.native
    
    var response: js.UndefOr[AxiosResponse[T]] = js.native
    
    def toJSON(): js.Object = js.native
  }
  object AxiosError {
    
    @scala.inline
    def apply[T](
      config: AxiosRequestConfig,
      isAxiosError: Boolean,
      message: String,
      name: String,
      toJSON: () => js.Object
    ): AxiosError[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], isAxiosError = isAxiosError.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[AxiosError[T]]
    }
    
    @scala.inline
    implicit class AxiosErrorMutableBuilder[Self <: AxiosError[_], T] (val x: Self with AxiosError[T]) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setConfig(value: AxiosRequestConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAxiosError(value: Boolean): Self = StObject.set(x, "isAxiosError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setResponse(value: AxiosResponse[T]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait AxiosInstance extends StObject {
    
    def apply(config: AxiosRequestConfig): AxiosPromise[_] = js.native
    def apply(url: String): AxiosPromise[_] = js.native
    def apply(url: String, config: AxiosRequestConfig): AxiosPromise[_] = js.native
    
    var defaults: AxiosRequestConfig = js.native
    
    def delete[T, R](url: String): js.Promise[R] = js.native
    def delete[T, R](url: String, config: AxiosRequestConfig): js.Promise[R] = js.native
    
    def get[T, R](url: String): js.Promise[R] = js.native
    def get[T, R](url: String, config: AxiosRequestConfig): js.Promise[R] = js.native
    
    def getUri(): String = js.native
    def getUri(config: AxiosRequestConfig): String = js.native
    
    def head[T, R](url: String): js.Promise[R] = js.native
    def head[T, R](url: String, config: AxiosRequestConfig): js.Promise[R] = js.native
    
    var interceptors: Request = js.native
    
    def options[T, R](url: String): js.Promise[R] = js.native
    def options[T, R](url: String, config: AxiosRequestConfig): js.Promise[R] = js.native
    
    def patch[T, R](url: String): js.Promise[R] = js.native
    def patch[T, R](url: String, data: js.UndefOr[scala.Nothing], config: AxiosRequestConfig): js.Promise[R] = js.native
    def patch[T, R](url: String, data: js.Any): js.Promise[R] = js.native
    def patch[T, R](url: String, data: js.Any, config: AxiosRequestConfig): js.Promise[R] = js.native
    
    def post[T, R](url: String): js.Promise[R] = js.native
    def post[T, R](url: String, data: js.UndefOr[scala.Nothing], config: AxiosRequestConfig): js.Promise[R] = js.native
    def post[T, R](url: String, data: js.Any): js.Promise[R] = js.native
    def post[T, R](url: String, data: js.Any, config: AxiosRequestConfig): js.Promise[R] = js.native
    
    def put[T, R](url: String): js.Promise[R] = js.native
    def put[T, R](url: String, data: js.UndefOr[scala.Nothing], config: AxiosRequestConfig): js.Promise[R] = js.native
    def put[T, R](url: String, data: js.Any): js.Promise[R] = js.native
    def put[T, R](url: String, data: js.Any, config: AxiosRequestConfig): js.Promise[R] = js.native
    
    def request[T, R](config: AxiosRequestConfig): js.Promise[R] = js.native
  }
  
  @js.native
  trait AxiosInterceptorManager[V] extends StObject {
    
    def eject(id: Double): Unit = js.native
    
    def use(): Double = js.native
    def use(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function1[/* error */ js.Any, _]): Double = js.native
    def use(onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]]): Double = js.native
    def use(
      onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]],
      onRejected: js.Function1[/* error */ js.Any, _]
    ): Double = js.native
  }
  
  type AxiosPromise[T] = js.Promise[AxiosResponse[T]]
  
  @js.native
  trait AxiosProxyConfig extends StObject {
    
    var auth: js.UndefOr[Password] = js.native
    
    var host: String = js.native
    
    var port: Double = js.native
    
    var protocol: js.UndefOr[String] = js.native
  }
  object AxiosProxyConfig {
    
    @scala.inline
    def apply(host: String, port: Double): AxiosProxyConfig = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxiosProxyConfig]
    }
    
    @scala.inline
    implicit class AxiosProxyConfigMutableBuilder[Self <: AxiosProxyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  @js.native
  trait AxiosRequestConfig extends StObject {
    
    var adapter: js.UndefOr[AxiosAdapter] = js.native
    
    var auth: js.UndefOr[AxiosBasicCredentials] = js.native
    
    var baseURL: js.UndefOr[String] = js.native
    
    var cancelToken: js.UndefOr[CancelToken] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var decompress: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var httpAgent: js.UndefOr[js.Any] = js.native
    
    var httpsAgent: js.UndefOr[js.Any] = js.native
    
    var maxBodyLength: js.UndefOr[Double] = js.native
    
    var maxContentLength: js.UndefOr[Double] = js.native
    
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[Method] = js.native
    
    var onDownloadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
    
    var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
    
    var paramsSerializer: js.UndefOr[js.Function1[/* params */ js.Any, String]] = js.native
    
    var proxy: js.UndefOr[AxiosProxyConfig | `false`] = js.native
    
    var responseType: js.UndefOr[ResponseType] = js.native
    
    var socketPath: js.UndefOr[String | Null] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var timeoutErrorMessage: js.UndefOr[String] = js.native
    
    var transformRequest: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.native
    
    var transformResponse: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var validateStatus: js.UndefOr[(js.Function1[/* status */ Double, Boolean]) | Null] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
    
    var xsrfCookieName: js.UndefOr[String] = js.native
    
    var xsrfHeaderName: js.UndefOr[String] = js.native
  }
  object AxiosRequestConfig {
    
    @scala.inline
    def apply(): AxiosRequestConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxiosRequestConfig]
    }
    
    @scala.inline
    implicit class AxiosRequestConfigMutableBuilder[Self <: AxiosRequestConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: /* config */ AxiosRequestConfig => AxiosPromise[js.Any]): Self = StObject.set(x, "adapter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setAuth(value: AxiosBasicCredentials): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      @scala.inline
      def setCancelToken(value: CancelToken): Self = StObject.set(x, "cancelToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTokenUndefined: Self = StObject.set(x, "cancelToken", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttpAgent(value: js.Any): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      @scala.inline
      def setHttpsAgent(value: js.Any): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      @scala.inline
      def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBodyLengthUndefined: Self = StObject.set(x, "maxBodyLength", js.undefined)
      
      @scala.inline
      def setMaxContentLength(value: Double): Self = StObject.set(x, "maxContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxContentLengthUndefined: Self = StObject.set(x, "maxContentLength", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOnDownloadProgress(value: /* progressEvent */ js.Any => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      @scala.inline
      def setOnUploadProgress(value: /* progressEvent */ js.Any => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsSerializer(value: /* params */ js.Any => String): Self = StObject.set(x, "paramsSerializer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParamsSerializerUndefined: Self = StObject.set(x, "paramsSerializer", js.undefined)
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setProxy(value: AxiosProxyConfig | `false`): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setResponseType(value: ResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathNull: Self = StObject.set(x, "socketPath", null)
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutErrorMessage(value: String): Self = StObject.set(x, "timeoutErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutErrorMessageUndefined: Self = StObject.set(x, "timeoutErrorMessage", js.undefined)
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTransformRequest(value: AxiosTransformer | js.Array[AxiosTransformer]): Self = StObject.set(x, "transformRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformRequestFunction2(value: (/* data */ js.Any, /* headers */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "transformRequest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
      
      @scala.inline
      def setTransformRequestVarargs(value: AxiosTransformer*): Self = StObject.set(x, "transformRequest", js.Array(value :_*))
      
      @scala.inline
      def setTransformResponse(value: AxiosTransformer | js.Array[AxiosTransformer]): Self = StObject.set(x, "transformResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformResponseFunction2(value: (/* data */ js.Any, /* headers */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
      
      @scala.inline
      def setTransformResponseVarargs(value: AxiosTransformer*): Self = StObject.set(x, "transformResponse", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setValidateStatus(value: /* status */ Double => Boolean): Self = StObject.set(x, "validateStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateStatusNull: Self = StObject.set(x, "validateStatus", null)
      
      @scala.inline
      def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
      
      @scala.inline
      def setXsrfCookieName(value: String): Self = StObject.set(x, "xsrfCookieName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsrfCookieNameUndefined: Self = StObject.set(x, "xsrfCookieName", js.undefined)
      
      @scala.inline
      def setXsrfHeaderName(value: String): Self = StObject.set(x, "xsrfHeaderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsrfHeaderNameUndefined: Self = StObject.set(x, "xsrfHeaderName", js.undefined)
    }
  }
  
  @js.native
  trait AxiosResponse[T] extends StObject {
    
    var config: AxiosRequestConfig = js.native
    
    var data: T = js.native
    
    var headers: js.Any = js.native
    
    var request: js.UndefOr[js.Any] = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
  }
  object AxiosResponse {
    
    @scala.inline
    def apply[T](config: AxiosRequestConfig, data: T, headers: js.Any, status: Double, statusText: String): AxiosResponse[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxiosResponse[T]]
    }
    
    @scala.inline
    implicit class AxiosResponseMutableBuilder[Self <: AxiosResponse[_], T] (val x: Self with AxiosResponse[T]) extends AnyVal {
      
      @scala.inline
      def setConfig(value: AxiosRequestConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AxiosStatic extends AxiosInstance {
    
    var Cancel: CancelStatic = js.native
    
    var CancelToken: CancelTokenStatic = js.native
    
    def all[T](values: js.Array[T | js.Promise[T]]): js.Promise[js.Array[T]] = js.native
    
    def create(): AxiosInstance = js.native
    def create(config: AxiosRequestConfig): AxiosInstance = js.native
    
    def isCancel(value: js.Any): Boolean = js.native
    
    def spread[T, R](callback: js.Function1[/* repeated */ T, R]): js.Function1[/* array */ js.Array[T], R] = js.native
  }
  
  type AxiosTransformer = js.Function2[/* data */ js.Any, /* headers */ js.UndefOr[js.Any], js.Any]
  
  @js.native
  trait Cancel extends StObject {
    
    var message: String = js.native
  }
  object Cancel {
    
    @scala.inline
    def apply(message: String): Cancel = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CancelStatic
    extends Instantiable0[Cancel]
       with Instantiable1[/* message */ String, Cancel]
  
  @js.native
  trait CancelToken extends StObject {
    
    var promise: js.Promise[Cancel] = js.native
    
    var reason: js.UndefOr[Cancel] = js.native
    
    def throwIfRequested(): Unit = js.native
  }
  object CancelToken {
    
    @scala.inline
    def apply(promise: js.Promise[Cancel], throwIfRequested: () => Unit): CancelToken = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], throwIfRequested = js.Any.fromFunction0(throwIfRequested))
      __obj.asInstanceOf[CancelToken]
    }
    
    @scala.inline
    implicit class CancelTokenMutableBuilder[Self <: CancelToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPromise(value: js.Promise[Cancel]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: Cancel): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setThrowIfRequested(value: () => Unit): Self = StObject.set(x, "throwIfRequested", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CancelTokenSource extends StObject {
    
    def cancel(): Unit = js.native
    def cancel(message: String): Unit = js.native
    @JSName("cancel")
    var cancel_Original: Canceler = js.native
    
    var token: CancelToken = js.native
  }
  
  @js.native
  trait CancelTokenStatic
    extends Instantiable1[/* executor */ js.Function1[/* cancel */ Canceler, Unit], CancelToken] {
    
    def source(): CancelTokenSource = js.native
  }
  
  type Canceler = js.Function1[/* message */ js.UndefOr[String], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.axios.axiosStrings.get_
    - typingsSlinky.axios.axiosStrings.GET
    - typingsSlinky.axios.axiosStrings.delete_
    - typingsSlinky.axios.axiosStrings.DELETE
    - typingsSlinky.axios.axiosStrings.head_
    - typingsSlinky.axios.axiosStrings.HEAD
    - typingsSlinky.axios.axiosStrings.options_
    - typingsSlinky.axios.axiosStrings.OPTIONS
    - typingsSlinky.axios.axiosStrings.post_
    - typingsSlinky.axios.axiosStrings.POST
    - typingsSlinky.axios.axiosStrings.put_
    - typingsSlinky.axios.axiosStrings.PUT
    - typingsSlinky.axios.axiosStrings.patch_
    - typingsSlinky.axios.axiosStrings.PATCH
    - typingsSlinky.axios.axiosStrings.purge_
    - typingsSlinky.axios.axiosStrings.PURGE
    - typingsSlinky.axios.axiosStrings.link_
    - typingsSlinky.axios.axiosStrings.LINK
    - typingsSlinky.axios.axiosStrings.unlink_
    - typingsSlinky.axios.axiosStrings.UNLINK
  */
  trait Method extends StObject
  object Method {
    
    @scala.inline
    def DELETE: typingsSlinky.axios.axiosStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.axios.axiosStrings.DELETE]
    
    @scala.inline
    def GET: typingsSlinky.axios.axiosStrings.GET = "GET".asInstanceOf[typingsSlinky.axios.axiosStrings.GET]
    
    @scala.inline
    def HEAD: typingsSlinky.axios.axiosStrings.HEAD = "HEAD".asInstanceOf[typingsSlinky.axios.axiosStrings.HEAD]
    
    @scala.inline
    def LINK: typingsSlinky.axios.axiosStrings.LINK = "LINK".asInstanceOf[typingsSlinky.axios.axiosStrings.LINK]
    
    @scala.inline
    def OPTIONS: typingsSlinky.axios.axiosStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsSlinky.axios.axiosStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typingsSlinky.axios.axiosStrings.PATCH = "PATCH".asInstanceOf[typingsSlinky.axios.axiosStrings.PATCH]
    
    @scala.inline
    def POST: typingsSlinky.axios.axiosStrings.POST = "POST".asInstanceOf[typingsSlinky.axios.axiosStrings.POST]
    
    @scala.inline
    def PURGE: typingsSlinky.axios.axiosStrings.PURGE = "PURGE".asInstanceOf[typingsSlinky.axios.axiosStrings.PURGE]
    
    @scala.inline
    def PUT: typingsSlinky.axios.axiosStrings.PUT = "PUT".asInstanceOf[typingsSlinky.axios.axiosStrings.PUT]
    
    @scala.inline
    def UNLINK: typingsSlinky.axios.axiosStrings.UNLINK = "UNLINK".asInstanceOf[typingsSlinky.axios.axiosStrings.UNLINK]
    
    @scala.inline
    def delete: delete_ = "delete".asInstanceOf[delete_]
    
    @scala.inline
    def get: get_ = "get".asInstanceOf[get_]
    
    @scala.inline
    def head: head_ = "head".asInstanceOf[head_]
    
    @scala.inline
    def link: link_ = "link".asInstanceOf[link_]
    
    @scala.inline
    def options: options_ = "options".asInstanceOf[options_]
    
    @scala.inline
    def patch: patch_ = "patch".asInstanceOf[patch_]
    
    @scala.inline
    def post: post_ = "post".asInstanceOf[post_]
    
    @scala.inline
    def purge: purge_ = "purge".asInstanceOf[purge_]
    
    @scala.inline
    def put: put_ = "put".asInstanceOf[put_]
    
    @scala.inline
    def unlink: unlink_ = "unlink".asInstanceOf[unlink_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.axios.axiosStrings.arraybuffer
    - typingsSlinky.axios.axiosStrings.blob
    - typingsSlinky.axios.axiosStrings.document
    - typingsSlinky.axios.axiosStrings.json
    - typingsSlinky.axios.axiosStrings.text
    - typingsSlinky.axios.axiosStrings.stream
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    @scala.inline
    def arraybuffer: typingsSlinky.axios.axiosStrings.arraybuffer = "arraybuffer".asInstanceOf[typingsSlinky.axios.axiosStrings.arraybuffer]
    
    @scala.inline
    def blob: typingsSlinky.axios.axiosStrings.blob = "blob".asInstanceOf[typingsSlinky.axios.axiosStrings.blob]
    
    @scala.inline
    def document: typingsSlinky.axios.axiosStrings.document = "document".asInstanceOf[typingsSlinky.axios.axiosStrings.document]
    
    @scala.inline
    def json: typingsSlinky.axios.axiosStrings.json = "json".asInstanceOf[typingsSlinky.axios.axiosStrings.json]
    
    @scala.inline
    def stream: typingsSlinky.axios.axiosStrings.stream = "stream".asInstanceOf[typingsSlinky.axios.axiosStrings.stream]
    
    @scala.inline
    def text: typingsSlinky.axios.axiosStrings.text = "text".asInstanceOf[typingsSlinky.axios.axiosStrings.text]
  }
}
