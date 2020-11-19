package typingsSlinky.aureliaBinding.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "CheckedObserver")
@js.native
class CheckedObserver protected () extends InternalPropertyObserver {
  def this(element: Element, handler: EventSubscriber, observerLocator: ObserverLocator) = this()
  
  /**
    * Handle underlying checkbox element change events
    */
  def handleEvent(): js.Any = js.native
}
