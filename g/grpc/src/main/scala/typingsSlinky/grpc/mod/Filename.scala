package typingsSlinky.grpc.mod

import typingsSlinky.grpc.anon.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.grpc.anon.File
*/
trait Filename extends js.Object

object Filename {
  @scala.inline
  implicit def apply(value: File): Filename = value.asInstanceOf[Filename]
  @scala.inline
  implicit def apply(value: String): Filename = value.asInstanceOf[Filename]
}

