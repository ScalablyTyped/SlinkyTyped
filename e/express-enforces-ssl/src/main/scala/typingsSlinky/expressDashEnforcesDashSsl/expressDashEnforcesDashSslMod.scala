package typingsSlinky.expressDashEnforcesDashSsl

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-enforces-ssl", JSImport.Namespace)
@js.native
object expressDashEnforcesDashSslMod extends js.Object {
  /**
    * Enforces HTTPS connections on any incoming requests.
    */
  def apply(): js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit] = js.native
}

