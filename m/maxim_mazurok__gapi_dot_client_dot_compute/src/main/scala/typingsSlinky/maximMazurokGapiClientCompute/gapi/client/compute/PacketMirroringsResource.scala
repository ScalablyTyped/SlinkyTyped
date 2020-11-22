package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.OauthtokenPacketMirroring
import typingsSlinky.maximMazurokGapiClientCompute.anon.PacketMirroringPrettyPrint
import typingsSlinky.maximMazurokGapiClientCompute.anon.QuotaUserRegionRequestId
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketMirroringsResource extends js.Object {
  
  /** Retrieves an aggregated list of packetMirrorings. */
  def aggregatedList(): Request[PacketMirroringAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[PacketMirroringAggregatedList] = js.native
  
  /** Deletes the specified PacketMirroring resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.PacketMirroring): Request[Operation] = js.native
  
  /** Returns the specified PacketMirroring resource. */
  def get(): Request[PacketMirroring] = js.native
  def get(request: OauthtokenPacketMirroring): Request[PacketMirroring] = js.native
  
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: PacketMirroring): Request[Operation] = js.native
  /** Creates a PacketMirroring resource in the specified project and region using the data included in the request. */
  def insert(request: QuotaUserRegionRequestId): Request[Operation] = js.native
  
  /** Retrieves a list of PacketMirroring resources available to the specified project and region. */
  def list(): Request[PacketMirroringList] = js.native
  def list(request: Filter): Request[PacketMirroringList] = js.native
  
  /** Patches the specified PacketMirroring resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules. */
  def patch(request: PacketMirroringPrettyPrint): Request[Operation] = js.native
  def patch(request: typingsSlinky.maximMazurokGapiClientCompute.anon.PacketMirroring, body: PacketMirroring): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: RegionResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
