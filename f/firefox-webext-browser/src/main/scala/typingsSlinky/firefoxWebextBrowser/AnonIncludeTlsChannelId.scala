package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeTlsChannelId extends js.Object {
  /**
    * Whether the TLS channel ID will be passed into onConnectExternal for processes that are listening for the
    * connection event.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.native
  /** Will be passed into onConnect for processes that are listening for the connection event. */
  var name: js.UndefOr[String] = js.native
}

object AnonIncludeTlsChannelId {
  @scala.inline
  def apply(): AnonIncludeTlsChannelId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIncludeTlsChannelId]
  }
  @scala.inline
  implicit class AnonIncludeTlsChannelIdOps[Self <: AnonIncludeTlsChannelId] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

