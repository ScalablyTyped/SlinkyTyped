package typingsSlinky.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.awsLambdaStrings.Confirmed_
import typingsSlinky.awsLambda.awsLambdaStrings.Denied
import typingsSlinky.awsLambda.awsLambdaStrings.None
import typingsSlinky.awsLambda.lexMod.LexSlotDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmationStatus extends js.Object {
  var confirmationStatus: None | Confirmed_ | Denied
  var name: String
  var slotDetails: LexSlotDetails
  var slots: StringDictionary[String | Null]
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
}

