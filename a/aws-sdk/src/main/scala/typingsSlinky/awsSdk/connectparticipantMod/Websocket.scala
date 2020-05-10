package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Websocket extends js.Object {
  /**
    * The URL expiration timestamp in ISO date format. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var ConnectionExpiry: js.UndefOr[ISO8601Datetime] = js.native
  /**
    * The URL of the websocket.
    */
  var Url: js.UndefOr[PreSignedConnectionUrl] = js.native
}

object Websocket {
  @scala.inline
  def apply(): Websocket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Websocket]
  }
  @scala.inline
  implicit class WebsocketOps[Self <: Websocket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionExpiry(value: ISO8601Datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionExpiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionExpiry")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: PreSignedConnectionUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

