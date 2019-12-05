package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

/**
  * An enumeration of legend positions within a chart.
  */
@JSGlobal("GoogleAppsScript.Charts.Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait BOTTOM extends Position
  
  @js.native
  sealed trait NONE extends Position
  
  @js.native
  sealed trait RIGHT extends Position
  
  @js.native
  sealed trait TOP extends Position
  
  /* 2 */ val BOTTOM: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Charts.Position.BOTTOM with Double = js.native
  /* 3 */ val NONE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Charts.Position.NONE with Double = js.native
  /* 1 */ val RIGHT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Charts.Position.RIGHT with Double = js.native
  /* 0 */ val TOP: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Charts.Position.TOP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
}

