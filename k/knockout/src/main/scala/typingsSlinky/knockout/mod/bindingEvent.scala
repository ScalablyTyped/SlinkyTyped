package typingsSlinky.knockout.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.knockout.knockoutStrings.childrenComplete
import typingsSlinky.knockout.knockoutStrings.descendantsComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingEvent {
  
  @JSImport("knockout", "bindingEvent.startPossiblyAsyncContentBinding")
  @js.native
  def startPossiblyAsyncContentBinding(node: Element, bindingContext: BindingContext[_]): BindingContext[_] = js.native
  
  @JSImport("knockout", "bindingEvent.subscribe")
  @js.native
  def subscribe_childrenComplete(node: Node, event: childrenComplete, callback: js.Function1[/* node */ Node, Unit]): Subscription = js.native
  @JSImport("knockout", "bindingEvent.subscribe")
  @js.native
  def subscribe_childrenComplete(
    node: Node,
    event: childrenComplete,
    callback: js.Function1[/* node */ Node, Unit],
    callbackContext: js.Any
  ): Subscription = js.native
  @JSImport("knockout", "bindingEvent.subscribe")
  @js.native
  def subscribe_descendantsComplete(node: Node, event: descendantsComplete, callback: js.Function1[/* node */ Node, Unit]): Subscription = js.native
  @JSImport("knockout", "bindingEvent.subscribe")
  @js.native
  def subscribe_descendantsComplete(
    node: Node,
    event: descendantsComplete,
    callback: js.Function1[/* node */ Node, Unit],
    callbackContext: js.Any
  ): Subscription = js.native
}
