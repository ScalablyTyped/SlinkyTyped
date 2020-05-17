package typingsSlinky.screeps

import typingsSlinky.screeps.anon.Data
import typingsSlinky.screeps.anon.DataEvent
import typingsSlinky.screeps.anon.DataEventObjectId
import typingsSlinky.screeps.anon.Event
import typingsSlinky.screeps.anon.EventEVENTEXIT
import typingsSlinky.screeps.anon.EventEVENTPOWER
import typingsSlinky.screeps.anon.EventEVENTREPAIR
import typingsSlinky.screeps.anon.EventEVENTRESERVECONTROLLER
import typingsSlinky.screeps.anon.EventEVENTTRANSFER
import typingsSlinky.screeps.anon.EventEVENTUPGRADECONTROLLER
import typingsSlinky.screeps.anon.EventObjectId
import typingsSlinky.screeps.anon.ObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.anon.Data
  - typingsSlinky.screeps.anon.Event
  - typingsSlinky.screeps.anon.ObjectId
  - typingsSlinky.screeps.anon.DataEvent
  - typingsSlinky.screeps.anon.EventObjectId
  - typingsSlinky.screeps.anon.DataEventObjectId
  - typingsSlinky.screeps.anon.EventEVENTREPAIR
  - typingsSlinky.screeps.anon.EventEVENTRESERVECONTROLLER
  - typingsSlinky.screeps.anon.EventEVENTUPGRADECONTROLLER
  - typingsSlinky.screeps.anon.EventEVENTEXIT
  - typingsSlinky.screeps.anon.EventEVENTPOWER
  - typingsSlinky.screeps.anon.EventEVENTTRANSFER
*/
trait EventItem extends js.Object

object EventItem {
  @scala.inline
  implicit def apply(value: Data): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: DataEvent): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: DataEventObjectId): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: Event): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: EventEVENTEXIT): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: EventEVENTPOWER): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: EventEVENTREPAIR): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: EventEVENTRESERVECONTROLLER): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: EventEVENTTRANSFER): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: EventEVENTUPGRADECONTROLLER): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: EventObjectId): EventItem = value.asInstanceOf[EventItem]
  @scala.inline
  implicit def apply(value: ObjectId): EventItem = value.asInstanceOf[EventItem]
}

