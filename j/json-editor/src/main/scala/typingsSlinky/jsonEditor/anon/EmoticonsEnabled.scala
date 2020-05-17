package typingsSlinky.jsonEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmoticonsEnabled extends js.Object {
  var emoticonsEnabled: Boolean = js.native
}

object EmoticonsEnabled {
  @scala.inline
  def apply(emoticonsEnabled: Boolean): EmoticonsEnabled = {
    val __obj = js.Dynamic.literal(emoticonsEnabled = emoticonsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmoticonsEnabled]
  }
  @scala.inline
  implicit class EmoticonsEnabledOps[Self <: EmoticonsEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmoticonsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoticonsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

