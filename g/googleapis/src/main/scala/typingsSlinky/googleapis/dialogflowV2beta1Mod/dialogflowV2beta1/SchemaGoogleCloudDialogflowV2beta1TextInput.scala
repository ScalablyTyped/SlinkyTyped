package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the natural language text to be processed.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1TextInput extends StObject {
  
  /**
    * Required. The language of this conversational query. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes. Note that queries
    * in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Required. The UTF-8 encoded natural language text to be processed. Text
    * length must not exceed 256 characters.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1TextInput {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1TextInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1TextInput]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1TextInputMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1TextInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
