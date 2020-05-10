package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a TextValidation.
  *
  *     // Add a text item to a form and require it to be a number within a range.
  *     var textItem = form.addTextItem().setTitle('Pick a number between 1 and 100?');
  *     var textValidation = FormApp.createTextValidation()
  *       .setHelpText(“Input was not a number between 1 and 100.”)
  *       .requireNumberBetween(1, 100);
  *     textItem.setValidation(textValidation);
  */
@js.native
trait TextValidationBuilder extends js.Object {
  def requireNumber(): TextValidationBuilder = js.native
  def requireNumberBetween(start: Double, end: Double): TextValidationBuilder = js.native
  def requireNumberEqualTo(number: Double): TextValidationBuilder = js.native
  def requireNumberGreaterThan(number: Double): TextValidationBuilder = js.native
  def requireNumberGreaterThanOrEqualTo(number: Double): TextValidationBuilder = js.native
  def requireNumberLessThan(number: Double): TextValidationBuilder = js.native
  def requireNumberLessThanOrEqualTo(number: Double): TextValidationBuilder = js.native
  def requireNumberNotBetween(start: Double, end: Double): TextValidationBuilder = js.native
  def requireNumberNotEqualTo(number: Double): TextValidationBuilder = js.native
  def requireTextContainsPattern(pattern: String): TextValidationBuilder = js.native
  def requireTextDoesNotContainPattern(pattern: String): TextValidationBuilder = js.native
  def requireTextDoesNotMatchPattern(pattern: String): TextValidationBuilder = js.native
  def requireTextIsEmail(): TextValidationBuilder = js.native
  def requireTextIsUrl(): TextValidationBuilder = js.native
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): TextValidationBuilder = js.native
  def requireTextLengthLessThanOrEqualTo(number: Integer): TextValidationBuilder = js.native
  def requireTextMatchesPattern(pattern: String): TextValidationBuilder = js.native
  def requireWholeNumber(): TextValidationBuilder = js.native
}

object TextValidationBuilder {
  @scala.inline
  def apply(
    requireNumber: () => TextValidationBuilder,
    requireNumberBetween: (Double, Double) => TextValidationBuilder,
    requireNumberEqualTo: Double => TextValidationBuilder,
    requireNumberGreaterThan: Double => TextValidationBuilder,
    requireNumberGreaterThanOrEqualTo: Double => TextValidationBuilder,
    requireNumberLessThan: Double => TextValidationBuilder,
    requireNumberLessThanOrEqualTo: Double => TextValidationBuilder,
    requireNumberNotBetween: (Double, Double) => TextValidationBuilder,
    requireNumberNotEqualTo: Double => TextValidationBuilder,
    requireTextContainsPattern: String => TextValidationBuilder,
    requireTextDoesNotContainPattern: String => TextValidationBuilder,
    requireTextDoesNotMatchPattern: String => TextValidationBuilder,
    requireTextIsEmail: () => TextValidationBuilder,
    requireTextIsUrl: () => TextValidationBuilder,
    requireTextLengthGreaterThanOrEqualTo: Integer => TextValidationBuilder,
    requireTextLengthLessThanOrEqualTo: Integer => TextValidationBuilder,
    requireTextMatchesPattern: String => TextValidationBuilder,
    requireWholeNumber: () => TextValidationBuilder
  ): TextValidationBuilder = {
    val __obj = js.Dynamic.literal(requireNumber = js.Any.fromFunction0(requireNumber), requireNumberBetween = js.Any.fromFunction2(requireNumberBetween), requireNumberEqualTo = js.Any.fromFunction1(requireNumberEqualTo), requireNumberGreaterThan = js.Any.fromFunction1(requireNumberGreaterThan), requireNumberGreaterThanOrEqualTo = js.Any.fromFunction1(requireNumberGreaterThanOrEqualTo), requireNumberLessThan = js.Any.fromFunction1(requireNumberLessThan), requireNumberLessThanOrEqualTo = js.Any.fromFunction1(requireNumberLessThanOrEqualTo), requireNumberNotBetween = js.Any.fromFunction2(requireNumberNotBetween), requireNumberNotEqualTo = js.Any.fromFunction1(requireNumberNotEqualTo), requireTextContainsPattern = js.Any.fromFunction1(requireTextContainsPattern), requireTextDoesNotContainPattern = js.Any.fromFunction1(requireTextDoesNotContainPattern), requireTextDoesNotMatchPattern = js.Any.fromFunction1(requireTextDoesNotMatchPattern), requireTextIsEmail = js.Any.fromFunction0(requireTextIsEmail), requireTextIsUrl = js.Any.fromFunction0(requireTextIsUrl), requireTextLengthGreaterThanOrEqualTo = js.Any.fromFunction1(requireTextLengthGreaterThanOrEqualTo), requireTextLengthLessThanOrEqualTo = js.Any.fromFunction1(requireTextLengthLessThanOrEqualTo), requireTextMatchesPattern = js.Any.fromFunction1(requireTextMatchesPattern), requireWholeNumber = js.Any.fromFunction0(requireWholeNumber))
    __obj.asInstanceOf[TextValidationBuilder]
  }
  @scala.inline
  implicit class TextValidationBuilderOps[Self <: TextValidationBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequireNumber(value: () => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequireNumberBetween(value: (Double, Double) => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumberBetween")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRequireNumberEqualTo(value: Double => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumberEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireNumberGreaterThan(value: Double => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumberGreaterThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireNumberGreaterThanOrEqualTo(value: Double => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumberGreaterThanOrEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireNumberLessThan(value: Double => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumberLessThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireNumberLessThanOrEqualTo(value: Double => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumberLessThanOrEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireNumberNotBetween(value: (Double, Double) => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumberNotBetween")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRequireNumberNotEqualTo(value: Double => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumberNotEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextContainsPattern(value: String => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextContainsPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextDoesNotContainPattern(value: String => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextDoesNotContainPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextDoesNotMatchPattern(value: String => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextDoesNotMatchPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextIsEmail(value: () => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextIsEmail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequireTextIsUrl(value: () => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextIsUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequireTextLengthGreaterThanOrEqualTo(value: Integer => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextLengthGreaterThanOrEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextLengthLessThanOrEqualTo(value: Integer => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextLengthLessThanOrEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextMatchesPattern(value: String => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextMatchesPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireWholeNumber(value: () => TextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireWholeNumber")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

