package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.GetAllFramesDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.GetAllFramesReturnDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.GetFrameDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.GetFrameReturnDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.OnBeforeNavigateDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.OnCommittedDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.OnCompletedDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.OnCreatedNavigationTargetDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.OnDOMContentLoadedDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.OnErrorOccurredDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.OnHistoryStateUpdatedDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.OnReferenceFragmentUpdatedDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.OnTabReplacedDetails
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnBeforeNavigateEvent
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnCommittedEvent
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnCompletedEvent
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnCreatedNavigationTargetEvent
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnDOMContentLoadedEvent
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnErrorOccurredEvent
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnHistoryStateUpdatedEvent
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnReferenceFragmentUpdatedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.webNavigation` API to receive notifications about the status of navigation requests in-flight.
  *
  * Permissions: `webNavigation`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.webNavigation")
@js.native
object webNavigation extends js.Object {
  
  /**
    * Retrieves information about all frames of a given tab.
    * @param details Information about the tab to retrieve all frames from.
    */
  def getAllFrames(details: GetAllFramesDetails): js.Promise[js.Array[GetAllFramesReturnDetails]] = js.native
  
  /* webNavigation functions */
  /**
    * Retrieves information about the given frame. A frame refers to an <iframe> or a <frame> of a web page and is identified by a tab ID and a frame ID.
    * @param details Information about the frame to retrieve information about.
    */
  def getFrame(details: GetFrameDetails): js.Promise[GetFrameReturnDetails] = js.native
  
  /* webNavigation events */
  /** Fired when a navigation is about to occur. */
  val onBeforeNavigate: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ OnBeforeNavigateDetails, Unit]] = js.native
  
  /**
    * Fired when a navigation is committed. The document (and the resources it refers to, such as images and subframes) might still be downloading, but at least part of the document has been received from the server and the browser has decided to switch to the new document.
    */
  val onCommitted: WebNavigationOnCommittedEvent[js.Function1[/* details */ OnCommittedDetails, Unit]] = js.native
  
  /** Fired when a document, including the resources it refers to, is completely loaded and initialized. */
  val onCompleted: WebNavigationOnCompletedEvent[js.Function1[/* details */ OnCompletedDetails, Unit]] = js.native
  
  /** Fired when a new window, or a new tab in an existing window, is created to host a navigation. */
  val onCreatedNavigationTarget: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ OnCreatedNavigationTargetDetails, Unit]] = js.native
  
  /** Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading. */
  val onDOMContentLoaded: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ OnDOMContentLoadedDetails, Unit]] = js.native
  
  /**
    * Fired when an error occurs and the navigation is aborted. This can happen if either a network error occurred, or the user aborted the navigation.
    */
  val onErrorOccurred: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ OnErrorOccurredDetails, Unit]] = js.native
  
  /**
    * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated URL.
    */
  val onHistoryStateUpdated: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ OnHistoryStateUpdatedDetails, Unit]] = js.native
  
  /**
    * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated URL.
    */
  val onReferenceFragmentUpdated: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ OnReferenceFragmentUpdatedDetails, Unit]] = js.native
  
  /** Fired when the contents of the tab is replaced by a different (usually previously pre-rendered) tab. */
  val onTabReplaced: WebExtEvent[js.Function1[/* details */ OnTabReplacedDetails, Unit]] = js.native
}
