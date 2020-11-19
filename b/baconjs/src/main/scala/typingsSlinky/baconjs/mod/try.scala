package typingsSlinky.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "try")
@js.native
object `try` extends js.Object {
  
  def apply[In, Out](f: js.Function1[/* value */ In, Out]): js.Function1[/* value */ In, typingsSlinky.baconjs.observableMod.EventStream[Out]] = js.native
}
