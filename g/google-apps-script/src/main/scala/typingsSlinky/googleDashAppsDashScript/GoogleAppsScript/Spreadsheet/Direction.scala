package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

/**
  * An enumeration representing the possible directions that one can move within a spreadsheet using
  * the arrow keys.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait DOWN extends Direction
  
  @js.native
  sealed trait NEXT extends Direction
  
  @js.native
  sealed trait PREVIOUS extends Direction
  
  @js.native
  sealed trait UP extends Direction
  
  /* 1 */ val DOWN: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Direction.DOWN with Double = js.native
  /* 3 */ val NEXT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Direction.NEXT with Double = js.native
  /* 2 */ val PREVIOUS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Direction.PREVIOUS with Double = js.native
  /* 0 */ val UP: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Direction.UP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
}

