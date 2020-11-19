package typingsSlinky.antd.listBodyMod

import typingsSlinky.antd.anon.Current
import typingsSlinky.antd.transferListMod.RenderedItem
import typingsSlinky.antd.transferMod.TransferItem
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBody
  extends Component[TransferListBodyProps, TransferListBodyState, js.Any] {
  
  def getItems(): js.Array[RenderedItem] = js.native
  
  def onItemRemove(item: TransferItem): Unit = js.native
  
  def onItemSelect(item: TransferItem): Unit = js.native
  
  def onPageChange(current: Double): Unit = js.native
  
  @JSName("state")
  var state_ListBody: Current = js.native
}
