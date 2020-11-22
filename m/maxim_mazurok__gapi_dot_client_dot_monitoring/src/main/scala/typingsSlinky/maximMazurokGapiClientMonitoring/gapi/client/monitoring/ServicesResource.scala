package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Alt
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.FilterKey
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Key
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.OauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.ParentPrettyPrint
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.ServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends js.Object {
  
  def create(request: ParentPrettyPrint, body: Service): Request[Service] = js.native
  /** Create a Service. */
  def create(request: ServiceId): Request[Service] = js.native
  
  /** Soft delete this Service. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Get the named Service. */
  def get(): Request[Service] = js.native
  def get(request: Alt): Request[Service] = js.native
  
  /** List Services for this workspace. */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: FilterKey): Request[ListServicesResponse] = js.native
  
  def patch(request: Key, body: Service): Request[Service] = js.native
  /** Update this Service. */
  def patch(request: OauthtokenPrettyPrint): Request[Service] = js.native
  
  var serviceLevelObjectives: ServiceLevelObjectivesResource = js.native
}
