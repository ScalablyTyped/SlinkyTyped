package typingsSlinky.maximMazurokGapiClientPubsub.gapi.client.pubsub

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientPubsub.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientPubsub.anon.Alt
import typingsSlinky.maximMazurokGapiClientPubsub.anon.Callback
import typingsSlinky.maximMazurokGapiClientPubsub.anon.Fields
import typingsSlinky.maximMazurokGapiClientPubsub.anon.Key
import typingsSlinky.maximMazurokGapiClientPubsub.anon.Name
import typingsSlinky.maximMazurokGapiClientPubsub.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientPubsub.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotsResource extends js.Object {
  
  /**
    * Creates a snapshot from the requested subscription. Snapshots are used in [Seek](https://cloud.google.com/pubsub/docs/replay-overview) operations, which allow you to manage message
    * acknowledgments in bulk. That is, you can set the acknowledgment state of messages in an existing subscription to the state captured by a snapshot. If the snapshot already exists,
    * returns `ALREADY_EXISTS`. If the requested subscription doesn't exist, returns `NOT_FOUND`. If the backlog in the subscription is too old -- and the resulting snapshot would expire
    * in less than 1 hour -- then `FAILED_PRECONDITION` is returned. See also the `Snapshot.expire_time` field. If the name is not provided in the request, the server will assign a random
    * name for this snapshot on the same project as the subscription, conforming to the [resource name format] (https://cloud.google.com/pubsub/docs/admin#resource_names). The generated
    * name is populated in the returned Snapshot object. Note that for REST API requests, you must specify a name in the request.
    */
  def create(request: Accesstoken): Request[Snapshot] = js.native
  def create(request: Alt, body: CreateSnapshotRequest): Request[Snapshot] = js.native
  
  /**
    * Removes an existing snapshot. Snapshots are used in [Seek] (https://cloud.google.com/pubsub/docs/replay-overview) operations, which allow you to manage message acknowledgments in
    * bulk. That is, you can set the acknowledgment state of messages in an existing subscription to the state captured by a snapshot. When the snapshot is deleted, all messages retained
    * in the snapshot are immediately dropped. After a snapshot is deleted, a new one may be created with the same name, but the new one has no association with the old snapshot or its
    * subscription, unless the same subscription is specified.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /**
    * Gets the configuration details of a snapshot. Snapshots are used in Seek operations, which allow you to manage message acknowledgments in bulk. That is, you can set the
    * acknowledgment state of messages in an existing subscription to the state captured by a snapshot.
    */
  def get(): Request[Snapshot] = js.native
  def get(request: Callback): Request[Snapshot] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /**
    * Lists the existing snapshots. Snapshots are used in [Seek]( https://cloud.google.com/pubsub/docs/replay-overview) operations, which allow you to manage message acknowledgments in
    * bulk. That is, you can set the acknowledgment state of messages in an existing subscription to the state captured by a snapshot.
    */
  /**
    * Lists the names of the snapshots on this topic. Snapshots are used in [Seek](https://cloud.google.com/pubsub/docs/replay-overview) operations, which allow you to manage message
    * acknowledgments in bulk. That is, you can set the acknowledgment state of messages in an existing subscription to the state captured by a snapshot.
    */
  def list(): Request[ListSnapshotsResponse] = js.native
  def list(request: Key): Request[ListSnapshotsResponse] = js.native
  def list(request: PageSize): Request[ListTopicSnapshotsResponse] = js.native
  
  def patch(request: Alt, body: UpdateSnapshotRequest): Request[Snapshot] = js.native
  /**
    * Updates an existing snapshot. Snapshots are used in Seek operations, which allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment state of
    * messages in an existing subscription to the state captured by a snapshot.
    */
  def patch(request: Name): Request[Snapshot] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
