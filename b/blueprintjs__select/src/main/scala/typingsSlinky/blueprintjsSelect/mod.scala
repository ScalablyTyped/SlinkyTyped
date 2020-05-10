package typingsSlinky.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import slinky.core.TagMod
import typingsSlinky.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typingsSlinky.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typingsSlinky.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typingsSlinky.blueprintjsSelect.multiSelectMod.IMultiSelectProps
import typingsSlinky.blueprintjsSelect.omnibarMod.IOmnibarProps
import typingsSlinky.blueprintjsSelect.queryListMod.IQueryListProps
import typingsSlinky.blueprintjsSelect.selectMod.ISelectProps
import typingsSlinky.blueprintjsSelect.suggestMod.ISuggestProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MultiSelect[T] ()
    extends typingsSlinky.blueprintjsSelect.componentsMod.MultiSelect[T]
  
  @js.native
  class Omnibar[T] ()
    extends typingsSlinky.blueprintjsSelect.componentsMod.Omnibar[T]
  
  @js.native
  class QueryList[T] protected ()
    extends typingsSlinky.blueprintjsSelect.componentsMod.QueryList[T] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
  }
  
  @js.native
  class Select[T] ()
    extends typingsSlinky.blueprintjsSelect.componentsMod.Select[T]
  
  @js.native
  class Suggest[T] ()
    extends typingsSlinky.blueprintjsSelect.componentsMod.Suggest[T]
  
  def executeItemsEqual[T](): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T, itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: js.UndefOr[scala.Nothing], itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: Null, itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T]): Boolean = js.native
  def getActiveItem[T](): T | Null = js.native
  def getActiveItem[T](activeItem: T): T | Null = js.native
  def getActiveItem[T](activeItem: ICreateNewItem): T | Null = js.native
  def getCreateNewItem(): ICreateNewItem = js.native
  def getFirstEnabledItem[T](items: js.Array[T]): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  def isCreateNewItem[T](item: ICreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  def renderFilteredItems(props: IItemListRendererProps[_]): TagMod[Any] = js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: TagMod[Any]): TagMod[Any] = js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: TagMod[Any], initialContent: TagMod[Any]): TagMod[Any] = js.native
  @js.native
  object Classes extends js.Object {
    val MULTISELECT: String = js.native
    val MULTISELECT_POPOVER: String = js.native
    val MULTISELECT_TAG_INPUT_INPUT: String = js.native
    val OMNIBAR: String = js.native
    val OMNIBAR_OVERLAY: String = js.native
    val SELECT: String = js.native
    val SELECT_POPOVER: String = js.native
  }
  
  /* static members */
  @js.native
  object MultiSelect extends js.Object {
    var defaultProps: AnonFill = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IMultiSelectProps[T], 
        typingsSlinky.blueprintjsSelect.multiSelectMod.MultiSelect[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Omnibar extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IOmnibarProps[T], 
        typingsSlinky.blueprintjsSelect.omnibarMod.Omnibar[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object QueryList extends js.Object {
    var defaultProps: AnonDisabled = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IQueryListProps[T], 
        typingsSlinky.blueprintjsSelect.queryListMod.QueryList[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Select extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[/* props */ ISelectProps[T], typingsSlinky.blueprintjsSelect.selectMod.Select[T]] = js.native
  }
  
  /* static members */
  @js.native
  object Suggest extends js.Object {
    var defaultProps: PartialISuggestPropsany = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ ISuggestProps[T], 
        typingsSlinky.blueprintjsSelect.suggestMod.Suggest[T]
      ] = js.native
  }
  
}

