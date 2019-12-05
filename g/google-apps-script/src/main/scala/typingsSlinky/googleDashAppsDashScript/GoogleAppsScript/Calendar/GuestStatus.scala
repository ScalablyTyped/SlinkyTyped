package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GuestStatus extends js.Object

/**
  * An enum representing the statuses a guest can have for an event.
  */
@JSGlobal("GoogleAppsScript.Calendar.GuestStatus")
@js.native
object GuestStatus extends js.Object {
  @js.native
  sealed trait INVITED extends GuestStatus
  
  @js.native
  sealed trait MAYBE extends GuestStatus
  
  @js.native
  sealed trait NO extends GuestStatus
  
  @js.native
  sealed trait OWNER extends GuestStatus
  
  @js.native
  sealed trait YES extends GuestStatus
  
  /* 0 */ val INVITED: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Calendar.GuestStatus.INVITED with Double = js.native
  /* 1 */ val MAYBE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Calendar.GuestStatus.MAYBE with Double = js.native
  /* 2 */ val NO: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Calendar.GuestStatus.NO with Double = js.native
  /* 3 */ val OWNER: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Calendar.GuestStatus.OWNER with Double = js.native
  /* 4 */ val YES: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Calendar.GuestStatus.YES with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GuestStatus with Double] = js.native
}

