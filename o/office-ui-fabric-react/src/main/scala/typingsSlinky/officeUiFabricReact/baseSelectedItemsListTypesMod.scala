package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsSlinky.officeUiFabricReact.libSelectionMod.Selection
import typingsSlinky.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseSelectedItemsListTypesMod {
  
  @js.native
  trait IBaseSelectedItemsList[T] extends StObject {
    
    def addItems(items: js.Array[T]): Unit = js.native
    
    /** Gets the current value of the input. */
    var items: js.UndefOr[js.Array[T]] = js.native
  }
  object IBaseSelectedItemsList {
    
    @scala.inline
    def apply[T](addItems: js.Array[T] => Unit): IBaseSelectedItemsList[T] = {
      val __obj = js.Dynamic.literal(addItems = js.Any.fromFunction1(addItems))
      __obj.asInstanceOf[IBaseSelectedItemsList[T]]
    }
    
    @scala.inline
    implicit class IBaseSelectedItemsListMutableBuilder[Self <: IBaseSelectedItemsList[_], T] (val x: Self with IBaseSelectedItemsList[T]) extends AnyVal {
      
      @scala.inline
      def setAddItems(value: js.Array[T] => Unit): Self = StObject.set(x, "addItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IBaseSelectedItemsListProps[T]
    extends ClassAttributes[js.Any] {
    
    /**
      * A callback on whether this item can be deleted
      */
    var canRemoveItem: js.UndefOr[js.Function1[/* item */ T, Boolean]] = js.native
    
    var componentRef: js.UndefOr[IRefObject[IBaseSelectedItemsList[T]]] = js.native
    
    /**
      * Function that specifies how arbitrary text entered into the well is handled.
      */
    var createGenericItem: js.UndefOr[
        js.Function2[/* input */ String, /* ValidationState */ ValidationState, ISuggestionModel[T]]
      ] = js.native
    
    /**
      * Initial items that have already been selected and should appear in the people picker.
      */
    var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.native
    
    /**
      * A callback for when the selected list of items changes.
      */
    var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.native
    
    /**
      * A callback for when items are copied
      */
    var onCopyItems: js.UndefOr[js.Function1[/* items */ js.Array[T], String]] = js.native
    
    /**
      * A callback when an item is deleted
      * @deprecated Use `onItemsDeleted` instead.
      */
    var onItemDeleted: js.UndefOr[js.Function1[/* deletedItem */ T, Unit]] = js.native
    
    /**
      * A callback to process a selection after the user selects something from the picker.
      */
    var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T]]] = js.native
    
    /**
      * A callback when and item or items are deleted
      */
    var onItemsDeleted: js.UndefOr[js.Function1[/* deletedItems */ js.Array[T], Unit]] = js.native
    
    /**
      * Function that specifies how the selected item will appear.
      */
    var onRenderItem: js.UndefOr[js.Function1[/* props */ ISelectedItemProps[T], ReactElement]] = js.native
    
    /**
      * Aria label for the 'X' button in the selected item component.
      * @defaultvalue ''
      */
    var removeButtonAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * The items that the base picker should currently display as selected.
      * If this is provided then the picker will act as a controlled component.
      */
    var selectedItems: js.UndefOr[js.Array[T]] = js.native
    
    /**
      * The selection
      */
    var selection: js.UndefOr[Selection[IObjectWithKey]] = js.native
  }
  object IBaseSelectedItemsListProps {
    
    @scala.inline
    def apply[T](): IBaseSelectedItemsListProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseSelectedItemsListProps[T]]
    }
    
    @scala.inline
    implicit class IBaseSelectedItemsListPropsMutableBuilder[Self <: IBaseSelectedItemsListProps[_], T] (val x: Self with IBaseSelectedItemsListProps[T]) extends AnyVal {
      
      @scala.inline
      def setCanRemoveItem(value: /* item */ T => Boolean): Self = StObject.set(x, "canRemoveItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanRemoveItemUndefined: Self = StObject.set(x, "canRemoveItem", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IBaseSelectedItemsList[T]]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IBaseSelectedItemsList[T] | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IBaseSelectedItemsList[T]]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setCreateGenericItem(value: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[T]): Self = StObject.set(x, "createGenericItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateGenericItemUndefined: Self = StObject.set(x, "createGenericItem", js.undefined)
      
      @scala.inline
      def setDefaultSelectedItems(value: js.Array[T]): Self = StObject.set(x, "defaultSelectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedItemsUndefined: Self = StObject.set(x, "defaultSelectedItems", js.undefined)
      
      @scala.inline
      def setDefaultSelectedItemsVarargs(value: T*): Self = StObject.set(x, "defaultSelectedItems", js.Array(value :_*))
      
      @scala.inline
      def setOnChange(value: /* items */ js.UndefOr[js.Array[T]] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnCopyItems(value: /* items */ js.Array[T] => String): Self = StObject.set(x, "onCopyItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyItemsUndefined: Self = StObject.set(x, "onCopyItems", js.undefined)
      
      @scala.inline
      def setOnItemDeleted(value: /* deletedItem */ T => Unit): Self = StObject.set(x, "onItemDeleted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemDeletedUndefined: Self = StObject.set(x, "onItemDeleted", js.undefined)
      
      @scala.inline
      def setOnItemSelected(value: /* selectedItem */ js.UndefOr[T] => T | js.Thenable[T]): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemSelectedUndefined: Self = StObject.set(x, "onItemSelected", js.undefined)
      
      @scala.inline
      def setOnItemsDeleted(value: /* deletedItems */ js.Array[T] => Unit): Self = StObject.set(x, "onItemsDeleted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemsDeletedUndefined: Self = StObject.set(x, "onItemsDeleted", js.undefined)
      
      @scala.inline
      def setOnRenderItem(value: /* props */ ISelectedItemProps[T] => ReactElement): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRenderItemUndefined: Self = StObject.set(x, "onRenderItem", js.undefined)
      
      @scala.inline
      def setRemoveButtonAriaLabel(value: String): Self = StObject.set(x, "removeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveButtonAriaLabelUndefined: Self = StObject.set(x, "removeButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Array[T]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setSelectedItemsVarargs(value: T*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
      
      @scala.inline
      def setSelection(value: Selection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    }
  }
  
  @js.native
  trait ISelectedItemProps[T] extends IPickerItemProps[T] {
    
    def onCopyItem(item: T): Unit = js.native
  }
  object ISelectedItemProps {
    
    @scala.inline
    def apply[T](IPickerItemProps: IPickerItemProps[T], onCopyItem: T => Unit): ISelectedItemProps[T] = {
      val __obj = js.Dynamic.literal(onCopyItem = js.Any.fromFunction1(onCopyItem))
      js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
      __obj.asInstanceOf[ISelectedItemProps[T]]
    }
    
    @scala.inline
    implicit class ISelectedItemPropsMutableBuilder[Self <: ISelectedItemProps[_], T] (val x: Self with ISelectedItemProps[T]) extends AnyVal {
      
      @scala.inline
      def setOnCopyItem(value: T => Unit): Self = StObject.set(x, "onCopyItem", js.Any.fromFunction1(value))
    }
  }
}
