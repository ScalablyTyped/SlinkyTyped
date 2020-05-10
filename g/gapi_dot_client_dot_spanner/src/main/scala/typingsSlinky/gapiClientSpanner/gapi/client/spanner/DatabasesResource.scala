package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSpanner.AnonAccesstoken
import typingsSlinky.gapiClientSpanner.AnonAlt
import typingsSlinky.gapiClientSpanner.AnonDatabase
import typingsSlinky.gapiClientSpanner.AnonKey
import typingsSlinky.gapiClientSpanner.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabasesResource extends js.Object {
  var operations: OperationsResource = js.native
  var sessions: SessionsResource = js.native
  /**
    * Creates a new Cloud Spanner database and starts to prepare it for serving.
    * The returned long-running operation will
    * have a name of the format `<database_name>/operations/<operation_id>` and
    * can be used to track preparation of the database. The
    * metadata field type is
    * CreateDatabaseMetadata. The
    * response field type is
    * Database, if successful.
    */
  def create(request: AnonKey): Request_[Operation] = js.native
  /** Drops (aka deletes) a Cloud Spanner database. */
  def dropDatabase(request: AnonDatabase): Request_[js.Object] = js.native
  /** Gets the state of a Cloud Spanner database. */
  def get(request: AnonAccesstoken): Request_[Database] = js.native
  /**
    * Returns the schema of a Cloud Spanner database as a list of formatted
    * DDL statements. This method does not show pending schema updates, those may
    * be queried using the Operations API.
    */
  def getDdl(request: AnonDatabase): Request_[GetDatabaseDdlResponse] = js.native
  /**
    * Gets the access control policy for a database resource. Returns an empty
    * policy if a database exists but does not have a policy set.
    *
    * Authorization requires `spanner.databases.getIamPolicy` permission on
    * resource.
    */
  def getIamPolicy(request: AnonOauthtoken): Request_[Policy] = js.native
  /** Lists Cloud Spanner databases. */
  def list(request: AnonAlt): Request_[ListDatabasesResponse] = js.native
  /**
    * Sets the access control policy on a database resource. Replaces any
    * existing policy.
    *
    * Authorization requires `spanner.databases.setIamPolicy` permission on
    * resource.
    */
  def setIamPolicy(request: AnonOauthtoken): Request_[Policy] = js.native
  /**
    * Returns permissions that the caller has on the specified database resource.
    *
    * Attempting this RPC on a non-existent Cloud Spanner database will result in
    * a NOT_FOUND error if the user has `spanner.databases.list` permission on
    * the containing Cloud Spanner instance. Otherwise returns an empty set of
    * permissions.
    */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestIamPermissionsResponse] = js.native
  /**
    * Updates the schema of a Cloud Spanner database by
    * creating/altering/dropping tables, columns, indexes, etc. The returned
    * long-running operation will have a name of
    * the format `<database_name>/operations/<operation_id>` and can be used to
    * track execution of the schema change(s). The
    * metadata field type is
    * UpdateDatabaseDdlMetadata.  The operation has no response.
    */
  def updateDdl(request: AnonDatabase): Request_[Operation] = js.native
}

object DatabasesResource {
  @scala.inline
  def apply(
    create: AnonKey => Request_[Operation],
    dropDatabase: AnonDatabase => Request_[js.Object],
    get: AnonAccesstoken => Request_[Database],
    getDdl: AnonDatabase => Request_[GetDatabaseDdlResponse],
    getIamPolicy: AnonOauthtoken => Request_[Policy],
    list: AnonAlt => Request_[ListDatabasesResponse],
    operations: OperationsResource,
    sessions: SessionsResource,
    setIamPolicy: AnonOauthtoken => Request_[Policy],
    testIamPermissions: AnonOauthtoken => Request_[TestIamPermissionsResponse],
    updateDdl: AnonDatabase => Request_[Operation]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), dropDatabase = js.Any.fromFunction1(dropDatabase), get = js.Any.fromFunction1(get), getDdl = js.Any.fromFunction1(getDdl), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), operations = operations.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), updateDdl = js.Any.fromFunction1(updateDdl))
    __obj.asInstanceOf[DatabasesResource]
  }
  @scala.inline
  implicit class DatabasesResourceOps[Self <: DatabasesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonKey => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDropDatabase(value: AnonDatabase => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDatabase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[Database]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDdl(value: AnonDatabase => Request_[GetDatabaseDdlResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDdl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonOauthtoken => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListDatabasesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOperations(value: OperationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessions(value: SessionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonOauthtoken => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonOauthtoken => Request_[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateDdl(value: AnonDatabase => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDdl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

