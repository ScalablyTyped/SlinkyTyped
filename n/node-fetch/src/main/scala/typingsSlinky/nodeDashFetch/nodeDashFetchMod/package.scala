package typingsSlinky.nodeDashFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashFetchMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.NodeJS.ReadableStream
  import typingsSlinky.node.urlMod.URLSearchParams

  type BlobPart = scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | Blob | String
  type BodyInit = scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | ReadableStream | String | URLSearchParams
  type HeaderInit = HeadersInit
  type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.nodeDashFetch.nodeDashFetchMod.URLLike
    - typings.nodeDashFetch.nodeDashFetchMod.Request
  */
  type RequestInfo = _RequestInfo | String
}
