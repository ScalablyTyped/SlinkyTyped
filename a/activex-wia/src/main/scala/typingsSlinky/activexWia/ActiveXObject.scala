package typingsSlinky.activexWia

import typingsSlinky.activexWia.WIA.DeviceManager
import typingsSlinky.activexWia.WIA.Vector
import typingsSlinky.activexWia.activexWiaStrings.DeviceID
import typingsSlinky.activexWia.activexWiaStrings.EventID
import typingsSlinky.activexWia.activexWiaStrings.Item
import typingsSlinky.activexWia.activexWiaStrings.ItemID
import typingsSlinky.activexWia.activexWiaStrings.OnEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: DeviceManager,
    event: OnEvent,
    argNames: js.Tuple3[EventID, DeviceID, ItemID],
    handler: js.ThisFunction1[
      /* this */ DeviceManager, 
      /* parameter */ typingsSlinky.activexWia.anon.DeviceID, 
      Unit
    ]
  ): Unit
  @JSName("set")
  def set_Item[TItem](obj: Vector[TItem], propertyName: Item, parameterTypes: js.Array[Double], newValue: TItem): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (DeviceManager, OnEvent, js.Tuple3[EventID, DeviceID, ItemID], js.ThisFunction1[
      /* this */ DeviceManager, 
      /* parameter */ typingsSlinky.activexWia.anon.DeviceID, 
      Unit
    ]) => Unit,
    set: (Vector[js.Any], Item, js.Array[Double], js.Any) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on), set = js.Any.fromFunction4(set))
    __obj.asInstanceOf[ActiveXObject]
  }
}

