package typingsSlinky.googleAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Tracker ()
    extends typingsSlinky.googleAnalytics.Tracker
  
  var ga: typingsSlinky.googleAnalytics.UniversalAnalytics.ga = js.native
  var gaClassic: GoogleAnalytics = js.native
  @JSName("_gaq")
  var gaq: GoogleAnalyticsCode = js.native
  @JSName("_gat")
  var gat: GoogleAnalyticsTracker = js.native
}

