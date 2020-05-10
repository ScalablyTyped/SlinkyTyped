package typingsSlinky.bootstrap.mod

import typingsSlinky.bootstrap.bootstrapStrings.static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalOption extends js.Object {
  /**
    * Includes a modal-backdrop element.
    * Alternatively, specify `static` for a backdrop which doesn't close the modal on click.
    *
    * @default true
    */
  var backdrop: js.UndefOr[Boolean | static] = js.native
  /**
    * Puts the focus on the modal when initialized.
    *
    * @default true
    */
  var focus: js.UndefOr[Boolean] = js.native
  /**
    * Closes the modal when escape key is pressed.
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * Shows the modal when initialized.
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.native
}

object ModalOption {
  @scala.inline
  def apply(): ModalOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOption]
  }
  @scala.inline
  implicit class ModalOptionOps[Self <: ModalOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackdrop(value: Boolean | static): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

