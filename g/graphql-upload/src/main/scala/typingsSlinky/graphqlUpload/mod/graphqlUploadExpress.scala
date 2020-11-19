package typingsSlinky.graphqlUpload.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-upload", "graphqlUploadExpress")
@js.native
object graphqlUploadExpress extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(uploadOptions: UploadOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
