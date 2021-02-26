package typingsSlinky.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSearchconsole.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientSearchconsole.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchanalyticsResource extends StObject {
  
  /**
    * Query your data with filters and parameters that you define. Returns zero or more rows grouped by the row keys that you define. You must define a date range of one or more days.
    * When date is one of the group by values, any days without data are omitted from the result list. If you need to know which days have data, issue a broad date range query grouped by
    * date for any metric, and see which day rows are returned.
    */
  def query(request: Accesstoken): Request[SearchAnalyticsQueryResponse] = js.native
  def query(request: Alt, body: SearchAnalyticsQueryRequest): Request[SearchAnalyticsQueryResponse] = js.native
}
