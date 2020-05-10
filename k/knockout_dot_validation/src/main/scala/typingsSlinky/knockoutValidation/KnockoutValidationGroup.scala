package typingsSlinky.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationGroup extends js.Object {
  var errors: js.UndefOr[KnockoutValidationErrors] = js.native
  var isAnyMessageShown: js.UndefOr[js.Function0[Boolean]] = js.native
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
}

object KnockoutValidationGroup {
  @scala.inline
  def apply(): KnockoutValidationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationGroup]
  }
  @scala.inline
  implicit class KnockoutValidationGroupOps[Self <: KnockoutValidationGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: KnockoutValidationErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAnyMessageShown(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnyMessageShown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsAnyMessageShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnyMessageShown")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
  }
  
}

