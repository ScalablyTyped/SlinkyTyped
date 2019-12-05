package typingsSlinky.requestDashPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestDashPromiseMod {
  import typingsSlinky.request.requestMod.RequestAPI
  import typingsSlinky.request.requestMod.RequiredUriUrl
  import typingsSlinky.request.requestMod.UriOptions
  import typingsSlinky.request.requestMod.UrlOptions

  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = UriOptions with RequestPromiseOptions
  type OptionsWithUrl = UrlOptions with RequestPromiseOptions
  type RequestPromiseAPI = RequestAPI[RequestPromise[js.Any], RequestPromiseOptions, RequiredUriUrl]
}
