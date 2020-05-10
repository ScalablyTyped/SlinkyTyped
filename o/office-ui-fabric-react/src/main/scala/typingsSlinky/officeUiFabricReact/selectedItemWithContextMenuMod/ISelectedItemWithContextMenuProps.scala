package typingsSlinky.officeUiFabricReact.selectedItemWithContextMenuMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectedItemWithContextMenuProps
  extends IBaseProps[js.Any] {
  var beginEditing: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.native
  var item: IExtendedPersonaProps = js.native
  var menuItems: js.Array[IContextualMenuItem] = js.native
  var renderedItem: ReactElement = js.native
}

object ISelectedItemWithContextMenuProps {
  @scala.inline
  def apply(item: IExtendedPersonaProps, menuItems: js.Array[IContextualMenuItem], renderedItem: ReactElement): ISelectedItemWithContextMenuProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], renderedItem = renderedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectedItemWithContextMenuProps]
  }
  @scala.inline
  implicit class ISelectedItemWithContextMenuPropsOps[Self <: ISelectedItemWithContextMenuProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: IExtendedPersonaProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItems(value: js.Array[IContextualMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedItem(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginEditing(value: /* item */ IExtendedPersonaProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEditing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEditing")(js.undefined)
        ret
    }
  }
  
}

