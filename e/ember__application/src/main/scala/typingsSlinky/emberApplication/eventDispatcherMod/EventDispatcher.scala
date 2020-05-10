package typingsSlinky.emberApplication.eventDispatcherMod

import typingsSlinky.emberApplication.typesMod.EventDispatcherEvents
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDispatcher extends Object {
  /**
    * The set of events names (and associated handler function names) to be setup
    * and dispatched by the `EventDispatcher`. Modifications to this list can be done
    * at setup time, generally via the `Ember.Application.customEvents` hash.
    */
  var events: EventDispatcherEvents = js.native
}

object EventDispatcher {
  @scala.inline
  def apply(
    constructor: js.Function,
    events: EventDispatcherEvents,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): EventDispatcher = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[EventDispatcher]
  }
  @scala.inline
  implicit class EventDispatcherOps[Self <: EventDispatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: EventDispatcherEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

