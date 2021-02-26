package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.Validation client event.
  */
@js.native
trait ASPxClientHtmlEditorValidationEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  var errorText: String = js.native
  
  /**
    * Gets or sets the HTML markup that is the ASPxHtmlEditor's content.
    */
  var html: String = js.native
  
  /**
    * Gets or sets a value specifying whether the validated value is valid.
    */
  var isValid: Boolean = js.native
}
object ASPxClientHtmlEditorValidationEventArgs {
  
  @scala.inline
  def apply(errorText: String, html: String, isValid: Boolean): ASPxClientHtmlEditorValidationEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorValidationEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorValidationEventArgsMutableBuilder[Self <: ASPxClientHtmlEditorValidationEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
  }
}
