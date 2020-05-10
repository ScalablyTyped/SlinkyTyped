package typingsSlinky.awsServerlessExpress.middlewareMod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-serverless-express/middleware", "eventContext")
@js.native
object eventContext extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

