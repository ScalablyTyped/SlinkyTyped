package typingsSlinky.requestretry.requestretryMod

import typingsSlinky.request.requestMod.RequestAPI
import typingsSlinky.request.requestMod.RequiredUriUrl
import typingsSlinky.requestretry.Anon_HTTPOrNetworkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryRequestAPI extends RequestAPI[RequestPromise, RequestRetryOptions, RequiredUriUrl] {
  var RetryStrategies: Anon_HTTPOrNetworkError = js.native
}

