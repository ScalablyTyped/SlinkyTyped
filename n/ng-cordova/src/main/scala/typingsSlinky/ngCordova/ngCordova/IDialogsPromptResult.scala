package typingsSlinky.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogsPromptResult extends js.Object {
  var buttonIndex: Double = js.native
  var input1: String = js.native
}

object IDialogsPromptResult {
  @scala.inline
  def apply(buttonIndex: Double, input1: String): IDialogsPromptResult = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], input1 = input1.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogsPromptResult]
  }
  @scala.inline
  implicit class IDialogsPromptResultOps[Self <: IDialogsPromptResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input1")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

