package typingsSlinky.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Immediate extends js.Object {
  var immediate: Boolean = js.native
}

object Immediate {
  @scala.inline
  def apply(immediate: Boolean): Immediate = {
    val __obj = js.Dynamic.literal(immediate = immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immediate]
  }
  @scala.inline
  implicit class ImmediateOps[Self <: Immediate] (val x: Self) extends AnyVal {
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

