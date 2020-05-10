package typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthProvider extends js.Object {
  def getUser(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): js.Promise[Principal] = js.native
}

object AuthProvider {
  @scala.inline
  def apply(
    getUser: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => js.Promise[Principal]
  ): AuthProvider = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
    __obj.asInstanceOf[AuthProvider]
  }
  @scala.inline
  implicit class AuthProviderOps[Self <: AuthProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUser(
      value: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => js.Promise[Principal]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUser")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

