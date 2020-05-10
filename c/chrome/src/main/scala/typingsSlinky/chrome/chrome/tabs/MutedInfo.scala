package typingsSlinky.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutedInfo extends js.Object {
  /**
    * Optional.
    * The ID of the extension that changed the muted state. Not set if an extension was not the reason the muted state last changed.
    */
  var extensionId: js.UndefOr[String] = js.native
  /** Whether the tab is prevented from playing sound (but hasn't necessarily recently produced sound). Equivalent to whether the muted audio indicator is showing. */
  var muted: Boolean = js.native
  /**
    * Optional.
    * The reason the tab was muted or unmuted. Not set if the tab's mute state has never been changed.
    * "user": A user input action has set/overridden the muted state.
    * "capture": Tab capture started, forcing a muted state change.
    * "extension": An extension, identified by the extensionId field, set the muted state.
    */
  var reason: js.UndefOr[String] = js.native
}

object MutedInfo {
  @scala.inline
  def apply(muted: Boolean): MutedInfo = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutedInfo]
  }
  @scala.inline
  implicit class MutedInfoOps[Self <: MutedInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

