package typingsSlinky.babelWalk.mod

import typingsSlinky.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-walk/lib", "simple")
@js.native
object simple extends js.Object {
  
  def apply[TState](visitors: SimpleVisitors[TState]): js.Function2[/* node */ Node, /* state */ TState, Unit] = js.native
}
