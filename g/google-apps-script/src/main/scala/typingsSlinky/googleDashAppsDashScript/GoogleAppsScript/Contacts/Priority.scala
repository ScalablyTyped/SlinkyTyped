package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Priority extends js.Object

/**
  * An enum for contact priority.
  */
@JSGlobal("GoogleAppsScript.Contacts.Priority")
@js.native
object Priority extends js.Object {
  @js.native
  sealed trait HIGH extends Priority
  
  @js.native
  sealed trait LOW extends Priority
  
  @js.native
  sealed trait NORMAL extends Priority
  
  /* 0 */ val HIGH: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Contacts.Priority.HIGH with Double = js.native
  /* 1 */ val LOW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Contacts.Priority.LOW with Double = js.native
  /* 2 */ val NORMAL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Contacts.Priority.NORMAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
}

