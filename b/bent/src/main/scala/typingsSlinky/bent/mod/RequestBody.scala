package typingsSlinky.bent.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.streamMod.Stream
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.bent.mod.Json
*/
trait RequestBody extends js.Object

object RequestBody {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): RequestBody = value.asInstanceOf[RequestBody]
  @scala.inline
  implicit def apply(value: Buffer): RequestBody = value.asInstanceOf[RequestBody]
  @scala.inline
  implicit def apply(value: Json): RequestBody = value.asInstanceOf[RequestBody]
  @scala.inline
  implicit def apply(value: Stream): RequestBody = value.asInstanceOf[RequestBody]
  @scala.inline
  implicit def apply(value: String): RequestBody = value.asInstanceOf[RequestBody]
}

