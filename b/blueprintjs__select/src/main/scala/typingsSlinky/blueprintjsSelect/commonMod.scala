package typingsSlinky.blueprintjsSelect

import slinky.core.TagMod
import typingsSlinky.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typingsSlinky.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typingsSlinky.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  def executeItemsEqual[T](): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T]): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T], itemA: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T], itemA: T, itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T], itemA: Null, itemB: T): Boolean = js.native
  def getActiveItem[T](): T | Null = js.native
  def getActiveItem[T](activeItem: T): T | Null = js.native
  def getActiveItem[T](activeItem: ICreateNewItem): T | Null = js.native
  def getCreateNewItem(): ICreateNewItem = js.native
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
  
}

