package typingsSlinky.awsLambda.lexMod

import typingsSlinky.awsLambda.anon.Content
import typingsSlinky.awsLambda.anon.ContentType
import typingsSlinky.awsLambda.awsLambdaStrings.Close
import typingsSlinky.awsLambda.awsLambdaStrings.ConfirmIntent
import typingsSlinky.awsLambda.awsLambdaStrings.ElicitIntent
import typingsSlinky.awsLambda.awsLambdaStrings.ElicitSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionBase extends js.Object {
  var message: js.UndefOr[Content] = js.undefined
  var responseCard: js.UndefOr[ContentType] = js.undefined
  var `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent
}

object LexDialogActionBase {
  @scala.inline
  def apply(
    `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent,
    message: Content = null,
    responseCard: ContentType = null
  ): LexDialogActionBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionBase]
  }
}

