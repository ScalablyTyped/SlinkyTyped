package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDataflow.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientDataflow.anon.QuotaUserSnapshotId
import typingsSlinky.maximMazurokGapiClientDataflow.anon.SnapshotId
import typingsSlinky.maximMazurokGapiClientDataflow.anon.UploadTypeUploadprotocol
import typingsSlinky.maximMazurokGapiClientDataflow.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotsResource extends StObject {
  
  /** Deletes a snapshot. */
  def delete(): Request[js.Object] = js.native
  def delete(request: SnapshotId): Request[js.Object] = js.native
  
  /** Gets information about a snapshot. */
  def get(): Request[Snapshot] = js.native
  def get(request: QuotaUserSnapshotId): Request[Snapshot] = js.native
  def get(request: SnapshotId): Request[Snapshot] = js.native
  
  /** Lists snapshots. */
  def list(): Request[ListSnapshotsResponse] = js.native
  def list(request: QuotaUser): Request[ListSnapshotsResponse] = js.native
  def list(request: UploadTypeUploadprotocol): Request[ListSnapshotsResponse] = js.native
  def list(request: UploadprotocolXgafv): Request[ListSnapshotsResponse] = js.native
}
