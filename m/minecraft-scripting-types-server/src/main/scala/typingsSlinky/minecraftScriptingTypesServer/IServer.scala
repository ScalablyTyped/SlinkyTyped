package typingsSlinky.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServer extends js.Object {
  def log(message: String): Unit = js.native
  def registerSystem[TSystem /* <: IServerSystem[TSystem] */](majorVersion: Double, minorVersion: Double): TSystem = js.native
}

object IServer {
  @scala.inline
  def apply(log: String => Unit, registerSystem: (Double, Double) => js.Any): IServer = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), registerSystem = js.Any.fromFunction2(registerSystem))
    __obj.asInstanceOf[IServer]
  }
  @scala.inline
  implicit class IServerOps[Self <: IServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterSystem(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSystem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

