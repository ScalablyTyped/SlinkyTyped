package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Alt
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Callback
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Fields
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertPoliciesResource extends js.Object {
  
  /** Creates a new alerting policy. */
  def create(request: Accesstoken): Request[AlertPolicy] = js.native
  def create(request: Alt, body: AlertPolicy): Request[AlertPolicy] = js.native
  
  /** Deletes an alerting policy. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a single alerting policy. */
  def get(): Request[AlertPolicy] = js.native
  def get(request: Alt): Request[AlertPolicy] = js.native
  
  /** Lists the existing alerting policies for the workspace. */
  def list(): Request[ListAlertPoliciesResponse] = js.native
  def list(request: Callback): Request[ListAlertPoliciesResponse] = js.native
  
  /**
    * Updates an alerting policy. You can either replace the entire policy with a new one or replace only certain fields in the current alerting policy by specifying the fields to be
    * updated via updateMask. Returns the updated alerting policy.
    */
  def patch(request: Fields): Request[AlertPolicy] = js.native
  def patch(request: Key, body: AlertPolicy): Request[AlertPolicy] = js.native
}
