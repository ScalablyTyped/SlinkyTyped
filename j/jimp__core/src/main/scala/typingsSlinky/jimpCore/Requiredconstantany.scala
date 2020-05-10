package typingsSlinky.jimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<{  constant  :any}> */
@js.native
trait Requiredconstantany extends js.Object {
  var constant: js.Any = js.native
}

object Requiredconstantany {
  @scala.inline
  def apply(constant: js.Any): Requiredconstantany = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requiredconstantany]
  }
  @scala.inline
  implicit class RequiredconstantanyOps[Self <: Requiredconstantany] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstant(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constant")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

