package typingsSlinky.reactMdTree

import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.reactMdList.listMod.ListElement
import typingsSlinky.reactMdTree.anon.NestedTreeItemUnknownTree
import typingsSlinky.reactMdTree.typesMod.ExpandedIds
import typingsSlinky.reactMdTree.typesMod.SelectedIds
import typingsSlinky.reactMdTree.typesMod.TreeData
import typingsSlinky.reactMdTree.typesMod.TreeItemId
import typingsSlinky.reactMdTree.typesMod.TreeItemSorter
import typingsSlinky.reactMdTree.typesMod.UnknownTreeItem
import typingsSlinky.reactMdTree.useFlattenedTreeListMod.MetadataRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTreeMovementMod {
  
  @JSImport("@react-md/tree/types/useTreeMovement", "useTreeMovement")
  @js.native
  def useTreeMovement(
    hasIdDataRootIdSortOnBlurOnFocusOnKeyDownMultiSelectSelectedIdsOnItemSelectOnMultiItemSelectExpandedIdsOnItemExpansionOnMultiItemExpansionValueKeyGetItemValue: Options
  ): ReturnValue = js.native
  
  /* Inlined std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'id' | 'data' | 'sort' | 'onBlur' | 'onFocus' | 'onKeyDown' | 'multiSelect' | 'selectedIds' | 'onItemSelect' | 'onMultiItemSelect' | 'expandedIds' | 'onItemExpansion' | 'onMultiItemExpansion'> & std.Required<std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'valueKey' | 'getItemValue' | 'rootId'>> */
  @js.native
  trait Options extends StObject {
    
    var data: TreeData[UnknownTreeItem] = js.native
    
    var expandedIds: ExpandedIds = js.native
    
    var getItemValue: js.Function2[/* item */ UnknownTreeItem, /* valueKey */ String, String] = js.native
    
    var id: String = js.native
    
    var multiSelect: js.UndefOr[Boolean] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[ListElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[ListElement]] = js.native
    
    var onItemExpansion: js.Function2[/* itemId */ TreeItemId, /* expanded */ Boolean, Unit] = js.native
    
    var onItemSelect: js.Function1[/* itemId */ TreeItemId, Unit] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[ListElement]] = js.native
    
    var onMultiItemExpansion: js.Function1[/* itemIds */ ExpandedIds, Unit] = js.native
    
    var onMultiItemSelect: js.Function1[/* itemIds */ SelectedIds, Unit] = js.native
    
    var rootId: TreeItemId = js.native
    
    var selectedIds: SelectedIds = js.native
    
    var sort: js.UndefOr[TreeItemSorter[UnknownTreeItem]] = js.native
    
    var valueKey: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      data: TreeData[UnknownTreeItem],
      expandedIds: ExpandedIds,
      getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String,
      id: String,
      onItemExpansion: (/* itemId */ TreeItemId, /* expanded */ Boolean) => Unit,
      onItemSelect: /* itemId */ TreeItemId => Unit,
      onMultiItemExpansion: /* itemIds */ ExpandedIds => Unit,
      onMultiItemSelect: /* itemIds */ SelectedIds => Unit,
      rootId: TreeItemId,
      selectedIds: SelectedIds,
      valueKey: String
    ): Options = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], expandedIds = expandedIds.asInstanceOf[js.Any], getItemValue = js.Any.fromFunction2(getItemValue), id = id.asInstanceOf[js.Any], onItemExpansion = js.Any.fromFunction2(onItemExpansion), onItemSelect = js.Any.fromFunction1(onItemSelect), onMultiItemExpansion = js.Any.fromFunction1(onMultiItemExpansion), onMultiItemSelect = js.Any.fromFunction1(onMultiItemSelect), rootId = rootId.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: TreeData[UnknownTreeItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedIds(value: ExpandedIds): Self = StObject.set(x, "expandedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedIdsVarargs(value: TreeItemId*): Self = StObject.set(x, "expandedIds", js.Array(value :_*))
      
      @scala.inline
      def setGetItemValue(value: (/* item */ UnknownTreeItem, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[ListElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[ListElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnItemExpansion(value: (/* itemId */ TreeItemId, /* expanded */ Boolean) => Unit): Self = StObject.set(x, "onItemExpansion", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemSelect(value: /* itemId */ TreeItemId => Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[ListElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMultiItemExpansion(value: /* itemIds */ ExpandedIds => Unit): Self = StObject.set(x, "onMultiItemExpansion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMultiItemSelect(value: /* itemIds */ SelectedIds => Unit): Self = StObject.set(x, "onMultiItemSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRootId(value: TreeItemId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIds(value: SelectedIds): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIdsVarargs(value: TreeItemId*): Self = StObject.set(x, "selectedIds", js.Array(value :_*))
      
      @scala.inline
      def setSort(value: /* items */ js.Array[UnknownTreeItem] => js.Array[UnknownTreeItem]): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReturnValue extends StObject {
    
    /**
      * The current treeitem's DOM id that is currently keyboard focused.
      */
    var activeId: String = js.native
    
    /**
      * A blur handler that should be passed to the tree list element that handles
      * removing the `aria-activedescendant` when the tree is no longer within
      * focus. This will also call the optional `onBlur` prop.
      */
    var handleBlur: FocusEventHandler[ListElement] = js.native
    
    /**
      * A focus handler that should be passed to the tree element that handles
      * conditionally setting the default `aria-activedescendant` id on first
      * focus. This will also call the optional `onFocus` prop.
      */
    var handleFocus: FocusEventHandler[ListElement] = js.native
    
    /**
      * The keydown handler that should be passed to the tree list element that
      * handles all the keyboard functionality and movement.
      *
      * This will also call the optional `onKeyDown` prop.
      */
    var handleKeyDown: KeyboardEventHandler[ListElement] = js.native
    
    /**
      * A record containing the DOM ids for each tree item along with a ref object
      * to provide to the itemRenderer for that item. This is just for a quick
      * lookup to help with all the tree traversal and keyboard movement.
      */
    var itemIdRefs: MetadataRecord = js.native
    
    /**
      * A nested list representation of the provided tree data. This is used for
      * rendering all the treeitem nodes.
      */
    var items: js.Array[NestedTreeItemUnknownTree] = js.native
    
    /**
      * A function that updates the `activeId` based on the provided `itemId`. This
      * should really only be used whenever an item is clicked with a mouse or
      * touch since the `activeId` will be updated automatically for all the other
      * flows.
      */
    def setActiveId(itemId: TreeItemId): Unit = js.native
  }
  object ReturnValue {
    
    @scala.inline
    def apply(
      activeId: String,
      handleBlur: SyntheticFocusEvent[ListElement] => Unit,
      handleFocus: SyntheticFocusEvent[ListElement] => Unit,
      handleKeyDown: SyntheticKeyboardEvent[ListElement] => Unit,
      itemIdRefs: MetadataRecord,
      items: js.Array[NestedTreeItemUnknownTree],
      setActiveId: TreeItemId => Unit
    ): ReturnValue = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], handleBlur = js.Any.fromFunction1(handleBlur), handleFocus = js.Any.fromFunction1(handleFocus), handleKeyDown = js.Any.fromFunction1(handleKeyDown), itemIdRefs = itemIdRefs.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1(setActiveId))
      __obj.asInstanceOf[ReturnValue]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleBlur(value: SyntheticFocusEvent[ListElement] => Unit): Self = StObject.set(x, "handleBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleFocus(value: SyntheticFocusEvent[ListElement] => Unit): Self = StObject.set(x, "handleFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleKeyDown(value: SyntheticKeyboardEvent[ListElement] => Unit): Self = StObject.set(x, "handleKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemIdRefs(value: MetadataRecord): Self = StObject.set(x, "itemIdRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[NestedTreeItemUnknownTree]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: NestedTreeItemUnknownTree*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setSetActiveId(value: TreeItemId => Unit): Self = StObject.set(x, "setActiveId", js.Any.fromFunction1(value))
    }
  }
}
