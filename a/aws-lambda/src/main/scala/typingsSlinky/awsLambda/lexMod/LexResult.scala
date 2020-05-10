package typingsSlinky.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexResult extends js.Object {
  var dialogAction: LexDialogAction = js.native
  var sessionAttributes: js.UndefOr[StringDictionary[String]] = js.native
}

object LexResult {
  @scala.inline
  def apply(dialogAction: LexDialogAction): LexResult = {
    val __obj = js.Dynamic.literal(dialogAction = dialogAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexResult]
  }
  @scala.inline
  implicit class LexResultOps[Self <: LexResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogAction(value: LexDialogAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionAttributes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAttributes")(js.undefined)
        ret
    }
  }
  
}

