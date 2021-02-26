package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2EventInput extends StObject {
  
  /**
    * Required. The language of this query. See [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of the currently supported language codes. Note
    * that queries in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Required. The unique identifier of the event. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The collection of parameters associated with the event. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON
    * object composed of a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter's entity type is a composite
    * entity: map - Else: string or number, depending on parameter value type - MapValue value: - If parameter's entity type is a composite entity: map from composite entity property
    * names to property values - Else: parameter value
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2EventInput with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudDialogflowV2EventInput {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2EventInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2EventInput]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2EventInputMutableBuilder[Self <: GoogleCloudDialogflowV2EventInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2EventInput with TopLevel[js.Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
