package typingsSlinky.plugapi.mod.Event

import typingsSlinky.plugapi.mod.User.DJ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DJListUpdate extends js.Object {
  var djs: js.Array[DJ] = js.native
  var remove: String = js.native
}

object DJListUpdate {
  @scala.inline
  def apply(djs: js.Array[DJ], remove: String): DJListUpdate = {
    val __obj = js.Dynamic.literal(djs = djs.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[DJListUpdate]
  }
  @scala.inline
  implicit class DJListUpdateOps[Self <: DJListUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDjs(value: js.Array[DJ]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("djs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

