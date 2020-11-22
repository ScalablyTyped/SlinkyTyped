package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRun.anon.Alt
import typingsSlinky.maximMazurokGapiClientRun.anon.ApiVersion
import typingsSlinky.maximMazurokGapiClientRun.anon.Callback
import typingsSlinky.maximMazurokGapiClientRun.anon.Fields
import typingsSlinky.maximMazurokGapiClientRun.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainmappingsResource extends js.Object {
  
  /** Create a new domain mapping. */
  def create(request: Fields): Request[DomainMapping] = js.native
  def create(request: Key, body: DomainMapping): Request[DomainMapping] = js.native
  
  /** Delete a domain mapping. */
  def delete(): Request[Status] = js.native
  def delete(request: ApiVersion): Request[Status] = js.native
  
  /** Get information about a domain mapping. */
  def get(): Request[DomainMapping] = js.native
  def get(request: Alt): Request[DomainMapping] = js.native
  
  /** List domain mappings. */
  def list(): Request[ListDomainMappingsResponse] = js.native
  def list(request: Callback): Request[ListDomainMappingsResponse] = js.native
}
