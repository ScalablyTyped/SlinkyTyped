package typingsSlinky.atOctokitRest

import typingsSlinky.atOctokitRest.atOctokitRestMod.Endpoint
import typingsSlinky.atOctokitRest.atOctokitRestMod.EndpointOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsCreateCommentReplyParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsCreateCommentReplyParamsDeprecatedInReplyTo
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsCreateCommentReplyParamsDeprecatedNumber
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsCreateCommentReplyResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.RequestOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromisePullsCreateCommentReplyParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsCreateCommentReplyResponse]] = js.native
  def apply(
    params: RequestOptions with (PullsCreateCommentReplyParams | PullsCreateCommentReplyParamsDeprecatedInReplyTo | PullsCreateCommentReplyParamsDeprecatedNumber)
  ): js.Promise[Response[PullsCreateCommentReplyResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

