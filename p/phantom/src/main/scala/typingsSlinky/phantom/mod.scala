package typingsSlinky.phantom

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phantom.anon.Abort
import typingsSlinky.phantom.anon.Bottom
import typingsSlinky.phantom.anon.Contents
import typingsSlinky.phantom.anon.ErrorCode
import typingsSlinky.phantom.anon.File
import typingsSlinky.phantom.anon.Format
import typingsSlinky.phantom.anon.Height
import typingsSlinky.phantom.anon.IRequestDataerrorCodenumb
import typingsSlinky.phantom.anon.Left
import typingsSlinky.phantom.anon.LogLevel
import typingsSlinky.phantom.anon.Name
import typingsSlinky.phantom.anon.PageId
import typingsSlinky.phantom.anon.Width
import typingsSlinky.phantom.phantomBooleans.`false`
import typingsSlinky.phantom.phantomBooleans.`true`
import typingsSlinky.phantom.phantomStrings.A3
import typingsSlinky.phantom.phantomStrings.A4
import typingsSlinky.phantom.phantomStrings.A5
import typingsSlinky.phantom.phantomStrings.BackOrForward
import typingsSlinky.phantom.phantomStrings.DELETE
import typingsSlinky.phantom.phantomStrings.FormResubmitted
import typingsSlinky.phantom.phantomStrings.FormSubmitted
import typingsSlinky.phantom.phantomStrings.GET
import typingsSlinky.phantom.phantomStrings.HEAD
import typingsSlinky.phantom.phantomStrings.Legal
import typingsSlinky.phantom.phantomStrings.Letter
import typingsSlinky.phantom.phantomStrings.LinkClicked
import typingsSlinky.phantom.phantomStrings.Other
import typingsSlinky.phantom.phantomStrings.POST
import typingsSlinky.phantom.phantomStrings.PUT
import typingsSlinky.phantom.phantomStrings.Reload
import typingsSlinky.phantom.phantomStrings.Tabloid
import typingsSlinky.phantom.phantomStrings.Undefined
import typingsSlinky.phantom.phantomStrings.XSSAuditingEnabled
import typingsSlinky.phantom.phantomStrings.callback
import typingsSlinky.phantom.phantomStrings.canGoBack
import typingsSlinky.phantom.phantomStrings.canGoForward
import typingsSlinky.phantom.phantomStrings.clipRect
import typingsSlinky.phantom.phantomStrings.content
import typingsSlinky.phantom.phantomStrings.cookies
import typingsSlinky.phantom.phantomStrings.customHeaders
import typingsSlinky.phantom.phantomStrings.end
import typingsSlinky.phantom.phantomStrings.fail
import typingsSlinky.phantom.phantomStrings.focusedFrameName
import typingsSlinky.phantom.phantomStrings.frameContent
import typingsSlinky.phantom.phantomStrings.frameName
import typingsSlinky.phantom.phantomStrings.framePlainText
import typingsSlinky.phantom.phantomStrings.frameTitle
import typingsSlinky.phantom.phantomStrings.framesCount
import typingsSlinky.phantom.phantomStrings.framesName
import typingsSlinky.phantom.phantomStrings.javascriptEnabled
import typingsSlinky.phantom.phantomStrings.landscape
import typingsSlinky.phantom.phantomStrings.libraryPath
import typingsSlinky.phantom.phantomStrings.loadImages
import typingsSlinky.phantom.phantomStrings.localToRemoteUrlAccessEnabled
import typingsSlinky.phantom.phantomStrings.navigationLocked
import typingsSlinky.phantom.phantomStrings.offlineStoragePath
import typingsSlinky.phantom.phantomStrings.offlineStorageQuota
import typingsSlinky.phantom.phantomStrings.onAlert
import typingsSlinky.phantom.phantomStrings.onCallback
import typingsSlinky.phantom.phantomStrings.onClosing
import typingsSlinky.phantom.phantomStrings.onConfirm
import typingsSlinky.phantom.phantomStrings.onConsoleMessage
import typingsSlinky.phantom.phantomStrings.onError
import typingsSlinky.phantom.phantomStrings.onFilePicker
import typingsSlinky.phantom.phantomStrings.onInitialized
import typingsSlinky.phantom.phantomStrings.onLoadFinished
import typingsSlinky.phantom.phantomStrings.onLoadStarted
import typingsSlinky.phantom.phantomStrings.onNavigationRequested
import typingsSlinky.phantom.phantomStrings.onPageCreated
import typingsSlinky.phantom.phantomStrings.onPrompt
import typingsSlinky.phantom.phantomStrings.onResourceError
import typingsSlinky.phantom.phantomStrings.onResourceReceived
import typingsSlinky.phantom.phantomStrings.onResourceRequested
import typingsSlinky.phantom.phantomStrings.onResourceTimeout
import typingsSlinky.phantom.phantomStrings.onUrlChanged
import typingsSlinky.phantom.phantomStrings.ownsPages
import typingsSlinky.phantom.phantomStrings.pages
import typingsSlinky.phantom.phantomStrings.pagesWindowName
import typingsSlinky.phantom.phantomStrings.paperSize
import typingsSlinky.phantom.phantomStrings.password
import typingsSlinky.phantom.phantomStrings.plainText
import typingsSlinky.phantom.phantomStrings.portrait
import typingsSlinky.phantom.phantomStrings.resourceTimeout
import typingsSlinky.phantom.phantomStrings.scrollPosition
import typingsSlinky.phantom.phantomStrings.start
import typingsSlinky.phantom.phantomStrings.success
import typingsSlinky.phantom.phantomStrings.title
import typingsSlinky.phantom.phantomStrings.url
import typingsSlinky.phantom.phantomStrings.userAgent
import typingsSlinky.phantom.phantomStrings.userName
import typingsSlinky.phantom.phantomStrings.utf8
import typingsSlinky.phantom.phantomStrings.viewportSize
import typingsSlinky.phantom.phantomStrings.webSecurityEnabled
import typingsSlinky.phantom.phantomStrings.windowName
import typingsSlinky.phantom.phantomStrings.zoomFactor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phantom", "create")
  @js.native
  def create(): js.Promise[PhantomJS] = js.native
  @JSImport("phantom", "create")
  @js.native
  def create(args: js.UndefOr[scala.Nothing], config: LogLevel): js.Promise[PhantomJS] = js.native
  @JSImport("phantom", "create")
  @js.native
  def create(args: js.Array[String]): js.Promise[PhantomJS] = js.native
  @JSImport("phantom", "create")
  @js.native
  def create(args: js.Array[String], config: LogLevel): js.Promise[PhantomJS] = js.native
  
  @js.native
  trait ICookie extends StObject {
    
    var domain: js.UndefOr[String] = js.native
    
    var expires: js.UndefOr[String] = js.native
    
    var httponly: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
    
    var value: String = js.native
  }
  object ICookie {
    
    @scala.inline
    def apply(name: String, path: String, value: String): ICookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICookie]
    }
    
    @scala.inline
    implicit class ICookieMutableBuilder[Self <: ICookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setHttponly(value: Boolean): Self = StObject.set(x, "httponly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttponlyUndefined: Self = StObject.set(x, "httponly", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOpenWebPageSettings extends StObject {
    
    var data: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[utf8 | String] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var operation: js.UndefOr[GET | POST | HEAD | DELETE | PUT | String] = js.native
  }
  object IOpenWebPageSettings {
    
    @scala.inline
    def apply(): IOpenWebPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOpenWebPageSettings]
    }
    
    @scala.inline
    implicit class IOpenWebPageSettingsMutableBuilder[Self <: IOpenWebPageSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEncoding(value: utf8 | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setOperation(value: GET | POST | HEAD | DELETE | PUT | String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    }
  }
  
  @js.native
  trait IPaperSizeOptions extends StObject {
    
    var footer: js.UndefOr[Contents] = js.native
    
    var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.native
    
    var header: js.UndefOr[Contents] = js.native
    
    var height: js.UndefOr[String] = js.native
    
    var margin: js.UndefOr[String | Bottom] = js.native
    
    var orientation: js.UndefOr[portrait | landscape] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object IPaperSizeOptions {
    
    @scala.inline
    def apply(): IPaperSizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPaperSizeOptions]
    }
    
    @scala.inline
    implicit class IPaperSizeOptionsMutableBuilder[Self <: IPaperSizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFooter(value: Contents): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeader(value: Contents): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMargin(value: String | Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IPhantomCallback extends StObject {
    
    var method: callback = js.native
    
    var parent: typingsSlinky.phantom.phantomStrings.phantom = js.native
    
    var target: js.Function = js.native
    
    var transform: `true` = js.native
  }
  object IPhantomCallback {
    
    @scala.inline
    def apply(
      method: callback,
      parent: typingsSlinky.phantom.phantomStrings.phantom,
      target: js.Function,
      transform: `true`
    ): IPhantomCallback = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPhantomCallback]
    }
    
    @scala.inline
    implicit class IPhantomCallbackMutableBuilder[Self <: IPhantomCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: callback): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: typingsSlinky.phantom.phantomStrings.phantom): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: `true`): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRequestData extends StObject {
    
    var headers: js.Array[Name] = js.native
    
    var id: Double = js.native
    
    var method: String = js.native
    
    var time: js.Date = js.native
    
    var url: String = js.native
  }
  object IRequestData {
    
    @scala.inline
    def apply(headers: js.Array[Name], id: Double, method: String, time: js.Date, url: String): IRequestData = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestData]
    }
    
    @scala.inline
    implicit class IRequestDataMutableBuilder[Self <: IRequestData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Array[Name]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: Name*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
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
  trait IResponse extends StObject {
    
    var bodySize: Double = js.native
    
    var contentType: String = js.native
    
    var headers: js.Array[Name] = js.native
    
    var id: String = js.native
    
    var redirectURL: String = js.native
    
    var stage: start | end = js.native
    
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
      headers: js.Array[Name],
      id: String,
      redirectURL: String,
      stage: start | end,
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
      def setHeaders(value: js.Array[Name]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: Name*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStage(value: start | end): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
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
  trait PhantomJS extends StObject {
    
    def callback(fn: js.Function2[/* pageNum */ Double, /* numPages */ Double, String]): IPhantomCallback = js.native
    
    def createPage(): js.Promise[WebPage] = js.native
    
    def exit(): Unit = js.native
    def exit(returnValue: Double): Unit = js.native
  }
  
  @js.native
  trait WebPage extends StObject {
    
    def addCookie(cookie: ICookie): js.Promise[Boolean] = js.native
    
    def clearCookies(): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def deleteCookie(cookieName: String): js.Promise[Boolean] = js.native
    
    def evaluate[R](callback: js.Function0[R]): js.Promise[R] = js.native
    def evaluate[R](callback: js.Function1[/* repeated */ js.Any, R], args: js.Any*): js.Promise[R] = js.native
    def evaluate[T, R](callback: js.Function1[/* arg */ T, R], arg: T): js.Promise[R] = js.native
    def evaluate[T1, T2, R](callback: js.Function2[/* arg1 */ T1, /* arg2 */ T2, R], arg1: T1, arg2: T2): js.Promise[R] = js.native
    def evaluate[T1, T2, T3, R](
      callback: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, R],
      arg1: T1,
      arg2: T2,
      arg3: T3
    ): js.Promise[R] = js.native
    
    def includeJs(url: String): js.Promise[Unit] = js.native
    
    def injectJs(filename: String): js.Promise[Boolean] = js.native
    
    @JSName("off")
    def off_onAlert(event: onAlert): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onCallback(event: onCallback): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onClosing(event: onClosing): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onConfirm(event: onConfirm): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onConsoleMessage(event: onConsoleMessage): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onError(event: onError): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onFilePicker(event: onFilePicker): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onInitialized(event: onInitialized): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onLoadFinished(event: onLoadFinished): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onLoadStarted(event: onLoadStarted): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onNavigationRequested(event: onNavigationRequested): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onPageCreated(event: onPageCreated): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onPrompt(event: onPrompt): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onResourceError(event: onResourceError): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onResourceReceived(event: onResourceReceived): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onResourceRequested(event: onResourceRequested): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onResourceTimeout(event: onResourceTimeout): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onUrlChanged(event: onUrlChanged): js.Promise[PageId] = js.native
    
    def on(event: onAlert, runOnPhantom: `false`, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    def on(event: onCallback, runOnPhantom: `false`, listener: js.Function1[/* data */ js.Any, Unit]): js.Promise[PageId] = js.native
    def on(event: onClosing, runOnPhantom: `false`, listener: js.Function1[/* closingPage */ js.Any, Unit]): js.Promise[PageId] = js.native
    def on(event: onConfirm, runOnPhantom: `false`, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    def on(
      event: onConsoleMessage,
      runOnPhantom: `false`,
      listener: js.Function3[/* msg */ String, /* lineNum */ Double, /* sourceId */ String, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onError,
      runOnPhantom: `false`,
      listener: js.Function2[/* msg */ String, /* trace */ js.Array[File], Unit]
    ): js.Promise[PageId] = js.native
    def on(event: onFilePicker, runOnPhantom: `false`, listener: js.Function1[/* oldFile */ js.Any, Unit]): js.Promise[PageId] = js.native
    def on(event: onInitialized, runOnPhantom: `false`, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    def on(event: onLoadFinished, listener: js.Function1[/* status */ success | fail, Unit]): js.Promise[PageId] = js.native
    def on(
      event: onLoadFinished,
      runOnPhantom: `false`,
      listener: js.Function1[/* status */ success | fail, Unit]
    ): js.Promise[PageId] = js.native
    def on(event: onLoadStarted, runOnPhantom: `false`, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    def on(
      event: onNavigationRequested,
      listener: js.Function4[
          /* url */ String, 
          /* type */ Undefined | LinkClicked | FormSubmitted | BackOrForward | Reload | FormResubmitted | Other, 
          /* willNavigate */ Boolean, 
          /* main */ Boolean, 
          Unit
        ]
    ): js.Promise[PageId] = js.native
    def on(
      event: onNavigationRequested,
      runOnPhantom: `false`,
      listener: js.Function4[
          /* url */ String, 
          /* type */ Undefined | LinkClicked | FormSubmitted | BackOrForward | Reload | FormResubmitted | Other, 
          /* willNavigate */ Boolean, 
          /* main */ Boolean, 
          Unit
        ]
    ): js.Promise[PageId] = js.native
    def on(event: onPageCreated, runOnPhantom: `false`, listener: js.Function1[/* newPage */ js.Any, Unit]): js.Promise[PageId] = js.native
    def on(
      event: onPrompt,
      runOnPhantom: `false`,
      listener: js.Function2[/* msg */ String, /* defaultVal */ String, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceError,
      runOnPhantom: `false`,
      listener: js.Function1[/* resourceError */ ErrorCode, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceReceived,
      runOnPhantom: `false`,
      listener: js.Function1[/* response */ IResponse, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceRequested,
      runOnPhantom: `false`,
      listener: js.Function2[/* requestData */ IRequestData, /* networkRequest */ Abort, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceTimeout,
      runOnPhantom: `false`,
      listener: js.Function1[/* request */ IRequestDataerrorCodenumb, Unit]
    ): js.Promise[PageId] = js.native
    def on(event: onUrlChanged, runOnPhantom: `false`, listener: js.Function1[/* targetUrl */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onAlert(event: onAlert, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onCallback(event: onCallback, listener: js.Function1[/* data */ js.Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onClosing(event: onClosing, listener: js.Function1[/* closingPage */ js.Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onConfirm(event: onConfirm, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onConsoleMessage(
      event: onConsoleMessage,
      listener: js.Function3[/* msg */ String, /* lineNum */ Double, /* sourceId */ String, Unit]
    ): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onError(event: onError, listener: js.Function2[/* msg */ String, /* trace */ js.Array[File], Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onFilePicker(event: onFilePicker, listener: js.Function1[/* oldFile */ js.Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onInitialized(event: onInitialized, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onLoadStarted(event: onLoadStarted, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onPageCreated(event: onPageCreated, listener: js.Function1[/* newPage */ js.Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onPrompt(event: onPrompt, listener: js.Function2[/* msg */ String, /* defaultVal */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceError(event: onResourceError, listener: js.Function1[/* resourceError */ ErrorCode, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceReceived(event: onResourceReceived, listener: js.Function1[/* response */ IResponse, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceRequested(
      event: onResourceRequested,
      listener: js.Function2[/* requestData */ IRequestData, /* networkRequest */ Abort, Unit]
    ): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceTimeout(event: onResourceTimeout, listener: js.Function1[/* request */ IRequestDataerrorCodenumb, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onUrlChanged(event: onUrlChanged, listener: js.Function1[/* targetUrl */ String, Unit]): js.Promise[PageId] = js.native
    
    def open(url: String): js.Promise[String] = js.native
    def open(url: String, settings: IOpenWebPageSettings): js.Promise[String] = js.native
    
    def property[T](key: String): js.Promise[T] = js.native
    def property[T](key: String, value: T): js.Promise[Unit] = js.native
    @JSName("property")
    def property_canGoBack(key: canGoBack): js.Promise[Boolean] = js.native
    @JSName("property")
    def property_canGoForward(key: canGoForward): js.Promise[Boolean] = js.native
    @JSName("property")
    def property_clipRect(key: clipRect): js.Promise[Height] = js.native
    @JSName("property")
    def property_content(key: content): js.Promise[String] = js.native
    @JSName("property")
    def property_cookies(key: cookies): js.Promise[js.Array[ICookie]] = js.native
    @JSName("property")
    def property_customHeaders(key: customHeaders): js.Promise[StringDictionary[String]] = js.native
    @JSName("property")
    def property_focusedFrameName(key: focusedFrameName): js.Promise[String] = js.native
    @JSName("property")
    def property_frameContent(key: frameContent): js.Promise[String] = js.native
    @JSName("property")
    def property_frameName(key: frameName): js.Promise[String] = js.native
    @JSName("property")
    def property_framePlainText(key: framePlainText): js.Promise[String] = js.native
    @JSName("property")
    def property_frameTitle(key: frameTitle): js.Promise[String] = js.native
    @JSName("property")
    def property_framesCount(key: framesCount): js.Promise[Double] = js.native
    @JSName("property")
    def property_framesName(key: framesName): js.Promise[js.Array[String]] = js.native
    @JSName("property")
    def property_libraryPath(key: libraryPath): js.Promise[String] = js.native
    @JSName("property")
    def property_navigationLocked(key: navigationLocked): js.Promise[Boolean] = js.native
    @JSName("property")
    def property_offlineStoragePath(key: offlineStoragePath): js.Promise[String] = js.native
    @JSName("property")
    def property_offlineStorageQuota(key: offlineStorageQuota): js.Promise[Double] = js.native
    @JSName("property")
    def property_ownsPages(key: ownsPages): js.Promise[Boolean] = js.native
    @JSName("property")
    def property_pages(key: pages): js.Promise[js.Array[String]] = js.native
    @JSName("property")
    def property_pagesWindowName(key: pagesWindowName): js.Promise[js.Array[String]] = js.native
    @JSName("property")
    def property_paperSize(key: paperSize): js.Promise[IPaperSizeOptions] = js.native
    @JSName("property")
    def property_plainText(key: plainText): js.Promise[String] = js.native
    @JSName("property")
    def property_scrollPosition(key: scrollPosition): js.Promise[Left] = js.native
    @JSName("property")
    def property_title(key: title): js.Promise[String] = js.native
    @JSName("property")
    def property_url(key: url): js.Promise[String] = js.native
    @JSName("property")
    def property_viewportSize(key: viewportSize): js.Promise[Width] = js.native
    @JSName("property")
    def property_windowName(key: windowName): js.Promise[String] = js.native
    @JSName("property")
    def property_zoomFactor(key: zoomFactor): js.Promise[Double] = js.native
    
    def render(filename: String): js.Promise[Unit] = js.native
    def render(filename: String, options: Format): js.Promise[Unit] = js.native
    
    def renderBase64(`type`: String): js.Promise[String] = js.native
    
    def sendEvent(keyboardEventType: String, key: String): js.Promise[Unit] = js.native
    def sendEvent(
      keyboardEventType: String,
      key: String,
      null1: js.UndefOr[scala.Nothing],
      null2: js.UndefOr[scala.Nothing],
      modifier: Double
    ): js.Promise[Unit] = js.native
    def sendEvent(keyboardEventType: String, key: String, null1: js.UndefOr[scala.Nothing], null2: Unit): js.Promise[Unit] = js.native
    def sendEvent(
      keyboardEventType: String,
      key: String,
      null1: js.UndefOr[scala.Nothing],
      null2: Unit,
      modifier: Double
    ): js.Promise[Unit] = js.native
    def sendEvent(keyboardEventType: String, key: String, null1: Unit): js.Promise[Unit] = js.native
    def sendEvent(
      keyboardEventType: String,
      key: String,
      null1: Unit,
      null2: js.UndefOr[scala.Nothing],
      modifier: Double
    ): js.Promise[Unit] = js.native
    def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit): js.Promise[Unit] = js.native
    def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit, modifier: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String): js.Promise[Unit] = js.native
    def sendEvent(
      mouseEventType: String,
      mouseX: js.UndefOr[scala.Nothing],
      mouseY: js.UndefOr[scala.Nothing],
      button: String
    ): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: js.UndefOr[scala.Nothing], mouseY: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: js.UndefOr[scala.Nothing], mouseY: Double, button: String): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double, mouseY: js.UndefOr[scala.Nothing], button: String): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double, button: String): js.Promise[Unit] = js.native
    
    def setContent(html: String, url: String): js.Promise[String] = js.native
    
    def setting[T](key: String): js.Promise[T] = js.native
    def setting[T](key: String, value: T): js.Promise[T] = js.native
    @JSName("setting")
    def setting_XSSAuditingEnabled(key: XSSAuditingEnabled): js.Promise[Boolean] = js.native
    @JSName("setting")
    def setting_javascriptEnabled(key: javascriptEnabled): js.Promise[Boolean] = js.native
    @JSName("setting")
    def setting_loadImages(key: loadImages): js.Promise[Boolean] = js.native
    @JSName("setting")
    def setting_localToRemoteUrlAccessEnabled(key: localToRemoteUrlAccessEnabled): js.Promise[Boolean] = js.native
    @JSName("setting")
    def setting_password(key: password): js.Promise[String] = js.native
    @JSName("setting")
    def setting_resourceTimeout(key: resourceTimeout): js.Promise[Double] = js.native
    @JSName("setting")
    def setting_userAgent(key: userAgent): js.Promise[String] = js.native
    @JSName("setting")
    def setting_userName(key: userName): js.Promise[String] = js.native
    @JSName("setting")
    def setting_webSecurityEnabled(key: webSecurityEnabled): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait winstonLeveledLogMethod extends StObject {
    
    def apply(infoObject: js.Any): js.Any = js.native
    def apply(message: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
    def apply(message: String, meta: js.Any*): js.Any = js.native
    def apply(message: String, meta: js.Any, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  }
}
