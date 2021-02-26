package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2Argument extends StObject {
  
  /**
    * Specified when query pattern includes a `$org.schema.type.YesNo` type or
    * expected input has a built-in intent: `actions.intent.CONFIRMATION`.
    * NOTE: if the boolean value is missing, it represents `false`.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /**
    * Specified for the built-in intent: `actions.intent.DATETIME`.
    */
  var datetimeValue: js.UndefOr[GoogleActionsV2DateTime] = js.native
  
  /**
    * Extension whose type depends on the argument.
    * For example, if the argument name is `SIGN_IN` for the
    * `actions.intent.SIGN_IN` intent, then this extension will
    * contain a SignInValue value.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Specified for built-in intent: \"actions.intent.NUMBER\"
    */
  var floatValue: js.UndefOr[Double] = js.native
  
  /**
    * Specified when query pattern includes a $org.schema.type.Number type or
    * expected input has a built-in intent: \"assistant.intent.action.NUMBER\".
    */
  var intValue: js.UndefOr[String] = js.native
  
  /**
    * Name of the argument being provided for the input.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specified when query pattern includes a $org.schema.type.Location type or
    * expected input has a built-in intent: \"actions.intent.PLACE\".
    */
  var placeValue: js.UndefOr[GoogleActionsV2Location] = js.native
  
  /**
    * The raw text, typed or spoken, that provided the value for the argument.
    */
  var rawText: js.UndefOr[String] = js.native
  
  /**
    * Specified when an error was encountered while computing the argument. For
    * example, the built-in intent \"actions.intent.PLACE\" can return an error
    * status if the user denied the permission to access their device location.
    */
  var status: js.UndefOr[GoogleRpcStatus] = js.native
  
  /**
    * Specified when Google needs to pass data value in JSON format.
    */
  var structuredValue: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Specified when query pattern includes a `$org.schema.type.Text` type or
    * expected input has a built-in intent: `actions.intent.TEXT`, or
    * `actions.intent.OPTION`. Note that for the `OPTION` intent, we set the
    * `text_value` as option key, the `raw_text` above will indicate the raw
    * span in user's query.
    */
  var textValue: js.UndefOr[String] = js.native
}
object GoogleActionsV2Argument {
  
  @scala.inline
  def apply(): GoogleActionsV2Argument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Argument]
  }
  
  @scala.inline
  implicit class GoogleActionsV2ArgumentMutableBuilder[Self <: GoogleActionsV2Argument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setDatetimeValue(value: GoogleActionsV2DateTime): Self = StObject.set(x, "datetimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetimeValueUndefined: Self = StObject.set(x, "datetimeValue", js.undefined)
    
    @scala.inline
    def setExtension(value: ApiClientObjectMap[_]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatValueUndefined: Self = StObject.set(x, "floatValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlaceValue(value: GoogleActionsV2Location): Self = StObject.set(x, "placeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceValueUndefined: Self = StObject.set(x, "placeValue", js.undefined)
    
    @scala.inline
    def setRawText(value: String): Self = StObject.set(x, "rawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawTextUndefined: Self = StObject.set(x, "rawText", js.undefined)
    
    @scala.inline
    def setStatus(value: GoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStructuredValue(value: ApiClientObjectMap[_]): Self = StObject.set(x, "structuredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuredValueUndefined: Self = StObject.set(x, "structuredValue", js.undefined)
    
    @scala.inline
    def setTextValue(value: String): Self = StObject.set(x, "textValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextValueUndefined: Self = StObject.set(x, "textValue", js.undefined)
  }
}
