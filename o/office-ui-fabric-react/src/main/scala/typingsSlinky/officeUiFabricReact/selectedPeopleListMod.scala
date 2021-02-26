package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListMod.BaseSelectedItemsList
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.react.mod.Key
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectedPeopleListMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/SelectedPeopleList", "BasePeopleSelectedItemsList")
  @js.native
  class BasePeopleSelectedItemsList protected () extends BaseSelectedItemsList[IExtendedPersonaProps, ISelectedPeopleProps] {
    def this(basePickerProps: ISelectedPeopleProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/SelectedPeopleList", "SelectedPeopleList")
  @js.native
  class SelectedPeopleList protected () extends BasePeopleSelectedItemsList {
    def this(basePickerProps: ISelectedPeopleProps) = this()
    
    var _beginEditing: js.Any = js.native
    
    var _completeEditing: js.Any = js.native
    
    var _createMenuItems: js.Any = js.native
    
    var _renderItem: js.Any = js.native
  }
  /* static members */
  object SelectedPeopleList {
    
    @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/SelectedPeopleList", "SelectedPeopleList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/SelectedPeopleList", "SelectedPeopleList.defaultProps")
    @js.native
    def defaultProps: js.Any = js.native
    @scala.inline
    def defaultProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IExtendedPersonaProps extends IPersonaProps {
    
    var blockRecipientRemoval: js.UndefOr[Boolean] = js.native
    
    var canExpand: js.UndefOr[Boolean] = js.native
    
    var isEditing: js.UndefOr[Boolean] = js.native
    
    var isValid: Boolean = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var shouldBlockSelection: js.UndefOr[Boolean] = js.native
  }
  object IExtendedPersonaProps {
    
    @scala.inline
    def apply(isValid: Boolean): IExtendedPersonaProps = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExtendedPersonaProps]
    }
    
    @scala.inline
    implicit class IExtendedPersonaPropsMutableBuilder[Self <: IExtendedPersonaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockRecipientRemoval(value: Boolean): Self = StObject.set(x, "blockRecipientRemoval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockRecipientRemovalUndefined: Self = StObject.set(x, "blockRecipientRemoval", js.undefined)
      
      @scala.inline
      def setCanExpand(value: Boolean): Self = StObject.set(x, "canExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanExpandUndefined: Self = StObject.set(x, "canExpand", js.undefined)
      
      @scala.inline
      def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setShouldBlockSelection(value: Boolean): Self = StObject.set(x, "shouldBlockSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldBlockSelectionUndefined: Self = StObject.set(x, "shouldBlockSelection", js.undefined)
    }
  }
  
  @js.native
  trait ISelectedPeopleItemProps extends ISelectedItemProps[IExtendedPersonaProps] {
    
    var onExpandItem: js.UndefOr[js.Function0[Unit]] = js.native
    
    var renderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
    
    var renderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  }
  object ISelectedPeopleItemProps {
    
    @scala.inline
    def apply(ISelectedItemProps: ISelectedItemProps[IExtendedPersonaProps]): ISelectedPeopleItemProps = {
      val __obj = js.Dynamic.literal()
      js.Dynamic.global.Object.assign(__obj, ISelectedItemProps)
      __obj.asInstanceOf[ISelectedPeopleItemProps]
    }
    
    @scala.inline
    implicit class ISelectedPeopleItemPropsMutableBuilder[Self <: ISelectedPeopleItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnExpandItem(value: () => Unit): Self = StObject.set(x, "onExpandItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExpandItemUndefined: Self = StObject.set(x, "onExpandItem", js.undefined)
      
      @scala.inline
      def setRenderPersonaCoin(
        value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "renderPersonaCoin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderPersonaCoinUndefined: Self = StObject.set(x, "renderPersonaCoin", js.undefined)
      
      @scala.inline
      def setRenderPrimaryText(
        value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "renderPrimaryText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderPrimaryTextUndefined: Self = StObject.set(x, "renderPrimaryText", js.undefined)
    }
  }
  
  @js.native
  trait ISelectedPeopleProps extends IBaseSelectedItemsListProps[IExtendedPersonaProps] {
    
    var copyMenuItemText: js.UndefOr[String] = js.native
    
    var editMenuItemText: js.UndefOr[String] = js.native
    
    var floatingPickerProps: js.UndefOr[IBaseFloatingPickerProps[IPersonaProps]] = js.native
    
    var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, String]] = js.native
    
    var onExpandGroup: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.native
    
    var onRenderFloatingPicker: js.UndefOr[ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]] = js.native
    
    var removeMenuItemText: js.UndefOr[String] = js.native
  }
  object ISelectedPeopleProps {
    
    @scala.inline
    def apply(): ISelectedPeopleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISelectedPeopleProps]
    }
    
    @scala.inline
    implicit class ISelectedPeoplePropsMutableBuilder[Self <: ISelectedPeopleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyMenuItemText(value: String): Self = StObject.set(x, "copyMenuItemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyMenuItemTextUndefined: Self = StObject.set(x, "copyMenuItemText", js.undefined)
      
      @scala.inline
      def setEditMenuItemText(value: String): Self = StObject.set(x, "editMenuItemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditMenuItemTextUndefined: Self = StObject.set(x, "editMenuItemText", js.undefined)
      
      @scala.inline
      def setFloatingPickerProps(value: IBaseFloatingPickerProps[IPersonaProps]): Self = StObject.set(x, "floatingPickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingPickerPropsUndefined: Self = StObject.set(x, "floatingPickerProps", js.undefined)
      
      @scala.inline
      def setGetEditingItemText(value: /* item */ IExtendedPersonaProps => String): Self = StObject.set(x, "getEditingItemText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetEditingItemTextUndefined: Self = StObject.set(x, "getEditingItemText", js.undefined)
      
      @scala.inline
      def setOnExpandGroup(value: /* item */ IExtendedPersonaProps => Unit): Self = StObject.set(x, "onExpandGroup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandGroupUndefined: Self = StObject.set(x, "onExpandGroup", js.undefined)
      
      @scala.inline
      def setOnRenderFloatingPicker(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = StObject.set(x, "onRenderFloatingPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRenderFloatingPickerComponentClass(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = StObject.set(x, "onRenderFloatingPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRenderFloatingPickerFunctionComponent(value: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]]): Self = StObject.set(x, "onRenderFloatingPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRenderFloatingPickerUndefined: Self = StObject.set(x, "onRenderFloatingPicker", js.undefined)
      
      @scala.inline
      def setRemoveMenuItemText(value: String): Self = StObject.set(x, "removeMenuItemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveMenuItemTextUndefined: Self = StObject.set(x, "removeMenuItemText", js.undefined)
    }
  }
}
