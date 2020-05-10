package typingsSlinky.ejWebAll.ej.ColorPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonText extends js.Object {
  /** Sets the text for the apply button.
    */
  @JSName("apply")
  var apply: js.UndefOr[String] = js.native
  /** Sets the text for the cancel button.
    */
  var cancel: js.UndefOr[String] = js.native
  /** Sets the header text for the swatches area.
    */
  var swatches: js.UndefOr[String] = js.native
}

object ButtonText {
  @scala.inline
  def apply(): ButtonText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonText]
  }
  @scala.inline
  implicit class ButtonTextOps[Self <: ButtonText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withSwatches(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatches")(js.undefined)
        ret
    }
  }
  
}

