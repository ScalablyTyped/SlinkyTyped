package typingsSlinky.knockout.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "applyBindingsToDescendants")
@js.native
object applyBindingsToDescendants extends js.Object {
  
  def apply[T](bindingContext: T): Unit = js.native
  def apply[T](bindingContext: T, rootNode: Node): Unit = js.native
  def apply[T](bindingContext: BindingContext[T]): Unit = js.native
  def apply[T](bindingContext: BindingContext[T], rootNode: Node): Unit = js.native
}
