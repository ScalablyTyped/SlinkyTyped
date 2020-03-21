package typingsSlinky.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.AnonContent
import typingsSlinky.awsLambda.AnonContentType
import typingsSlinky.awsLambda.awsLambdaStrings.Close
import typingsSlinky.awsLambda.awsLambdaStrings.ConfirmIntent
import typingsSlinky.awsLambda.awsLambdaStrings.Delegate
import typingsSlinky.awsLambda.awsLambdaStrings.ElicitIntent
import typingsSlinky.awsLambda.awsLambdaStrings.ElicitSlot
import typingsSlinky.awsLambda.awsLambdaStrings.Failed_
import typingsSlinky.awsLambda.awsLambdaStrings.Fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.lexMod.LexDialogActionClose
  - typingsSlinky.awsLambda.lexMod.LexDialogActionElicitIntent
  - typingsSlinky.awsLambda.lexMod.LexDialogActionElicitSlot
  - typingsSlinky.awsLambda.lexMod.LexDialogActionConfirmIntent
  - typingsSlinky.awsLambda.lexMod.LexDialogActionDelegate
*/
trait LexDialogAction extends js.Object

object LexDialogAction {
  @scala.inline
  def LexDialogActionElicitIntent(`type`: ElicitIntent, message: AnonContent = null, responseCard: AnonContentType = null): LexDialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionDelegate(slots: StringDictionary[String | Null], `type`: Delegate): LexDialogAction = {
    val __obj = js.Dynamic.literal(slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionConfirmIntent(
    intentName: String,
    slots: StringDictionary[String | Null],
    `type`: ConfirmIntent,
    message: AnonContent = null,
    responseCard: AnonContentType = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionElicitSlot(
    intentName: String,
    slotToElicit: String,
    slots: StringDictionary[String | Null],
    `type`: ElicitSlot,
    message: AnonContent = null,
    responseCard: AnonContentType = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slotToElicit = slotToElicit.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionClose(
    fulfillmentState: Fulfilled | Failed_,
    `type`: Close,
    message: AnonContent = null,
    responseCard: AnonContentType = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
}

