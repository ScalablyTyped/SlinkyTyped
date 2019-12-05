package typingsSlinky.apolloDashServerDashCore

import typingsSlinky.graphqlDashUpload.graphqlDashUploadMod.GraphQLOperation
import typingsSlinky.graphqlDashUpload.graphqlDashUploadMod.UploadOptions
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Request extends js.Object {
  def apply(request: IncomingMessage, response: ServerResponse): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
  def apply(request: IncomingMessage, response: ServerResponse, uploadOptions: UploadOptions): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
}

