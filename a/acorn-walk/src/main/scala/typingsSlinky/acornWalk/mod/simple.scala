package typingsSlinky.acornWalk.mod

import typingsSlinky.acorn.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("acorn-walk", "simple")
@js.native
object simple extends js.Object {
  
  def apply[TState](node: Node, visitors: SimpleVisitors[TState]): Unit = js.native
  def apply[TState](node: Node, visitors: SimpleVisitors[TState], base: js.UndefOr[scala.Nothing], state: TState): Unit = js.native
  def apply[TState](node: Node, visitors: SimpleVisitors[TState], base: RecursiveVisitors[TState]): Unit = js.native
  def apply[TState](node: Node, visitors: SimpleVisitors[TState], base: RecursiveVisitors[TState], state: TState): Unit = js.native
}
