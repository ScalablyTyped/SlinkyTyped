package typingsSlinky.officeUiFabricReact.textFieldMultilineExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFieldMultilineExampleState extends js.Object {
  var multiline: Boolean = js.native
}

object ITextFieldMultilineExampleState {
  @scala.inline
  def apply(multiline: Boolean): ITextFieldMultilineExampleState = {
    val __obj = js.Dynamic.literal(multiline = multiline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldMultilineExampleState]
  }
  @scala.inline
  implicit class ITextFieldMultilineExampleStateOps[Self <: ITextFieldMultilineExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

