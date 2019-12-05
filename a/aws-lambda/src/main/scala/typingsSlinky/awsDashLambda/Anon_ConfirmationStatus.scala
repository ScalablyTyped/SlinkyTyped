package typingsSlinky.awsDashLambda

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsDashLambda.awsDashLambdaMod.LexSlotDetails
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.Confirmed_
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.Denied
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfirmationStatus extends js.Object {
  var confirmationStatus: None | Confirmed_ | Denied
  var name: String
  var slotDetails: LexSlotDetails
  var slots: StringDictionary[String | Null]
}

object Anon_ConfirmationStatus {
  @scala.inline
  def apply(
    confirmationStatus: None | Confirmed_ | Denied,
    name: String,
    slotDetails: LexSlotDetails,
    slots: StringDictionary[String | Null]
  ): Anon_ConfirmationStatus = {
    val __obj = js.Dynamic.literal(confirmationStatus = confirmationStatus.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotDetails = slotDetails.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ConfirmationStatus]
  }
}

