package typingsSlinky.graphqlUpload.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-upload", "processRequest")
@js.native
object processRequest extends js.Object {
  def apply(request: IncomingMessage, response: ServerResponse): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
  def apply(request: IncomingMessage, response: ServerResponse, uploadOptions: UploadOptions): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
}

