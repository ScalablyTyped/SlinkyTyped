package typingsSlinky.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsDashLambda.Anon_Applicationvndamazonawscardgeneric
import typingsSlinky.awsDashLambda.Anon_Content
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.Close
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.ConfirmIntent
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.Delegate
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.ElicitIntent
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.ElicitSlot
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.Failed_
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.Fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsDashLambda.awsDashLambdaMod.LexDialogActionClose
  - typings.awsDashLambda.awsDashLambdaMod.LexDialogActionElicitIntent
  - typings.awsDashLambda.awsDashLambdaMod.LexDialogActionElicitSlot
  - typings.awsDashLambda.awsDashLambdaMod.LexDialogActionConfirmIntent
  - typings.awsDashLambda.awsDashLambdaMod.LexDialogActionDelegate
*/
trait LexDialogAction extends js.Object

object LexDialogAction {
  @scala.inline
  def LexDialogActionClose(
    fulfillmentState: Fulfilled | Failed_,
    `type`: Close,
    message: Anon_Content = null,
    responseCard: Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionElicitIntent(
    `type`: ElicitIntent,
    message: Anon_Content = null,
    responseCard: Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionConfirmIntent(
    intentName: String,
    slots: StringDictionary[String | Null],
    `type`: ConfirmIntent,
    message: Anon_Content = null,
    responseCard: Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
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
  def LexDialogActionElicitSlot(
    intentName: String,
    slotToElicit: String,
    slots: StringDictionary[String | Null],
    `type`: ElicitSlot,
    message: Anon_Content = null,
    responseCard: Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slotToElicit = slotToElicit.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
}

