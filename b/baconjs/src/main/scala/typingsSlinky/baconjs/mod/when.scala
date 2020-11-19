package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.whenMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "when")
@js.native
object when extends js.Object {
  
  def apply[O](patterns: Pattern[O]*): typingsSlinky.baconjs.observableMod.EventStream[O] = js.native
}
