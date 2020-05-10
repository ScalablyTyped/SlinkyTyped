package typingsSlinky.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImmediate extends js.Object {
  var immediate: Boolean = js.native
}

object AnonImmediate {
  @scala.inline
  def apply(immediate: Boolean): AnonImmediate = {
    val __obj = js.Dynamic.literal(immediate = immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImmediate]
  }
  @scala.inline
  implicit class AnonImmediateOps[Self <: AnonImmediate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

