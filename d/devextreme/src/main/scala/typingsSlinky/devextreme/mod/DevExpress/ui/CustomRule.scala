package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.Column
import typingsSlinky.devextreme.devextremeStrings.async
import typingsSlinky.devextreme.devextremeStrings.compare
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.email
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.pattern
import typingsSlinky.devextreme.devextremeStrings.range
import typingsSlinky.devextreme.devextremeStrings.required
import typingsSlinky.devextreme.devextremeStrings.stringLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomRule extends js.Object {
  /** If true, the validationCallback is not executed for null, undefined, false, and empty strings. */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.native
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.native
  /** Indicates whether the rule should be always checked for the target value or only when the target value changes. */
  var reevaluate: js.UndefOr[Boolean] = js.native
  /** Specifies the rule type. Set it to "custom" to use the CustomRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.native
  /** A function that validates the target value. */
  var validationCallback: js.UndefOr[js.Function1[/* options */ Column, Boolean]] = js.native
}

object CustomRule {
  @scala.inline
  def apply(): CustomRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRule]
  }
  @scala.inline
  implicit class CustomRuleOps[Self <: CustomRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreEmptyValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEmptyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withReevaluate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reevaluate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReevaluate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reevaluate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: required | numeric | range | stringLength | custom | compare | pattern | email | async): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationCallback(value: /* options */ Column => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidationCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationCallback")(js.undefined)
        ret
    }
  }
  
}

