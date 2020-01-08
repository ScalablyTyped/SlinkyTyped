package typingsSlinky.ramda

import typingsSlinky.ramda.toolsMod.Evolvable
import typingsSlinky.ramda.toolsMod.Evolve
import typingsSlinky.ramda.toolsMod.Evolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/evolve", JSImport.Namespace)
@js.native
object srcEvolveMod extends js.Object {
  def default[E /* <: Evolver */](transformations: E): js.Function1[/* obj */ Evolvable[E], Evolve[Evolvable[E], E]] = js.native
  def default[E /* <: Evolver */, V /* <: Evolvable[E] */](transformations: E, obj: V): Evolve[V, E] = js.native
}

