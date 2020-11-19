package typingsSlinky.knockout.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "applyBindingsToNode")
@js.native
object applyBindingsToNode extends js.Object {
  
  def apply[T](node: Node, bindings: js.Function0[js.Object], viewModel: T): Unit = js.native
  def apply[T](node: Node, bindings: js.Function0[js.Object], viewModel: BindingContext[T]): Unit = js.native
  def apply[T](node: Node, bindings: js.Object, viewModel: T): Unit = js.native
  def apply[T](node: Node, bindings: js.Object, viewModel: BindingContext[T]): Unit = js.native
}
