package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait ParagraphTextValidationBuilder extends StObject {
  
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
  implicit class ParagraphTextValidationBuilderMutableBuilder[Self <: ParagraphTextValidationBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequireTextContainsPattern(value: String => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextContainsPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextDoesNotContainPattern(value: String => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextDoesNotContainPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextDoesNotMatchPattern(value: String => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextDoesNotMatchPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextLengthGreaterThanOrEqualTo(value: Integer => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextLengthGreaterThanOrEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextLengthLessThanOrEqualTo(value: Integer => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextLengthLessThanOrEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextMatchesPattern(value: String => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextMatchesPattern", js.Any.fromFunction1(value))
  }
}
