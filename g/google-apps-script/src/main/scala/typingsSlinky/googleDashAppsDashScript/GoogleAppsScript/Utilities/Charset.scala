package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Charset extends js.Object

/**
  * A typesafe enum for character sets.
  */
@JSGlobal("GoogleAppsScript.Utilities.Charset")
@js.native
object Charset extends js.Object {
  @js.native
  sealed trait US_ASCII
    extends typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset
  
  @js.native
  sealed trait UTF_8
    extends typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset
  
  /* 0 */ val US_ASCII: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset.US_ASCII with Double = js.native
  /* 1 */ val UTF_8: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset.UTF_8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset with Double
  ] = js.native
}

