package typingsSlinky.maximMazurokGapiClientFile.gapi.client.file

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFile.anon.Callback
import typingsSlinky.maximMazurokGapiClientFile.anon.Fields
import typingsSlinky.maximMazurokGapiClientFile.anon.InstanceId
import typingsSlinky.maximMazurokGapiClientFile.anon.Name
import typingsSlinky.maximMazurokGapiClientFile.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientFile.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientFile.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends StObject {
  
  /**
    * Creates an instance. When creating from a backup, the capacity of the new instance needs to be equal to or larger than the capacity of the backup (and also equal to or larger than
    * the minimum capacity of the tier).
    */
  def create(request: InstanceId): Request[Operation] = js.native
  def create(request: Oauthtoken, body: Instance): Request[Operation] = js.native
  
  /** Deletes an instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets the details of a specific instance. */
  def get(): Request[Instance] = js.native
  def get(request: Callback): Request[Instance] = js.native
  
  /** Lists all instances in a project for either a specified location or for all locations. */
  def list(): Request[ListInstancesResponse] = js.native
  def list(request: Fields): Request[ListInstancesResponse] = js.native
  
  def patch(request: Name, body: Instance): Request[Operation] = js.native
  /** Updates the settings of a specific instance. */
  def patch(request: PrettyPrint): Request[Operation] = js.native
  
  def restore(request: Callback, body: RestoreInstanceRequest): Request[Operation] = js.native
  /**
    * Restores an existing instance's file share from a backup. The instance's file share capacity will be set to the backup's capacity or the minimum capacity of the tier, whichever is
    * larger.
    */
  def restore(request: QuotaUser): Request[Operation] = js.native
}
