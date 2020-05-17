package typingsSlinky.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Key is the type of the unique identifier managed by Models for each node data object. */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait Key extends js.Object

object Key {
  @scala.inline
  implicit def apply(value: Double): Key = value.asInstanceOf[Key]
  @scala.inline
  implicit def apply(value: String): Key = value.asInstanceOf[Key]
}

