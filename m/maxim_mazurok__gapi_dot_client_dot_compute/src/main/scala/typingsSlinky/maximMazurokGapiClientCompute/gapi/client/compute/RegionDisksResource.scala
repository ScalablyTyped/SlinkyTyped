package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltDiskFields
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltDiskFieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.DiskFieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.DiskFieldsKeyOauthtoken
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.OptionsRequestedPolicyVersionPrettyPrint
import typingsSlinky.maximMazurokGapiClientCompute.anon.QuotaUserRegionRequestIdResource
import typingsSlinky.maximMazurokGapiClientCompute.anon.QuotaUserRegionUserIp
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionRequestIdResourceUserIp
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionResource
import typingsSlinky.maximMazurokGapiClientCompute.anon.ResourceSourceImage
import typingsSlinky.maximMazurokGapiClientCompute.anon.SourceImageUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionDisksResource extends StObject {
  
  /** Adds existing resource policies to a regional disk. You can only add one policy which will be applied to this disk for scheduling snapshot creation. */
  def addResourcePolicies(request: AltDiskFields): Request[Operation] = js.native
  def addResourcePolicies(request: DiskFieldsKey, body: RegionDisksAddResourcePoliciesRequest): Request[Operation] = js.native
  
  /** Creates a snapshot of this regional disk. */
  def createSnapshot(request: AltDiskFieldsKey): Request[Operation] = js.native
  def createSnapshot(request: DiskFieldsKey, body: Snapshot): Request[Operation] = js.native
  
  /**
    * Deletes the specified regional persistent disk. Deleting a regional disk removes all the replicas of its data permanently and is irreversible. However, deleting a disk does not
    * delete any snapshots previously made from the disk. You must separately delete snapshots.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: DiskFieldsKey): Request[Operation] = js.native
  
  /** Returns a specified regional persistent disk. */
  def get(): Request[Disk] = js.native
  def get(request: QuotaUserRegionUserIp): Request[Disk] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsRequestedPolicyVersionPrettyPrint): Request[Policy] = js.native
  
  /** Creates a persistent regional disk in the specified project using the data included in the request. */
  def insert(request: ResourceSourceImage): Request[Operation] = js.native
  def insert(request: SourceImageUserIp, body: Disk): Request[Operation] = js.native
  
  /** Retrieves the list of persistent disks contained within the specified region. */
  def list(): Request[DiskList] = js.native
  def list(request: Filter): Request[DiskList] = js.native
  
  /** Removes resource policies from a regional disk. */
  def removeResourcePolicies(request: DiskFieldsKeyOauthtoken): Request[Operation] = js.native
  def removeResourcePolicies(request: DiskFieldsKey, body: RegionDisksRemoveResourcePoliciesRequest): Request[Operation] = js.native
  
  def resize(request: DiskFieldsKey, body: RegionDisksResizeRequest): Request[Operation] = js.native
  /** Resizes the specified regional persistent disk. */
  def resize(request: QuotaUserRegionRequestIdResource): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: RegionResource, body: RegionSetPolicyRequest): Request[Policy] = js.native
  
  /** Sets the labels on the target regional disk. */
  def setLabels(request: RegionRequestIdResourceUserIp, body: RegionSetLabelsRequest): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: RegionResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
