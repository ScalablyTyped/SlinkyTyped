package typingsSlinky.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsSelect.anon.Disabled
import typingsSlinky.blueprintjsSelect.anon.Fill
import typingsSlinky.blueprintjsSelect.anon.PartialISuggestPropsany
import typingsSlinky.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typingsSlinky.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typingsSlinky.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typingsSlinky.blueprintjsSelect.multiSelectMod.IMultiSelectProps
import typingsSlinky.blueprintjsSelect.omnibarMod.IOmnibarProps
import typingsSlinky.blueprintjsSelect.queryListMod.IQueryListProps
import typingsSlinky.blueprintjsSelect.selectMod.ISelectProps
import typingsSlinky.blueprintjsSelect.suggestMod.ISuggestProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Classes {
    
    @JSImport("@blueprintjs/select", "Classes.MULTISELECT")
    @js.native
    val MULTISELECT: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.MULTISELECT_POPOVER")
    @js.native
    val MULTISELECT_POPOVER: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.MULTISELECT_TAG_INPUT_INPUT")
    @js.native
    val MULTISELECT_TAG_INPUT_INPUT: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.OMNIBAR")
    @js.native
    val OMNIBAR: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.OMNIBAR_OVERLAY")
    @js.native
    val OMNIBAR_OVERLAY: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.SELECT")
    @js.native
    val SELECT: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.SELECT_POPOVER")
    @js.native
    val SELECT_POPOVER: String = js.native
  }
  
  @JSImport("@blueprintjs/select", "MultiSelect")
  @js.native
  class MultiSelect[T] protected ()
    extends typingsSlinky.blueprintjsSelect.componentsMod.MultiSelect[T] {
    def this(props: IMultiSelectProps[T]) = this()
    def this(props: IMultiSelectProps[T], context: js.Any) = this()
  }
  /* static members */
  object MultiSelect {
    
    @JSImport("@blueprintjs/select", "MultiSelect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "MultiSelect.defaultProps")
    @js.native
    def defaultProps: Fill = js.native
    @scala.inline
    def defaultProps_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "MultiSelect.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "MultiSelect.ofType")
    @js.native
    def ofType[U](): Instantiable1[
        /* props */ IMultiSelectProps[U], 
        typingsSlinky.blueprintjsSelect.multiSelectMod.MultiSelect[U]
      ] = js.native
  }
  
  @JSImport("@blueprintjs/select", "Omnibar")
  @js.native
  class Omnibar[T] protected ()
    extends typingsSlinky.blueprintjsSelect.componentsMod.Omnibar[T] {
    def this(props: IOmnibarProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IOmnibarProps[T], context: js.Any) = this()
  }
  /* static members */
  object Omnibar {
    
    @JSImport("@blueprintjs/select", "Omnibar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "Omnibar.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "Omnibar.ofType")
    @js.native
    def ofType[U](): Instantiable1[
        /* props */ IOmnibarProps[U], 
        typingsSlinky.blueprintjsSelect.omnibarMod.Omnibar[U]
      ] = js.native
  }
  
  @JSImport("@blueprintjs/select", "QueryList")
  @js.native
  class QueryList[T] protected ()
    extends typingsSlinky.blueprintjsSelect.componentsMod.QueryList[T] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
  }
  /* static members */
  object QueryList {
    
    @JSImport("@blueprintjs/select", "QueryList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "QueryList.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "QueryList.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "QueryList.ofType")
    @js.native
    def ofType[U](): Instantiable1[
        /* props */ IQueryListProps[U], 
        typingsSlinky.blueprintjsSelect.queryListMod.QueryList[U]
      ] = js.native
  }
  
  @JSImport("@blueprintjs/select", "Select")
  @js.native
  class Select[T] protected ()
    extends typingsSlinky.blueprintjsSelect.componentsMod.Select[T] {
    def this(props: ISelectProps[T]) = this()
    def this(props: ISelectProps[T], context: js.Any) = this()
  }
  /* static members */
  object Select {
    
    @JSImport("@blueprintjs/select", "Select")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "Select.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "Select.ofType")
    @js.native
    def ofType[U](): Instantiable1[/* props */ ISelectProps[U], typingsSlinky.blueprintjsSelect.selectMod.Select[U]] = js.native
  }
  
  @JSImport("@blueprintjs/select", "Suggest")
  @js.native
  class Suggest[T] protected ()
    extends typingsSlinky.blueprintjsSelect.componentsMod.Suggest[T] {
    def this(props: ISuggestProps[T]) = this()
    def this(props: ISuggestProps[T], context: js.Any) = this()
  }
  /* static members */
  object Suggest {
    
    @JSImport("@blueprintjs/select", "Suggest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "Suggest.defaultProps")
    @js.native
    def defaultProps: PartialISuggestPropsany = js.native
    @scala.inline
    def defaultProps_=(x: PartialISuggestPropsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "Suggest.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "Suggest.ofType")
    @js.native
    def ofType[U](): Instantiable1[
        /* props */ ISuggestProps[U], 
        typingsSlinky.blueprintjsSelect.suggestMod.Suggest[U]
      ] = js.native
  }
  
  @JSImport("@blueprintjs/select", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](): Boolean = js.native
  @JSImport("@blueprintjs/select", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T): Boolean = js.native
  @JSImport("@blueprintjs/select", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T, itemB: T): Boolean = js.native
  @JSImport("@blueprintjs/select", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: js.UndefOr[scala.Nothing], itemB: T): Boolean = js.native
  @JSImport("@blueprintjs/select", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: Null, itemB: T): Boolean = js.native
  @JSImport("@blueprintjs/select", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T]): Boolean = js.native
  
  @JSImport("@blueprintjs/select", "getActiveItem")
  @js.native
  def getActiveItem[T](): T | Null = js.native
  @JSImport("@blueprintjs/select", "getActiveItem")
  @js.native
  def getActiveItem[T](activeItem: T): T | Null = js.native
  @JSImport("@blueprintjs/select", "getActiveItem")
  @js.native
  def getActiveItem[T](activeItem: ICreateNewItem): T | Null = js.native
  
  @JSImport("@blueprintjs/select", "getCreateNewItem")
  @js.native
  def getCreateNewItem(): ICreateNewItem = js.native
  
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T]): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.UndefOr[scala.Nothing],
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.UndefOr[scala.Nothing], direction: Double): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.UndefOr[scala.Nothing], direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: /* keyof T */ String,
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  
  @JSImport("@blueprintjs/select", "isCreateNewItem")
  @js.native
  def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  @JSImport("@blueprintjs/select", "isCreateNewItem")
  @js.native
  def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  @JSImport("@blueprintjs/select", "isCreateNewItem")
  @js.native
  def isCreateNewItem[T](item: ICreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  
  @JSImport("@blueprintjs/select", "renderFilteredItems")
  @js.native
  def renderFilteredItems(props: IItemListRendererProps[_]): ReactElement = js.native
  @JSImport("@blueprintjs/select", "renderFilteredItems")
  @js.native
  def renderFilteredItems(
    props: IItemListRendererProps[_],
    noResults: js.UndefOr[ReactElement],
    initialContent: ReactElement
  ): ReactElement = js.native
  @JSImport("@blueprintjs/select", "renderFilteredItems")
  @js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: ReactElement): ReactElement = js.native
}
