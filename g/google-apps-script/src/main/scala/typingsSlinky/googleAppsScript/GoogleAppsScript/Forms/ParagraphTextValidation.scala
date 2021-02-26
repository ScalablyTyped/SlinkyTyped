package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DataValidation for a ParagraphTextItem.
  *
  *     // Add a paragraph text item to a form and require the answer to be at least 100 characters.
  *     var paragraphTextItem = form.addParagraphTextItem().setTitle('Describe yourself:');
  *     var paragraphtextValidation = FormApp.createParagraphTextValidation()
  *       .setHelpText(“Answer must be more than 100 characters.”)
  *       .requireTextLengthGreatherThan(100);
  *     paragraphTextItem.setValidation(paragraphtextValidation);
  */
// tslint:disable-next-line: no-empty-interface
@js.native
trait ParagraphTextValidation extends StObject
