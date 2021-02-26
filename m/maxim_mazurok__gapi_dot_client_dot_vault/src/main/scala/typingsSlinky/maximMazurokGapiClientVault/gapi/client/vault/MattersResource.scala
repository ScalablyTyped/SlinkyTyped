package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientVault.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientVault.anon.Alt
import typingsSlinky.maximMazurokGapiClientVault.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientVault.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientVault.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientVault.anon.KeyMatterId
import typingsSlinky.maximMazurokGapiClientVault.anon.MatterIdOauthtoken
import typingsSlinky.maximMazurokGapiClientVault.anon.OauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientVault.anon.PageToken
import typingsSlinky.maximMazurokGapiClientVault.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientVault.anon.View
import typingsSlinky.maximMazurokGapiClientVault.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MattersResource extends StObject {
  
  def addPermissions(request: Alt, body: AddMatterPermissionsRequest): Request[MatterPermission] = js.native
  /** Adds an account as a matter collaborator. */
  def addPermissions(request: Uploadprotocol): Request[MatterPermission] = js.native
  
  def close(request: Alt, body: CloseMatterRequest): Request[CloseMatterResponse] = js.native
  /** Closes the specified matter. Returns matter with updated state. */
  def close(request: Xgafv): Request[CloseMatterResponse] = js.native
  
  /** Counts the artifacts within the context of a matter and returns a detailed breakdown of metrics. */
  def count(request: AccesstokenAlt): Request[Operation] = js.native
  def count(request: Alt, body: CountArtifactsRequest): Request[Operation] = js.native
  
  /** Creates a new matter with the given name and description. The initial state is open, and the owner is the method caller. Returns the created matter with default view. */
  def create(request: AltCallback): Request[Matter] = js.native
  def create(request: CallbackFields, body: Matter): Request[Matter] = js.native
  
  /** Deletes the specified matter. Returns matter with updated state. */
  def delete(): Request[Matter] = js.native
  def delete(request: Alt): Request[Matter] = js.native
  
  var exports: ExportsResource = js.native
  
  /** Gets the specified matter. */
  def get(): Request[Matter] = js.native
  def get(request: View): Request[Matter] = js.native
  
  var holds: HoldsResource = js.native
  
  /** Lists matters the user has access to. */
  def list(): Request[ListMattersResponse] = js.native
  def list(request: PageToken): Request[ListMattersResponse] = js.native
  
  def removePermissions(request: Alt, body: RemoveMatterPermissionsRequest): Request[js.Object] = js.native
  /** Removes an account as a matter collaborator. */
  def removePermissions(request: FieldsKey): Request[js.Object] = js.native
  
  def reopen(request: Alt, body: ReopenMatterRequest): Request[ReopenMatterResponse] = js.native
  /** Reopens the specified matter. Returns matter with updated state. */
  def reopen(request: KeyMatterId): Request[ReopenMatterResponse] = js.native
  
  var savedQueries: SavedQueriesResource = js.native
  
  def undelete(request: Alt, body: UndeleteMatterRequest): Request[Matter] = js.native
  /** Undeletes the specified matter. Returns matter with updated state. */
  def undelete(request: MatterIdOauthtoken): Request[Matter] = js.native
  
  def update(request: Alt, body: Matter): Request[Matter] = js.native
  /**
    * Updates the specified matter. This updates only the name and description of the matter, identified by matter ID. Changes to any other fields are ignored. Returns the default view of
    * the matter.
    */
  def update(request: OauthtokenPrettyPrint): Request[Matter] = js.native
}
