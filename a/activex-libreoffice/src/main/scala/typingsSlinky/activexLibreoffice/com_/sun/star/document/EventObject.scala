package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is thrown on document and document content events
  * @deprecated Deprecated
  * @see XEventListener
  * @see XEventBroadcaster
  * @see DocumentEvent
  */
@js.native
trait EventObject
  extends typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject {
  /**
    * specifies the name of the occurred event
    *
    * For a list of possible event names see {@link Events} .
    */
  var EventName: String = js.native
}

object EventObject {
  @scala.inline
  def apply(EventName: String, Source: XInterface): EventObject = {
    val __obj = js.Dynamic.literal(EventName = EventName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  @scala.inline
  implicit class EventObjectOps[Self <: EventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

