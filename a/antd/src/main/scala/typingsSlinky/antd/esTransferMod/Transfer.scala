package typingsSlinky.antd.esTransferMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.Anon_ItemUnit
import typingsSlinky.antd.Anon_LeftDataSource
import typingsSlinky.antd.antdStrings.sourceSelectedKeys
import typingsSlinky.antd.antdStrings.targetSelectedKeys
import typingsSlinky.antd.esCollapseCollapseMod.ExpandIconPosition
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfer
  extends Component[TransferProps, js.Any, js.Any] {
  var separatedDataSource: Anon_LeftDataSource | Null = js.native
  def getLocale(
    transferLocale: TransferLocale,
    renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], TagMod[Any]]
  ): Anon_ItemUnit = js.native
  def getSelectedKeysName(direction: TransferDirection): sourceSelectedKeys | targetSelectedKeys = js.native
  def getTitles(transferLocale: TransferLocale): js.Array[String] = js.native
  def handleClear(direction: ExpandIconPosition): Unit = js.native
  def handleFilter(direction: ExpandIconPosition, e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleLeftClear(): Unit = js.native
  def handleLeftFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleLeftScroll(e: SyntheticEvent[Event, HTMLDivElement]): Unit = js.native
  def handleLeftSelect(selectedItem: TransferItem, checked: Boolean): Unit = js.native
  def handleLeftSelectAll(filteredDataSource: js.Array[TransferItem], checkAll: Boolean): Unit = js.native
  def handleRightClear(): Unit = js.native
  def handleRightFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleRightScroll(e: SyntheticEvent[Event, HTMLDivElement]): Unit = js.native
  def handleRightSelect(selectedItem: TransferItem, checked: Boolean): Unit = js.native
  def handleRightSelectAll(filteredDataSource: js.Array[TransferItem], checkAll: Boolean): Unit = js.native
  def handleScroll(direction: ExpandIconPosition, e: SyntheticEvent[Event, HTMLDivElement]): Unit = js.native
  def handleSelect(direction: ExpandIconPosition, selectedItem: TransferItem, checked: Boolean): Unit = js.native
  def handleSelectAll(direction: ExpandIconPosition, filteredDataSource: js.Array[TransferItem], checkAll: Boolean): Unit = js.native
  def handleSelectChange(direction: TransferDirection, holder: js.Array[String]): Unit = js.native
  def moveTo(direction: ExpandIconPosition): Unit = js.native
  def moveToLeft(): Unit = js.native
  def moveToRight(): Unit = js.native
  def onItemSelect(direction: ExpandIconPosition, selectedKey: String, checked: Boolean): Unit = js.native
  def onItemSelectAll(direction: ExpandIconPosition, selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def onLeftItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  def onLeftItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def onRightItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  def onRightItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def renderTransfer(transferLocale: TransferLocale): ReactElement = js.native
  def separateDataSource(): Anon_LeftDataSource = js.native
}

