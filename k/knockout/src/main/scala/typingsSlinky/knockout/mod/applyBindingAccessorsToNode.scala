package typingsSlinky.knockout.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "applyBindingAccessorsToNode")
@js.native
object applyBindingAccessorsToNode extends js.Object {
  def apply[T](node: Node, bindings: js.Function0[BindingAccessors], viewModel: T): Unit = js.native
  def apply[T](node: Node, bindings: js.Function0[BindingAccessors], viewModel: BindingContext[T]): Unit = js.native
  def apply[T](node: Node, bindings: BindingAccessors, viewModel: T): Unit = js.native
  def apply[T](node: Node, bindings: BindingAccessors, viewModel: BindingContext[T]): Unit = js.native
}

