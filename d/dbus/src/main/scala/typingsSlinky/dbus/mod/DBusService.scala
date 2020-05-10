package typingsSlinky.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBusService extends js.Object {
  def createObject(path: String): DBusServiceObject = js.native
  def disconnect(): Unit = js.native
  def removeObject(service: DBusServiceObject): Unit = js.native
}

object DBusService {
  @scala.inline
  def apply(
    createObject: String => DBusServiceObject,
    disconnect: () => Unit,
    removeObject: DBusServiceObject => Unit
  ): DBusService = {
    val __obj = js.Dynamic.literal(createObject = js.Any.fromFunction1(createObject), disconnect = js.Any.fromFunction0(disconnect), removeObject = js.Any.fromFunction1(removeObject))
    __obj.asInstanceOf[DBusService]
  }
  @scala.inline
  implicit class DBusServiceOps[Self <: DBusService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateObject(value: String => DBusServiceObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveObject(value: DBusServiceObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeObject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

