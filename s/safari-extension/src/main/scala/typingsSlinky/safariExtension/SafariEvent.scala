package typingsSlinky.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariEvent extends js.Object {
  /**
  		* A Boolean value that indicates whether the event goes through the bubbling phase.
  		*/
  var bubbles: Boolean = js.native
  /**
  		* A Boolean value that indicates whether the event can be canceled.
  		*/
  var cancelable: Boolean = js.native
  /**
  		* The object that the event is currently being sent to.
  		* This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
  		*/
  var currentTarget: SafariEventTarget = js.native
  /**
  		* A Boolean value that indicates whether the event’s default action has been prevented.
  		*/
  var defaultPrevented: Boolean = js.native
  /**
  		* The event-handling phase that the event is in.
  		* The values for this property are the same as the values used by Webkit to identify the event-handling phases.
  		*/
  var eventPhase: Double = js.native
  /**
  		* The target of the event.
  		* This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
  		*/
  var target: SafariEventTarget = js.native
  /**
  		* The time and date that the event was created.
  		*/
  var timestamp: Double = js.native
  /**
  		* The type of the event.
  		* The string used to identify a particular type of event is documented in the reference for that class.
  		*/
  var `type`: String = js.native
  /**
  		* Prevents the browser from performing the default action for an event.
  		* Use this method to indicate that your extension has already fully handled the event; you don’t want the browser to do anything. Note that preventing the default action does not stop an event from propagating.
  		*/
  def preventDefault(): Unit = js.native
  /**
  		* Prevents the event from any further propagation.
  		* Propagation can be stopped only fon cancelable events. After propagation is stopped, the event is not sent to any other targets.
  		*/
  def stopPropagation(): Unit = js.native
}

object SafariEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: SafariEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: SafariEventTarget,
    timestamp: Double,
    `type`: String
  ): SafariEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariEvent]
  }
  @scala.inline
  implicit class SafariEventOps[Self <: SafariEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTarget(value: SafariEventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPrevented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventPhase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: SafariEventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

