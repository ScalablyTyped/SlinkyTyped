package typingsSlinky.awsDashLambda.awsDashLambdaMod

import typingsSlinky.awsDashLambda.Anon_Applicationvndamazonawscardgeneric
import typingsSlinky.awsDashLambda.Anon_Content
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.ElicitIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionElicitIntent
  extends LexDialogActionBase
     with LexDialogAction {
  @JSName("type")
  var type_LexDialogActionElicitIntent: ElicitIntent
}

object LexDialogActionElicitIntent {
  @scala.inline
  def apply(
    `type`: ElicitIntent,
    message: Anon_Content = null,
    responseCard: Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogActionElicitIntent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionElicitIntent]
  }
}

