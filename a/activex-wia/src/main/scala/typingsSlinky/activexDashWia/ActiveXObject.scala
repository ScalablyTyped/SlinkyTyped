package typingsSlinky.activexDashWia

import typingsSlinky.activexDashWia.WIA.DeviceManager
import typingsSlinky.activexDashWia.WIA.Vector
import typingsSlinky.activexDashWia.activexDashWiaStrings.DeviceID
import typingsSlinky.activexDashWia.activexDashWiaStrings.EventID
import typingsSlinky.activexDashWia.activexDashWiaStrings.Item
import typingsSlinky.activexDashWia.activexDashWiaStrings.ItemID
import typingsSlinky.activexDashWia.activexDashWiaStrings.OnEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: DeviceManager,
    event: OnEvent,
    argNames: js.Tuple3[EventID, DeviceID, ItemID],
    handler: js.ThisFunction1[/* this */ DeviceManager, /* parameter */ Anon_DeviceID, Unit]
  ): Unit
  @JSName("set")
  def set_Item[TItem](obj: Vector[TItem], propertyName: Item, parameterTypes: js.Array[Double], newValue: TItem): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (DeviceManager, OnEvent, js.Tuple3[EventID, DeviceID, ItemID], js.ThisFunction1[/* this */ DeviceManager, /* parameter */ Anon_DeviceID, Unit]) => Unit,
    set: (Vector[js.Any], Item, js.Array[Double], js.Any) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on), set = js.Any.fromFunction4(set))
  
    __obj.asInstanceOf[ActiveXObject]
  }
}

