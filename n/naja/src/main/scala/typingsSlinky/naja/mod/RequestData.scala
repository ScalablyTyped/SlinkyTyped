package typingsSlinky.naja.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - java.lang.String
  - scala.Double
  - js.Array[js.Any]
  - js.Object
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Blob
  - typingsSlinky.std.FormData
*/
trait RequestData extends js.Object

object RequestData {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): RequestData = value.asInstanceOf[RequestData]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): RequestData = value.asInstanceOf[RequestData]
  @scala.inline
  implicit def apply(value: Blob): RequestData = value.asInstanceOf[RequestData]
  @scala.inline
  implicit def apply(value: Double): RequestData = value.asInstanceOf[RequestData]
  @scala.inline
  implicit def apply(value: FormData): RequestData = value.asInstanceOf[RequestData]
  @scala.inline
  implicit def apply(value: Null): RequestData = value.asInstanceOf[RequestData]
  @scala.inline
  implicit def apply(value: js.Object): RequestData = value.asInstanceOf[RequestData]
  @scala.inline
  implicit def apply(value: String): RequestData = value.asInstanceOf[RequestData]
}

