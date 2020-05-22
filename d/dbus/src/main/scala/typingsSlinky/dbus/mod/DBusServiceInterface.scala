package typingsSlinky.dbus.mod

import typingsSlinky.dbus.anon.Getter
import typingsSlinky.dbus.anon.In
import typingsSlinky.dbus.anon.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusServiceInterface extends js.Object {
  def addMethod(
    method: String,
    opts: In,
    handler: js.Function3[
      /* name */ String, 
      /* quality */ js.Any, 
      /* callback */ js.Function1[/* res */ js.Any, Unit], 
      Unit
    ]
  ): Unit
  def addProperty(name: String, opts: Getter): Unit
  def addSignal(name: String, opts: Types): Unit
  def emitSignal(name: String, values: js.Any*): Unit
  def update(): Unit
}

object DBusServiceInterface {
  @scala.inline
  def apply(
    addMethod: (String, In, js.Function3[
      /* name */ String, 
      /* quality */ js.Any, 
      /* callback */ js.Function1[/* res */ js.Any, Unit], 
      Unit
    ]) => Unit,
    addProperty: (String, Getter) => Unit,
    addSignal: (String, Types) => Unit,
    emitSignal: (String, /* repeated */ js.Any) => Unit,
    update: () => Unit
  ): DBusServiceInterface = {
    val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction3(addMethod), addProperty = js.Any.fromFunction2(addProperty), addSignal = js.Any.fromFunction2(addSignal), emitSignal = js.Any.fromFunction2(emitSignal), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[DBusServiceInterface]
  }
}

