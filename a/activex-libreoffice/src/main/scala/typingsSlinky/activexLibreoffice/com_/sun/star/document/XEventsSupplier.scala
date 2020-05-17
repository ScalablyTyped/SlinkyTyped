package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameReplace
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class XEventsSupplierOps[Self <: XEventsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: XNameReplace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetEvents(value: () => XNameReplace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEvents")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

