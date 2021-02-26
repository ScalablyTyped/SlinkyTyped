package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsFirewall
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.FirewallKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallsResource extends StObject {
  
  /** Deletes the specified firewall. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Firewall): Request[Operation] = js.native
  
  /** Returns the specified firewall. */
  def get(): Request[Firewall] = js.native
  def get(request: FieldsFirewall): Request[Firewall] = js.native
  
  def insert(request: FieldsKey, body: Firewall): Request[Operation] = js.native
  /** Creates a firewall rule in the specified project using the data included in the request. */
  def insert(request: OauthtokenPrettyPrintProject): Request[Operation] = js.native
  
  /** Retrieves the list of firewall rules available to the specified project. */
  def list(): Request[FirewallList] = js.native
  def list(request: MaxResults): Request[FirewallList] = js.native
  
  /** Updates the specified firewall rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules. */
  def patch(request: FirewallKey): Request[Operation] = js.native
  def patch(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Firewall, body: Firewall): Request[Operation] = js.native
  
  /**
    * Updates the specified firewall rule with the data included in the request. Note that all fields will be updated if using PUT, even fields that are not specified. To update
    * individual fields, please use PATCH instead.
    */
  def update(request: FirewallKey): Request[Operation] = js.native
  def update(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Firewall, body: Firewall): Request[Operation] = js.native
}
