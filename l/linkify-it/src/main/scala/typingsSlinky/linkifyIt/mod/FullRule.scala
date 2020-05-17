package typingsSlinky.linkifyIt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullRule extends Rule {
  var normalize: js.UndefOr[js.Function1[/* match */ Match, Unit]] = js.native
  var validate: String | js.RegExp | Validate = js.native
}

object FullRule {
  @scala.inline
  def apply(validate: String | js.RegExp | Validate): FullRule = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullRule]
  }
  @scala.inline
  implicit class FullRuleOps[Self <: FullRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidateRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateFunction3(value: (/* text */ String, /* pos */ Double, /* self */ LinkifyIt) => Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withValidate(value: String | js.RegExp | Validate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalize(value: /* match */ Match => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
  }
  
}

