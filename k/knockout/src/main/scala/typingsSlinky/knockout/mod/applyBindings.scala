package typingsSlinky.knockout.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "applyBindings")
@js.native
object applyBindings extends js.Object {
  def apply[T](bindingContext: T): Unit = js.native
  def apply[T](bindingContext: T, rootNode: Null, extendCallback: BindingContextExtendCallback[T]): Unit = js.native
  def apply[T](bindingContext: T, rootNode: Node): Unit = js.native
  def apply[T](bindingContext: T, rootNode: Node, extendCallback: BindingContextExtendCallback[T]): Unit = js.native
  def apply[T](bindingContext: BindingContext[T]): Unit = js.native
  def apply[T](bindingContext: BindingContext[T], rootNode: Null, extendCallback: BindingContextExtendCallback[T]): Unit = js.native
  def apply[T](bindingContext: BindingContext[T], rootNode: Node): Unit = js.native
  def apply[T](bindingContext: BindingContext[T], rootNode: Node, extendCallback: BindingContextExtendCallback[T]): Unit = js.native
}

