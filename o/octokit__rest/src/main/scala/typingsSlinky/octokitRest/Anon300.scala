package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.Endpoint
import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.PullsDeleteReviewRequestParams
import typingsSlinky.octokitRest.mod.Octokit.PullsDeleteReviewRequestParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon300 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[AnyResponse] = js.native
  def apply(
    params: RequestOptions with PullsDeleteReviewRequestParamsDeprecatedNumber with PullsDeleteReviewRequestParams
  ): js.Promise[AnyResponse] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

