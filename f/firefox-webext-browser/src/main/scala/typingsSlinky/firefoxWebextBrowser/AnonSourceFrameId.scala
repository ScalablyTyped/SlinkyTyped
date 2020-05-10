package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSourceFrameId extends js.Object {
  /**
    * The ID of the frame with sourceTabId in which the navigation is triggered. 0 indicates the main frame.
    */
  var sourceFrameId: Double = js.native
  /** The ID of the process runs the renderer for the source tab. */
  var sourceProcessId: Double = js.native
  /** The ID of the tab in which the navigation is triggered. */
  var sourceTabId: Double = js.native
  /** The ID of the tab in which the url is opened */
  var tabId: Double = js.native
  /** The time when the browser was about to create a new view, in milliseconds since the epoch. */
  var timeStamp: Double = js.native
  /** The URL to be opened in the new window. */
  var url: String = js.native
}

object AnonSourceFrameId {
  @scala.inline
  def apply(
    sourceFrameId: Double,
    sourceProcessId: Double,
    sourceTabId: Double,
    tabId: Double,
    timeStamp: Double,
    url: String
  ): AnonSourceFrameId = {
    val __obj = js.Dynamic.literal(sourceFrameId = sourceFrameId.asInstanceOf[js.Any], sourceProcessId = sourceProcessId.asInstanceOf[js.Any], sourceTabId = sourceTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceFrameId]
  }
  @scala.inline
  implicit class AnonSourceFrameIdOps[Self <: AnonSourceFrameId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceFrameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFrameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceProcessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceProcessId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

