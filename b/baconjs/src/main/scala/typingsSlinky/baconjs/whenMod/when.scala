package typingsSlinky.baconjs.whenMod

import typingsSlinky.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/when", "when")
@js.native
object when extends js.Object {
  def apply[O](patterns: Pattern[O]*): EventStream[O] = js.native
}

