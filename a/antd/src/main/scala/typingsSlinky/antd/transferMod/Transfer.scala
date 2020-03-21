package typingsSlinky.antd.transferMod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.AnonItemsUnitNotFoundContent
import typingsSlinky.antd.AnonLeftDataSource
import typingsSlinky.antd.AnonTitles
import typingsSlinky.antd.antdStrings.sourceSelectedKeys
import typingsSlinky.antd.antdStrings.targetSelectedKeys
import typingsSlinky.antd.collapseCollapseMod.ExpandIconPosition
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfer
  extends Component[TransferProps, js.Any, js.Any] {
  var separatedDataSource: AnonLeftDataSource | Null = js.native
  def getLocale(
    transferLocale: TransferLocale,
    renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], TagMod[Any]]
  ): AnonTitles | AnonItemsUnitNotFoundContent = js.native
  def getSelectedKeysName(direction: TransferDirection): sourceSelectedKeys | targetSelectedKeys = js.native
  def getTitles(transferLocale: TransferLocale): js.Array[String] = js.native
  def handleClear(direction: ExpandIconPosition): Unit = js.native
  def handleFilter(direction: ExpandIconPosition, e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleLeftClear(): Unit = js.native
  def handleLeftFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleLeftScroll(e: SyntheticEvent[Event_, HTMLUListElement]): Unit = js.native
  def handleListStyle(listStyle: js.Function1[/* style */ ListStyle, CSSProperties], direction: ExpandIconPosition): CSSProperties = js.native
  def handleListStyle(listStyle: CSSProperties, direction: ExpandIconPosition): CSSProperties = js.native
  def handleRightClear(): Unit = js.native
  def handleRightFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleRightScroll(e: SyntheticEvent[Event_, HTMLUListElement]): Unit = js.native
  def handleScroll(direction: ExpandIconPosition, e: SyntheticEvent[Event_, HTMLUListElement]): Unit = js.native
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
  def separateDataSource(): AnonLeftDataSource = js.native
}

