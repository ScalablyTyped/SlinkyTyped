package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.FilterSetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImpressionMetricsResource extends js.Object {
  
  /** Lists all metrics that are measured in terms of number of impressions. */
  def list(): Request[ListImpressionMetricsResponse] = js.native
  def list(request: FilterSetName): Request[ListImpressionMetricsResponse] = js.native
}
