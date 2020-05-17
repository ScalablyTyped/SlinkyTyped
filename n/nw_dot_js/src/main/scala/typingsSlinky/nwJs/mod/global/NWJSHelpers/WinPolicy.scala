package typingsSlinky.nwJs.mod.global.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Window.get().on('new-win-policy') callback policy argument object
  */
@js.native
trait WinPolicy extends js.Object {
  /**
    * Force the link to be opened in the same frame
    */
  def forceCurrent(): Unit = js.native
  /**
    * Force the link to be a downloadable, or open by external program
    */
  def forceDownload(): Unit = js.native
  /**
    * Force the link to be opened in a new popup window
    */
  def forceNewPopup(): Unit = js.native
  /**
    * Force the link to be opened in a new window
    */
  def forceNewWindow(): Unit = js.native
  /**
    * Ignore the request, navigation won’t happen.
    */
  def ignore(): Unit = js.native
  /**
    * Control the options for the new popup window.
    *
    *@param m {Object} The object is in the same format as the Window subfields in manifest format.
    */
  def setNewWindowManifest(m: WindowOption): Unit = js.native
}

object WinPolicy {
  @scala.inline
  def apply(
    forceCurrent: () => Unit,
    forceDownload: () => Unit,
    forceNewPopup: () => Unit,
    forceNewWindow: () => Unit,
    ignore: () => Unit,
    setNewWindowManifest: WindowOption => Unit
  ): WinPolicy = {
    val __obj = js.Dynamic.literal(forceCurrent = js.Any.fromFunction0(forceCurrent), forceDownload = js.Any.fromFunction0(forceDownload), forceNewPopup = js.Any.fromFunction0(forceNewPopup), forceNewWindow = js.Any.fromFunction0(forceNewWindow), ignore = js.Any.fromFunction0(ignore), setNewWindowManifest = js.Any.fromFunction1(setNewWindowManifest))
    __obj.asInstanceOf[WinPolicy]
  }
  @scala.inline
  implicit class WinPolicyOps[Self <: WinPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceCurrent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCurrent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForceDownload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDownload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForceNewPopup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNewPopup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForceNewWindow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNewWindow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIgnore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetNewWindowManifest(value: WindowOption => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNewWindowManifest")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

