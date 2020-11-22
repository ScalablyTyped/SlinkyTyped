package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Alt
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectdTimeSeriesResource extends js.Object {
  
  def create(request: Alt, body: CreateCollectdTimeSeriesRequest): Request[CreateCollectdTimeSeriesResponse] = js.native
  /** Stackdriver Monitoring Agent only: Creates a new time series.This method is only for use by the Stackdriver Monitoring Agent. Use projects.timeSeries.create instead. */
  def create(request: Name): Request[CreateCollectdTimeSeriesResponse] = js.native
}
