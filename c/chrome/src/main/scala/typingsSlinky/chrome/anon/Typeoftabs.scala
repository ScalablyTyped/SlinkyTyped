package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.runtime.Port
import typingsSlinky.chrome.chrome.tabs.CaptureVisibleTabOptions
import typingsSlinky.chrome.chrome.tabs.ConnectInfo
import typingsSlinky.chrome.chrome.tabs.CreateProperties
import typingsSlinky.chrome.chrome.tabs.HighlightInfo
import typingsSlinky.chrome.chrome.tabs.InjectDetails
import typingsSlinky.chrome.chrome.tabs.MessageSendOptions
import typingsSlinky.chrome.chrome.tabs.MoveProperties
import typingsSlinky.chrome.chrome.tabs.QueryInfo
import typingsSlinky.chrome.chrome.tabs.ReloadProperties
import typingsSlinky.chrome.chrome.tabs.Tab
import typingsSlinky.chrome.chrome.tabs.TabActivatedEvent
import typingsSlinky.chrome.chrome.tabs.TabAttachedEvent
import typingsSlinky.chrome.chrome.tabs.TabCreatedEvent
import typingsSlinky.chrome.chrome.tabs.TabDetachedEvent
import typingsSlinky.chrome.chrome.tabs.TabHighlightedEvent
import typingsSlinky.chrome.chrome.tabs.TabMovedEvent
import typingsSlinky.chrome.chrome.tabs.TabRemovedEvent
import typingsSlinky.chrome.chrome.tabs.TabReplacedEvent
import typingsSlinky.chrome.chrome.tabs.TabSelectedEvent
import typingsSlinky.chrome.chrome.tabs.TabUpdatedEvent
import typingsSlinky.chrome.chrome.tabs.TabZoomChangeEvent
import typingsSlinky.chrome.chrome.tabs.UpdateProperties
import typingsSlinky.chrome.chrome.tabs.ZoomSettings
import typingsSlinky.chrome.chromeNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftabs extends StObject {
  
  var TAB_ID_NONE: `-1` = js.native
  
  def captureVisibleTab(callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def captureVisibleTab(options: CaptureVisibleTabOptions, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def captureVisibleTab(windowId: Double, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def captureVisibleTab(
    windowId: Double,
    options: CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ String, Unit]
  ): Unit = js.native
  
  def connect(tabId: Double): Port = js.native
  def connect(tabId: Double, connectInfo: ConnectInfo): Port = js.native
  
  def create(createProperties: CreateProperties): Unit = js.native
  def create(createProperties: CreateProperties, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  def detectLanguage(callback: js.Function1[/* language */ String, Unit]): Unit = js.native
  def detectLanguage(tabId: Double, callback: js.Function1[/* language */ String, Unit]): Unit = js.native
  
  def discard(): Unit = js.native
  def discard(tabId: js.UndefOr[scala.Nothing], callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  def discard(tabId: Double): Unit = js.native
  def discard(tabId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  def duplicate(tabId: Double): Unit = js.native
  def duplicate(tabId: Double, callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = js.native
  
  def executeScript(details: InjectDetails): Unit = js.native
  def executeScript(details: InjectDetails, callback: js.Function1[/* result */ js.Array[_], Unit]): Unit = js.native
  def executeScript(tabId: Double, details: InjectDetails): Unit = js.native
  def executeScript(tabId: Double, details: InjectDetails, callback: js.Function1[/* result */ js.Array[_], Unit]): Unit = js.native
  
  def get(tabId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  def getAllInWindow(callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  def getAllInWindow(windowId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  def getCurrent(callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = js.native
  
  def getSelected(callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  def getSelected(windowId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  def getZoom(callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = js.native
  def getZoom(tabId: Double, callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = js.native
  
  def getZoomSettings(callback: js.Function1[/* zoomSettings */ ZoomSettings, Unit]): Unit = js.native
  def getZoomSettings(tabId: Double, callback: js.Function1[/* zoomSettings */ ZoomSettings, Unit]): Unit = js.native
  
  def goBack(): Unit = js.native
  def goBack(callback: js.Function0[Unit]): Unit = js.native
  def goBack(tabId: Double): Unit = js.native
  def goBack(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def goForward(): Unit = js.native
  def goForward(callback: js.Function0[Unit]): Unit = js.native
  def goForward(tabId: Double): Unit = js.native
  def goForward(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def highlight(highlightInfo: HighlightInfo): Unit = js.native
  def highlight(highlightInfo: HighlightInfo, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  
  def insertCSS(details: InjectDetails): Unit = js.native
  def insertCSS(details: InjectDetails, callback: js.Function): Unit = js.native
  def insertCSS(tabId: Double, details: InjectDetails): Unit = js.native
  def insertCSS(tabId: Double, details: InjectDetails, callback: js.Function): Unit = js.native
  
  def move(tabId: Double, moveProperties: MoveProperties): Unit = js.native
  def move(tabId: Double, moveProperties: MoveProperties, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  def move(tabIds: js.Array[Double], moveProperties: MoveProperties): Unit = js.native
  def move(
    tabIds: js.Array[Double],
    moveProperties: MoveProperties,
    callback: js.Function1[/* tabs */ js.Array[Tab], Unit]
  ): Unit = js.native
  
  var onActivated: TabActivatedEvent = js.native
  
  var onActiveChanged: TabSelectedEvent = js.native
  
  var onAttached: TabAttachedEvent = js.native
  
  var onCreated: TabCreatedEvent = js.native
  
  var onDetached: TabDetachedEvent = js.native
  
  var onHighlightChanged: TabHighlightedEvent = js.native
  
  var onHighlighted: TabHighlightedEvent = js.native
  
  var onMoved: TabMovedEvent = js.native
  
  var onRemoved: TabRemovedEvent = js.native
  
  var onReplaced: TabReplacedEvent = js.native
  
  var onSelectionChanged: TabSelectedEvent = js.native
  
  var onUpdated: TabUpdatedEvent = js.native
  
  var onZoomChange: TabZoomChangeEvent = js.native
  
  def query(queryInfo: QueryInfo, callback: js.Function1[/* result */ js.Array[Tab], Unit]): Unit = js.native
  
  def reload(): Unit = js.native
  def reload(callback: js.Function0[Unit]): Unit = js.native
  def reload(reloadProperties: ReloadProperties): Unit = js.native
  def reload(reloadProperties: ReloadProperties, callback: js.Function0[Unit]): Unit = js.native
  def reload(tabId: Double): Unit = js.native
  def reload(tabId: Double, reloadProperties: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def reload(tabId: Double, reloadProperties: ReloadProperties): Unit = js.native
  def reload(tabId: Double, reloadProperties: ReloadProperties, callback: js.Function0[Unit]): Unit = js.native
  
  def remove(tabId: Double): Unit = js.native
  def remove(tabId: Double, callback: js.Function): Unit = js.native
  def remove(tabIds: js.Array[Double]): Unit = js.native
  def remove(tabIds: js.Array[Double], callback: js.Function): Unit = js.native
  
  def sendMessage(tabId: Double, message: js.Any): Unit = js.native
  def sendMessage(tabId: Double, message: js.Any, options: MessageSendOptions): Unit = js.native
  def sendMessage(
    tabId: Double,
    message: js.Any,
    options: MessageSendOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def sendMessage(tabId: Double, message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  
  def sendRequest(tabId: Double, request: js.Any): Unit = js.native
  def sendRequest(tabId: Double, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  
  def setZoom(tabId: Double, zoomFactor: Double): Unit = js.native
  def setZoom(tabId: Double, zoomFactor: Double, callback: js.Function0[Unit]): Unit = js.native
  def setZoom(zoomFactor: Double): Unit = js.native
  def setZoom(zoomFactor: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings): Unit = js.native
  def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
  def setZoomSettings(zoomSettings: ZoomSettings): Unit = js.native
  def setZoomSettings(zoomSettings: ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
  
  def update(tabId: Double, updateProperties: UpdateProperties): Unit = js.native
  def update(
    tabId: Double,
    updateProperties: UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]
  ): Unit = js.native
  def update(updateProperties: UpdateProperties): Unit = js.native
  def update(updateProperties: UpdateProperties, callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = js.native
}
