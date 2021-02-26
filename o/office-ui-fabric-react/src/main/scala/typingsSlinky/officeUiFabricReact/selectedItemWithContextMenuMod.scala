package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsSlinky.react.mod.Component
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectedItemWithContextMenuMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
  @js.native
  class SelectedItemWithContextMenu protected ()
    extends Component[ISelectedItemWithContextMenuProps, IPeoplePickerItemState, js.Any] {
    def this(props: ISelectedItemWithContextMenuProps) = this()
    
    var _onClick: js.Any = js.native
    
    var _onCloseContextualMenu: js.Any = js.native
    
    var itemElement: ReactRef[HTMLDivElement] = js.native
  }
  
  @js.native
  trait IPeoplePickerItemState extends StObject {
    
    var contextualMenuVisible: Boolean = js.native
  }
  object IPeoplePickerItemState {
    
    @scala.inline
    def apply(contextualMenuVisible: Boolean): IPeoplePickerItemState = {
      val __obj = js.Dynamic.literal(contextualMenuVisible = contextualMenuVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemState]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemStateMutableBuilder[Self <: IPeoplePickerItemState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextualMenuVisible(value: Boolean): Self = StObject.set(x, "contextualMenuVisible", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class ISelectedItemWithContextMenuPropsMutableBuilder[Self <: ISelectedItemWithContextMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeginEditing(value: /* item */ IExtendedPersonaProps => Unit): Self = StObject.set(x, "beginEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeginEditingUndefined: Self = StObject.set(x, "beginEditing", js.undefined)
      
      @scala.inline
      def setItem(value: IExtendedPersonaProps): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItems(value: js.Array[IContextualMenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemsVarargs(value: IContextualMenuItem*): Self = StObject.set(x, "menuItems", js.Array(value :_*))
      
      @scala.inline
      def setRenderedItem(value: ReactElement): Self = StObject.set(x, "renderedItem", value.asInstanceOf[js.Any])
    }
  }
}
