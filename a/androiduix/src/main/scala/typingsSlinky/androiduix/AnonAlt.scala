package typingsSlinky.androiduix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlt extends js.Object {
  var noMeta: Anon186 = js.native
  var shift: Anon186 = js.native
}

object AnonAlt {
  @scala.inline
  def apply(noMeta: Anon186, shift: Anon186): AnonAlt = {
    val __obj = js.Dynamic.literal(noMeta = noMeta.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlt]
  }
  @scala.inline
  implicit class AnonAltOps[Self <: AnonAlt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoMeta(value: Anon186): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift(value: Anon186): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

