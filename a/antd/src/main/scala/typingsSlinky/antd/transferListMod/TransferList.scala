package typingsSlinky.antd.transferListMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.AnonFilteredItems
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.antdStrings.all
import typingsSlinky.antd.antdStrings.none
import typingsSlinky.antd.antdStrings.part
import typingsSlinky.antd.transferMod.TransferItem
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferList
  extends Component[TransferListProps, TransferListState, js.Any] {
  var timer: Double = js.native
  var triggerScrollTimer: Double = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTransferList(): Unit = js.native
  def getCheckBox(
    filteredItems: js.Array[TransferItem],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit]
  ): `false` | ReactElement = js.native
  def getCheckBox(
    filteredItems: js.Array[TransferItem],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
    showSelectAll: Boolean
  ): `false` | ReactElement = js.native
  def getCheckBox(
    filteredItems: js.Array[TransferItem],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
    showSelectAll: Boolean,
    disabled: Boolean
  ): `false` | ReactElement = js.native
  def getCheckStatus(filteredItems: js.Array[TransferItem]): none | all | part = js.native
  def getFilteredItems(dataSource: js.Array[TransferItem], filterValue: String): AnonFilteredItems = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: TagMod[Any],
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String]
  ): TagMod[Any] = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: TagMod[Any],
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction
  ): TagMod[Any] = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: TagMod[Any],
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction,
    showSearch: Boolean
  ): TagMod[Any] = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: TagMod[Any],
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction,
    showSearch: Boolean,
    disabled: Boolean
  ): TagMod[Any] = js.native
  def getSelectAllLabel(selectedCount: Double, totalCount: Double): TagMod[Any] = js.native
  def handleClear(): Unit = js.native
  def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def matchFilter(text: String, item: TransferItem): Boolean = js.native
  def renderItem(item: TransferItem): RenderedItem = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTransferList(args: js.Any*): js.Any = js.native
}

