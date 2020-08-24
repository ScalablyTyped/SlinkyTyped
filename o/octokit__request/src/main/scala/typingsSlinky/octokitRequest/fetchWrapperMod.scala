package typingsSlinky.octokitRequest

import typingsSlinky.octokitRequest.anon.Data
import typingsSlinky.octokitRequest.anon.Redirect
import typingsSlinky.octokitTypes.endpointInterfaceMod.EndpointInterface
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/request/dist-types/fetch-wrapper", JSImport.Namespace)
@js.native
object fetchWrapperMod extends js.Object {
  def default(requestOptions: ReturnType[EndpointInterface[js.Object]] with Redirect): js.Promise[Data] = js.native
}

