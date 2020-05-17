package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - java.lang.String
  - typingsSlinky.ractive.mod.ShuffleFn
*/
trait Shuffler extends js.Object

object Shuffler {
  @scala.inline
  implicit def apply(value: Boolean): Shuffler = value.asInstanceOf[Shuffler]
  @scala.inline
  implicit def apply(value: ShuffleFn): Shuffler = value.asInstanceOf[Shuffler]
  @scala.inline
  implicit def apply(value: String): Shuffler = value.asInstanceOf[Shuffler]
}

