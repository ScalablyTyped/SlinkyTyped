package typingsSlinky.awsLambda.lexMod

import typingsSlinky.awsLambda.awsLambdaStrings.ElicitIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexDialogActionElicitIntent
  extends LexDialogActionBase
     with LexDialogAction {
  @JSName("type")
  var type_LexDialogActionElicitIntent: ElicitIntent = js.native
}

object LexDialogActionElicitIntent {
  @scala.inline
  def apply(`type`: ElicitIntent): LexDialogActionElicitIntent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionElicitIntent]
  }
  @scala.inline
  implicit class LexDialogActionElicitIntentOps[Self <: LexDialogActionElicitIntent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ElicitIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

