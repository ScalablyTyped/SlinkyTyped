package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomClientAddress extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomClientAddress. */
  var kind: js.UndefOr[String] = js.native
  /** The XMPP address of the client on the Google Games XMPP network. */
  var xmppAddress: js.UndefOr[String] = js.native
}

object RoomClientAddress {
  @scala.inline
  def apply(): RoomClientAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomClientAddress]
  }
  @scala.inline
  implicit class RoomClientAddressOps[Self <: RoomClientAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withXmppAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmppAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmppAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmppAddress")(js.undefined)
        ret
    }
  }
  
}

