package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkinEntry extends js.Object {
  var attachment: Attachment = js.native
  var name: String = js.native
  var slotIndex: Double = js.native
}

object SkinEntry {
  @scala.inline
  def apply(attachment: Attachment, name: String, slotIndex: Double): SkinEntry = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinEntry]
  }
  @scala.inline
  implicit class SkinEntryOps[Self <: SkinEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlotIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

