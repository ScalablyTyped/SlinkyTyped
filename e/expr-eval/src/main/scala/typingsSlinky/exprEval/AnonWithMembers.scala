package typingsSlinky.exprEval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWithMembers extends js.Object {
  var withMembers: js.UndefOr[Boolean] = js.native
}

object AnonWithMembers {
  @scala.inline
  def apply(): AnonWithMembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonWithMembers]
  }
  @scala.inline
  implicit class AnonWithMembersOps[Self <: AnonWithMembers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithMembers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMembers")(js.undefined)
        ret
    }
  }
  
}

