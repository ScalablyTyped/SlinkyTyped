package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object predicateMod {
  type Predicate[V] = typingsSlinky.baconjs.typesMod.Function1[V, scala.Boolean]
  type Predicate2Transformer[V] = js.Function1[
    /* p */ typingsSlinky.baconjs.predicateMod.Predicate[V], 
    typingsSlinky.baconjs.transformMod.Transformer[V, V]
  ]
}
