package typingsSlinky.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequiredOnly extends js.Object {
  var requiredOnly: Boolean = js.native
}

object RequiredOnly {
  @scala.inline
  def apply(requiredOnly: Boolean): RequiredOnly = {
    val __obj = js.Dynamic.literal(requiredOnly = requiredOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOnly]
  }
  @scala.inline
  implicit class RequiredOnlyOps[Self <: RequiredOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequiredOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredOnly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

