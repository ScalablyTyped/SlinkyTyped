package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a control event send by extended user interface controls.
  * @since OOo 2.0.3
  */
@js.native
trait ControlEvent extends js.Object {
  /** specifies the event which has occurred. */
  var Event: String = js.native
  /** specifies a sequence of named values which are used as additional values for the event. The number and types of named values depend on the event. */
  var aInformation: SafeArray[NamedValue] = js.native
  /** fully parsed URL describing the control that sends this notification. */
  var aURL: URL = js.native
}

object ControlEvent {
  @scala.inline
  def apply(Event: String, aInformation: SafeArray[NamedValue], aURL: URL): ControlEvent = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], aInformation = aInformation.asInstanceOf[js.Any], aURL = aURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlEvent]
  }
  @scala.inline
  implicit class ControlEventOps[Self <: ControlEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAInformation(value: SafeArray[NamedValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAURL(value: URL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aURL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

