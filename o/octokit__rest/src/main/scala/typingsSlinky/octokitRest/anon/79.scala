package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.AppsListMarketplacePurchasesForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.AppsListMarketplacePurchasesForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `79` extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: typingsSlinky.octokitRest.mod.Octokit.Endpoint = js.native
  def apply(): js.Promise[Response[AppsListMarketplacePurchasesForAuthenticatedUserResponse]] = js.native
  def apply(params: RequestOptions with AppsListMarketplacePurchasesForAuthenticatedUserParams): js.Promise[Response[AppsListMarketplacePurchasesForAuthenticatedUserResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

