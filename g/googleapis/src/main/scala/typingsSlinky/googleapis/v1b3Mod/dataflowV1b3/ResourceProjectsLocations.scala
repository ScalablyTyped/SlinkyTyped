package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations")
@js.native
class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var jobs: ResourceProjectsLocationsJobs = js.native
  
  var templates: ResourceProjectsLocationsTemplates = js.native
  
  /**
    * dataflow.projects.locations.workerMessages
    * @desc Send a worker_message to the service.
    * @alias dataflow.projects.locations.workerMessages
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job.
    * @param {string} params.projectId The project to send the WorkerMessages to.
    * @param {().SendWorkerMessagesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def workerMessages(): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]): Unit = js.native
  def workerMessages(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(params: ParamsResourceProjectsLocationsWorkermessages): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(
    params: ParamsResourceProjectsLocationsWorkermessages,
    callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]
  ): Unit = js.native
  def workerMessages(
    params: ParamsResourceProjectsLocationsWorkermessages,
    options: BodyResponseCallback[SchemaSendWorkerMessagesResponse],
    callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]
  ): Unit = js.native
  def workerMessages(params: ParamsResourceProjectsLocationsWorkermessages, options: MethodOptions): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(
    params: ParamsResourceProjectsLocationsWorkermessages,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]
  ): Unit = js.native
}
