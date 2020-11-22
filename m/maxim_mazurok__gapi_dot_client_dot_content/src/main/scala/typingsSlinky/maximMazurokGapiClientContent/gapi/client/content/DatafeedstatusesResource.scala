package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientContent.anon.Country
import typingsSlinky.maximMazurokGapiClientContent.anon.Key
import typingsSlinky.maximMazurokGapiClientContent.anon.KeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatafeedstatusesResource extends js.Object {
  
  /** Gets multiple Merchant Center datafeed statuses in a single request. */
  def custombatch(request: KeyOauthtoken): Request[DatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(request: Key, body: DatafeedstatusesCustomBatchRequest): Request[DatafeedstatusesCustomBatchResponse] = js.native
  
  /** Retrieves the status of a datafeed from your Merchant Center account. */
  def get(): Request[DatafeedStatus] = js.native
  def get(request: Country): Request[DatafeedStatus] = js.native
  
  /** Lists the statuses of the datafeeds in your Merchant Center account. */
  def list(): Request[DatafeedstatusesListResponse] = js.native
  def list(request: CallbackFields): Request[DatafeedstatusesListResponse] = js.native
}
