package typingsSlinky.googleapis.v2beta3Mod.cloudtasksV2beta3

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudtasks/v2beta3", "cloudtasks_v2beta3.Resource$Projects$Locations$Queues")
@js.native
class ResourceProjectsLocationsQueues protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudtasks.projects.locations.queues.create
    * @desc Creates a queue.  Queues created with this method allow tasks to
    * live for a maximum of 31 days. After a task is 31 days old, the task will
    * be deleted regardless of whether it was dispatched or not.  WARNING:
    * Using this method may have unintended side effects if you are using an
    * App Engine `queue.yaml` or `queue.xml` file to manage your queues. Read
    * [Overview of Queue Management and
    * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
    * this method.
    * @alias cloudtasks.projects.locations.queues.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The location name in which the queue will be created. For example: `projects/PROJECT_ID/locations/LOCATION_ID`  The list of allowed locations can be obtained by calling Cloud Tasks' implementation of ListLocations.
    * @param {().Queue} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaQueue] = js.native
  def create(callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def create(params: ParamsResourceProjectsLocationsQueuesCreate): GaxiosPromise[SchemaQueue] = js.native
  def create(params: ParamsResourceProjectsLocationsQueuesCreate, callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsQueuesCreate,
    options: BodyResponseCallback[SchemaQueue],
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsQueuesCreate, options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def create(
    params: ParamsResourceProjectsLocationsQueuesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.delete
    * @desc Deletes a queue.  This command will delete the queue even if it has
    * tasks in it.  Note: If you delete a queue, a queue with the same name
    * can't be created for 7 days.  WARNING: Using this method may have
    * unintended side effects if you are using an App Engine `queue.yaml` or
    * `queue.xml` file to manage your queues. Read [Overview of Queue
    * Management and
    * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
    * this method.
    * @alias cloudtasks.projects.locations.queues.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsQueuesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsQueuesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsQueuesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsQueuesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsQueuesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.get
    * @desc Gets a queue.
    * @alias cloudtasks.projects.locations.queues.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the queue. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaQueue] = js.native
  def get(callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def get(params: ParamsResourceProjectsLocationsQueuesGet): GaxiosPromise[SchemaQueue] = js.native
  def get(params: ParamsResourceProjectsLocationsQueuesGet, callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsQueuesGet,
    options: BodyResponseCallback[SchemaQueue],
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsQueuesGet, options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def get(
    params: ParamsResourceProjectsLocationsQueuesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.getIamPolicy
    * @desc Gets the access control policy for a Queue. Returns an empty policy
    * if the resource exists and does not have a policy set.  Authorization
    * requires the following [Google IAM](https://cloud.google.com/iam)
    * permission on the specified resource parent:  *
    * `cloudtasks.queues.getIamPolicy`
    * @alias cloudtasks.projects.locations.queues.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsQueuesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsQueuesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsQueuesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsQueuesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsQueuesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.list
    * @desc Lists queues.  Queues are returned in lexicographical order.
    * @alias cloudtasks.projects.locations.queues.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter `filter` can be used to specify a subset of queues. Any Queue field can be used as a filter and several operators as supported. For example: `<=, <, >=, >, !=, =, :`. The filter syntax is the same as described in [Stackdriver's Advanced Logs Filters](https://cloud.google.com/logging/docs/view/advanced_filters).  Sample filter "state: PAUSED".  Note that using filters might cause fewer queues than the requested page_size to be returned.
    * @param {integer=} params.pageSize Requested page size.  The maximum page size is 9800. If unspecified, the page size will be the maximum. Fewer queues than requested might be returned, even if more queues exist; use the next_page_token in the response to determine if more queues exist.
    * @param {string=} params.pageToken A token identifying the page of results to return.  To request the first page results, page_token must be empty. To request the next page of results, page_token must be the value of next_page_token returned from the previous call to ListQueues method. It is an error to switch the value of the filter while iterating through pages.
    * @param {string} params.parent Required.  The location name. For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListQueuesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListQueuesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListQueuesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsQueuesList): GaxiosPromise[SchemaListQueuesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsQueuesList,
    callback: BodyResponseCallback[SchemaListQueuesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsQueuesList,
    options: BodyResponseCallback[SchemaListQueuesResponse],
    callback: BodyResponseCallback[SchemaListQueuesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsQueuesList, options: MethodOptions): GaxiosPromise[SchemaListQueuesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsQueuesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListQueuesResponse]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.patch
    * @desc Updates a queue.  This method creates the queue if it does not
    * exist and updates the queue if it does exist.  Queues created with this
    * method allow tasks to live for a maximum of 31 days. After a task is 31
    * days old, the task will be deleted regardless of whether it was
    * dispatched or not.  WARNING: Using this method may have unintended side
    * effects if you are using an App Engine `queue.yaml` or `queue.xml` file
    * to manage your queues. Read [Overview of Queue Management and
    * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
    * this method.
    * @alias cloudtasks.projects.locations.queues.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Caller-specified and required in CreateQueue, after which it becomes output only.  The queue name.  The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`  * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons (:), or periods (.).    For more information, see    [Identifying    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location.    The list of available locations can be obtained by calling    ListLocations.    For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or   hyphens (-). The maximum length is 100 characters.
    * @param {string=} params.updateMask A mask used to specify which fields of the queue are being updated.  If empty, then all fields will be updated.
    * @param {().Queue} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaQueue] = js.native
  def patch(callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def patch(params: ParamsResourceProjectsLocationsQueuesPatch): GaxiosPromise[SchemaQueue] = js.native
  def patch(params: ParamsResourceProjectsLocationsQueuesPatch, callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsQueuesPatch,
    options: BodyResponseCallback[SchemaQueue],
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsQueuesPatch, options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsQueuesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.pause
    * @desc Pauses the queue.  If a queue is paused then the system will stop
    * dispatching tasks until the queue is resumed via ResumeQueue. Tasks can
    * still be added when the queue is paused. A queue is paused if its state
    * is PAUSED.
    * @alias cloudtasks.projects.locations.queues.pause
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The queue name. For example: `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param {().PauseQueueRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pause(): GaxiosPromise[SchemaQueue] = js.native
  def pause(callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def pause(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def pause(params: ParamsResourceProjectsLocationsQueuesPause): GaxiosPromise[SchemaQueue] = js.native
  def pause(params: ParamsResourceProjectsLocationsQueuesPause, callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def pause(
    params: ParamsResourceProjectsLocationsQueuesPause,
    options: BodyResponseCallback[SchemaQueue],
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  def pause(params: ParamsResourceProjectsLocationsQueuesPause, options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def pause(
    params: ParamsResourceProjectsLocationsQueuesPause,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.purge
    * @desc Purges a queue by deleting all of its tasks.  All tasks created
    * before this method is called are permanently deleted.  Purge operations
    * can take up to one minute to take effect. Tasks might be dispatched
    * before the purge takes effect. A purge is irreversible.
    * @alias cloudtasks.projects.locations.queues.purge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The queue name. For example: `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param {().PurgeQueueRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def purge(): GaxiosPromise[SchemaQueue] = js.native
  def purge(callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def purge(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def purge(params: ParamsResourceProjectsLocationsQueuesPurge): GaxiosPromise[SchemaQueue] = js.native
  def purge(params: ParamsResourceProjectsLocationsQueuesPurge, callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def purge(
    params: ParamsResourceProjectsLocationsQueuesPurge,
    options: BodyResponseCallback[SchemaQueue],
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  def purge(params: ParamsResourceProjectsLocationsQueuesPurge, options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def purge(
    params: ParamsResourceProjectsLocationsQueuesPurge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.resume
    * @desc Resume a queue.  This method resumes a queue after it has been
    * PAUSED or DISABLED. The state of a queue is stored in the queue's state;
    * after calling this method it will be set to RUNNING.  WARNING: Resuming
    * many high-QPS queues at the same time can lead to target overloading. If
    * you are resuming high-QPS queues, follow the 500/50/5 pattern described
    * in [Managing Cloud Tasks Scaling
    * Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
    * @alias cloudtasks.projects.locations.queues.resume
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The queue name. For example: `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param {().ResumeQueueRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resume(): GaxiosPromise[SchemaQueue] = js.native
  def resume(callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def resume(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def resume(params: ParamsResourceProjectsLocationsQueuesResume): GaxiosPromise[SchemaQueue] = js.native
  def resume(params: ParamsResourceProjectsLocationsQueuesResume, callback: BodyResponseCallback[SchemaQueue]): Unit = js.native
  def resume(
    params: ParamsResourceProjectsLocationsQueuesResume,
    options: BodyResponseCallback[SchemaQueue],
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  def resume(params: ParamsResourceProjectsLocationsQueuesResume, options: MethodOptions): GaxiosPromise[SchemaQueue] = js.native
  def resume(
    params: ParamsResourceProjectsLocationsQueuesResume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueue]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.setIamPolicy
    * @desc Sets the access control policy for a Queue. Replaces any existing
    * policy.  Note: The Cloud Console does not check queue-level IAM
    * permissions yet. Project-level permissions are required to use the Cloud
    * Console.  Authorization requires the following [Google
    * IAM](https://cloud.google.com/iam) permission on the specified resource
    * parent:  * `cloudtasks.queues.setIamPolicy`
    * @alias cloudtasks.projects.locations.queues.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsQueuesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsQueuesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsQueuesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsQueuesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsQueuesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  var tasks: ResourceProjectsLocationsQueuesTasks = js.native
  
  /**
    * cloudtasks.projects.locations.queues.testIamPermissions
    * @desc Returns permissions that a caller has on a Queue. If the resource
    * does not exist, this will return an empty set of permissions, not a
    * NOT_FOUND error.  Note: This operation is designed to be used for
    * building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias cloudtasks.projects.locations.queues.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsQueuesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsQueuesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsQueuesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsQueuesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsQueuesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
