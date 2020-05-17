package typingsSlinky.curriable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Y
  - X
*/
trait Cast[X, Y] extends js.Object

object Cast {
  @scala.inline
  implicit def apply[X, Y](value: X | Y): Cast[X, Y] = value.asInstanceOf[Cast[X, Y]]
}

