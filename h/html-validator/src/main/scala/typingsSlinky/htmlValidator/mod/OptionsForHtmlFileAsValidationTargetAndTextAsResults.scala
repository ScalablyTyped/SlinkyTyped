package typingsSlinky.htmlValidator.mod

import typingsSlinky.htmlValidator.htmlValidatorStrings.gnu
import typingsSlinky.htmlValidator.htmlValidatorStrings.html
import typingsSlinky.htmlValidator.htmlValidatorStrings.text
import typingsSlinky.htmlValidator.htmlValidatorStrings.xhtml
import typingsSlinky.htmlValidator.htmlValidatorStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsForHtmlFileAsValidationTargetAndTextAsResults extends OptionsForHtmlFileAsValidationTarget {
  
  var format: html | xhtml | xml | gnu | text = js.native
}
object OptionsForHtmlFileAsValidationTargetAndTextAsResults {
  
  @scala.inline
  def apply(data: String, format: html | xhtml | xml | gnu | text): OptionsForHtmlFileAsValidationTargetAndTextAsResults = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForHtmlFileAsValidationTargetAndTextAsResults]
  }
  
  @scala.inline
  implicit class OptionsForHtmlFileAsValidationTargetAndTextAsResultsOps[Self <: OptionsForHtmlFileAsValidationTargetAndTextAsResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: html | xhtml | xml | gnu | text): Self = this.set("format", value.asInstanceOf[js.Any])
  }
}
