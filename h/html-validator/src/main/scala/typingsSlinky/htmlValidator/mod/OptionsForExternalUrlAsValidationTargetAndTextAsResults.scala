package typingsSlinky.htmlValidator.mod

import typingsSlinky.htmlValidator.htmlValidatorStrings.gnu
import typingsSlinky.htmlValidator.htmlValidatorStrings.html
import typingsSlinky.htmlValidator.htmlValidatorStrings.text
import typingsSlinky.htmlValidator.htmlValidatorStrings.xhtml
import typingsSlinky.htmlValidator.htmlValidatorStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsForExternalUrlAsValidationTargetAndTextAsResults extends OptionsForHtmlFileAsValidationTarget {
  
  var format: html | xhtml | xml | gnu | text = js.native
}
object OptionsForExternalUrlAsValidationTargetAndTextAsResults {
  
  @scala.inline
  def apply(data: String, format: html | xhtml | xml | gnu | text): OptionsForExternalUrlAsValidationTargetAndTextAsResults = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTargetAndTextAsResults]
  }
  
  @scala.inline
  implicit class OptionsForExternalUrlAsValidationTargetAndTextAsResultsMutableBuilder[Self <: OptionsForExternalUrlAsValidationTargetAndTextAsResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: html | xhtml | xml | gnu | text): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
