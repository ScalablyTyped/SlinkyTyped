package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accounts to search
  */
@js.native
trait SchemaHangoutsChatInfo extends js.Object {
  /**
    * A set of rooms to search.
    */
  var roomId: js.UndefOr[js.Array[String]] = js.native
}

object SchemaHangoutsChatInfo {
  @scala.inline
  def apply(): SchemaHangoutsChatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutsChatInfo]
  }
  @scala.inline
  implicit class SchemaHangoutsChatInfoOps[Self <: SchemaHangoutsChatInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoomId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomId")(js.undefined)
        ret
    }
  }
  
}

