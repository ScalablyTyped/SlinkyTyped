package typingsSlinky.bent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bentMod {
  import org.scalablytyped.runtime.NumberDictionary
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.experimental.Response
  import typingsSlinky.bent.Anon_Headers
  import typingsSlinky.bent.Anon_StatusCode
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.streamMod.PassThrough
  import typingsSlinky.node.streamMod.Stream

  type BaseUrl = String
  type BentResponse = NodeResponse | FetchResponse
  type FetchResponse = Response with Anon_StatusCode
  type Headers = StringDictionary[js.Any]
  type Json = (StringDictionary[js.Any] with NumberDictionary[js.Any]) | js.Array[js.Any]
  type NodeResponse = PassThrough with Anon_Headers
  type Options = HttpMethod | StatusCode | Headers | BaseUrl
  type RequestBody = String | Stream | Buffer | scala.scalajs.js.typedarray.ArrayBuffer | Json
  type RequestFunction[T /* <: ValidResponse */] = js.Function2[/* url */ String, /* body */ js.UndefOr[RequestBody], js.Promise[T]]
  type StatusCode = Double
  type ValidResponse = BentResponse | String | Buffer | scala.scalajs.js.typedarray.ArrayBuffer | Json
}
