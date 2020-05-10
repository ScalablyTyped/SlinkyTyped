package typingsSlinky.reactTether.mod.ReactTether

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEventData extends js.Object {
  var attachment: TetherAttachment = js.native
  var targetAttachment: TetherAttachment = js.native
}

object UpdateEventData {
  @scala.inline
  def apply(attachment: TetherAttachment, targetAttachment: TetherAttachment): UpdateEventData = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], targetAttachment = targetAttachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventData]
  }
  @scala.inline
  implicit class UpdateEventDataOps[Self <: UpdateEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: TetherAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetAttachment(value: TetherAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAttachment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

