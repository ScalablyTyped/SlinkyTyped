package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSqladmin.AnonFields
import typingsSlinky.gapiClientSqladmin.AnonFilter
import typingsSlinky.gapiClientSqladmin.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesResource extends js.Object {
  /** Creates a Cloud SQL instance as a clone of the source instance. The API is not ready for Second Generation instances yet. */
  def clone(request: AnonFields): Request_[Operation] = js.native
  /** Deletes a Cloud SQL instance. */
  def delete(request: AnonFields): Request_[Operation] = js.native
  /** Exports data from a Cloud SQL instance to a Google Cloud Storage bucket as a MySQL dump file. */
  def export(request: AnonFields): Request_[Operation] = js.native
  /** Failover the instance to its failover replica instance. */
  def failover(request: AnonFields): Request_[Operation] = js.native
  /** Retrieves a resource containing information about a Cloud SQL instance. */
  def get(request: AnonFields): Request_[DatabaseInstance] = js.native
  /** Imports data into a Cloud SQL instance from a MySQL dump file in Google Cloud Storage. */
  def `import`(request: AnonFields): Request_[Operation] = js.native
  /** Creates a new Cloud SQL instance. */
  def insert(request: AnonKey): Request_[Operation] = js.native
  /** Lists instances under a given project in the alphabetical order of the instance name. */
  def list(request: AnonFilter): Request_[InstancesListResponse] = js.native
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.. This method supports patch semantics.
    */
  def patch(request: AnonFields): Request_[Operation] = js.native
  /** Promotes the read replica instance to be a stand-alone Cloud SQL instance. */
  def promoteReplica(request: AnonFields): Request_[Operation] = js.native
  /**
    * Deletes all client certificates and generates a new server SSL certificate for the instance. The changes will not take effect until the instance is
    * restarted. Existing instances without a server certificate will need to call this once to set a server certificate.
    */
  def resetSslConfig(request: AnonFields): Request_[Operation] = js.native
  /** Restarts a Cloud SQL instance. */
  def restart(request: AnonFields): Request_[Operation] = js.native
  /** Restores a backup of a Cloud SQL instance. */
  def restoreBackup(request: AnonFields): Request_[Operation] = js.native
  /** Starts the replication in the read replica instance. */
  def startReplica(request: AnonFields): Request_[Operation] = js.native
  /** Stops the replication in the read replica instance. */
  def stopReplica(request: AnonFields): Request_[Operation] = js.native
  /** Truncate MySQL general and slow query log tables */
  def truncateLog(request: AnonFields): Request_[Operation] = js.native
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.
    */
  def update(request: AnonFields): Request_[Operation] = js.native
}

object InstancesResource {
  @scala.inline
  def apply(
    clone: AnonFields => Request_[Operation],
    delete: AnonFields => Request_[Operation],
    export: AnonFields => Request_[Operation],
    failover: AnonFields => Request_[Operation],
    get: AnonFields => Request_[DatabaseInstance],
    `import`: AnonFields => Request_[Operation],
    insert: AnonKey => Request_[Operation],
    list: AnonFilter => Request_[InstancesListResponse],
    patch: AnonFields => Request_[Operation],
    promoteReplica: AnonFields => Request_[Operation],
    resetSslConfig: AnonFields => Request_[Operation],
    restart: AnonFields => Request_[Operation],
    restoreBackup: AnonFields => Request_[Operation],
    startReplica: AnonFields => Request_[Operation],
    stopReplica: AnonFields => Request_[Operation],
    truncateLog: AnonFields => Request_[Operation],
    update: AnonFields => Request_[Operation]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), delete = js.Any.fromFunction1(delete), export = js.Any.fromFunction1(export), failover = js.Any.fromFunction1(failover), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), promoteReplica = js.Any.fromFunction1(promoteReplica), resetSslConfig = js.Any.fromFunction1(resetSslConfig), restart = js.Any.fromFunction1(restart), restoreBackup = js.Any.fromFunction1(restoreBackup), startReplica = js.Any.fromFunction1(startReplica), stopReplica = js.Any.fromFunction1(stopReplica), truncateLog = js.Any.fromFunction1(truncateLog), update = js.Any.fromFunction1(update))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[InstancesResource]
  }
  @scala.inline
  implicit class InstancesResourceOps[Self <: InstancesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExport(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFailover(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[DatabaseInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImport(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[InstancesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPromoteReplica(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteReplica")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetSslConfig(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetSslConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestart(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestoreBackup(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreBackup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartReplica(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startReplica")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopReplica(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopReplica")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTruncateLog(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateLog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

