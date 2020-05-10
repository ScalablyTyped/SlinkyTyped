package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a ParagraphTextValidation.
  *
  *     // Add a paragraph text item to a form and require the answer to be at least 100 characters.
  *     var paragraphTextItem = form.addParagraphTextItem().setTitle('Describe yourself:');
  *     var paragraphtextValidation = FormApp.createParagraphTextValidation()
  *       .setHelpText(“Answer must be more than 100 characters.”)
  *       .requireTextLengthGreatherThan(100);
  *     paragraphTextItem.setValidation(paragraphtextValidation);
  */
@js.native
trait ParagraphTextValidationBuilder extends js.Object {
  def requireTextContainsPattern(pattern: String): ParagraphTextValidationBuilder = js.native
  def requireTextDoesNotContainPattern(pattern: String): ParagraphTextValidationBuilder = js.native
  def requireTextDoesNotMatchPattern(pattern: String): ParagraphTextValidationBuilder = js.native
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder = js.native
  def requireTextLengthLessThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder = js.native
  def requireTextMatchesPattern(pattern: String): ParagraphTextValidationBuilder = js.native
}

object ParagraphTextValidationBuilder {
  @scala.inline
  def apply(
    requireTextContainsPattern: String => ParagraphTextValidationBuilder,
    requireTextDoesNotContainPattern: String => ParagraphTextValidationBuilder,
    requireTextDoesNotMatchPattern: String => ParagraphTextValidationBuilder,
    requireTextLengthGreaterThanOrEqualTo: Integer => ParagraphTextValidationBuilder,
    requireTextLengthLessThanOrEqualTo: Integer => ParagraphTextValidationBuilder,
    requireTextMatchesPattern: String => ParagraphTextValidationBuilder
  ): ParagraphTextValidationBuilder = {
    val __obj = js.Dynamic.literal(requireTextContainsPattern = js.Any.fromFunction1(requireTextContainsPattern), requireTextDoesNotContainPattern = js.Any.fromFunction1(requireTextDoesNotContainPattern), requireTextDoesNotMatchPattern = js.Any.fromFunction1(requireTextDoesNotMatchPattern), requireTextLengthGreaterThanOrEqualTo = js.Any.fromFunction1(requireTextLengthGreaterThanOrEqualTo), requireTextLengthLessThanOrEqualTo = js.Any.fromFunction1(requireTextLengthLessThanOrEqualTo), requireTextMatchesPattern = js.Any.fromFunction1(requireTextMatchesPattern))
    __obj.asInstanceOf[ParagraphTextValidationBuilder]
  }
  @scala.inline
  implicit class ParagraphTextValidationBuilderOps[Self <: ParagraphTextValidationBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequireTextContainsPattern(value: String => ParagraphTextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextContainsPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextDoesNotContainPattern(value: String => ParagraphTextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextDoesNotContainPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextDoesNotMatchPattern(value: String => ParagraphTextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextDoesNotMatchPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextLengthGreaterThanOrEqualTo(value: Integer => ParagraphTextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextLengthGreaterThanOrEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextLengthLessThanOrEqualTo(value: Integer => ParagraphTextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextLengthLessThanOrEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireTextMatchesPattern(value: String => ParagraphTextValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTextMatchesPattern")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

