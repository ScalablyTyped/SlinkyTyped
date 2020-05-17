package typingsSlinky.chrome.anon

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
import scala.scalajs.js.annotation._

@js.native
trait TypeofwebNavigation extends js.Object {
  var onBeforeNavigate: WebNavigationParentedEvent = js.native
  var onCommitted: WebNavigationTransitionalEvent = js.native
  var onCompleted: WebNavigationFramedEvent = js.native
  var onCreatedNavigationTarget: WebNavigationSourceEvent = js.native
  var onDOMContentLoaded: WebNavigationFramedEvent = js.native
  var onErrorOccurred: WebNavigationFramedErrorEvent = js.native
  var onHistoryStateUpdated: WebNavigationTransitionalEvent = js.native
  var onReferenceFragmentUpdated: WebNavigationTransitionalEvent = js.native
  var onTabReplaced: WebNavigationReplacementEvent = js.native
  def getAllFrames(
    details: GetAllFrameDetails,
    callback: js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]
  ): Unit = js.native
  def getFrame(details: GetFrameDetails, callback: js.Function1[/* details */ GetFrameResultDetails | Null, Unit]): Unit = js.native
}

object TypeofwebNavigation {
  @scala.inline
  def apply(
    getAllFrames: (GetAllFrameDetails, js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]) => Unit,
    getFrame: (GetFrameDetails, js.Function1[/* details */ GetFrameResultDetails | Null, Unit]) => Unit,
    onBeforeNavigate: WebNavigationParentedEvent,
    onCommitted: WebNavigationTransitionalEvent,
    onCompleted: WebNavigationFramedEvent,
    onCreatedNavigationTarget: WebNavigationSourceEvent,
    onDOMContentLoaded: WebNavigationFramedEvent,
    onErrorOccurred: WebNavigationFramedErrorEvent,
    onHistoryStateUpdated: WebNavigationTransitionalEvent,
    onReferenceFragmentUpdated: WebNavigationTransitionalEvent,
    onTabReplaced: WebNavigationReplacementEvent
  ): TypeofwebNavigation = {
    val __obj = js.Dynamic.literal(getAllFrames = js.Any.fromFunction2(getAllFrames), getFrame = js.Any.fromFunction2(getFrame), onBeforeNavigate = onBeforeNavigate.asInstanceOf[js.Any], onCommitted = onCommitted.asInstanceOf[js.Any], onCompleted = onCompleted.asInstanceOf[js.Any], onCreatedNavigationTarget = onCreatedNavigationTarget.asInstanceOf[js.Any], onDOMContentLoaded = onDOMContentLoaded.asInstanceOf[js.Any], onErrorOccurred = onErrorOccurred.asInstanceOf[js.Any], onHistoryStateUpdated = onHistoryStateUpdated.asInstanceOf[js.Any], onReferenceFragmentUpdated = onReferenceFragmentUpdated.asInstanceOf[js.Any], onTabReplaced = onTabReplaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofwebNavigation]
  }
  @scala.inline
  implicit class TypeofwebNavigationOps[Self <: TypeofwebNavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllFrames(
      value: (GetAllFrameDetails, js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllFrames")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetFrame(value: (GetFrameDetails, js.Function1[/* details */ GetFrameResultDetails | Null, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrame")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnBeforeNavigate(value: WebNavigationParentedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeNavigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCommitted(value: WebNavigationTransitionalEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCommitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCompleted(value: WebNavigationFramedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCreatedNavigationTarget(value: WebNavigationSourceEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreatedNavigationTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDOMContentLoaded(value: WebNavigationFramedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDOMContentLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnErrorOccurred(value: WebNavigationFramedErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorOccurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnHistoryStateUpdated(value: WebNavigationTransitionalEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHistoryStateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReferenceFragmentUpdated(value: WebNavigationTransitionalEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReferenceFragmentUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTabReplaced(value: WebNavigationReplacementEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabReplaced")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

