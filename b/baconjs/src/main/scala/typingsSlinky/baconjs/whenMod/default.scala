package typingsSlinky.baconjs.whenMod

import typingsSlinky.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/when", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[O](patterns: Pattern[O]*): EventStream[O] = js.native
}

