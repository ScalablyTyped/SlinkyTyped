package typingsSlinky.atOctokitRest

import typingsSlinky.atOctokitRest.atOctokitRestMod.AppsCheckAccountIsAssociatedWithAnyStubbedParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.AppsCheckAccountIsAssociatedWithAnyStubbedResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.Endpoint
import typingsSlinky.atOctokitRest.atOctokitRestMod.EndpointOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.RequestOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsAppsCheckAccountIsAssociatedWithAnyStubbedParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[AppsCheckAccountIsAssociatedWithAnyStubbedResponse]] = js.native
  def apply(params: RequestOptions with AppsCheckAccountIsAssociatedWithAnyStubbedParams): js.Promise[Response[AppsCheckAccountIsAssociatedWithAnyStubbedResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

