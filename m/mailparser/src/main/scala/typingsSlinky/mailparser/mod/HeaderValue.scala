package typingsSlinky.mailparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.mailparser.mod.AddressObject
  - typingsSlinky.std.Date
  - typingsSlinky.mailparser.mod.StructuredHeader
*/
trait HeaderValue extends js.Object

object HeaderValue {
  @scala.inline
  implicit def apply(value: AddressObject): HeaderValue = value.asInstanceOf[HeaderValue]
  @scala.inline
  implicit def apply(value: js.Array[String]): HeaderValue = value.asInstanceOf[HeaderValue]
  @scala.inline
  implicit def apply(value: js.Date): HeaderValue = value.asInstanceOf[HeaderValue]
  @scala.inline
  implicit def apply(value: String): HeaderValue = value.asInstanceOf[HeaderValue]
  @scala.inline
  implicit def apply(value: StructuredHeader): HeaderValue = value.asInstanceOf[HeaderValue]
}

