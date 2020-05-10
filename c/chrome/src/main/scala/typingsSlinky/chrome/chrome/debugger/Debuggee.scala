package typingsSlinky.chrome.chrome.debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debuggee extends js.Object {
  /**
    * Optional.
    * Since Chrome 27.
    * The id of the extension which you intend to debug. Attaching to an extension background page is only possible when 'silent-debugger-extension-api' flag is enabled on the target browser.
    */
  var extensionId: js.UndefOr[String] = js.native
  /** Optional. The id of the tab which you intend to debug.  */
  var tabId: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * Since Chrome 28.
    * The opaque id of the debug target.
    */
  var targetId: js.UndefOr[String] = js.native
}

object Debuggee {
  @scala.inline
  def apply(): Debuggee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debuggee]
  }
  @scala.inline
  implicit class DebuggeeOps[Self <: Debuggee] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(js.undefined)
        ret
    }
  }
  
}

