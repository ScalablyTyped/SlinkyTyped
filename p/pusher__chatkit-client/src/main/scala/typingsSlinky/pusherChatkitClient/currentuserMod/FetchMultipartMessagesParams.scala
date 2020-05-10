package typingsSlinky.pusherChatkitClient.currentuserMod

import typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.newer
import typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.older
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMultipartMessagesParams extends js.Object {
  var direction: js.UndefOr[older | newer] = js.native
  var initialId: js.UndefOr[Double] = js.native
  var limit: js.UndefOr[Double] = js.native
  var roomId: String = js.native
}

object FetchMultipartMessagesParams {
  @scala.inline
  def apply(roomId: String): FetchMultipartMessagesParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMultipartMessagesParams]
  }
  @scala.inline
  implicit class FetchMultipartMessagesParamsOps[Self <: FetchMultipartMessagesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoomId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: older | newer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialId")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
  }
  
}

