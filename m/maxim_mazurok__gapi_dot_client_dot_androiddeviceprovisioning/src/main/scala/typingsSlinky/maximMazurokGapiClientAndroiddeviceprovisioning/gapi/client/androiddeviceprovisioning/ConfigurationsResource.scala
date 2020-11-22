package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Alt
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Callback
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Fields
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationsResource extends js.Object {
  
  /** Creates a new configuration. Once created, a customer can apply the configuration to devices. */
  def create(request: Accesstoken): Request[Configuration] = js.native
  def create(request: Alt, body: Configuration): Request[Configuration] = js.native
  
  /** Deletes an unused configuration. The API call fails if the customer has devices with the configuration applied. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets the details of a configuration. */
  def get(): Request[Configuration] = js.native
  def get(request: Callback): Request[Configuration] = js.native
  
  /** Lists a customer's configurations. */
  def list(): Request[CustomerListConfigurationsResponse] = js.native
  def list(request: Alt): Request[CustomerListConfigurationsResponse] = js.native
  
  /** Updates a configuration's field values. */
  def patch(request: Fields): Request[Configuration] = js.native
  def patch(request: Key, body: Configuration): Request[Configuration] = js.native
}
