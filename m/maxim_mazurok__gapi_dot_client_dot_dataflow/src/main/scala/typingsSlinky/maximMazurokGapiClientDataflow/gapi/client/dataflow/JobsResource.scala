package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDataflow.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientDataflow.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientDataflow.anon.FieldsJobId
import typingsSlinky.maximMazurokGapiClientDataflow.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientDataflow.anon.Filter
import typingsSlinky.maximMazurokGapiClientDataflow.anon.JobIdKey
import typingsSlinky.maximMazurokGapiClientDataflow.anon.KeyLocation
import typingsSlinky.maximMazurokGapiClientDataflow.anon.LocationOauthtoken
import typingsSlinky.maximMazurokGapiClientDataflow.anon.OauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientDataflow.anon.PageSize
import typingsSlinky.maximMazurokGapiClientDataflow.anon.PageToken
import typingsSlinky.maximMazurokGapiClientDataflow.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientDataflow.anon.PrettyPrintProjectId
import typingsSlinky.maximMazurokGapiClientDataflow.anon.ProjectIdQuotaUser
import typingsSlinky.maximMazurokGapiClientDataflow.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientDataflow.anon.ReplaceJobId
import typingsSlinky.maximMazurokGapiClientDataflow.anon.StartTime
import typingsSlinky.maximMazurokGapiClientDataflow.anon.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends js.Object {
  
  /** List the jobs of a project across all regions. */
  def aggregated(): Request[ListJobsResponse] = js.native
  def aggregated(request: Filter): Request[ListJobsResponse] = js.native
  
  /**
    * Creates a Cloud Dataflow job. To create a job, we recommend using `projects.locations.jobs.create` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.create` is not recommended, as your job will always start in `us-central1`.
    */
  def create(request: FieldsKey): Request[Job] = js.native
  def create(request: KeyLocation, body: Job): Request[Job] = js.native
  /**
    * Creates a Cloud Dataflow job. To create a job, we recommend using `projects.locations.jobs.create` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.create` is not recommended, as your job will always start in `us-central1`.
    */
  def create(request: ReplaceJobId): Request[Job] = js.native
  def create(request: View, body: Job): Request[Job] = js.native
  
  var debug: DebugResource = js.native
  
  /**
    * Gets the state of the specified Cloud Dataflow job. To get the state of a job, we recommend using `projects.locations.jobs.get` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.get` is not recommended, as you can only get the state of jobs that are running in
    * `us-central1`.
    */
  def get(): Request[Job] = js.native
  def get(request: AltCallback): Request[Job] = js.native
  def get(request: LocationOauthtoken): Request[Job] = js.native
  
  /** Request detailed information about the execution status of the job. EXPERIMENTAL. This API is subject to change or removal without notice. */
  def getExecutionDetails(): Request[JobExecutionDetails] = js.native
  def getExecutionDetails(request: PageSize): Request[JobExecutionDetails] = js.native
  
  /**
    * Request the job status. To request the status of a job, we recommend using `projects.locations.jobs.getMetrics` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.getMetrics` is not recommended, as you can only request the status of jobs that are
    * running in `us-central1`.
    */
  def getMetrics(): Request[JobMetrics] = js.native
  def getMetrics(request: OauthtokenPrettyPrint): Request[JobMetrics] = js.native
  def getMetrics(request: StartTime): Request[JobMetrics] = js.native
  
  /**
    * List the jobs of a project. To list the jobs of a project in a region, we recommend using `projects.locations.jobs.list` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). To list the all jobs across all regions, use `projects.jobs.aggregated`. Using `projects.jobs.list` is not
    * recommended, as you can only get the list of jobs that are running in `us-central1`.
    */
  def list(): Request[ListJobsResponse] = js.native
  def list(request: Filter): Request[ListJobsResponse] = js.native
  def list(request: PageToken): Request[ListJobsResponse] = js.native
  
  var messages: MessagesResource = js.native
  
  /** Snapshot the state of a streaming job. */
  def snapshot(request: CallbackFields): Request[Snapshot] = js.native
  /** Snapshot the state of a streaming job. */
  def snapshot(request: PrettyPrintProjectId): Request[Snapshot] = js.native
  def snapshot(request: PrettyPrint, body: SnapshotJobRequest): Request[Snapshot] = js.native
  def snapshot(request: QuotaUser, body: SnapshotJobRequest): Request[Snapshot] = js.native
  
  var snapshots: SnapshotsResource = js.native
  
  var stages: StagesResource = js.native
  
  /**
    * Updates the state of an existing Cloud Dataflow job. To update the state of an existing job, we recommend using `projects.locations.jobs.update` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.update` is not recommended, as you can only update the state of jobs that are running in
    * `us-central1`.
    */
  def update(request: FieldsJobId): Request[Job] = js.native
  def update(request: JobIdKey, body: Job): Request[Job] = js.native
  /**
    * Updates the state of an existing Cloud Dataflow job. To update the state of an existing job, we recommend using `projects.locations.jobs.update` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.update` is not recommended, as you can only update the state of jobs that are running in
    * `us-central1`.
    */
  def update(request: ProjectIdQuotaUser): Request[Job] = js.native
  def update(request: QuotaUser, body: Job): Request[Job] = js.native
  
  var workItems: WorkItemsResource = js.native
}
