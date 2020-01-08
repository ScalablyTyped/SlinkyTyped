package typingsSlinky.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.httpMod.Agent

  type Cookie = typingsSlinky.toughDashCookie.toughDashCookieMod.Cookie
  type Headers = StringDictionary[js.Any]
  type MultipartBody = String | Buffer | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.Uint8Array
  type OptionalUriUrl = RequiredUriUrl | js.Object
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = UriOptions with CoreOptions
  type OptionsWithUrl = UrlOptions with CoreOptions
  /* Rewritten from type alias, can be one of: 
    - typings.request.requestBooleans.`false`
    - (org.scalablytyped.runtime.StringDictionary[typings.node.httpMod.Agent | typings.node.httpsMod.Agent]) with typings.request.requestMod.ExtraPoolOptions
    - typings.request.requestMod.ExtraPoolOptions
  */
  type PoolOptions = _PoolOptions | ((StringDictionary[Agent | typingsSlinky.node.httpsMod.Agent]) with ExtraPoolOptions)
  type RequestCallback = js.Function3[/* error */ js.Any, /* response */ Response, /* body */ js.Any, Unit]
  type RequestResponse = Response
  // aliases for backwards compatibility
  type ResponseRequest = Request
}
