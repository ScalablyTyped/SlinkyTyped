package typingsSlinky.oJs.ohandlerMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.std.BufferSource
import typingsSlinky.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Blob
  - typingsSlinky.std.BufferSource
  - typingsSlinky.std.FormData
  - typingsSlinky.std.URLSearchParams
  - java.lang.String
  - js.Object
*/
trait BodyType extends js.Object

object BodyType {
  @scala.inline
  implicit def apply(value: Blob): BodyType = value.asInstanceOf[BodyType]
  @scala.inline
  implicit def apply(value: BufferSource): BodyType = value.asInstanceOf[BodyType]
  @scala.inline
  implicit def apply(value: FormData): BodyType = value.asInstanceOf[BodyType]
  @scala.inline
  implicit def apply(value: js.Object): BodyType = value.asInstanceOf[BodyType]
  @scala.inline
  implicit def apply(value: String): BodyType = value.asInstanceOf[BodyType]
  @scala.inline
  implicit def apply(value: URLSearchParams): BodyType = value.asInstanceOf[BodyType]
}

