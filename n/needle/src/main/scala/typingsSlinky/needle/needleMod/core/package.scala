package typingsSlinky.needle.needleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object core {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.Buffer

  type BodyData = Buffer | KeyValue | typingsSlinky.node.NodeJS.ReadableStream | String | Null
  type Cookies = StringDictionary[js.Any]
  type KeyValue = StringDictionary[js.Any]
  type NeedleCallback = js.Function3[/* error */ js.Error | Null, /* response */ NeedleResponse, /* body */ js.Any, Unit]
  type NeedleOptions = RequestOptions with ResponseOptions with RedirectOptions with typingsSlinky.node.httpsMod.RequestOptions
  type ReadableStream = typingsSlinky.node.NodeJS.ReadableStream
}
