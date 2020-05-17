package typingsSlinky.phantom.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phantom.anon.Abort
import typingsSlinky.phantom.anon.ErrorCode
import typingsSlinky.phantom.anon.File
import typingsSlinky.phantom.anon.Format
import typingsSlinky.phantom.anon.Height
import typingsSlinky.phantom.anon.IRequestDataerrorCodenumb
import typingsSlinky.phantom.anon.Left
import typingsSlinky.phantom.anon.PageId
import typingsSlinky.phantom.anon.Width
import typingsSlinky.phantom.phantomBooleans.`false`
import typingsSlinky.phantom.phantomStrings.BackOrForward
import typingsSlinky.phantom.phantomStrings.FormResubmitted
import typingsSlinky.phantom.phantomStrings.FormSubmitted
import typingsSlinky.phantom.phantomStrings.LinkClicked
import typingsSlinky.phantom.phantomStrings.Other
import typingsSlinky.phantom.phantomStrings.Reload
import typingsSlinky.phantom.phantomStrings.Undefined
import typingsSlinky.phantom.phantomStrings.XSSAuditingEnabled
import typingsSlinky.phantom.phantomStrings.canGoBack
import typingsSlinky.phantom.phantomStrings.canGoForward
import typingsSlinky.phantom.phantomStrings.clipRect
import typingsSlinky.phantom.phantomStrings.content
import typingsSlinky.phantom.phantomStrings.cookies
import typingsSlinky.phantom.phantomStrings.customHeaders
import typingsSlinky.phantom.phantomStrings.fail
import typingsSlinky.phantom.phantomStrings.focusedFrameName
import typingsSlinky.phantom.phantomStrings.frameContent
import typingsSlinky.phantom.phantomStrings.frameName
import typingsSlinky.phantom.phantomStrings.framePlainText
import typingsSlinky.phantom.phantomStrings.frameTitle
import typingsSlinky.phantom.phantomStrings.framesCount
import typingsSlinky.phantom.phantomStrings.framesName
import typingsSlinky.phantom.phantomStrings.javascriptEnabled
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
import typingsSlinky.phantom.phantomStrings.resourceTimeout
import typingsSlinky.phantom.phantomStrings.scrollPosition
import typingsSlinky.phantom.phantomStrings.success
import typingsSlinky.phantom.phantomStrings.title
import typingsSlinky.phantom.phantomStrings.url
import typingsSlinky.phantom.phantomStrings.userAgent
import typingsSlinky.phantom.phantomStrings.userName
import typingsSlinky.phantom.phantomStrings.viewportSize
import typingsSlinky.phantom.phantomStrings.webSecurityEnabled
import typingsSlinky.phantom.phantomStrings.windowName
import typingsSlinky.phantom.phantomStrings.zoomFactor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPage extends js.Object {
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
  def off(
    event: onResourceRequested | onLoadFinished | onAlert | onCallback | onClosing | onConfirm | onConsoleMessage | onError | onFilePicker | onInitialized | onLoadStarted | onNavigationRequested | onPageCreated | onPrompt | onResourceError | onResourceReceived | onResourceTimeout | onUrlChanged
  ): js.Promise[PageId] = js.native
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
  def property(
    key: content | plainText | focusedFrameName | frameContent | frameName | framePlainText | frameTitle | libraryPath | offlineStoragePath | title | url | windowName
  ): js.Promise[String] = js.native
  def property[T](key: String): js.Promise[T] = js.native
  def property[T](key: String, value: T): js.Promise[Unit] = js.native
  @JSName("property")
  def property_canGoBack(key: canGoBack): js.Promise[Boolean] = js.native
  @JSName("property")
  def property_canGoForward(key: canGoForward): js.Promise[Boolean] = js.native
  @JSName("property")
  def property_clipRect(key: clipRect): js.Promise[Height] = js.native
  @JSName("property")
  def property_cookies(key: cookies): js.Promise[js.Array[ICookie]] = js.native
  @JSName("property")
  def property_customHeaders(key: customHeaders): js.Promise[StringDictionary[String]] = js.native
  @JSName("property")
  def property_framesCount(key: framesCount): js.Promise[Double] = js.native
  @JSName("property")
  def property_framesName(key: framesName): js.Promise[js.Array[String]] = js.native
  @JSName("property")
  def property_navigationLocked(key: navigationLocked): js.Promise[Boolean] = js.native
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
  def property_scrollPosition(key: scrollPosition): js.Promise[Left] = js.native
  @JSName("property")
  def property_viewportSize(key: viewportSize): js.Promise[Width] = js.native
  @JSName("property")
  def property_zoomFactor(key: zoomFactor): js.Promise[Double] = js.native
  def render(filename: String): js.Promise[Unit] = js.native
  def render(filename: String, options: Format): js.Promise[Unit] = js.native
  def renderBase64(`type`: String): js.Promise[String] = js.native
  def sendEvent(keyboardEventType: String, key: String): js.Promise[Unit] = js.native
  def sendEvent(keyboardEventType: String, key: String, null1: Unit): js.Promise[Unit] = js.native
  def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit): js.Promise[Unit] = js.native
  def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit, modifier: Double): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String, mouseX: Double): js.Promise[Unit] = js.native
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

