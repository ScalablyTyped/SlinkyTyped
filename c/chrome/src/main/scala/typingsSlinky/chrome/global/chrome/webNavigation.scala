package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.webNavigation.GetAllFrameDetails
import typingsSlinky.chrome.chrome.webNavigation.GetAllFrameResultDetails
import typingsSlinky.chrome.chrome.webNavigation.GetFrameDetails
import typingsSlinky.chrome.chrome.webNavigation.GetFrameResultDetails
import typingsSlinky.chrome.chrome.webNavigation.WebNavigationFramedErrorEvent
import typingsSlinky.chrome.chrome.webNavigation.WebNavigationFramedEvent
import typingsSlinky.chrome.chrome.webNavigation.WebNavigationParentedEvent
import typingsSlinky.chrome.chrome.webNavigation.WebNavigationReplacementEvent
import typingsSlinky.chrome.chrome.webNavigation.WebNavigationSourceEvent
import typingsSlinky.chrome.chrome.webNavigation.WebNavigationTransitionalEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Web Navigation
////////////////////
/**
  * Use the chrome.webNavigation API to receive notifications about the status of navigation requests in-flight.
  * Permissions:  "webNavigation"
  * @since Chrome 16.
  */
@JSGlobal("chrome.webNavigation")
@js.native
object webNavigation extends js.Object {
  
  def getAllFrames(
    details: GetAllFrameDetails,
    callback: js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]
  ): Unit = js.native
  
  def getFrame(details: GetFrameDetails, callback: js.Function1[/* details */ GetFrameResultDetails | Null, Unit]): Unit = js.native
  
  var onBeforeNavigate: WebNavigationParentedEvent = js.native
  
  var onCommitted: WebNavigationTransitionalEvent = js.native
  
  var onCompleted: WebNavigationFramedEvent = js.native
  
  var onCreatedNavigationTarget: WebNavigationSourceEvent = js.native
  
  var onDOMContentLoaded: WebNavigationFramedEvent = js.native
  
  var onErrorOccurred: WebNavigationFramedErrorEvent = js.native
  
  var onHistoryStateUpdated: WebNavigationTransitionalEvent = js.native
  
  var onReferenceFragmentUpdated: WebNavigationTransitionalEvent = js.native
  
  var onTabReplaced: WebNavigationReplacementEvent = js.native
}
