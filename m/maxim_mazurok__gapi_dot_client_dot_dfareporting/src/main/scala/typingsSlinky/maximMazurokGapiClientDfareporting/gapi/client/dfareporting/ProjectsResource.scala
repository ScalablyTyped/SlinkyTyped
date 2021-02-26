package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.SearchString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /** Gets one project by ID. */
  def get(): Request[Project] = js.native
  def get(request: Alt): Request[Project] = js.native
  
  /** Retrieves a list of projects, possibly filtered. This method supports paging . */
  def list(): Request[ProjectsListResponse] = js.native
  def list(request: SearchString): Request[ProjectsListResponse] = js.native
}
