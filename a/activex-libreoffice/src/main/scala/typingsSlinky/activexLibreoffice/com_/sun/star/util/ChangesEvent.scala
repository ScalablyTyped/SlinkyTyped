package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is fired when a set of changes becomes effective on the source of the event.
  * @see XChangesSet
  * @see XChangesBatch
  * @see XChangesListener
  * @see XChangesNotifier
  * @see com.sun.star.container.ContainerEvent
  * @see ElementChange
  */
@js.native
trait ChangesEvent extends EventObject {
  /**
    * contains the accessor to the common root of the changed elements.
    *
    * Type and value of the accessor depend on the service.
    */
  var Base: js.Any = js.native
  /** contains the changes which occurred. */
  var Changes: ChangesSet = js.native
}

object ChangesEvent {
  @scala.inline
  def apply(Base: js.Any, Changes: ChangesSet, Source: XInterface): ChangesEvent = {
    val __obj = js.Dynamic.literal(Base = Base.asInstanceOf[js.Any], Changes = Changes.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesEvent]
  }
  @scala.inline
  implicit class ChangesEventOps[Self <: ChangesEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanges(value: ChangesSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Changes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

