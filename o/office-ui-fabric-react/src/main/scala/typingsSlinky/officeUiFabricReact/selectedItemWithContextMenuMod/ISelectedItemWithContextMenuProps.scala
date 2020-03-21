package typingsSlinky.officeUiFabricReact.selectedItemWithContextMenuMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectedItemWithContextMenuProps
  extends IBaseProps[js.Any] {
  var beginEditing: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.undefined
  var item: IExtendedPersonaProps
  var menuItems: js.Array[IContextualMenuItem]
  var renderedItem: ReactElement
}

object ISelectedItemWithContextMenuProps {
  @scala.inline
  def apply(
    item: IExtendedPersonaProps,
    menuItems: js.Array[IContextualMenuItem],
    renderedItem: ReactElement,
    beginEditing: /* item */ IExtendedPersonaProps => Unit = null,
    componentRef: IRefObject[js.Any] = null
  ): ISelectedItemWithContextMenuProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], renderedItem = renderedItem.asInstanceOf[js.Any])
    if (beginEditing != null) __obj.updateDynamic("beginEditing")(js.Any.fromFunction1(beginEditing))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectedItemWithContextMenuProps]
  }
}

