package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientCompute.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressesResource extends js.Object {
  
  /** Retrieves an aggregated list of addresses. */
  def aggregatedList(): Request[AddressAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[AddressAggregatedList] = js.native
  
  /** Deletes the specified address resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Address): Request[Operation] = js.native
  
  /** Returns the specified address resource. */
  def get(): Request[Address] = js.native
  def get(request: Oauthtoken): Request[Address] = js.native
  
  /** Creates an address resource in the specified project by using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: Address): Request[Operation] = js.native
  
  /** Retrieves a list of addresses contained within the specified region. */
  def list(): Request[AddressList] = js.native
  def list(request: Filter): Request[AddressList] = js.native
}
