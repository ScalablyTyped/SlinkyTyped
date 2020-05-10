package typingsSlinky.awsLambda.lexMod

import typingsSlinky.awsLambda.AnonContent
import typingsSlinky.awsLambda.AnonContentType
import typingsSlinky.awsLambda.awsLambdaStrings.Close
import typingsSlinky.awsLambda.awsLambdaStrings.ConfirmIntent
import typingsSlinky.awsLambda.awsLambdaStrings.ElicitIntent
import typingsSlinky.awsLambda.awsLambdaStrings.ElicitSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexDialogActionBase extends js.Object {
  var message: js.UndefOr[AnonContent] = js.native
  var responseCard: js.UndefOr[AnonContentType] = js.native
  var `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent = js.native
}

object LexDialogActionBase {
  @scala.inline
  def apply(`type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent): LexDialogActionBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionBase]
  }
  @scala.inline
  implicit class LexDialogActionBaseOps[Self <: LexDialogActionBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Close | ElicitIntent | ElicitSlot | ConfirmIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: AnonContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCard(value: AnonContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCard")(js.undefined)
        ret
    }
  }
  
}

