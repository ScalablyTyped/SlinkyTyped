package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is fired when an element is inserted in a container.
  * @see XContainerListener
  */
@js.native
trait ContainerEvent extends EventObject {
  
  /**
    * It contains the accessor to the element which is inserted or removed.
    *
    * The type and the value of the accessor depends on the service.
    */
  var Accessor: js.Any = js.native
  
  /** This contains the element that was inserted or removed. */
  var Element: js.Any = js.native
  
  /** This contains the replaced element. */
  var ReplacedElement: js.Any = js.native
}
object ContainerEvent {
  
  @scala.inline
  def apply(Accessor: js.Any, Element: js.Any, ReplacedElement: js.Any, Source: XInterface): ContainerEvent = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any], ReplacedElement = ReplacedElement.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerEvent]
  }
  
  @scala.inline
  implicit class ContainerEventMutableBuilder[Self <: ContainerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessor(value: js.Any): Self = StObject.set(x, "Accessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacedElement(value: js.Any): Self = StObject.set(x, "ReplacedElement", value.asInstanceOf[js.Any])
  }
}
