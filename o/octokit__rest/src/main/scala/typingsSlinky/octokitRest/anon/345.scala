package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchAppRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchAppRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `345` extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: typingsSlinky.octokitRest.mod.Octokit.Endpoint = js.native
  def apply(): js.Promise[Response[ReposAddProtectedBranchAppRestrictionsResponse]] = js.native
  def apply(params: RequestOptions with ReposAddProtectedBranchAppRestrictionsParams): js.Promise[Response[ReposAddProtectedBranchAppRestrictionsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

