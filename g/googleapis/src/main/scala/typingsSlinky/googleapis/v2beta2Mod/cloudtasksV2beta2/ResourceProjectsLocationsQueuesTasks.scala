package typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudtasks/v2beta2", "cloudtasks_v2beta2.Resource$Projects$Locations$Queues$Tasks")
@js.native
class ResourceProjectsLocationsQueuesTasks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * cloudtasks.projects.locations.queues.tasks.acknowledge
    * @desc Acknowledges a pull task.  The worker, that is, the entity that
    * leased this task must call this method to indicate that the work
    * associated with the task has finished.  The worker must acknowledge a
    * task within the lease_duration or the lease will expire and the task will
    * become available to be leased again. After the task is acknowledged, it
    * will not be returned by a later LeaseTasks, GetTask, or ListTasks.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Tasks API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtasks
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudTasks = google.cloudtasks('v2beta2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required.
    *     // The task name. For example:
    *     //
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name:
    * 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    * // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudTasks.projects.locations.queues.tasks.acknowledge(request,
    * function(err) { if (err) { console.error(err); return;
    *     }
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudtasks.projects.locations.queues.tasks.acknowledge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param {().AcknowledgeTaskRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def acknowledge(): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def acknowledge(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(
    params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def acknowledge(
    params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def acknowledge(params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(
    params: ParamsResourceProjectsLocationsQueuesTasksAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.tasks.cancelLease
    * @desc Cancel a pull task's lease.  The worker can use this method to
    * cancel a task's lease by setting its schedule_time to now. This will make
    * the task available to be leased to the next caller of LeaseTasks.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Tasks API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtasks
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudTasks = google.cloudtasks('v2beta2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required.
    *     // The task name. For example:
    *     //
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name:
    * 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    * // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudTasks.projects.locations.queues.tasks.cancelLease(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudtasks.projects.locations.queues.tasks.cancelLease
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param {().CancelLeaseRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancelLease(): GaxiosPromise[SchemaTask] = js.native
  def cancelLease(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def cancelLease(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def cancelLease(params: ParamsResourceProjectsLocationsQueuesTasksCancellease): GaxiosPromise[SchemaTask] = js.native
  def cancelLease(
    params: ParamsResourceProjectsLocationsQueuesTasksCancellease,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def cancelLease(
    params: ParamsResourceProjectsLocationsQueuesTasksCancellease,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def cancelLease(params: ParamsResourceProjectsLocationsQueuesTasksCancellease, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def cancelLease(
    params: ParamsResourceProjectsLocationsQueuesTasksCancellease,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudtasks.projects.locations.queues.tasks.create
    * @desc Creates a task and adds it to a queue.  Tasks cannot be updated
    * after creation; there is no UpdateTask command.  * For App Engine queues,
    * the maximum task size is   100KB. * For pull queues, the maximum task
    * size is 1MB.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Tasks API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtasks
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudTasks = google.cloudtasks('v2beta2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required.
    *     // The queue name. For example:
    *     // `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    *     // The queue must already exist.
    *     parent: 'projects/my-project/locations/my-location/queues/my-queue',
    * // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudTasks.projects.locations.queues.tasks.create(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudtasks.projects.locations.queues.tasks.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`  The queue must already exist.
    * @param {().CreateTaskRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTask] = js.native
  def create(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def create(params: ParamsResourceProjectsLocationsQueuesTasksCreate): GaxiosPromise[SchemaTask] = js.native
  def create(
    params: ParamsResourceProjectsLocationsQueuesTasksCreate,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsQueuesTasksCreate,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsQueuesTasksCreate, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def create(
    params: ParamsResourceProjectsLocationsQueuesTasksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.tasks.delete
    * @desc Deletes a task.  A task can be deleted if it is scheduled or
    * dispatched. A task cannot be deleted if it has completed successfully or
    * permanently failed.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Tasks API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtasks
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudTasks = google.cloudtasks('v2beta2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required.
    *     // The task name. For example:
    *     //
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name:
    * 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    * // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudTasks.projects.locations.queues.tasks.delete(request,
    * function(err) { if (err) { console.error(err); return;
    *     }
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudtasks.projects.locations.queues.tasks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsQueuesTasksDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsQueuesTasksDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsQueuesTasksDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsQueuesTasksDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsQueuesTasksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.tasks.get
    * @desc Gets a task.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Tasks API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtasks
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudTasks = google.cloudtasks('v2beta2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required.
    *     // The task name. For example:
    *     //
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name:
    * 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    * // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudTasks.projects.locations.queues.tasks.get(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudtasks.projects.locations.queues.tasks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param {string=} params.responseView The response_view specifies which subset of the Task will be returned.  By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains.  Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTask] = js.native
  def get(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceProjectsLocationsQueuesTasksGet): GaxiosPromise[SchemaTask] = js.native
  def get(params: ParamsResourceProjectsLocationsQueuesTasksGet, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsQueuesTasksGet,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsQueuesTasksGet, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def get(
    params: ParamsResourceProjectsLocationsQueuesTasksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.tasks.lease
    * @desc Leases tasks from a pull queue for lease_duration.  This method is
    * invoked by the worker to obtain a lease. The worker must acknowledge the
    * task via AcknowledgeTask after they have performed the work associated
    * with the task.  The payload is intended to store data that the worker
    * needs to perform the work associated with the task. To return the
    * payloads in the response, set response_view to FULL.  A maximum of 10 qps
    * of LeaseTasks requests are allowed per queue. RESOURCE_EXHAUSTED is
    * returned when this limit is exceeded. RESOURCE_EXHAUSTED is also returned
    * when max_tasks_dispatched_per_second is exceeded.
    * @alias cloudtasks.projects.locations.queues.tasks.lease
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param {().LeaseTasksRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def lease(): GaxiosPromise[SchemaLeaseTasksResponse] = js.native
  def lease(callback: BodyResponseCallback[SchemaLeaseTasksResponse]): Unit = js.native
  def lease(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLeaseTasksResponse] = js.native
  def lease(params: ParamsResourceProjectsLocationsQueuesTasksLease): GaxiosPromise[SchemaLeaseTasksResponse] = js.native
  def lease(
    params: ParamsResourceProjectsLocationsQueuesTasksLease,
    callback: BodyResponseCallback[SchemaLeaseTasksResponse]
  ): Unit = js.native
  def lease(
    params: ParamsResourceProjectsLocationsQueuesTasksLease,
    options: BodyResponseCallback[SchemaLeaseTasksResponse],
    callback: BodyResponseCallback[SchemaLeaseTasksResponse]
  ): Unit = js.native
  def lease(params: ParamsResourceProjectsLocationsQueuesTasksLease, options: MethodOptions): GaxiosPromise[SchemaLeaseTasksResponse] = js.native
  def lease(
    params: ParamsResourceProjectsLocationsQueuesTasksLease,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaseTasksResponse]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.tasks.list
    * @desc Lists the tasks in a queue.  By default, only the BASIC view is
    * retrieved due to performance considerations; response_view controls the
    * subset of information which is returned.  The tasks may be returned in
    * any order. The ordering may change at any time.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Tasks API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtasks
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudTasks = google.cloudtasks('v2beta2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required.
    *     // The queue name. For example:
    *     // `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    *     parent: 'projects/my-project/locations/my-location/queues/my-queue',
    * // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var tasksPage = response['tasks'];
    *     if (!tasksPage) {
    *       return;
    *     }
    *     for (var i = 0; i < tasksPage.length; i++) {
    *       // TODO: Change code below to process each resource in `tasksPage`:
    *       console.log(JSON.stringify(tasksPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       cloudTasks.projects.locations.queues.tasks.list(request,
    * handlePage);
    *     }
    *   };
    *
    *   cloudTasks.projects.locations.queues.tasks.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudtasks.projects.locations.queues.tasks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Requested page size. Fewer tasks than requested might be returned.  The maximum page size is 1000. If unspecified, the page size will be the maximum. Fewer tasks than requested might be returned, even if more tasks exist; use next_page_token in the response to determine if more tasks exist.
    * @param {string=} params.pageToken A token identifying the page of results to return.  To request the first page results, page_token must be empty. To request the next page of results, page_token must be the value of next_page_token returned from the previous call to ListTasks method.  The page token is valid for only 2 hours.
    * @param {string} params.parent Required.  The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param {string=} params.responseView The response_view specifies which subset of the Task will be returned.  By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains.  Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTasksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTasksResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTasksResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsQueuesTasksList): GaxiosPromise[SchemaListTasksResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsQueuesTasksList,
    callback: BodyResponseCallback[SchemaListTasksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsQueuesTasksList,
    options: BodyResponseCallback[SchemaListTasksResponse],
    callback: BodyResponseCallback[SchemaListTasksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsQueuesTasksList, options: MethodOptions): GaxiosPromise[SchemaListTasksResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsQueuesTasksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTasksResponse]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.tasks.renewLease
    * @desc Renew the current lease of a pull task.  The worker can use this
    * method to extend the lease by a new duration, starting from now. The new
    * task lease will be returned in the task's schedule_time.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Tasks API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtasks
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudTasks = google.cloudtasks('v2beta2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required.
    *     // The task name. For example:
    *     //
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name:
    * 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    * // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudTasks.projects.locations.queues.tasks.renewLease(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudtasks.projects.locations.queues.tasks.renewLease
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param {().RenewLeaseRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def renewLease(): GaxiosPromise[SchemaTask] = js.native
  def renewLease(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def renewLease(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def renewLease(params: ParamsResourceProjectsLocationsQueuesTasksRenewlease): GaxiosPromise[SchemaTask] = js.native
  def renewLease(
    params: ParamsResourceProjectsLocationsQueuesTasksRenewlease,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def renewLease(
    params: ParamsResourceProjectsLocationsQueuesTasksRenewlease,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def renewLease(params: ParamsResourceProjectsLocationsQueuesTasksRenewlease, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def renewLease(
    params: ParamsResourceProjectsLocationsQueuesTasksRenewlease,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  
  /**
    * cloudtasks.projects.locations.queues.tasks.run
    * @desc Forces a task to run now.  When this method is called, Cloud Tasks
    * will dispatch the task, even if the task is already running, the queue
    * has reached its RateLimits or is PAUSED.  This command is meant to be
    * used for manual debugging. For example, RunTask can be used to retry a
    * failed task after a fix has been made or to manually force a task to be
    * dispatched now.  The dispatched task is returned. That is, the task that
    * is returned contains the status after the task is dispatched but before
    * the task is received by its target.  If Cloud Tasks receives a successful
    * response from the task's target, then the task will be deleted; otherwise
    * the task's schedule_time will be reset to the time that RunTask was
    * called plus the retry delay specified in the queue's RetryConfig. RunTask
    * returns NOT_FOUND when it is called on a task that has already succeeded
    * or permanently failed.  RunTask cannot be called on a pull task.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Tasks API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtasks
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudTasks = google.cloudtasks('v2beta2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required.
    *     // The task name. For example:
    *     //
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *     name:
    * 'projects/my-project/locations/my-location/queues/my-queue/tasks/my-task',
    * // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudTasks.projects.locations.queues.tasks.run(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudtasks.projects.locations.queues.tasks.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param {().RunTaskRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[SchemaTask] = js.native
  def run(callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def run(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def run(params: ParamsResourceProjectsLocationsQueuesTasksRun): GaxiosPromise[SchemaTask] = js.native
  def run(params: ParamsResourceProjectsLocationsQueuesTasksRun, callback: BodyResponseCallback[SchemaTask]): Unit = js.native
  def run(
    params: ParamsResourceProjectsLocationsQueuesTasksRun,
    options: BodyResponseCallback[SchemaTask],
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
  def run(params: ParamsResourceProjectsLocationsQueuesTasksRun, options: MethodOptions): GaxiosPromise[SchemaTask] = js.native
  def run(
    params: ParamsResourceProjectsLocationsQueuesTasksRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTask]
  ): Unit = js.native
}
