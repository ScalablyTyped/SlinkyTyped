package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReplacementroom extends js.Object {
  var replacement_room: js.Object = js.native
}

object AnonReplacementroom {
  @scala.inline
  def apply(replacement_room: js.Object): AnonReplacementroom = {
    val __obj = js.Dynamic.literal(replacement_room = replacement_room.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReplacementroom]
  }
  @scala.inline
  implicit class AnonReplacementroomOps[Self <: AnonReplacementroom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplacement_room(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement_room")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

