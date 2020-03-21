package typingsSlinky.requestretry.mod

import typingsSlinky.request.mod.RequestAPI
import typingsSlinky.request.mod.RequiredUriUrl
import typingsSlinky.requestretry.AnonHTTPOrNetworkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryRequestAPI extends RequestAPI[RequestPromise, RequestRetryOptions, RequiredUriUrl] {
  var RetryStrategies: AnonHTTPOrNetworkError = js.native
}

