package typingsSlinky.nightmare

import typingsSlinky.nightmare.anon.Downloads
import typingsSlinky.nightmare.anon.Height
import typingsSlinky.nightmare.anon.Mode
import typingsSlinky.nightmare.nightmareStrings.HTMLComplete
import typingsSlinky.nightmare.nightmareStrings.HTMLOnly
import typingsSlinky.nightmare.nightmareStrings.MHTML
import typingsSlinky.nightmare.nightmareStrings.alert
import typingsSlinky.nightmare.nightmareStrings.cancel
import typingsSlinky.nightmare.nightmareStrings.confirm
import typingsSlinky.nightmare.nightmareStrings.consoleMessage
import typingsSlinky.nightmare.nightmareStrings.continue
import typingsSlinky.nightmare.nightmareStrings.error
import typingsSlinky.nightmare.nightmareStrings.initialized
import typingsSlinky.nightmare.nightmareStrings.loadFinished
import typingsSlinky.nightmare.nightmareStrings.loadStarted
import typingsSlinky.nightmare.nightmareStrings.navigationRequested
import typingsSlinky.nightmare.nightmareStrings.prompt
import typingsSlinky.nightmare.nightmareStrings.resourceError
import typingsSlinky.nightmare.nightmareStrings.resourceReceived
import typingsSlinky.nightmare.nightmareStrings.resourceRequested
import typingsSlinky.nightmare.nightmareStrings.timeout
import typingsSlinky.nightmare.nightmareStrings.urlChanged
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nightmare", JSImport.Namespace)
  @js.native
  class ^ () extends Nightmare {
    def this(options: IConstructorOptions) = this()
  }
  
  @JSImport("nightmare", "Cookies")
  @js.native
  class Cookies () extends StObject {
    
    def clear(): Nightmare = js.native
    def clear(name: String): Nightmare = js.native
    
    def clearAll(): Nightmare = js.native
    
    def get(): js.Array[ICookie] = js.native
    def get(name: String): ICookie = js.native
    def get(query: ICookieQuery): js.Array[ICookie] = js.native
    
    def set(cookies: js.Array[ICookie]): Nightmare = js.native
    def set(cookie: ICookie): Nightmare = js.native
    def set(name: String, value: String): Nightmare = js.native
  }
  
  @js.native
  trait IConstructorOptions extends StObject {
    
    var cookiesFile: js.UndefOr[String] = js.native
    
    var electronPath: js.UndefOr[String] = js.native
    
    var executionTimeout: js.UndefOr[Double] = js.native
    
    //in ms
    var gotoTimeout: js.UndefOr[Double] = js.native
    
    var ignoreDownloads: js.UndefOr[Boolean] = js.native
    
    var ignoreSslErrors: js.UndefOr[Boolean] = js.native
    
    var interval: js.UndefOr[js.Any] = js.native
    
    var loadImages: js.UndefOr[Boolean] = js.native
    
    var maxDownloadRequestWait: js.UndefOr[Double] = js.native
    
    var openDevTools: js.UndefOr[Mode] = js.native
    
    var paths: js.UndefOr[Downloads] = js.native
    
    var phantomPath: js.UndefOr[String] = js.native
    
    var pollInterval: js.UndefOr[Double] = js.native
    
    // number | string;
    var port: js.UndefOr[Double] = js.native
    
    var proxy: js.UndefOr[String] = js.native
    
    var proxyAuth: js.UndefOr[String] = js.native
    
    var proxyType: js.UndefOr[String] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var sslProtocol: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[js.Any] = js.native
    
    var typeInterval: js.UndefOr[Double] = js.native
    
    // number | string;
    var waitTimeout: js.UndefOr[Double] = js.native
    
    var weak: js.UndefOr[Boolean] = js.native
    
    var webSecurity: js.UndefOr[Boolean] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object IConstructorOptions {
    
    @scala.inline
    def apply(): IConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConstructorOptions]
    }
    
    @scala.inline
    implicit class IConstructorOptionsMutableBuilder[Self <: IConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookiesFile(value: String): Self = StObject.set(x, "cookiesFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesFileUndefined: Self = StObject.set(x, "cookiesFile", js.undefined)
      
      @scala.inline
      def setElectronPath(value: String): Self = StObject.set(x, "electronPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronPathUndefined: Self = StObject.set(x, "electronPath", js.undefined)
      
      @scala.inline
      def setExecutionTimeout(value: Double): Self = StObject.set(x, "executionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionTimeoutUndefined: Self = StObject.set(x, "executionTimeout", js.undefined)
      
      @scala.inline
      def setGotoTimeout(value: Double): Self = StObject.set(x, "gotoTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGotoTimeoutUndefined: Self = StObject.set(x, "gotoTimeout", js.undefined)
      
      @scala.inline
      def setIgnoreDownloads(value: Boolean): Self = StObject.set(x, "ignoreDownloads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDownloadsUndefined: Self = StObject.set(x, "ignoreDownloads", js.undefined)
      
      @scala.inline
      def setIgnoreSslErrors(value: Boolean): Self = StObject.set(x, "ignoreSslErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSslErrorsUndefined: Self = StObject.set(x, "ignoreSslErrors", js.undefined)
      
      @scala.inline
      def setInterval(value: js.Any): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLoadImages(value: Boolean): Self = StObject.set(x, "loadImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadImagesUndefined: Self = StObject.set(x, "loadImages", js.undefined)
      
      @scala.inline
      def setMaxDownloadRequestWait(value: Double): Self = StObject.set(x, "maxDownloadRequestWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDownloadRequestWaitUndefined: Self = StObject.set(x, "maxDownloadRequestWait", js.undefined)
      
      @scala.inline
      def setOpenDevTools(value: Mode): Self = StObject.set(x, "openDevTools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDevToolsUndefined: Self = StObject.set(x, "openDevTools", js.undefined)
      
      @scala.inline
      def setPaths(value: Downloads): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPhantomPath(value: String): Self = StObject.set(x, "phantomPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhantomPathUndefined: Self = StObject.set(x, "phantomPath", js.undefined)
      
      @scala.inline
      def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyAuth(value: String): Self = StObject.set(x, "proxyAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyAuthUndefined: Self = StObject.set(x, "proxyAuth", js.undefined)
      
      @scala.inline
      def setProxyType(value: String): Self = StObject.set(x, "proxyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyTypeUndefined: Self = StObject.set(x, "proxyType", js.undefined)
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSslProtocol(value: String): Self = StObject.set(x, "sslProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslProtocolUndefined: Self = StObject.set(x, "sslProtocol", js.undefined)
      
      @scala.inline
      def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTypeInterval(value: Double): Self = StObject.set(x, "typeInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeIntervalUndefined: Self = StObject.set(x, "typeInterval", js.undefined)
      
      @scala.inline
      def setWaitTimeout(value: Double): Self = StObject.set(x, "waitTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitTimeoutUndefined: Self = StObject.set(x, "waitTimeout", js.undefined)
      
      @scala.inline
      def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
      
      @scala.inline
      def setWebSecurity(value: Boolean): Self = StObject.set(x, "webSecurity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSecurityUndefined: Self = StObject.set(x, "webSecurity", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ICookie extends StObject {
    
    var domain: js.UndefOr[String] = js.native
    
    var expirationDate: js.UndefOr[Double] = js.native
    
    var hostOnly: js.UndefOr[Boolean] = js.native
    
    var httpOnly: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
    
    var session: js.UndefOr[Boolean] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var value: String = js.native
  }
  object ICookie {
    
    @scala.inline
    def apply(name: String, value: String): ICookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICookie]
    }
    
    @scala.inline
    implicit class ICookieMutableBuilder[Self <: ICookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      @scala.inline
      def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostOnlyUndefined: Self = StObject.set(x, "hostOnly", js.undefined)
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICookieQuery extends StObject {
    
    var domain: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
    
    var session: js.UndefOr[Boolean] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object ICookieQuery {
    
    @scala.inline
    def apply(): ICookieQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICookieQuery]
    }
    
    @scala.inline
    implicit class ICookieQueryMutableBuilder[Self <: ICookieQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait INetwordRequest extends StObject {
    
    def abort(): Unit = js.native
    
    def changeUrl(url: String): Unit = js.native
    
    def setHeader(key: String, value: String): Unit = js.native
  }
  object INetwordRequest {
    
    @scala.inline
    def apply(abort: () => Unit, changeUrl: String => Unit, setHeader: (String, String) => Unit): INetwordRequest = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), changeUrl = js.Any.fromFunction1(changeUrl), setHeader = js.Any.fromFunction2(setHeader))
      __obj.asInstanceOf[INetwordRequest]
    }
    
    @scala.inline
    implicit class INetwordRequestMutableBuilder[Self <: INetwordRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setChangeUrl(value: String => Unit): Self = StObject.set(x, "changeUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IRequest extends StObject {
    
    var headers: js.Object = js.native
    
    var id: Double = js.native
    
    var method: String = js.native
    
    var time: js.Date = js.native
    
    var url: String = js.native
  }
  object IRequest {
    
    @scala.inline
    def apply(headers: js.Object, id: Double, method: String, time: js.Date, url: String): IRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequest]
    }
    
    @scala.inline
    implicit class IRequestMutableBuilder[Self <: IRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IResourceError extends StObject {
    
    var errorCode: Double = js.native
    
    var errorString: String = js.native
    
    var id: Double = js.native
    
    var url: String = js.native
  }
  object IResourceError {
    
    @scala.inline
    def apply(errorCode: Double, errorString: String, id: Double, url: String): IResourceError = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResourceError]
    }
    
    @scala.inline
    implicit class IResourceErrorMutableBuilder[Self <: IResourceError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorString(value: String): Self = StObject.set(x, "errorString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IResponse extends StObject {
    
    var bodySize: Double = js.native
    
    var contentType: String = js.native
    
    var headers: js.Object = js.native
    
    var id: Double = js.native
    
    var redirectURL: String = js.native
    
    var stage: String = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
    
    var time: js.Date = js.native
    
    var url: String = js.native
  }
  object IResponse {
    
    @scala.inline
    def apply(
      bodySize: Double,
      contentType: String,
      headers: js.Object,
      id: Double,
      redirectURL: String,
      stage: String,
      status: Double,
      statusText: String,
      time: js.Date,
      url: String
    ): IResponse = {
      val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], redirectURL = redirectURL.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    @scala.inline
    implicit class IResponseMutableBuilder[Self <: IResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStackTrace extends StObject {
    
    var file: String = js.native
    
    var function: js.UndefOr[String] = js.native
    
    var line: Double = js.native
  }
  object IStackTrace {
    
    @scala.inline
    def apply(file: String, line: Double): IStackTrace = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStackTrace]
    }
    
    @scala.inline
    implicit class IStackTraceMutableBuilder[Self <: IStackTrace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Nightmare extends StObject {
    
    // Settings
    def authentication(user: String, password: String): Nightmare = js.native
    
    def back(): Nightmare = js.native
    
    def check(seletor: String): Nightmare = js.native
    
    def click(selector: String): Nightmare = js.native
    
    val cookies: Cookies = js.native
    
    def download(path: String): Nightmare = js.native
    @JSName("download")
    def download_cancel(action: cancel): Nightmare = js.native
    @JSName("download")
    def download_continue(action: continue): Nightmare = js.native
    
    // Interact
    def end(): Nightmare = js.native
    
    def evaluate(fn: js.Function0[Unit]): Nightmare = js.native
    def evaluate[R](fn: js.Function0[R], cb: js.Function1[/* result */ R, Unit]): Nightmare = js.native
    def evaluate[T](fn: js.Function1[/* arg */ T, Unit], cb: js.Function0[Unit], arg: T): Nightmare = js.native
    def evaluate[T, R](fn: js.Function1[/* arg */ T, R], cb: js.Function1[/* result */ R, Unit], arg: T): Nightmare = js.native
    def evaluate[T1, T2, R](
      fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, R],
      cb: js.Function1[/* result */ R, Unit],
      arg1: T1,
      arg2: T2
    ): Nightmare = js.native
    def evaluate[T1, T2, T3, R](
      fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, R],
      cb: js.Function1[/* result */ R, Unit],
      arg1: T1,
      arg2: T2,
      arg3: T3
    ): Nightmare = js.native
    
    // Extract
    def exists(selector: String): Nightmare = js.native
    def exists(selector: String, cb: js.Function1[/* result */ Boolean, Unit]): Nightmare = js.native
    
    def forward(): Nightmare = js.native
    
    def goto(url: String): Nightmare = js.native
    def goto(url: String, headers: js.Object): Nightmare = js.native
    
    def halt(error: String, cb: js.Function0[Unit]): Nightmare = js.native
    
    def header(header: String, value: String): Nightmare = js.native
    
    def headers(headers: js.Object): Nightmare = js.native
    
    def html(path: String, saveType: String): Nightmare = js.native
    @JSName("html")
    def html_HTMLComplete(path: String, saveType: HTMLComplete): Nightmare = js.native
    @JSName("html")
    def html_HTMLOnly(path: String, saveType: HTMLOnly): Nightmare = js.native
    @JSName("html")
    def html_MHTML(path: String, saveType: MHTML): Nightmare = js.native
    
    def inject(`type`: String, file: String): Nightmare = js.native
    
    def insert(selector: String, text: String): Nightmare = js.native
    
    def mousedown(selector: String): Nightmare = js.native
    
    def mouseover(selector: String): Nightmare = js.native
    
    def mouseup(selector: String): Nightmare = js.native
    
    def on(event: String, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("on")
    def on_alert(event: alert, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("on")
    def on_confirm(event: confirm, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("on")
    def on_consoleMessage(
      event: consoleMessage,
      cb: js.Function3[/* msg */ String, /* lineNumber */ Double, /* sourceId */ Double, Unit]
    ): Nightmare = js.native
    @JSName("on")
    def on_error(
      event: error,
      cb: js.Function2[/* msg */ String, /* trace */ js.UndefOr[js.Array[IStackTrace]], Unit]
    ): Nightmare = js.native
    @JSName("on")
    def on_initialized(event: initialized, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("on")
    def on_loadFinished(event: loadFinished, cb: js.Function1[/* status */ String, Unit]): Nightmare = js.native
    @JSName("on")
    def on_loadStarted(event: loadStarted, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("on")
    def on_navigationRequested(
      event: navigationRequested,
      cb: js.Function4[
          /* url */ String, 
          /* type */ String, 
          /* willNavigate */ Boolean, 
          /* main */ Boolean, 
          Unit
        ]
    ): Nightmare = js.native
    @JSName("on")
    def on_prompt(event: prompt, cb: js.Function2[/* msg */ String, /* defaultValue */ js.UndefOr[String], Unit]): Nightmare = js.native
    @JSName("on")
    def on_resourceError(event: resourceError, cb: js.Function1[/* resourceError */ IResourceError, Unit]): Nightmare = js.native
    @JSName("on")
    def on_resourceReceived(event: resourceReceived, cb: js.Function1[/* response */ IResponse, Unit]): Nightmare = js.native
    @JSName("on")
    def on_resourceRequested(
      event: resourceRequested,
      cb: js.Function2[/* requestData */ IRequest, /* networkRequest */ INetwordRequest, Unit]
    ): Nightmare = js.native
    @JSName("on")
    def on_timeout(event: timeout, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("on")
    def on_urlChanged(event: urlChanged, cb: js.Function1[/* targetUrl */ String, Unit]): Nightmare = js.native
    
    def once(event: String, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("once")
    def once_alert(event: alert, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("once")
    def once_confirm(event: confirm, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("once")
    def once_consoleMessage(
      event: consoleMessage,
      cb: js.Function3[/* msg */ String, /* lineNumber */ Double, /* sourceId */ Double, Unit]
    ): Nightmare = js.native
    @JSName("once")
    def once_error(
      event: error,
      cb: js.Function2[/* msg */ String, /* trace */ js.UndefOr[js.Array[IStackTrace]], Unit]
    ): Nightmare = js.native
    @JSName("once")
    def once_initialized(event: initialized, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("once")
    def once_loadFinished(event: loadFinished, cb: js.Function1[/* status */ String, Unit]): Nightmare = js.native
    @JSName("once")
    def once_loadStarted(event: loadStarted, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("once")
    def once_navigationRequested(
      event: navigationRequested,
      cb: js.Function4[
          /* url */ String, 
          /* type */ String, 
          /* willNavigate */ Boolean, 
          /* main */ Boolean, 
          Unit
        ]
    ): Nightmare = js.native
    @JSName("once")
    def once_prompt(event: prompt, cb: js.Function2[/* msg */ String, /* defaultValue */ js.UndefOr[String], Unit]): Nightmare = js.native
    @JSName("once")
    def once_resourceError(event: resourceError, cb: js.Function1[/* resourceError */ IResourceError, Unit]): Nightmare = js.native
    @JSName("once")
    def once_resourceReceived(event: resourceReceived, cb: js.Function1[/* response */ IResponse, Unit]): Nightmare = js.native
    @JSName("once")
    def once_resourceRequested(
      event: resourceRequested,
      cb: js.Function2[/* requestData */ IRequest, /* networkRequest */ INetwordRequest, Unit]
    ): Nightmare = js.native
    @JSName("once")
    def once_timeout(event: timeout, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("once")
    def once_urlChanged(event: urlChanged, cb: js.Function1[/* targetUrl */ String, Unit]): Nightmare = js.native
    
    def path(): String = js.native
    
    def pdf(cb: js.Function2[/* err */ js.Error, /* data */ Buffer, Unit]): Nightmare = js.native
    def pdf(path: String): Nightmare = js.native
    def pdf(path: String, options: js.Object): Nightmare = js.native
    
    def refresh(): Nightmare = js.native
    
    def removeListener(event: String, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_alert(event: alert, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_confirm(event: confirm, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_consoleMessage(
      event: consoleMessage,
      cb: js.Function3[/* msg */ String, /* lineNumber */ Double, /* sourceId */ Double, Unit]
    ): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_error(
      event: error,
      cb: js.Function2[/* msg */ String, /* trace */ js.UndefOr[js.Array[IStackTrace]], Unit]
    ): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_initialized(event: initialized, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_loadFinished(event: loadFinished, cb: js.Function1[/* status */ String, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_loadStarted(event: loadStarted, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_navigationRequested(
      event: navigationRequested,
      cb: js.Function4[
          /* url */ String, 
          /* type */ String, 
          /* willNavigate */ Boolean, 
          /* main */ Boolean, 
          Unit
        ]
    ): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_prompt(event: prompt, cb: js.Function2[/* msg */ String, /* defaultValue */ js.UndefOr[String], Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_resourceError(event: resourceError, cb: js.Function1[/* resourceError */ IResourceError, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_resourceReceived(event: resourceReceived, cb: js.Function1[/* response */ IResponse, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_resourceRequested(
      event: resourceRequested,
      cb: js.Function2[/* requestData */ IRequest, /* networkRequest */ INetwordRequest, Unit]
    ): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_timeout(event: timeout, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_urlChanged(event: urlChanged, cb: js.Function1[/* targetUrl */ String, Unit]): Nightmare = js.native
    
    def run(): Nightmare = js.native
    def run(cb: js.Function2[/* err */ js.Any, /* nightmare */ this.type, Unit]): Nightmare = js.native
    
    def screenshot(): Nightmare = js.native
    def screenshot(clip: Height): Nightmare = js.native
    def screenshot(clip: Height, done: js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]): Nightmare = js.native
    def screenshot(done: js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]): Nightmare = js.native
    def screenshot(path: String): Nightmare = js.native
    def screenshot(path: String, clip: js.UndefOr[scala.Nothing], done: js.Function1[/* err */ js.Any, Unit]): Nightmare = js.native
    def screenshot(path: String, clip: Height): Nightmare = js.native
    def screenshot(path: String, clip: Height, done: js.Function1[/* err */ js.Any, Unit]): Nightmare = js.native
    def screenshot(path: String, done: js.Function1[/* err */ js.Any, Unit]): Nightmare = js.native
    
    def scrollTo(top: Double, left: Double): Nightmare = js.native
    
    def select(seletor: String, option: String): Nightmare = js.native
    
    def `then`[T, R](fn: js.Function1[/* value */ T, R]): js.Promise[R] = js.native
    
    def title(): String = js.native
    def title(cb: js.Function1[/* title */ String, Unit]): Nightmare = js.native
    
    def `type`(selector: String, text: String): Nightmare = js.native
    
    def uncheck(seletor: String): Nightmare = js.native
    
    def upload(selector: String, path: String): Nightmare = js.native
    
    def url(): String = js.native
    def url(cb: js.Function1[/* url */ String, Unit]): Nightmare = js.native
    
    def use(plugin: js.Function1[/* nightmare */ this.type, Unit]): Nightmare = js.native
    
    def useragent(useragent: String): Nightmare = js.native
    
    def viewport(width: Double, height: Double): Nightmare = js.native
    
    def visible(selector: String): Nightmare = js.native
    def visible(selector: String, cb: js.Function1[/* result */ Boolean, Unit]): Nightmare = js.native
    
    def wait(fn: js.Function0[_]): Nightmare = js.native
    def wait(fn: js.Function0[_], value: js.Any): Nightmare = js.native
    def wait(fn: js.Function0[_], value: js.Any, delay: Double): Nightmare = js.native
    def wait(ms: Double): Nightmare = js.native
    def wait(selector: String): Nightmare = js.native
    def wait[T1](fn: js.Function1[/* arg1 */ T1, _], value1: T1): Nightmare = js.native
    def wait[T1, T2](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, _], value1: T1, value2: T2): Nightmare = js.native
    def wait[T1, T2, T3](
      fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, _],
      value1: T1,
      value2: T2,
      value3: T3
    ): Nightmare = js.native
    def wait[T1, T2, T3, T4](
      fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, _],
      value1: T1,
      value2: T2,
      value3: T3,
      value4: T4
    ): Nightmare = js.native
    def wait[T1, T2, T3, T4, T5](
      fn: js.Function5[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, /* arg5 */ T5, _],
      value1: T1,
      value2: T2,
      value3: T3,
      value4: T4,
      value5: T5
    ): Nightmare = js.native
    
    def zoom(zoomFactor: Double): Nightmare = js.native
  }
}
