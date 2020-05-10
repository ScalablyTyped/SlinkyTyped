package typingsSlinky.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValidator extends js.Object {
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.native
  var tagName: js.UndefOr[String] = js.native
  def isAcceptable(s: js.Any): Boolean = js.native
}

object IPropertyValidator {
  @scala.inline
  def apply(isAcceptable: js.Any => Boolean): IPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable))
    __obj.asInstanceOf[IPropertyValidator]
  }
  @scala.inline
  implicit class IPropertyValidatorOps[Self <: IPropertyValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAcceptable(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAcceptable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustomMessage(value: (/* config */ js.Any, /* args */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
  }
  
}

