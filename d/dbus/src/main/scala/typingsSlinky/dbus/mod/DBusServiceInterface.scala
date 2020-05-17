package typingsSlinky.dbus.mod

import typingsSlinky.dbus.anon.Getter
import typingsSlinky.dbus.anon.In
import typingsSlinky.dbus.anon.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  ): Unit = js.native
  def addProperty(name: String, opts: Getter): Unit = js.native
  def addSignal(name: String, opts: Types): Unit = js.native
  def emitSignal(name: String, values: js.Any*): Unit = js.native
  def update(): Unit = js.native
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
  @scala.inline
  implicit class DBusServiceInterfaceOps[Self <: DBusServiceInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMethod(
      value: (String, In, js.Function3[
          /* name */ String, 
          /* quality */ js.Any, 
          /* callback */ js.Function1[/* res */ js.Any, Unit], 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMethod")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddProperty(value: (String, Getter) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddSignal(value: (String, Types) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSignal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmitSignal(value: (String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitSignal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

