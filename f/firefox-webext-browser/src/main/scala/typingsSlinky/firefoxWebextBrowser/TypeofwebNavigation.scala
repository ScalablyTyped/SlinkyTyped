package typingsSlinky.firefoxWebextBrowser

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
import scala.scalajs.js.annotation._

@js.native
trait TypeofwebNavigation extends js.Object {
  /* webNavigation events */
  /** Fired when a navigation is about to occur. */
  val onBeforeNavigate: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ AnonProcessId, Unit]] = js.native
  /**
    * Fired when a navigation is committed. The document (and the resources it refers to, such as images and
    * subframes) might still be downloading, but at least part of the document has been received from the server and
    * the browser has decided to switch to the new document.
    */
  val onCommitted: WebNavigationOnCommittedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]] = js.native
  /** Fired when a document, including the resources it refers to, is completely loaded and initialized. */
  val onCompleted: WebNavigationOnCompletedEvent[js.Function1[/* details */ AnonUrl, Unit]] = js.native
  /** Fired when a new window, or a new tab in an existing window, is created to host a navigation. */
  val onCreatedNavigationTarget: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ AnonSourceFrameId, Unit]] = js.native
  /** Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading. */
  val onDOMContentLoaded: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ AnonUrl, Unit]] = js.native
  /**
    * Fired when an error occurs and the navigation is aborted. This can happen if either a network error occurred, or
    * the user aborted the navigation.
    */
  val onErrorOccurred: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ AnonError, Unit]] = js.native
  /**
    * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated
    * URL.
    */
  val onHistoryStateUpdated: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]] = js.native
  /**
    * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated
    * URL.
    */
  val onReferenceFragmentUpdated: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]] = js.native
  /** Fired when the contents of the tab is replaced by a different (usually previously pre-rendered) tab. */
  val onTabReplaced: WebExtEvent[js.Function1[/* details */ AnonReplacedTabId, Unit]] = js.native
  /**
    * Retrieves information about all frames of a given tab.
    * @param details Information about the tab to retrieve all frames from.
    */
  def getAllFrames(details: AnonTabIdNumber): js.Promise[js.Array[AnonParentFrameId]] = js.native
  /* webNavigation functions */
  /**
    * Retrieves information about the given frame. A frame refers to an <iframe> or a <frame> of a web page and is
    * identified by a tab ID and a frame ID.
    * @param details Information about the frame to retrieve information about.
    */
  def getFrame(details: AnonFrameId): js.Promise[AnonErrorOccurred] = js.native
}

object TypeofwebNavigation {
  @scala.inline
  def apply(
    getAllFrames: AnonTabIdNumber => js.Promise[js.Array[AnonParentFrameId]],
    getFrame: AnonFrameId => js.Promise[AnonErrorOccurred],
    onBeforeNavigate: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ AnonProcessId, Unit]],
    onCommitted: WebNavigationOnCommittedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]],
    onCompleted: WebNavigationOnCompletedEvent[js.Function1[/* details */ AnonUrl, Unit]],
    onCreatedNavigationTarget: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ AnonSourceFrameId, Unit]],
    onDOMContentLoaded: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ AnonUrl, Unit]],
    onErrorOccurred: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ AnonError, Unit]],
    onHistoryStateUpdated: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]],
    onReferenceFragmentUpdated: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]],
    onTabReplaced: WebExtEvent[js.Function1[/* details */ AnonReplacedTabId, Unit]]
  ): TypeofwebNavigation = {
    val __obj = js.Dynamic.literal(getAllFrames = js.Any.fromFunction1(getAllFrames), getFrame = js.Any.fromFunction1(getFrame), onBeforeNavigate = onBeforeNavigate.asInstanceOf[js.Any], onCommitted = onCommitted.asInstanceOf[js.Any], onCompleted = onCompleted.asInstanceOf[js.Any], onCreatedNavigationTarget = onCreatedNavigationTarget.asInstanceOf[js.Any], onDOMContentLoaded = onDOMContentLoaded.asInstanceOf[js.Any], onErrorOccurred = onErrorOccurred.asInstanceOf[js.Any], onHistoryStateUpdated = onHistoryStateUpdated.asInstanceOf[js.Any], onReferenceFragmentUpdated = onReferenceFragmentUpdated.asInstanceOf[js.Any], onTabReplaced = onTabReplaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofwebNavigation]
  }
  @scala.inline
  implicit class TypeofwebNavigationOps[Self <: TypeofwebNavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllFrames(value: AnonTabIdNumber => js.Promise[js.Array[AnonParentFrameId]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllFrames")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFrame(value: AnonFrameId => js.Promise[AnonErrorOccurred]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnBeforeNavigate(value: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ AnonProcessId, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeNavigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCommitted(value: WebNavigationOnCommittedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCommitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCompleted(value: WebNavigationOnCompletedEvent[js.Function1[/* details */ AnonUrl, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCreatedNavigationTarget(
      value: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ AnonSourceFrameId, Unit]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreatedNavigationTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDOMContentLoaded(value: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ AnonUrl, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDOMContentLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnErrorOccurred(value: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ AnonError, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorOccurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnHistoryStateUpdated(value: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHistoryStateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReferenceFragmentUpdated(
      value: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReferenceFragmentUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTabReplaced(value: WebExtEvent[js.Function1[/* details */ AnonReplacedTabId, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabReplaced")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

