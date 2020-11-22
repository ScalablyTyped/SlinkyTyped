package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Callback
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.FieldsInstance
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Filter
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Project
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Resource
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.SyncMode
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.UploadType
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.VerifyConnectionOnly
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends js.Object {
  
  /**
    * Add a new trusted Certificate Authority (CA) version for the specified instance. Required to prepare for a certificate rotation. If a CA version was previously added but never used
    * in a certificate rotation, this operation replaces that version. There cannot be more than one CA version waiting to be rotated in.
    */
  def addServerCa(): Request[Operation] = js.native
  def addServerCa(request: Callback): Request[Operation] = js.native
  
  def clone(request: Callback, body: InstancesCloneRequest): Request[Operation] = js.native
  /** Creates a Cloud SQL instance as a clone of the source instance. Using this operation might cause your instance to restart. */
  def clone(request: Oauthtoken): Request[Operation] = js.native
  
  /** Deletes a Cloud SQL instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  def demoteMaster(request: Callback, body: InstancesDemoteMasterRequest): Request[Operation] = js.native
  /** Demotes the stand-alone instance to be a Cloud SQL read replica for an external database server. */
  def demoteMaster(request: PrettyPrint): Request[Operation] = js.native
  
  def export(request: Callback, body: InstancesExportRequest): Request[Operation] = js.native
  /** Exports data from a Cloud SQL instance to a Cloud Storage bucket as a SQL dump or CSV file. */
  def export(request: Project): Request[Operation] = js.native
  
  def failover(request: Callback, body: InstancesFailoverRequest): Request[Operation] = js.native
  /** Failover the instance to its failover replica instance. Using this operation might cause your instance to restart. */
  def failover(request: QuotaUser): Request[Operation] = js.native
  
  /** Retrieves a resource containing information about a Cloud SQL instance. */
  def get(): Request[DatabaseInstance] = js.native
  def get(request: Callback): Request[DatabaseInstance] = js.native
  
  def `import`(request: Callback, body: InstancesImportRequest): Request[Operation] = js.native
  /** Imports data into a Cloud SQL instance from a SQL dump or CSV file in Cloud Storage. */
  def `import`(request: Resource): Request[Operation] = js.native
  
  /** Creates a new Cloud SQL instance. */
  def insert(request: UploadType): Request[Operation] = js.native
  def insert(request: Uploadprotocol, body: DatabaseInstance): Request[Operation] = js.native
  
  /** Lists instances under a given project. */
  def list(): Request[InstancesListResponse] = js.native
  def list(request: Filter): Request[InstancesListResponse] = js.native
  
  /**
    * Lists all of the trusted Certificate Authorities (CAs) for the specified instance. There can be up to three CAs listed: the CA that was used to sign the certificate that is
    * currently in use, a CA that has been added but not yet used to sign a certificate, and a CA used to sign a certificate that has previously rotated out.
    */
  def listServerCas(): Request[InstancesListServerCasResponse] = js.native
  def listServerCas(request: Callback): Request[InstancesListServerCasResponse] = js.native
  
  def patch(request: Callback, body: DatabaseInstance): Request[Operation] = js.native
  /** Updates settings of a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: Xgafv): Request[Operation] = js.native
  
  /** Promotes the read replica instance to be a stand-alone Cloud SQL instance. Using this operation might cause your instance to restart. */
  def promoteReplica(): Request[Operation] = js.native
  def promoteReplica(request: Callback): Request[Operation] = js.native
  
  def rescheduleMaintenance(request: Callback, body: SqlInstancesRescheduleMaintenanceRequestBody): Request[Operation] = js.native
  /** Reschedules the maintenance on the given instance. */
  def rescheduleMaintenance(request: FieldsInstance): Request[Operation] = js.native
  
  /** Deletes all client certificates and generates a new server SSL certificate for the instance. */
  def resetSslConfig(): Request[Operation] = js.native
  def resetSslConfig(request: Callback): Request[Operation] = js.native
  
  /** Restarts a Cloud SQL instance. */
  def restart(): Request[Operation] = js.native
  def restart(request: Callback): Request[Operation] = js.native
  
  /** Restores a backup of a Cloud SQL instance. Using this operation might cause your instance to restart. */
  def restoreBackup(request: AccesstokenAlt): Request[Operation] = js.native
  def restoreBackup(request: Callback, body: InstancesRestoreBackupRequest): Request[Operation] = js.native
  
  /** Rotates the server certificate to one signed by the Certificate Authority (CA) version previously added with the addServerCA method. */
  def rotateServerCa(request: AltCallback): Request[Operation] = js.native
  def rotateServerCa(request: Callback, body: InstancesRotateServerCaRequest): Request[Operation] = js.native
  
  /** Start External primary instance migration. */
  def startExternalSync(): Request[Operation] = js.native
  def startExternalSync(request: SyncMode): Request[Operation] = js.native
  
  /** Starts the replication in the read replica instance. */
  def startReplica(): Request[Operation] = js.native
  def startReplica(request: Callback): Request[Operation] = js.native
  
  /** Stops the replication in the read replica instance. */
  def stopReplica(): Request[Operation] = js.native
  def stopReplica(request: Callback): Request[Operation] = js.native
  
  /** Truncate MySQL general and slow query log tables */
  def truncateLog(request: CallbackFields): Request[Operation] = js.native
  def truncateLog(request: Callback, body: InstancesTruncateLogRequest): Request[Operation] = js.native
  
  def update(request: Callback, body: DatabaseInstance): Request[Operation] = js.native
  /** Updates settings of a Cloud SQL instance. Using this operation might cause your instance to restart. */
  def update(request: Xgafv): Request[Operation] = js.native
  
  /** Verify External primary instance external sync settings. */
  def verifyExternalSyncSettings(): Request[SqlInstancesVerifyExternalSyncSettingsResponse] = js.native
  def verifyExternalSyncSettings(request: VerifyConnectionOnly): Request[SqlInstancesVerifyExternalSyncSettingsResponse] = js.native
}
