package typingsSlinky.bluebird.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * error * / E, scala.Boolean]
  - js.Object with E
*/
trait CatchFilter[E] extends js.Object

object CatchFilter {
  @scala.inline
  implicit def apply[E](value: js.Object with E): CatchFilter[E] = value.asInstanceOf[CatchFilter[E]]
  @scala.inline
  implicit def apply[E](value: js.Function1[/* error */ E, Boolean]): CatchFilter[E] = value.asInstanceOf[CatchFilter[E]]
}

