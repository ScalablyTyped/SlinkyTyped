package typingsSlinky.hapiIron.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
Password secret string or buffer.
*/
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
*/
trait Password_ extends js.Object

object Password_ {
  @scala.inline
  implicit def apply(value: Buffer): Password_ = value.asInstanceOf[Password_]
  @scala.inline
  implicit def apply(value: String): Password_ = value.asInstanceOf[Password_]
}

