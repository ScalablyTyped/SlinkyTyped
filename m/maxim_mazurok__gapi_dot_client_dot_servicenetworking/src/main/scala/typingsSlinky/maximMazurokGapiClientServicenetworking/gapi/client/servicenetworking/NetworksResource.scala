package typingsSlinky.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientServicenetworking.anon.Alt
import typingsSlinky.maximMazurokGapiClientServicenetworking.anon.Key
import typingsSlinky.maximMazurokGapiClientServicenetworking.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworksResource extends js.Object {
  
  /** Service producers use this method to get the configuration of their connection including the import/export of custom routes and subnetwork routes with public IP. */
  def get(): Request[ConsumerConfig] = js.native
  def get(request: Alt): Request[ConsumerConfig] = js.native
  
  var peeredDnsDomains: PeeredDnsDomainsResource = js.native
  
  def updateConsumerConfig(request: Key, body: UpdateConsumerConfigRequest): Request[Operation] = js.native
  /** Service producers use this method to update the configuration of their connection including the import/export of custom routes and subnetwork routes with public IP. */
  def updateConsumerConfig(request: Uploadprotocol): Request[Operation] = js.native
}
