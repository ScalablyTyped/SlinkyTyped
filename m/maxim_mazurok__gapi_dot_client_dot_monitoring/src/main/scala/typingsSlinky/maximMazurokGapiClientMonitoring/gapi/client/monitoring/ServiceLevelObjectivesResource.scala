package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Alt
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.FieldsFilter
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Key
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.NameOauthtoken
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.OauthtokenParent
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.ServiceLevelObjectiveId
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLevelObjectivesResource extends js.Object {
  
  def create(request: OauthtokenParent, body: ServiceLevelObjective): Request[ServiceLevelObjective] = js.native
  /** Create a ServiceLevelObjective for the given Service. */
  def create(request: ServiceLevelObjectiveId): Request[ServiceLevelObjective] = js.native
  
  /** Delete the given ServiceLevelObjective. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Get a ServiceLevelObjective by name. */
  def get(): Request[ServiceLevelObjective] = js.native
  def get(request: View): Request[ServiceLevelObjective] = js.native
  
  /** List the ServiceLevelObjectives for the given Service. */
  def list(): Request[ListServiceLevelObjectivesResponse] = js.native
  def list(request: FieldsFilter): Request[ListServiceLevelObjectivesResponse] = js.native
  
  def patch(request: Key, body: ServiceLevelObjective): Request[ServiceLevelObjective] = js.native
  /** Update the given ServiceLevelObjective. */
  def patch(request: NameOauthtoken): Request[ServiceLevelObjective] = js.native
}
