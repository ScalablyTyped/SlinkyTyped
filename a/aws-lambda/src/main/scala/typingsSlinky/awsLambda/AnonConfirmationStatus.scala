package typingsSlinky.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.awsLambdaStrings.Confirmed_
import typingsSlinky.awsLambda.awsLambdaStrings.Denied
import typingsSlinky.awsLambda.awsLambdaStrings.None
import typingsSlinky.awsLambda.lexMod.LexSlotDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfirmationStatus extends js.Object {
  var confirmationStatus: None | Confirmed_ | Denied = js.native
  var name: String = js.native
  var slotDetails: LexSlotDetails = js.native
  var slots: StringDictionary[String | Null] = js.native
}

object AnonConfirmationStatus {
  @scala.inline
  def apply(
    confirmationStatus: None | Confirmed_ | Denied,
    name: String,
    slotDetails: LexSlotDetails,
    slots: StringDictionary[String | Null]
  ): AnonConfirmationStatus = {
    val __obj = js.Dynamic.literal(confirmationStatus = confirmationStatus.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotDetails = slotDetails.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirmationStatus]
  }
  @scala.inline
  implicit class AnonConfirmationStatusOps[Self <: AnonConfirmationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmationStatus(value: None | Confirmed_ | Denied): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlotDetails(value: LexSlotDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlots(value: StringDictionary[String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

