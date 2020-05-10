package typingsSlinky.officeUiFabricReact.modalTypesMod

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragOptions extends js.Object {
  /**
    * The text to use for the modal close menu item
    */
  var closeMenuItemText: String = js.native
  /**
    * Optional selector for the element where the drag can be initiated. If not supplied when
    * isDraggable is true dragging can be initated by the whole contents of the modal
    */
  var dragHandleSelector: js.UndefOr[String] = js.native
  /**
    * IconProps for the icon used to indicate that the dialog is in keyboard move mode
    */
  var keyboardMoveIconProps: js.UndefOr[IIconProps] = js.native
  /**
    * The Draggable Control Menu so that the draggable zone can be moved via the keyboard
    */
  var menu: ReactComponentClass[IContextualMenuProps] = js.native
  /**
    * The text to use for the modal move menu item
    */
  var moveMenuItemText: String = js.native
}

object IDragOptions {
  @scala.inline
  def apply(
    closeMenuItemText: String,
    menu: ReactComponentClass[IContextualMenuProps],
    moveMenuItemText: String
  ): IDragOptions = {
    val __obj = js.Dynamic.literal(closeMenuItemText = closeMenuItemText.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], moveMenuItemText = moveMenuItemText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragOptions]
  }
  @scala.inline
  implicit class IDragOptionsOps[Self <: IDragOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseMenuItemText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMenuItemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: ReactComponentClass[IContextualMenuProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveMenuItemText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveMenuItemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragHandleSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandleSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragHandleSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandleSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardMoveIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardMoveIconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardMoveIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardMoveIconProps")(js.undefined)
        ret
    }
  }
  
}

