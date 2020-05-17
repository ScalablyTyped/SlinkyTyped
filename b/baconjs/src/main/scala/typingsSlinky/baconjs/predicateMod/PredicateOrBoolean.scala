package typingsSlinky.baconjs.predicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baconjs.predicateMod.Predicate[V]
  - scala.Boolean
*/
trait PredicateOrBoolean[V] extends js.Object

object PredicateOrBoolean {
  @scala.inline
  implicit def apply[V](value: Boolean): PredicateOrBoolean[V] = value.asInstanceOf[PredicateOrBoolean[V]]
  @scala.inline
  implicit def apply[V](value: Predicate[V]): PredicateOrBoolean[V] = value.asInstanceOf[PredicateOrBoolean[V]]
}

