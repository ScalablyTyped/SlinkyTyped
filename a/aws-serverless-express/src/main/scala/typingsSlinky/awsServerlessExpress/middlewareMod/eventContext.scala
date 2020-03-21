package typingsSlinky.awsServerlessExpress.middlewareMod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-serverless-express/middleware", "eventContext")
@js.native
object eventContext extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: Options): RequestHandler[ParamsDictionary] = js.native
}

