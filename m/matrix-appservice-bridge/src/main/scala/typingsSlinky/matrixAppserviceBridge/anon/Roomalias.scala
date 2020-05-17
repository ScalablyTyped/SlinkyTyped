package typingsSlinky.matrixAppserviceBridge.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Roomalias extends js.Object {
  var room_alias: js.UndefOr[String] = js.native
  var room_id: String = js.native
}

object Roomalias {
  @scala.inline
  def apply(room_id: String): Roomalias = {
    val __obj = js.Dynamic.literal(room_id = room_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Roomalias]
  }
  @scala.inline
  implicit class RoomaliasOps[Self <: Roomalias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoom_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoom_alias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room_alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoom_alias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room_alias")(js.undefined)
        ret
    }
  }
  
}

