package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsInterconnect
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrintProject
import typingsSlinky.maximMazurokGapiClientCompute.anon.InterconnectKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectsResource extends js.Object {
  
  /** Deletes the specified interconnect. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Interconnect): Request[Operation] = js.native
  
  /** Returns the specified interconnect. Get a list of available interconnects by making a list() request. */
  def get(): Request[Interconnect] = js.native
  def get(request: FieldsInterconnect): Request[Interconnect] = js.native
  
  /** Returns the interconnectDiagnostics for the specified interconnect. */
  def getDiagnostics(): Request[InterconnectsGetDiagnosticsResponse] = js.native
  def getDiagnostics(request: FieldsInterconnect): Request[InterconnectsGetDiagnosticsResponse] = js.native
  
  /** Creates a Interconnect in the specified project using the data included in the request. */
  def insert(request: FieldsKeyOauthtokenPrettyPrintProject): Request[Operation] = js.native
  def insert(request: FieldsKey, body: Interconnect): Request[Operation] = js.native
  
  /** Retrieves the list of interconnect available to the specified project. */
  def list(): Request[InterconnectList] = js.native
  def list(request: MaxResults): Request[InterconnectList] = js.native
  
  /** Updates the specified interconnect with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules. */
  def patch(request: InterconnectKey): Request[Operation] = js.native
  def patch(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Interconnect, body: Interconnect): Request[Operation] = js.native
}
