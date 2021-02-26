package typingsSlinky.htmlValidator.mod

import typingsSlinky.htmlValidator.htmlValidatorStrings.`non-document-error`
import typingsSlinky.htmlValidator.htmlValidatorStrings.internal
import typingsSlinky.htmlValidator.htmlValidatorStrings.io
import typingsSlinky.htmlValidator.htmlValidatorStrings.schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationMessageBasicNonDocumentErrorObject extends StObject {
  
  var subType: js.UndefOr[internal | io | schema] = js.native
  
  var `type`: `non-document-error` = js.native
}
object ValidationMessageBasicNonDocumentErrorObject {
  
  @scala.inline
  def apply(`type`: `non-document-error`): ValidationMessageBasicNonDocumentErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicNonDocumentErrorObject]
  }
  
  @scala.inline
  implicit class ValidationMessageBasicNonDocumentErrorObjectMutableBuilder[Self <: ValidationMessageBasicNonDocumentErrorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubType(value: internal | io | schema): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    @scala.inline
    def setType(value: `non-document-error`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
