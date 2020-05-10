package typingsSlinky.awsLambda.lexMod

import typingsSlinky.awsLambda.awsLambdaStrings.Close
import typingsSlinky.awsLambda.awsLambdaStrings.Failed_
import typingsSlinky.awsLambda.awsLambdaStrings.Fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexDialogActionClose
  extends LexDialogActionBase
     with LexDialogAction {
  var fulfillmentState: Fulfilled | Failed_ = js.native
  @JSName("type")
  var type_LexDialogActionClose: Close = js.native
}

object LexDialogActionClose {
  @scala.inline
  def apply(fulfillmentState: Fulfilled | Failed_, `type`: Close): LexDialogActionClose = {
    val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionClose]
  }
  @scala.inline
  implicit class LexDialogActionCloseOps[Self <: LexDialogActionClose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFulfillmentState(value: Fulfilled | Failed_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Close): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

