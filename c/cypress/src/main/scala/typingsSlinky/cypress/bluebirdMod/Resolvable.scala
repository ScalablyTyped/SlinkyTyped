package typingsSlinky.cypress.bluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - R
  - js.Thenable[R]
*/
trait Resolvable[R] extends js.Object

object Resolvable {
  @scala.inline
  implicit def apply[R](value: R): Resolvable[R] = value.asInstanceOf[Resolvable[R]]
  @scala.inline
  implicit def apply[R](value: js.Thenable[R]): Resolvable[R] = value.asInstanceOf[Resolvable[R]]
}

