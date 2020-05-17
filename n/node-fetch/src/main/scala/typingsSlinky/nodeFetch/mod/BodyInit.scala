package typingsSlinky.nodeFetch.mod

import typingsSlinky.formData.mod.^
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.urlMod.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.ArrayBufferView
  - typingsSlinky.node.NodeJS.ReadableStream
  - java.lang.String
  - typingsSlinky.node.urlMod.URLSearchParams
  - typingsSlinky.formData.mod.^
*/
trait BodyInit extends js.Object

object BodyInit {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBufferView): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: ReadableStream): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: String): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: URLSearchParams): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: ^): BodyInit = value.asInstanceOf[BodyInit]
}

