package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDns.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZoneOperationsResource extends StObject {
  
  /** Fetch the representation of an existing Operation. */
  def get(): Request[Operation] = js.native
  def get(request: Key): Request[Operation] = js.native
  
  /** Enumerate Operations for the given ManagedZone. */
  def list(): Request[ManagedZoneOperationsListResponse] = js.native
  def list(request: typingsSlinky.maximMazurokGapiClientDns.anon.ManagedZone): Request[ManagedZoneOperationsListResponse] = js.native
}
