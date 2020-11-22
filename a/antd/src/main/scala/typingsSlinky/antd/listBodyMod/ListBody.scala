package typingsSlinky.antd.listBodyMod

import typingsSlinky.antd.anon.Current
import typingsSlinky.antd.transferListMod.RenderedItem
import typingsSlinky.antd.transferMod.KeyWiseTransferItem
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBody[RecordType /* <: KeyWiseTransferItem */]
  extends Component[TransferListBodyProps[RecordType], TransferListBodyState, js.Any] {
  
  def getItems(): js.Array[RenderedItem[RecordType]] = js.native
  
  def onItemRemove(item: RecordType): Unit = js.native
  
  def onItemSelect(item: RecordType): Unit = js.native
  
  def onPageChange(current: Double): Unit = js.native
  
  @JSName("state")
  var state_ListBody: Current = js.native
}
