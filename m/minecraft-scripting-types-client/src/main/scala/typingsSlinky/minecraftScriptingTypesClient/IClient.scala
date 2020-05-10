package typingsSlinky.minecraftScriptingTypesClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClient extends js.Object {
  def log(message: String): Unit = js.native
  def registerSystem[TSystem /* <: IClientSystem[TSystem] */](majorVersion: Double, minorVersion: Double): TSystem = js.native
}

object IClient {
  @scala.inline
  def apply(log: String => Unit, registerSystem: (Double, Double) => js.Any): IClient = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), registerSystem = js.Any.fromFunction2(registerSystem))
    __obj.asInstanceOf[IClient]
  }
  @scala.inline
  implicit class IClientOps[Self <: IClient] (val x: Self) extends AnyVal {
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

