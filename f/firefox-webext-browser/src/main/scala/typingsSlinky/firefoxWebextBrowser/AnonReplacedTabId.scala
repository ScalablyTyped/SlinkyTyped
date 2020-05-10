package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReplacedTabId extends js.Object {
  /** The ID of the tab that was replaced. */
  var replacedTabId: Double = js.native
  /** The ID of the tab that replaced the old tab. */
  var tabId: Double = js.native
  /** The time when the replacement happened, in milliseconds since the epoch. */
  var timeStamp: Double = js.native
}

object AnonReplacedTabId {
  @scala.inline
  def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): AnonReplacedTabId = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReplacedTabId]
  }
  @scala.inline
  implicit class AnonReplacedTabIdOps[Self <: AnonReplacedTabId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplacedTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacedTabId")(value.asInstanceOf[js.Any])
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
  }
  
}

