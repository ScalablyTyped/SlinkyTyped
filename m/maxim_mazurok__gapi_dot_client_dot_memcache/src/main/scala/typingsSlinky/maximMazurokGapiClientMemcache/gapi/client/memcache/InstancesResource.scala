package typingsSlinky.maximMazurokGapiClientMemcache.gapi.client.memcache

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientMemcache.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientMemcache.anon.Alt
import typingsSlinky.maximMazurokGapiClientMemcache.anon.Callback
import typingsSlinky.maximMazurokGapiClientMemcache.anon.Fields
import typingsSlinky.maximMazurokGapiClientMemcache.anon.Filter
import typingsSlinky.maximMazurokGapiClientMemcache.anon.Key
import typingsSlinky.maximMazurokGapiClientMemcache.anon.Name
import typingsSlinky.maximMazurokGapiClientMemcache.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends StObject {
  
  /** ApplyParameters will restart the set of specified nodes in order to update them to the current set of parameters for the Memcached Instance. */
  def applyParameters(request: Accesstoken): Request[Operation] = js.native
  def applyParameters(request: Alt, body: ApplyParametersRequest): Request[Operation] = js.native
  
  /** Creates a new Instance in a given location. */
  def create(request: Callback): Request[Operation] = js.native
  def create(request: Fields, body: Instance): Request[Operation] = js.native
  
  /** Deletes a single Instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: Alt): Request[Operation] = js.native
  
  /** Gets details of a single Instance. */
  def get(): Request[Instance] = js.native
  def get(request: Alt): Request[Instance] = js.native
  
  /** Lists Instances in a given location. */
  def list(): Request[ListInstancesResponse] = js.native
  def list(request: Filter): Request[ListInstancesResponse] = js.native
  
  /** Updates an existing Instance in a given project and location. */
  def patch(request: Key): Request[Operation] = js.native
  def patch(request: Name, body: Instance): Request[Operation] = js.native
  
  def updateParameters(request: Alt, body: UpdateParametersRequest): Request[Operation] = js.native
  /**
    * Updates the defined Memcached Parameters for an existing Instance. This method only stages the parameters, it must be followed by ApplyParameters to apply the parameters to nodes of
    * the Memcached Instance.
    */
  def updateParameters(request: Oauthtoken): Request[Operation] = js.native
}
