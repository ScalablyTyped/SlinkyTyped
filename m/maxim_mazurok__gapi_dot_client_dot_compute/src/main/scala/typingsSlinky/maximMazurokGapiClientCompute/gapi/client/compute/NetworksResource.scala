package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltFieldsKeyOauthtokenPrettyPrintProject
import typingsSlinky.maximMazurokGapiClientCompute.anon.Direction
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKeyNetwork
import typingsSlinky.maximMazurokGapiClientCompute.anon.KeyNetwork
import typingsSlinky.maximMazurokGapiClientCompute.anon.KeyNetworkOauthtoken
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientCompute.anon.NetworkOauthtoken
import typingsSlinky.maximMazurokGapiClientCompute.anon.NetworkOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworksResource extends js.Object {
  
  def addPeering(request: KeyNetwork, body: NetworksAddPeeringRequest): Request[Operation] = js.native
  /** Adds a peering to the specified network. */
  def addPeering(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Network): Request[Operation] = js.native
  
  /** Deletes the specified network. */
  def delete(): Request[Operation] = js.native
  def delete(request: KeyNetwork): Request[Operation] = js.native
  
  /** Returns the specified network. Gets a list of available networks by making a list() request. */
  def get(): Request[Network] = js.native
  def get(request: NetworkOauthtoken): Request[Network] = js.native
  
  /** Creates a network in the specified project using the data included in the request. */
  def insert(request: AltFieldsKeyOauthtokenPrettyPrintProject): Request[Operation] = js.native
  def insert(request: FieldsKey, body: Network): Request[Operation] = js.native
  
  /** Retrieves the list of networks available to the specified project. */
  def list(): Request[NetworkList] = js.native
  def list(request: MaxResults): Request[NetworkList] = js.native
  
  /** Lists the peering routes exchanged over peering connection. */
  def listPeeringRoutes(): Request[ExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(request: Direction): Request[ExchangedPeeringRoutesList] = js.native
  
  /** Patches the specified network with the data included in the request. Only the following fields can be modified: routingConfig.routingMode. */
  def patch(request: FieldsKeyNetwork): Request[Operation] = js.native
  def patch(request: KeyNetwork, body: Network): Request[Operation] = js.native
  
  /** Removes a peering from the specified network. */
  def removePeering(request: KeyNetworkOauthtoken): Request[Operation] = js.native
  def removePeering(request: KeyNetwork, body: NetworksRemovePeeringRequest): Request[Operation] = js.native
  
  /** Switches the network mode from auto subnet mode to custom subnet mode. */
  def switchToCustomMode(): Request[Operation] = js.native
  def switchToCustomMode(request: KeyNetwork): Request[Operation] = js.native
  
  def updatePeering(request: KeyNetwork, body: NetworksUpdatePeeringRequest): Request[Operation] = js.native
  /**
    * Updates the specified network peering with the data included in the request Only the following fields can be modified: NetworkPeering.export_custom_routes, and
    * NetworkPeering.import_custom_routes
    */
  def updatePeering(request: NetworkOauthtokenPrettyPrint): Request[Operation] = js.native
}
