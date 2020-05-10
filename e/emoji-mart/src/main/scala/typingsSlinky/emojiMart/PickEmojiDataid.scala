package typingsSlinky.emojiMart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<emoji-mart.emoji-mart/dist-es.EmojiData, 'id'> */
@js.native
trait PickEmojiDataid extends js.Object {
  var id: js.Any = js.native
}

object PickEmojiDataid {
  @scala.inline
  def apply(id: js.Any): PickEmojiDataid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickEmojiDataid]
  }
  @scala.inline
  implicit class PickEmojiDataidOps[Self <: PickEmojiDataid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

