package typingsSlinky.diacritics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBase extends js.Object {
  var base: String = js.native
  var chars: String = js.native
}

object AnonBase {
  @scala.inline
  def apply(base: String, chars: String): AnonBase = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], chars = chars.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase]
  }
  @scala.inline
  implicit class AnonBaseOps[Self <: AnonBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

