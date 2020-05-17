package typingsSlinky.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.ArrayBufferView
  - java.lang.String
*/
trait BodyInit extends js.Object

object BodyInit {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBufferView): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: String): BodyInit = value.asInstanceOf[BodyInit]
}

