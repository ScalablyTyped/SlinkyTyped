package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.TransitionQualifier
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.TransitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeStamp extends js.Object {
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a
    * subframe. Frame IDs are unique within a tab.
    */
  var frameId: Double = js.native
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.native
  /** The ID of the tab in which the navigation occurs. */
  var tabId: Double = js.native
  /** The time when the navigation was committed, in milliseconds since the epoch. */
  var timeStamp: Double = js.native
  /**
    * A list of transition qualifiers.
    * @deprecated Unsupported on Firefox at this time.
    */
  var transitionQualifiers: js.UndefOr[js.Array[TransitionQualifier]] = js.native
  /**
    * Cause of the navigation.
    * @deprecated Unsupported on Firefox at this time.
    */
  var transitionType: js.UndefOr[TransitionType] = js.native
  var url: String = js.native
}

object TimeStamp {
  @scala.inline
  def apply(frameId: Double, tabId: Double, timeStamp: Double, url: String): TimeStamp = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeStamp]
  }
  @scala.inline
  implicit class TimeStampOps[Self <: TimeStamp] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withProcessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionQualifiers(value: js.Array[TransitionQualifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionQualifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionQualifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionQualifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionType(value: TransitionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionType")(js.undefined)
        ret
    }
  }
  
}

