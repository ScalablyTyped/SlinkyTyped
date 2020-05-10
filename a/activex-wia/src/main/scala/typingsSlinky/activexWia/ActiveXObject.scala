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

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: DeviceManager,
    event: OnEvent,
    argNames: js.Tuple3[EventID, DeviceID, ItemID],
    handler: js.ThisFunction1[/* this */ DeviceManager, /* parameter */ AnonDeviceID, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_Item[TItem](obj: Vector[TItem], propertyName: Item, parameterTypes: js.Array[Double], newValue: TItem): Unit = js.native
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (DeviceManager, OnEvent, js.Tuple3[EventID, DeviceID, ItemID], js.ThisFunction1[/* this */ DeviceManager, /* parameter */ AnonDeviceID, Unit]) => Unit,
    set: (Vector[js.Any], Item, js.Array[Double], js.Any) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on), set = js.Any.fromFunction4(set))
    __obj.asInstanceOf[ActiveXObject]
  }
  @scala.inline
  implicit class ActiveXObjectOps[Self <: ActiveXObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(
      value: (DeviceManager, OnEvent, js.Tuple3[EventID, DeviceID, ItemID], js.ThisFunction1[/* this */ DeviceManager, /* parameter */ AnonDeviceID, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSet(value: (Vector[js.Any], Item, js.Array[Double], js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

