package typingsSlinky.chance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatted extends js.Object {
  var formatted: Boolean = js.native
}

object Formatted {
  @scala.inline
  def apply(formatted: Boolean): Formatted = {
    val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatted]
  }
  @scala.inline
  implicit class FormattedOps[Self <: Formatted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

