package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientVault.anon.Alt
import typingsSlinky.maximMazurokGapiClientVault.anon.Fields
import typingsSlinky.maximMazurokGapiClientVault.anon.SavedQueryId
import typingsSlinky.maximMazurokGapiClientVault.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedQueriesResource extends StObject {
  
  def create(request: Alt, body: SavedQuery): Request[SavedQuery] = js.native
  /** Creates a saved query. */
  def create(request: UploadType): Request[SavedQuery] = js.native
  
  /** Deletes a saved query by Id. */
  def delete(): Request[js.Object] = js.native
  def delete(request: SavedQueryId): Request[js.Object] = js.native
  
  /** Retrieves a saved query by Id. */
  def get(): Request[SavedQuery] = js.native
  def get(request: SavedQueryId): Request[SavedQuery] = js.native
  
  /** Lists saved queries within a matter. An empty page token in ListSavedQueriesResponse denotes no more saved queries to list. */
  def list(): Request[ListSavedQueriesResponse] = js.native
  def list(request: Fields): Request[ListSavedQueriesResponse] = js.native
}
