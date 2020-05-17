package typingsSlinky.gapiClientAnalyticsreporting

import typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting.ReportsResource
import typingsSlinky.gapiClientAnalyticsreporting.gapiClientAnalyticsreportingStrings.analyticsreporting
import typingsSlinky.gapiClientAnalyticsreporting.gapiClientAnalyticsreportingStrings.v4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val reports: ReportsResource = js.native
      /** Load Google Analytics Reporting API v4 */
      def load(name: analyticsreporting, version: v4): js.Thenable[Unit] = js.native
      def load(name: analyticsreporting, version: v4, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

