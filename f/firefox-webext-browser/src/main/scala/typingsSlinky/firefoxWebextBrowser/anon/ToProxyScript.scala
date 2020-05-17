package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToProxyScript extends js.Object {
  /**
    * Whether the TLS channel ID will be passed into onMessageExternal for processes that are listening for the
    * connection event.
    * @deprecated Unsupported on Firefox at this time.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.native
  /** If true, the message will be directed to the extension's proxy sandbox. */
  var toProxyScript: js.UndefOr[Boolean] = js.native
}

object ToProxyScript {
  @scala.inline
  def apply(): ToProxyScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToProxyScript]
  }
  @scala.inline
  implicit class ToProxyScriptOps[Self <: ToProxyScript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeTlsChannelId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTlsChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTlsChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTlsChannelId")(js.undefined)
        ret
    }
    @scala.inline
    def withToProxyScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toProxyScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToProxyScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toProxyScript")(js.undefined)
        ret
    }
  }
  
}

