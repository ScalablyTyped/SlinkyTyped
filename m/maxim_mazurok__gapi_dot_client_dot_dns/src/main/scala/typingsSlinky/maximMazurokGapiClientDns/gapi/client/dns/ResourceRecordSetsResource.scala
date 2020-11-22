package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDns.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRecordSetsResource extends js.Object {
  
  /** Enumerate ResourceRecordSets that have been created but not yet deleted. */
  def list(): Request[ResourceRecordSetsListResponse] = js.native
  def list(request: Name): Request[ResourceRecordSetsListResponse] = js.native
}
