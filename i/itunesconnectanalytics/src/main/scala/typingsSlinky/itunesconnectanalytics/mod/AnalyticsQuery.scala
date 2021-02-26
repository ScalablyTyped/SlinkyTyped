package typingsSlinky.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("itunesconnectanalytics", "AnalyticsQuery")
@js.native
class AnalyticsQuery protected () extends StObject {
  def this(`type`: String, appId: String, config: QueryConfig) = this()
  
  def date(start: QueryDateTypes, end: QueryDateTypes): AnalyticsQuery = js.native
  
  def limit(limit: Double): AnalyticsQuery = js.native
  
  def time(value: Double, unit: String): AnalyticsQuery = js.native
}
/* static members */
object AnalyticsQuery {
  
  @JSImport("itunesconnectanalytics", "AnalyticsQuery.metrics")
  @js.native
  def metrics(appId: String, config: QueryConfig): AnalyticsQuery = js.native
  
  @JSImport("itunesconnectanalytics", "AnalyticsQuery.sources")
  @js.native
  def sources(appId: String, config: QueryConfig): AnalyticsQuery = js.native
}
