package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAppengine.anon.AltAppsId
import typingsSlinky.maximMazurokGapiClientAppengine.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientAppengine.anon.MigrateTraffic
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  /** Deletes the specified service and all enclosed versions. */
  def delete(): Request[Operation] = js.native
  def delete(request: AltAppsId): Request[Operation] = js.native
  
  /** Gets the current configuration of the specified service. */
  def get(): Request[Service] = js.native
  def get(request: AltAppsId): Request[Service] = js.native
  
  /** Lists all the services in the application. */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: Oauthtoken): Request[ListServicesResponse] = js.native
  
  def patch(request: FieldsKey, body: Service): Request[Operation] = js.native
  /** Updates the configuration of the specified service. */
  def patch(request: MigrateTraffic): Request[Operation] = js.native
  
  var versions: VersionsResource = js.native
}
