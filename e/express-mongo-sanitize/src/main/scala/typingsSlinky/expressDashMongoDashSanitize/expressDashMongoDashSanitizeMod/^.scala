package typingsSlinky.expressDashMongoDashSanitize.expressDashMongoDashSanitizeMod

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mongo-sanitize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit] = js.native
  def apply(options: MongoSanitizeOptions): js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit] = js.native
}

