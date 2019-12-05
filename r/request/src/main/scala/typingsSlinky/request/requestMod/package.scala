package typingsSlinky.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.Buffer

  type Cookie = typingsSlinky.toughDashCookie.toughDashCookieMod.Cookie
  type Headers = StringDictionary[js.Any]
  type MultipartBody = String | Buffer | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.Uint8Array
  type OptionalUriUrl = RequiredUriUrl | js.Object
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = UriOptions with CoreOptions
  type OptionsWithUrl = UrlOptions with CoreOptions
  type RequestCallback = js.Function3[/* error */ js.Any, /* response */ Response, /* body */ js.Any, Unit]
  type RequestResponse = Response
  // aliases for backwards compatibility
  type ResponseRequest = Request
}
