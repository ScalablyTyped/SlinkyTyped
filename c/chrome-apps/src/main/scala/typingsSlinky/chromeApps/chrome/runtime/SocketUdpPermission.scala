package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketUdpPermission extends js.Object {
  /**
    * The host:port pattern for bind operations.
    * *:* are allowed
    */
  var bind: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The host:port pattern for joinGroup operations.
    * *:* are allowed
    */
  var multicastMembership: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The host:port pattern for send operations.
    * *:* are allowed
    */
  var send: js.UndefOr[String | js.Array[String]] = js.native
}

object SocketUdpPermission {
  @scala.inline
  def apply(): SocketUdpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketUdpPermission]
  }
  @scala.inline
  implicit class SocketUdpPermissionOps[Self <: SocketUdpPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.undefined)
        ret
    }
    @scala.inline
    def withMulticastMembership(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicastMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulticastMembership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicastMembership")(js.undefined)
        ret
    }
    @scala.inline
    def withSend(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.undefined)
        ret
    }
  }
  
}

