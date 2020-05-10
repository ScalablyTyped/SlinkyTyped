package typingsSlinky.officeUiFabricReact.modalBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogState extends js.Object {
  var hasBeenOpened: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var isInKeyboardMoveMode: js.UndefOr[Boolean] = js.native
  var isModalMenuOpen: js.UndefOr[Boolean] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var isVisible: js.UndefOr[Boolean] = js.native
  var isVisibleClose: js.UndefOr[Boolean] = js.native
  var modalRectangleTop: js.UndefOr[Double] = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object IDialogState {
  @scala.inline
  def apply(x: Double, y: Double): IDialogState = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogState]
  }
  @scala.inline
  implicit class IDialogStateOps[Self <: IDialogState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBeenOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBeenOpened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBeenOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBeenOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInKeyboardMoveMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInKeyboardMoveMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInKeyboardMoveMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInKeyboardMoveMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModalMenuOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModalMenuOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModalMenuOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModalMenuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVisibleClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisibleClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVisibleClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisibleClose")(js.undefined)
        ret
    }
    @scala.inline
    def withModalRectangleTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalRectangleTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalRectangleTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalRectangleTop")(js.undefined)
        ret
    }
  }
  
}

