package typingsSlinky.chromeApps.chrome.bluetoothSocket

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenOptions extends js.Object {
  /**
    * Length of the socket's listen queue.
    * The default value depends on the operating system's host subsystem.
    * */
  var backlog: js.UndefOr[integer] = js.native
  /**
    * The RFCOMM Channel used by listenUsingRfcomm.
    * If specified, this channel must not be previously
    * in use or the method call will fail. When not specified,
    * an unused channel will be automatically allocated.
    */
  var channel: js.UndefOr[integer] = js.native
  /**
    * The L2CAP PSM used by listenUsingL2cap.
    * If specified, this PSM must not be previously
    * in use or the method call with fail. When not specified,
    * an unused PSM will be automatically allocated.
    * */
  var psm: js.UndefOr[integer] = js.native
}

object ListenOptions {
  @scala.inline
  def apply(): ListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenOptions]
  }
  @scala.inline
  implicit class ListenOptionsOps[Self <: ListenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBacklog(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBacklog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlog")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withPsm(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPsm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psm")(js.undefined)
        ret
    }
  }
  
}

