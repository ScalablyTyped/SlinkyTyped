package typingsSlinky.atOctokitRest

import typingsSlinky.atOctokitRest.atOctokitRestMod.Endpoint
import typingsSlinky.atOctokitRest.atOctokitRestMod.EndpointOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsCreateCommentParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsCreateCommentParamsDeprecatedInReplyTo
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsCreateCommentParamsDeprecatedNumber
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsCreateCommentResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.RequestOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromisePullsCreateCommentParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsCreateCommentResponse]] = js.native
  def apply(
    params: RequestOptions with (PullsCreateCommentParams | PullsCreateCommentParamsDeprecatedInReplyTo | PullsCreateCommentParamsDeprecatedNumber)
  ): js.Promise[Response[PullsCreateCommentResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

