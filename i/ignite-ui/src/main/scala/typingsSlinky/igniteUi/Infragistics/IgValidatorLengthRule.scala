package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgValidatorLengthRule extends js.Object {
  /**
  	 * Formats an error message using rule-specific values (usually from formatItems).
  	 *
  	 * @param message The unformatted error message the validator intends to display.
  	 */
  def formatMessage(message: String): String = js.native
  def getMessageType(): Unit = js.native
  /**
  	 * Gets an errorMessage from either the rule or field/global options.
  	 *
  	 * @param options
  	 */
  def getRuleMessage(options: js.Object): String = js.native
  def isValid(options: js.Object, value: js.Object): Unit = js.native
  /**
  	 * Checks if rule should run on the current field and/or value.
  	 *
  	 * @param options Options for the validator, if fields are used this parameter is already populated with inherited ones.
  	 * @param value The stringified value to check.
  	 */
  def shouldRun(options: js.Object, value: String): Boolean = js.native
}

object IgValidatorLengthRule {
  @scala.inline
  def apply(
    formatMessage: String => String,
    getMessageType: () => Unit,
    getRuleMessage: js.Object => String,
    isValid: (js.Object, js.Object) => Unit,
    shouldRun: (js.Object, String) => Boolean
  ): IgValidatorLengthRule = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), getMessageType = js.Any.fromFunction0(getMessageType), getRuleMessage = js.Any.fromFunction1(getRuleMessage), isValid = js.Any.fromFunction2(isValid), shouldRun = js.Any.fromFunction2(shouldRun))
    __obj.asInstanceOf[IgValidatorLengthRule]
  }
  @scala.inline
  implicit class IgValidatorLengthRuleOps[Self <: IgValidatorLengthRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatMessage(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMessageType(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRuleMessage(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRuleMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsValid(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShouldRun(value: (js.Object, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRun")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

