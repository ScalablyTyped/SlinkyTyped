package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameReplace
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to a list of URLs bound to events of this object */
@js.native
trait XEventsSupplier extends XInterface {
  
  /**
    * offers a list of event handlers which are be bound to events of this object
    * @returns an {@link Events} description object
    */
  val Events: XNameReplace = js.native
  
  /**
    * offers a list of event handlers which are be bound to events of this object
    * @returns an {@link Events} description object
    */
  def getEvents(): XNameReplace = js.native
}
object XEventsSupplier {
  
  @scala.inline
  def apply(
    Events: XNameReplace,
    acquire: () => Unit,
    getEvents: () => XNameReplace,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEventsSupplier = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEvents = js.Any.fromFunction0(getEvents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEventsSupplier]
  }
  
  @scala.inline
  implicit class XEventsSupplierMutableBuilder[Self <: XEventsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: XNameReplace): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEvents(value: () => XNameReplace): Self = StObject.set(x, "getEvents", js.Any.fromFunction0(value))
  }
}
