package typingsSlinky.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.awsLambdaStrings.Confirmed_
import typingsSlinky.awsLambda.awsLambdaStrings.Denied
import typingsSlinky.awsLambda.awsLambdaStrings.None
import typingsSlinky.awsLambda.lexMod.LexSlotDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmationStatus extends StObject {
  
  var confirmationStatus: None | Confirmed_ | Denied = js.native
  
  var name: String = js.native
  
  var slotDetails: LexSlotDetails = js.native
  
  var slots: StringDictionary[String | Null] = js.native
}
object ConfirmationStatus {
  
  @scala.inline
  def apply(
    confirmationStatus: None | Confirmed_ | Denied,
    name: String,
    slotDetails: LexSlotDetails,
    slots: StringDictionary[String | Null]
  ): ConfirmationStatus = {
    val __obj = js.Dynamic.literal(confirmationStatus = confirmationStatus.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotDetails = slotDetails.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationStatus]
  }
  
  @scala.inline
  implicit class ConfirmationStatusMutableBuilder[Self <: ConfirmationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmationStatus(value: None | Confirmed_ | Denied): Self = StObject.set(x, "confirmationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotDetails(value: LexSlotDetails): Self = StObject.set(x, "slotDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlots(value: StringDictionary[String | Null]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
  }
}
