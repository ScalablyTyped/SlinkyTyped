package typingsSlinky.activexLibreoffice.com_.sun.star.accessibility

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this struct describes an accessible event, that is broadcasted from the {@link XAccessibleEventBroadcaster} and notified to {@link
  * XAccessibleEventListener} .
  *
  * It is usually implemented by {@link AccessibleContext} .
  * @since OOo 1.1.2
  */
@js.native
trait AccessibleEventObject extends EventObject {
  /**
    * specifies the type of this event.
    *
    * For a list of possible events see {@link AccessibleEventId} .
    */
  var EventId: Double = js.native
  /**
    * for events that specifies a value change, this is the new value.
    *
    * Depending on the {@link EventId} , this can be void.
    */
  var NewValue: js.Any = js.native
  /**
    * for events that specifies a value change, this is the old value.
    *
    * Depending on the {@link EventId} , this can be void.
    */
  var OldValue: js.Any = js.native
}

object AccessibleEventObject {
  @scala.inline
  def apply(EventId: Double, NewValue: js.Any, OldValue: js.Any, Source: XInterface): AccessibleEventObject = {
    val __obj = js.Dynamic.literal(EventId = EventId.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibleEventObject]
  }
  @scala.inline
  implicit class AccessibleEventObjectOps[Self <: AccessibleEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

