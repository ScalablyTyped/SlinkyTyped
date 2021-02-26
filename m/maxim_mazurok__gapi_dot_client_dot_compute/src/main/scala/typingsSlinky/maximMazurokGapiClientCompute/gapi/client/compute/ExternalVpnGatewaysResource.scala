package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltExternalVpnGateway
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtoken
import typingsSlinky.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalVpnGatewaysResource extends StObject {
  
  /** Deletes the specified externalVpnGateway. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.ExternalVpnGateway): Request[Operation] = js.native
  
  /** Returns the specified externalVpnGateway. Get a list of available externalVpnGateways by making a list() request. */
  def get(): Request[ExternalVpnGateway] = js.native
  def get(request: AltExternalVpnGateway): Request[ExternalVpnGateway] = js.native
  
  /** Creates a ExternalVpnGateway in the specified project using the data included in the request. */
  def insert(request: FieldsKeyOauthtoken): Request[Operation] = js.native
  def insert(request: FieldsKey, body: ExternalVpnGateway): Request[Operation] = js.native
  
  /** Retrieves the list of ExternalVpnGateway available to the specified project. */
  def list(): Request[ExternalVpnGatewayList] = js.native
  def list(request: MaxResults): Request[ExternalVpnGatewayList] = js.native
  
  /** Sets the labels on an ExternalVpnGateway. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: KeyOauthtokenPrettyPrint, body: GlobalSetLabelsRequest): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: KeyOauthtokenPrettyPrint, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
