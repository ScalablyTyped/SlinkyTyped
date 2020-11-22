package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.ManagedConfigurationForDeviceId
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedconfigurationsfordeviceResource extends js.Object {
  
  /** Removes a per-device managed configuration for an app for the specified device. */
  def delete(): Request[Unit] = js.native
  def delete(request: ManagedConfigurationForDeviceId): Request[Unit] = js.native
  
  /** Retrieves details of a per-device managed configuration. */
  def get(): Request[ManagedConfiguration] = js.native
  def get(request: ManagedConfigurationForDeviceId): Request[ManagedConfiguration] = js.native
  
  /** Lists all the per-device managed configurations for the specified device. Only the ID is set. */
  def list(): Request[ManagedConfigurationsForDeviceListResponse] = js.native
  def list(request: Accesstoken): Request[ManagedConfigurationsForDeviceListResponse] = js.native
  
  def update(request: ManagedConfigurationForDeviceId, body: ManagedConfiguration): Request[ManagedConfiguration] = js.native
  /** Adds or updates a per-device managed configuration for an app for the specified device. */
  def update(request: Xgafv): Request[ManagedConfiguration] = js.native
}
