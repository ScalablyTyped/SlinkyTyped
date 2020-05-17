package typingsSlinky.baconjs.predicateMod

import typingsSlinky.baconjs.describeMod.Desc
import typingsSlinky.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/predicate", "withPredicate")
@js.native
object withPredicate extends js.Object {
  def apply[V](
    src: default[V],
    f: PredicateOrProperty[V],
    predicateTransformer: Predicate2Transformer[V],
    desc: Desc
  ): default[V] = js.native
}

