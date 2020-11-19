package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.compilationCacheProduced
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.domContentEventFired
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.downloadProgress
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.downloadWillBegin
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.fileChooserOpened
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.frameAttached
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.frameClearedScheduledNavigation
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.frameDetached
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.frameNavigated
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.frameRequestedNavigation
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.frameResized
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.frameScheduledNavigation
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.frameStartedLoading
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.frameStoppedLoading
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.interstitialHidden
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.interstitialShown
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.javascriptDialogClosed
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.javascriptDialogOpening
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.lifecycleEvent
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.loadEventFired
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.navigatedWithinDocument
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.screencastFrame
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.screencastVisibilityChanged
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.windowOpen
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.AddCompilationCacheRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnLoadRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnLoadResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnNewDocumentRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnNewDocumentResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.CaptureScreenshotRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.CaptureScreenshotResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.CaptureSnapshotRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.CaptureSnapshotResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.CompilationCacheProducedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.CreateIsolatedWorldRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.CreateIsolatedWorldResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.DeleteCookieRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.DomContentEventFiredEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.DownloadProgressEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.DownloadWillBeginEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameAttachedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameClearedScheduledNavigationEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameDetachedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameNavigatedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameRequestedNavigationEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameScheduledNavigationEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameStartedLoadingEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameStoppedLoadingEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GenerateTestReportRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetAppManifestResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetCookiesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetFrameTreeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetInstallabilityErrorsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetLayoutMetricsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetManifestIconsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetNavigationHistoryResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetResourceContentRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetResourceContentResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetResourceTreeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.HandleJavaScriptDialogRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.JavascriptDialogClosedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.JavascriptDialogOpeningEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.LifecycleEventEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.LoadEventFiredEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.NavigateRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.NavigateResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.NavigateToHistoryEntryRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.NavigatedWithinDocumentEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.PrintToPDFRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.PrintToPDFResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.ReloadRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.RemoveScriptToEvaluateOnLoadRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.RemoveScriptToEvaluateOnNewDocumentRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.ScreencastFrameAckRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.ScreencastFrameEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.ScreencastVisibilityChangedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SearchInResourceRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SearchInResourceResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetAdBlockingEnabledRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetBypassCSPRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetDeviceMetricsOverrideRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetDeviceOrientationOverrideRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetDocumentContentRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetDownloadBehaviorRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetFontFamiliesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetFontSizesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetGeolocationOverrideRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetInterceptFileChooserDialogRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetLifecycleEventsEnabledRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetProduceCompilationCacheRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetTouchEmulationEnabledRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.SetWebLifecycleStateRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.StartScreencastRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.WindowOpenEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageApi extends js.Object {
  
  /**
    * Seeds compilation cache for given url. Compilation cache does not survive
    * cross-process navigation.
    */
  def addCompilationCache(params: AddCompilationCacheRequest): js.Promise[Unit] = js.native
  
  /**
    * Deprecated, please use addScriptToEvaluateOnNewDocument instead.
    */
  def addScriptToEvaluateOnLoad(params: AddScriptToEvaluateOnLoadRequest): js.Promise[AddScriptToEvaluateOnLoadResponse] = js.native
  
  /**
    * Evaluates given script in every frame upon creation (before loading frame's scripts).
    */
  def addScriptToEvaluateOnNewDocument(params: AddScriptToEvaluateOnNewDocumentRequest): js.Promise[AddScriptToEvaluateOnNewDocumentResponse] = js.native
  
  /**
    * Brings page to front (activates tab).
    */
  def bringToFront(): js.Promise[Unit] = js.native
  
  /**
    * Capture page screenshot.
    */
  def captureScreenshot(params: CaptureScreenshotRequest): js.Promise[CaptureScreenshotResponse] = js.native
  
  /**
    * Returns a snapshot of the page as a string. For MHTML format, the serialization includes
    * iframes, shadow DOM, external resources, and element-inline styles.
    */
  def captureSnapshot(params: CaptureSnapshotRequest): js.Promise[CaptureSnapshotResponse] = js.native
  
  /**
    * Clears seeded compilation cache.
    */
  def clearCompilationCache(): js.Promise[Unit] = js.native
  
  /**
    * Clears the overriden device metrics.
    */
  def clearDeviceMetricsOverride(): js.Promise[Unit] = js.native
  
  /**
    * Clears the overridden Device Orientation.
    */
  def clearDeviceOrientationOverride(): js.Promise[Unit] = js.native
  
  /**
    * Clears the overriden Geolocation Position and Error.
    */
  def clearGeolocationOverride(): js.Promise[Unit] = js.native
  
  /**
    * Tries to close page, running its beforeunload hooks, if any.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Crashes renderer on the IO thread, generates minidumps.
    */
  def crash(): js.Promise[Unit] = js.native
  
  /**
    * Creates an isolated world for the given frame.
    */
  def createIsolatedWorld(params: CreateIsolatedWorldRequest): js.Promise[CreateIsolatedWorldResponse] = js.native
  
  /**
    * Deletes browser cookie with given name, domain and path.
    */
  def deleteCookie(params: DeleteCookieRequest): js.Promise[Unit] = js.native
  
  /**
    * Disables page domain notifications.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables page domain notifications.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Generates a report for testing.
    */
  def generateTestReport(params: GenerateTestReportRequest): js.Promise[Unit] = js.native
  
  def getAppManifest(): js.Promise[GetAppManifestResponse] = js.native
  
  /**
    * Returns all browser cookies. Depending on the backend support, will return detailed cookie
    * information in the `cookies` field.
    */
  def getCookies(): js.Promise[GetCookiesResponse] = js.native
  
  /**
    * Returns present frame tree structure.
    */
  def getFrameTree(): js.Promise[GetFrameTreeResponse] = js.native
  
  def getInstallabilityErrors(): js.Promise[GetInstallabilityErrorsResponse] = js.native
  
  /**
    * Returns metrics relating to the layouting of the page, such as viewport bounds/scale.
    */
  def getLayoutMetrics(): js.Promise[GetLayoutMetricsResponse] = js.native
  
  def getManifestIcons(): js.Promise[GetManifestIconsResponse] = js.native
  
  /**
    * Returns navigation history for the current page.
    */
  def getNavigationHistory(): js.Promise[GetNavigationHistoryResponse] = js.native
  
  /**
    * Returns content of the given resource.
    */
  def getResourceContent(params: GetResourceContentRequest): js.Promise[GetResourceContentResponse] = js.native
  
  /**
    * Returns present frame / resource tree structure.
    */
  def getResourceTree(): js.Promise[GetResourceTreeResponse] = js.native
  
  /**
    * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
    */
  def handleJavaScriptDialog(params: HandleJavaScriptDialogRequest): js.Promise[Unit] = js.native
  
  /**
    * Navigates current page to the given URL.
    */
  def navigate(params: NavigateRequest): js.Promise[NavigateResponse] = js.native
  
  /**
    * Navigates current page to the given history entry.
    */
  def navigateToHistoryEntry(params: NavigateToHistoryEntryRequest): js.Promise[Unit] = js.native
  
  /**
    * Issued for every compilation cache generated. Is only available
    * if Page.setGenerateCompilationCache is enabled.
    */
  @JSName("on")
  def on_compilationCacheProduced(
    event: compilationCacheProduced,
    listener: js.Function1[/* params */ CompilationCacheProducedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_domContentEventFired(event: domContentEventFired, listener: js.Function1[/* params */ DomContentEventFiredEvent, Unit]): Unit = js.native
  /**
    * Fired when download makes progress. Last call has |done| == true.
    */
  @JSName("on")
  def on_downloadProgress(event: downloadProgress, listener: js.Function1[/* params */ DownloadProgressEvent, Unit]): Unit = js.native
  /**
    * Fired when page is about to start a download.
    */
  @JSName("on")
  def on_downloadWillBegin(event: downloadWillBegin, listener: js.Function1[/* params */ DownloadWillBeginEvent, Unit]): Unit = js.native
  /**
    * Emitted only when `page.interceptFileChooser` is enabled.
    */
  @JSName("on")
  def on_fileChooserOpened(event: fileChooserOpened, listener: js.Function1[/* params */ FileChooserOpenedEvent, Unit]): Unit = js.native
  /**
    * Fired when frame has been attached to its parent.
    */
  @JSName("on")
  def on_frameAttached(event: frameAttached, listener: js.Function1[/* params */ FrameAttachedEvent, Unit]): Unit = js.native
  /**
    * Fired when frame no longer has a scheduled navigation.
    */
  @JSName("on")
  def on_frameClearedScheduledNavigation(
    event: frameClearedScheduledNavigation,
    listener: js.Function1[/* params */ FrameClearedScheduledNavigationEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when frame has been detached from its parent.
    */
  @JSName("on")
  def on_frameDetached(event: frameDetached, listener: js.Function1[/* params */ FrameDetachedEvent, Unit]): Unit = js.native
  /**
    * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
    */
  @JSName("on")
  def on_frameNavigated(event: frameNavigated, listener: js.Function1[/* params */ FrameNavigatedEvent, Unit]): Unit = js.native
  /**
    * Fired when a renderer-initiated navigation is requested.
    * Navigation may still be cancelled after the event is issued.
    */
  @JSName("on")
  def on_frameRequestedNavigation(
    event: frameRequestedNavigation,
    listener: js.Function1[/* params */ FrameRequestedNavigationEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_frameResized(event: frameResized, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when frame schedules a potential navigation.
    */
  @JSName("on")
  def on_frameScheduledNavigation(
    event: frameScheduledNavigation,
    listener: js.Function1[/* params */ FrameScheduledNavigationEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when frame has started loading.
    */
  @JSName("on")
  def on_frameStartedLoading(event: frameStartedLoading, listener: js.Function1[/* params */ FrameStartedLoadingEvent, Unit]): Unit = js.native
  /**
    * Fired when frame has stopped loading.
    */
  @JSName("on")
  def on_frameStoppedLoading(event: frameStoppedLoading, listener: js.Function1[/* params */ FrameStoppedLoadingEvent, Unit]): Unit = js.native
  /**
    * Fired when interstitial page was hidden
    */
  @JSName("on")
  def on_interstitialHidden(event: interstitialHidden, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when interstitial page was shown
    */
  @JSName("on")
  def on_interstitialShown(event: interstitialShown, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
    * closed.
    */
  @JSName("on")
  def on_javascriptDialogClosed(
    event: javascriptDialogClosed,
    listener: js.Function1[/* params */ JavascriptDialogClosedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to
    * open.
    */
  @JSName("on")
  def on_javascriptDialogOpening(
    event: javascriptDialogOpening,
    listener: js.Function1[/* params */ JavascriptDialogOpeningEvent, Unit]
  ): Unit = js.native
  /**
    * Fired for top level page lifecycle events such as navigation, load, paint, etc.
    */
  @JSName("on")
  def on_lifecycleEvent(event: lifecycleEvent, listener: js.Function1[/* params */ LifecycleEventEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_loadEventFired(event: loadEventFired, listener: js.Function1[/* params */ LoadEventFiredEvent, Unit]): Unit = js.native
  /**
    * Fired when same-document navigation happens, e.g. due to history API usage or anchor navigation.
    */
  @JSName("on")
  def on_navigatedWithinDocument(
    event: navigatedWithinDocument,
    listener: js.Function1[/* params */ NavigatedWithinDocumentEvent, Unit]
  ): Unit = js.native
  /**
    * Compressed image data requested by the `startScreencast`.
    */
  @JSName("on")
  def on_screencastFrame(event: screencastFrame, listener: js.Function1[/* params */ ScreencastFrameEvent, Unit]): Unit = js.native
  /**
    * Fired when the page with currently enabled screencast was shown or hidden `.
    */
  @JSName("on")
  def on_screencastVisibilityChanged(
    event: screencastVisibilityChanged,
    listener: js.Function1[/* params */ ScreencastVisibilityChangedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when a new window is going to be opened, via window.open(), link click, form submission,
    * etc.
    */
  @JSName("on")
  def on_windowOpen(event: windowOpen, listener: js.Function1[/* params */ WindowOpenEvent, Unit]): Unit = js.native
  
  /**
    * Print page as PDF.
    */
  def printToPDF(params: PrintToPDFRequest): js.Promise[PrintToPDFResponse] = js.native
  
  /**
    * Reloads given page optionally ignoring the cache.
    */
  def reload(params: ReloadRequest): js.Promise[Unit] = js.native
  
  /**
    * Deprecated, please use removeScriptToEvaluateOnNewDocument instead.
    */
  def removeScriptToEvaluateOnLoad(params: RemoveScriptToEvaluateOnLoadRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes given script from the list.
    */
  def removeScriptToEvaluateOnNewDocument(params: RemoveScriptToEvaluateOnNewDocumentRequest): js.Promise[Unit] = js.native
  
  /**
    * Resets navigation history for the current page.
    */
  def resetNavigationHistory(): js.Promise[Unit] = js.native
  
  /**
    * Acknowledges that a screencast frame has been received by the frontend.
    */
  def screencastFrameAck(params: ScreencastFrameAckRequest): js.Promise[Unit] = js.native
  
  /**
    * Searches for given string in resource content.
    */
  def searchInResource(params: SearchInResourceRequest): js.Promise[SearchInResourceResponse] = js.native
  
  /**
    * Enable Chrome's experimental ad filter on all sites.
    */
  def setAdBlockingEnabled(params: SetAdBlockingEnabledRequest): js.Promise[Unit] = js.native
  
  /**
    * Enable page Content Security Policy by-passing.
    */
  def setBypassCSP(params: SetBypassCSPRequest): js.Promise[Unit] = js.native
  
  /**
    * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
    * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
    * query results).
    */
  def setDeviceMetricsOverride(params: SetDeviceMetricsOverrideRequest): js.Promise[Unit] = js.native
  
  /**
    * Overrides the Device Orientation.
    */
  def setDeviceOrientationOverride(params: SetDeviceOrientationOverrideRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets given markup as the document's HTML.
    */
  def setDocumentContent(params: SetDocumentContentRequest): js.Promise[Unit] = js.native
  
  /**
    * Set the behavior when downloading a file.
    */
  def setDownloadBehavior(params: SetDownloadBehaviorRequest): js.Promise[Unit] = js.native
  
  /**
    * Set generic font families.
    */
  def setFontFamilies(params: SetFontFamiliesRequest): js.Promise[Unit] = js.native
  
  /**
    * Set default font sizes.
    */
  def setFontSizes(params: SetFontSizesRequest): js.Promise[Unit] = js.native
  
  /**
    * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
    * unavailable.
    */
  def setGeolocationOverride(params: SetGeolocationOverrideRequest): js.Promise[Unit] = js.native
  
  /**
    * Intercept file chooser requests and transfer control to protocol clients.
    * When file chooser interception is enabled, native file chooser dialog is not shown.
    * Instead, a protocol event `Page.fileChooserOpened` is emitted.
    */
  def setInterceptFileChooserDialog(params: SetInterceptFileChooserDialogRequest): js.Promise[Unit] = js.native
  
  /**
    * Controls whether page will emit lifecycle events.
    */
  def setLifecycleEventsEnabled(params: SetLifecycleEventsEnabledRequest): js.Promise[Unit] = js.native
  
  /**
    * Forces compilation cache to be generated for every subresource script.
    */
  def setProduceCompilationCache(params: SetProduceCompilationCacheRequest): js.Promise[Unit] = js.native
  
  /**
    * Toggles mouse event-based touch event emulation.
    */
  def setTouchEmulationEnabled(params: SetTouchEmulationEnabledRequest): js.Promise[Unit] = js.native
  
  /**
    * Tries to update the web lifecycle state of the page.
    * It will transition the page to the given state according to:
    * https://github.com/WICG/web-lifecycle/
    */
  def setWebLifecycleState(params: SetWebLifecycleStateRequest): js.Promise[Unit] = js.native
  
  /**
    * Starts sending each frame using the `screencastFrame` event.
    */
  def startScreencast(params: StartScreencastRequest): js.Promise[Unit] = js.native
  
  /**
    * Force the page stop all navigations and pending resource fetches.
    */
  def stopLoading(): js.Promise[Unit] = js.native
  
  /**
    * Stops sending each frame in the `screencastFrame`.
    */
  def stopScreencast(): js.Promise[Unit] = js.native
  
  /**
    * Pauses page execution. Can be resumed using generic Runtime.runIfWaitingForDebugger.
    */
  def waitForDebugger(): js.Promise[Unit] = js.native
}
