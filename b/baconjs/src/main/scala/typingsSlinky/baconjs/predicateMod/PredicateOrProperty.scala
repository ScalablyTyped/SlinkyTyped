package typingsSlinky.baconjs.predicateMod

import typingsSlinky.baconjs.observableMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baconjs.predicateMod.Predicate[V]
  - scala.Boolean
  - typingsSlinky.baconjs.observableMod.Property[scala.Boolean]
*/
trait PredicateOrProperty[V] extends js.Object

object PredicateOrProperty {
  @scala.inline
  implicit def apply[V](value: Boolean): PredicateOrProperty[V] = value.asInstanceOf[PredicateOrProperty[V]]
  @scala.inline
  implicit def apply[V](value: Predicate[V]): PredicateOrProperty[V] = value.asInstanceOf[PredicateOrProperty[V]]
  @scala.inline
  implicit def apply[V](value: Property[Boolean]): PredicateOrProperty[V] = value.asInstanceOf[PredicateOrProperty[V]]
}

