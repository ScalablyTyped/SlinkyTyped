package typingsSlinky.antd.transferMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.ItemsUnit
import typingsSlinky.antd.anon.LeftDataSource
import typingsSlinky.antd.anon.NotFoundContent
import typingsSlinky.antd.renderEmptyMod.RenderEmptyHandler
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transfer
  extends Component[TransferProps, TransferState, js.Any] {
  
  def getLocale(transferLocale: TransferLocale, renderEmpty: RenderEmptyHandler): ItemsUnit | NotFoundContent = js.native
  
  def getTitles(transferLocale: TransferLocale): js.Array[String] = js.native
  
  def handleClear(direction: TransferDirection): Unit = js.native
  
  def handleFilter(direction: TransferDirection, e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def handleLeftClear(): Unit = js.native
  
  def handleLeftFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def handleLeftScroll(e: SyntheticEvent[Event, HTMLUListElement]): Unit = js.native
  
  def handleListStyle(listStyle: js.Function1[/* style */ ListStyle, CSSProperties], direction: TransferDirection): CSSProperties = js.native
  def handleListStyle(listStyle: CSSProperties, direction: TransferDirection): CSSProperties = js.native
  
  def handleRightClear(): Unit = js.native
  
  def handleRightFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def handleRightScroll(e: SyntheticEvent[Event, HTMLUListElement]): Unit = js.native
  
  def handleScroll(direction: TransferDirection, e: SyntheticEvent[Event, HTMLUListElement]): Unit = js.native
  
  def handleSelectChange(direction: TransferDirection, holder: js.Array[String]): Unit = js.native
  
  def moveTo(direction: TransferDirection): Unit = js.native
  
  def moveToLeft(): Unit = js.native
  
  def moveToRight(): Unit = js.native
  
  def onItemSelect(direction: TransferDirection, selectedKey: String, checked: Boolean): Unit = js.native
  
  def onItemSelectAll(direction: TransferDirection, selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  
  def onLeftItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  
  def onLeftItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  
  def onRightItemRemove(selectedKeys: js.Array[String]): Unit = js.native
  
  def onRightItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  
  def onRightItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  
  def renderTransfer(transferLocale: TransferLocale): ReactElement = js.native
  
  def separateDataSource(): LeftDataSource = js.native
  
  var separatedDataSource: LeftDataSource | Null = js.native
  
  def setStateKeys(direction: TransferDirection, keys: js.Array[String]): Unit = js.native
  def setStateKeys(
    direction: TransferDirection,
    keys: js.Function1[/* prevKeys */ js.Array[String], js.Array[String]]
  ): Unit = js.native
}
