package typingsSlinky.preact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Preact Component interface
// -----------------------------------
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Any
*/
trait Key extends js.Object

object Key {
  @scala.inline
  implicit def apply(value: js.Any): Key = value.asInstanceOf[Key]
  @scala.inline
  implicit def apply(value: Double): Key = value.asInstanceOf[Key]
  @scala.inline
  implicit def apply(value: String): Key = value.asInstanceOf[Key]
}

