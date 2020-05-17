package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCorrect extends js.Object {
  @JSName("Access.AutoCorrect_typekey")
  var AccessDotAutoCorrect_typekey: AutoCorrect = js.native
  var DisplayAutoCorrectOptions: Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object AutoCorrect {
  @scala.inline
  def apply(
    AccessDotAutoCorrect_typekey: AutoCorrect,
    DisplayAutoCorrectOptions: Boolean,
    IsMemberSafe: Double => Boolean
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe))
    __obj.updateDynamic("Access.AutoCorrect_typekey")(AccessDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
  @scala.inline
  implicit class AutoCorrectOps[Self <: AutoCorrect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotAutoCorrect_typekey(value: AutoCorrect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.AutoCorrect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayAutoCorrectOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayAutoCorrectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMemberSafe(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberSafe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

