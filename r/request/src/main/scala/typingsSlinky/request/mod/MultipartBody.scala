package typingsSlinky.request.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Uint8Array
*/
trait MultipartBody extends js.Object

object MultipartBody {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): MultipartBody = value.asInstanceOf[MultipartBody]
  @scala.inline
  implicit def apply(value: Buffer): MultipartBody = value.asInstanceOf[MultipartBody]
  @scala.inline
  implicit def apply(value: String): MultipartBody = value.asInstanceOf[MultipartBody]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): MultipartBody = value.asInstanceOf[MultipartBody]
}

