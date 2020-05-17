package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.OrgsRemoveMembershipParams
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `259` extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: typingsSlinky.octokitRest.mod.Octokit.Endpoint = js.native
  def apply(): js.Promise[AnyResponse] = js.native
  def apply(params: RequestOptions with OrgsRemoveMembershipParams): js.Promise[AnyResponse] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

