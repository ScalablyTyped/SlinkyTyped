package typingsSlinky.easyJsend.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Partial extends js.Object {
  var partial: Boolean = js.native
}

object Partial {
  @scala.inline
  def apply(partial: Boolean): Partial = {
    val __obj = js.Dynamic.literal(partial = partial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partial]
  }
  @scala.inline
  implicit class PartialOps[Self <: Partial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

