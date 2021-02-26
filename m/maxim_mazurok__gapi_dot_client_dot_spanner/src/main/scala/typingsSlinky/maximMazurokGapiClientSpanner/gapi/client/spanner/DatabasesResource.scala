package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSpanner.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientSpanner.anon.Alt
import typingsSlinky.maximMazurokGapiClientSpanner.anon.CallbackDatabase
import typingsSlinky.maximMazurokGapiClientSpanner.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientSpanner.anon.OauthtokenParent
import typingsSlinky.maximMazurokGapiClientSpanner.anon.Parent
import typingsSlinky.maximMazurokGapiClientSpanner.anon.ParentPrettyPrint
import typingsSlinky.maximMazurokGapiClientSpanner.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabasesResource extends StObject {
  
  def create(request: OauthtokenParent, body: CreateDatabaseRequest): Request[Operation] = js.native
  /**
    * Creates a new Cloud Spanner database and starts to prepare it for serving. The returned long-running operation will have a name of the format `/operations/` and can be used to track
    * preparation of the database. The metadata field type is CreateDatabaseMetadata. The response field type is Database, if successful.
    */
  def create(request: Parent): Request[Operation] = js.native
  
  /** Drops (aka deletes) a Cloud Spanner database. Completed backups for the database will be retained according to their `expire_time`. */
  def dropDatabase(): Request[js.Object] = js.native
  def dropDatabase(request: QuotaUser): Request[js.Object] = js.native
  
  /** Gets the state of a Cloud Spanner database. */
  def get(): Request[Database] = js.native
  def get(request: Accesstoken): Request[Database] = js.native
  
  /**
    * Returns the schema of a Cloud Spanner database as a list of formatted DDL statements. This method does not show pending schema updates, those may be queried using the Operations
    * API.
    */
  def getDdl(): Request[GetDatabaseDdlResponse] = js.native
  def getDdl(request: QuotaUser): Request[GetDatabaseDdlResponse] = js.native
  
  /**
    * Gets the access control policy for a database or backup resource. Returns an empty policy if a database or backup exists but does not have a policy set. Authorization requires
    * `spanner.databases.getIamPolicy` permission on resource. For backups, authorization requires `spanner.backups.getIamPolicy` permission on resource.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists Cloud Spanner databases. */
  def list(): Request[ListDatabasesResponse] = js.native
  def list(request: Alt): Request[ListDatabasesResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  def restore(request: OauthtokenParent, body: RestoreDatabaseRequest): Request[Operation] = js.native
  /**
    * Create a new database by restoring from a completed backup. The new database must be in the same project and in an instance with the same instance configuration as the instance
    * containing the backup. The returned database long-running operation has a name of the format `projects//instances//databases//operations/`, and can be used to track the progress of
    * the operation, and to cancel it. The metadata field type is RestoreDatabaseMetadata. The response type is Database, if successful. Cancelling the returned operation will stop the
    * restore and delete the database. There can be only one database being restored into an instance at a time. Once the restore operation completes, a new restore operation can be
    * initiated, without waiting for the optimize operation associated with the first restore to complete.
    */
  def restore(request: ParentPrettyPrint): Request[Operation] = js.native
  
  var sessions: SessionsResource = js.native
  
  /**
    * Sets the access control policy on a database or backup resource. Replaces any existing policy. Authorization requires `spanner.databases.setIamPolicy` permission on resource. For
    * backups, authorization requires `spanner.backups.setIamPolicy` permission on resource.
    */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that the caller has on the specified database or backup resource. Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND error
    * if the user has `spanner.databases.list` permission on the containing Cloud Spanner instance. Otherwise returns an empty set of permissions. Calling this method on a backup that
    * does not exist will result in a NOT_FOUND error if the user has `spanner.backups.list` permission on the containing instance.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  /**
    * Updates the schema of a Cloud Spanner database by creating/altering/dropping tables, columns, indexes, etc. The returned long-running operation will have a name of the format
    * `/operations/` and can be used to track execution of the schema change(s). The metadata field type is UpdateDatabaseDdlMetadata. The operation has no response.
    */
  def updateDdl(request: CallbackDatabase): Request[Operation] = js.native
  def updateDdl(request: QuotaUser, body: UpdateDatabaseDdlRequest): Request[Operation] = js.native
}
