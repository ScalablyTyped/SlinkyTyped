package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.Endpoint
import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.ReposListProtectedBranchRequiredStatusChecksContextsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListProtectedBranchRequiredStatusChecksContextsResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon443 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposListProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  def apply(params: RequestOptions with ReposListProtectedBranchRequiredStatusChecksContextsParams): js.Promise[Response[ReposListProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

