package typingsSlinky.atOctokitRest

import typingsSlinky.atOctokitRest.atOctokitRestMod.Endpoint
import typingsSlinky.atOctokitRest.atOctokitRestMod.EndpointOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.IssuesReplaceLabelsParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.IssuesReplaceLabelsParamsDeprecatedNumber
import typingsSlinky.atOctokitRest.atOctokitRestMod.IssuesReplaceLabelsResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.RequestOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsIssuesReplaceLabelsParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesReplaceLabelsResponse]] = js.native
  def apply(
    params: RequestOptions with (IssuesReplaceLabelsParams | IssuesReplaceLabelsParamsDeprecatedNumber)
  ): js.Promise[Response[IssuesReplaceLabelsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

