package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AddressAlt
import typingsSlinky.maximMazurokGapiClientCompute.anon.AddressAltFields
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalAddressesResource extends StObject {
  
  /** Deletes the specified address resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: AddressAlt): Request[Operation] = js.native
  
  /** Returns the specified address resource. Gets a list of available addresses by making a list() request. */
  def get(): Request[Address] = js.native
  def get(request: AddressAltFields): Request[Address] = js.native
  
  def insert(request: FieldsKey, body: Address): Request[Operation] = js.native
  /** Creates an address resource in the specified project by using the data included in the request. */
  def insert(request: PrettyPrintProjectQuotaUser): Request[Operation] = js.native
  
  /** Retrieves a list of global addresses. */
  def list(): Request[AddressList] = js.native
  def list(request: MaxResults): Request[AddressList] = js.native
}
