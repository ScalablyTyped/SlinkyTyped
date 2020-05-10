package typingsSlinky.officeUiFabricReact.textFieldErrorMessageExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFieldErrorMessageExampleState extends js.Object {
  /**
    * Screen readers will read all errors on a page as soon as they are present,
    * making this demo potentially unpleasant when using a screen reader.
    * Not rendering the controls by default makes for a more pleasant experience.
    */
  var showFields: Boolean = js.native
}

object ITextFieldErrorMessageExampleState {
  @scala.inline
  def apply(showFields: Boolean): ITextFieldErrorMessageExampleState = {
    val __obj = js.Dynamic.literal(showFields = showFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldErrorMessageExampleState]
  }
  @scala.inline
  implicit class ITextFieldErrorMessageExampleStateOps[Self <: ITextFieldErrorMessageExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

