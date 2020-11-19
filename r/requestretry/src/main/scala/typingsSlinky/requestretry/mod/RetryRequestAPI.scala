package typingsSlinky.requestretry.mod

import typingsSlinky.request.mod.RequestAPI
import typingsSlinky.request.mod.RequiredUriUrl
import typingsSlinky.requestretry.anon.HTTPOrNetworkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryRequestAPI extends RequestAPI[RequestPromise, RequestRetryOptions, RequiredUriUrl] {
  
  var RetryStrategies: HTTPOrNetworkError = js.native
}
