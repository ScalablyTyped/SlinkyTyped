package typingsSlinky.graphqlUpload.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-upload", "graphqlUploadExpress")
@js.native
object graphqlUploadExpress extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(uploadOptions: UploadOptions): RequestHandler[ParamsDictionary] = js.native
}

