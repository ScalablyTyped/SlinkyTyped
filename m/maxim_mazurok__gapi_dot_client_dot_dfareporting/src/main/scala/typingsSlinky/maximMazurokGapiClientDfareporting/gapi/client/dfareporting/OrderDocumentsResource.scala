package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Approved
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.ProjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderDocumentsResource extends StObject {
  
  /** Gets one order document by ID. */
  def get(): Request[OrderDocument] = js.native
  def get(request: ProjectId): Request[OrderDocument] = js.native
  
  /** Retrieves a list of order documents, possibly filtered. This method supports paging. */
  def list(): Request[OrderDocumentsListResponse] = js.native
  def list(request: Approved): Request[OrderDocumentsListResponse] = js.native
}
