package typingsSlinky.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  def getUser(req: Request[ParamsDictionary], res: Response, next: NextFunction): js.Promise[Principal]
}

object AuthProvider {
  @scala.inline
  def apply(getUser: (Request[ParamsDictionary], Response, NextFunction) => js.Promise[Principal]): AuthProvider = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
  
    __obj.asInstanceOf[AuthProvider]
  }
}

