package typingsSlinky.baconjs.baconjsMod

import typingsSlinky.baconjs.typesWhenMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "when")
@js.native
object when extends js.Object {
  def apply[O](patterns: Pattern[O]*): typingsSlinky.baconjs.typesObservableMod.EventStream[O] = js.native
}

