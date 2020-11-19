package typingsSlinky.gapiClientCloudmonitoring

import typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring.MetricDescriptorsResource
import typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring.TimeseriesDescriptorsResource
import typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring.TimeseriesResource
import typingsSlinky.gapiClientCloudmonitoring.gapiClientCloudmonitoringStrings.cloudmonitoring
import typingsSlinky.gapiClientCloudmonitoring.gapiClientCloudmonitoringStrings.v2beta2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Cloud Monitoring API v2beta2 */
      def load(name: cloudmonitoring, version: v2beta2): js.Thenable[Unit] = js.native
      def load(name: cloudmonitoring, version: v2beta2, callback: js.Function0[_]): Unit = js.native
      
      val metricDescriptors: MetricDescriptorsResource = js.native
      
      val timeseries: TimeseriesResource = js.native
      
      val timeseriesDescriptors: TimeseriesDescriptorsResource = js.native
    }
  }
}
