package typingsSlinky.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStringValidator extends IPropertyValidator {
  def isAcceptable(s: String): Boolean = js.native
}

object IStringValidator {
  @scala.inline
  def apply(isAcceptable: String => Boolean): IStringValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable))
    __obj.asInstanceOf[IStringValidator]
  }
  @scala.inline
  implicit class IStringValidatorOps[Self <: IStringValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAcceptable(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAcceptable")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

