package typingsSlinky.googleAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var ga: typingsSlinky.googleAnalytics.UniversalAnalytics.ga = js.native
  
  var gaClassic: GoogleAnalytics = js.native
  
  @JSName("_gaq")
  var gaq: GoogleAnalyticsCode = js.native
  
  @JSName("_gat")
  var gat: GoogleAnalyticsTracker = js.native
  
  @js.native
  class Tracker ()
    extends typingsSlinky.googleAnalytics.Tracker
}
