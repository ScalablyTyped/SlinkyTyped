package typingsSlinky.hubspotDashPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaceEvent extends js.Object

@JSGlobal("HubSpotPaceInterfaces.PaceEvent")
@js.native
object PaceEvent extends js.Object {
  @js.native
  sealed trait done extends PaceEvent
  
  @js.native
  sealed trait hide extends PaceEvent
  
  @js.native
  sealed trait restart extends PaceEvent
  
  @js.native
  sealed trait start extends PaceEvent
  
  @js.native
  sealed trait stop extends PaceEvent
  
  /* 3 */ val done: typingsSlinky.hubspotDashPace.HubSpotPaceInterfaces.PaceEvent.done with Double = js.native
  /* 4 */ val hide: typingsSlinky.hubspotDashPace.HubSpotPaceInterfaces.PaceEvent.hide with Double = js.native
  /* 2 */ val restart: typingsSlinky.hubspotDashPace.HubSpotPaceInterfaces.PaceEvent.restart with Double = js.native
  /* 0 */ val start: typingsSlinky.hubspotDashPace.HubSpotPaceInterfaces.PaceEvent.start with Double = js.native
  /* 1 */ val stop: typingsSlinky.hubspotDashPace.HubSpotPaceInterfaces.PaceEvent.stop with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaceEvent with Double] = js.native
}

