package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.runtime.OnInstalledReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreviousVersion extends js.Object {
  /**
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is
    * 'shared_module_update'.
    * @deprecated Unsupported on Firefox at this time.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Indicates the previous version of the extension, which has just been updated. This is present only if
    * 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.native
  /** The reason that this event is being dispatched. */
  var reason: OnInstalledReason = js.native
  /** Indicates whether the addon is installed as a temporary extension. */
  var temporary: Boolean = js.native
}

object AnonPreviousVersion {
  @scala.inline
  def apply(reason: OnInstalledReason, temporary: Boolean): AnonPreviousVersion = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], temporary = temporary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreviousVersion]
  }
  @scala.inline
  implicit class AnonPreviousVersionOps[Self <: AnonPreviousVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: OnInstalledReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemporary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousVersion")(js.undefined)
        ret
    }
  }
  
}

