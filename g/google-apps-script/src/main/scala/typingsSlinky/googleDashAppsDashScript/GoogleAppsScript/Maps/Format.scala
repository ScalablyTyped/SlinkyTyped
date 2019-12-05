package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Format extends js.Object

/**
  * An enum representing the format of the map image.
  * See also
  *
  * Google Static Maps API
  */
@JSGlobal("GoogleAppsScript.Maps.Format")
@js.native
object Format extends js.Object {
  @js.native
  sealed trait GIF extends Format
  
  @js.native
  sealed trait JPG extends Format
  
  @js.native
  sealed trait JPG_BASELINE extends Format
  
  @js.native
  sealed trait PNG extends Format
  
  @js.native
  sealed trait PNG32 extends Format
  
  @js.native
  sealed trait PNG8 extends Format
  
  /* 3 */ val GIF: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Maps.Format.GIF with Double = js.native
  /* 4 */ val JPG: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Maps.Format.JPG with Double = js.native
  /* 5 */ val JPG_BASELINE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Maps.Format.JPG_BASELINE with Double = js.native
  /* 0 */ val PNG: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Maps.Format.PNG with Double = js.native
  /* 2 */ val PNG32: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Maps.Format.PNG32 with Double = js.native
  /* 1 */ val PNG8: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Maps.Format.PNG8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Format with Double] = js.native
}

