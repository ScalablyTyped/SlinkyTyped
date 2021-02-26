package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionTypesResource extends StObject {
  
  /** Gets one connection type by ID. */
  def get(): Request[ConnectionType] = js.native
  def get(request: Alt): Request[ConnectionType] = js.native
  
  /** Retrieves a list of connection types. */
  def list(): Request[ConnectionTypesListResponse] = js.native
  def list(request: Callback): Request[ConnectionTypesListResponse] = js.native
}
