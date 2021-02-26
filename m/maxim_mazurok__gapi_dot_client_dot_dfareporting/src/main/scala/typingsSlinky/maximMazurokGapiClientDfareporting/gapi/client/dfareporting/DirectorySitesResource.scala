package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.AcceptsInStreamVideoPlacements
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.CallbackFieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectorySitesResource extends StObject {
  
  /** Gets one directory site by ID. */
  def get(): Request[DirectorySite] = js.native
  def get(request: Alt): Request[DirectorySite] = js.native
  
  /** Inserts a new directory site. */
  def insert(request: CallbackFieldsKey): Request[DirectorySite] = js.native
  def insert(request: Callback, body: DirectorySite): Request[DirectorySite] = js.native
  
  /** Retrieves a list of directory sites, possibly filtered. This method supports paging. */
  def list(): Request[DirectorySitesListResponse] = js.native
  def list(request: AcceptsInStreamVideoPlacements): Request[DirectorySitesListResponse] = js.native
}
