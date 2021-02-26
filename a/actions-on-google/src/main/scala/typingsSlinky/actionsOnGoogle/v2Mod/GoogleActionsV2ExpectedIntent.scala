package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2ExpectedIntent extends StObject {
  
  /**
    * Additional configuration data required by a built-in intent. Possible
    * values for the built-in intents: `actions.intent.OPTION ->`
    * [google.actions.v2.OptionValueSpec], `actions.intent.CONFIRMATION ->`
    * [google.actions.v2.ConfirmationValueSpec],
    * `actions.intent.TRANSACTION_REQUIREMENTS_CHECK ->`
    * [google.actions.v2.TransactionRequirementsCheckSpec],
    * `actions.intent.DELIVERY_ADDRESS ->`
    * [google.actions.v2.DeliveryAddressValueSpec],
    * `actions.intent.TRANSACTION_DECISION ->`
    * [google.actions.v2.TransactionDecisionValueSpec],
    * `actions.intent.PLACE ->`
    * [google.actions.v2.PlaceValueSpec],
    * `actions.intent.Link ->`
    * [google.actions.v2.LinkValueSpec]
    */
  var inputValueData: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * The built-in intent name, e.g. `actions.intent.TEXT`, or intents
    * defined in the action package. If the intent specified is not a built-in
    * intent, it is only used for speech biasing and the input provided by the
    * Google Assistant will be the `actions.intent.TEXT` intent.
    */
  var intent: js.UndefOr[String] = js.native
  
  /**
    * Optionally, a parameter of the intent that is being requested. Only valid
    * for requested intents. Used for speech biasing.
    */
  var parameterName: js.UndefOr[String] = js.native
}
object GoogleActionsV2ExpectedIntent {
  
  @scala.inline
  def apply(): GoogleActionsV2ExpectedIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ExpectedIntent]
  }
  
  @scala.inline
  implicit class GoogleActionsV2ExpectedIntentMutableBuilder[Self <: GoogleActionsV2ExpectedIntent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputValueData(value: ApiClientObjectMap[_]): Self = StObject.set(x, "inputValueData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueDataUndefined: Self = StObject.set(x, "inputValueData", js.undefined)
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    @scala.inline
    def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
  }
}
