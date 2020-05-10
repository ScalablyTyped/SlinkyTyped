package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorOccurred extends js.Object {
  /**
    * True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired.
    */
  var errorOccurred: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a
    * subframe.
    */
  var frameId: Double = js.native
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: Double = js.native
  /** The ID of the tab in which the frame is. */
  var tabId: Double = js.native
  /**
    * The URL currently associated with this frame, if the frame identified by the frameId existed at one point in
    * the given tab. The fact that an URL is associated with a given frameId does not imply that the corresponding
    * frame still exists.
    */
  var url: String = js.native
}

object AnonErrorOccurred {
  @scala.inline
  def apply(frameId: Double, parentFrameId: Double, tabId: Double, url: String): AnonErrorOccurred = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorOccurred]
  }
  @scala.inline
  implicit class AnonErrorOccurredOps[Self <: AnonErrorOccurred] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentFrameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFrameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorOccurred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOccurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorOccurred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOccurred")(js.undefined)
        ret
    }
  }
  
}

