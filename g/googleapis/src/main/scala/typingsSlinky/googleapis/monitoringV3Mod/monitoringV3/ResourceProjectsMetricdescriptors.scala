package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Metricdescriptors")
@js.native
class ResourceProjectsMetricdescriptors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * monitoring.projects.metricDescriptors.create
    * @desc Creates a new metric descriptor. User-created metric descriptors
    * define custom metrics.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'create' method:
    *
    *     // The project on which to execute the request. The format is
    * `"projects/{project_id_or_number}"`. name: "projects/{MY-PROJECT}",
    *     resource: {},
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *   monitoring.projects.metricDescriptors.create(request, function(err,
    * result) { if (err) { console.log(err); } else { console.log(result);
    *     }
    *   });
    * });
    * @alias monitoring.projects.metricDescriptors.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The project on which to execute the request. The format is "projects/{project_id_or_number}".
    * @param {().MetricDescriptor} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def create(callback: BodyResponseCallback[SchemaMetricDescriptor]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def create(params: ParamsResourceProjectsMetricdescriptorsCreate): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def create(
    params: ParamsResourceProjectsMetricdescriptorsCreate,
    callback: BodyResponseCallback[SchemaMetricDescriptor]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsMetricdescriptorsCreate,
    options: BodyResponseCallback[SchemaMetricDescriptor],
    callback: BodyResponseCallback[SchemaMetricDescriptor]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsMetricdescriptorsCreate, options: MethodOptions): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def create(
    params: ParamsResourceProjectsMetricdescriptorsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetricDescriptor]
  ): Unit = js.native
  
  /**
    * monitoring.projects.metricDescriptors.delete
    * @desc Deletes a metric descriptor. Only user-created custom metrics can
    * be deleted.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'delete' method:
    *
    *     // The metric descriptor on which to execute the request. The format
    * is
    *     // `"projects/{project_id_or_number}/metricDescriptors/{metric_id}"`.
    * An example of `{metric_id}` is:
    *     // `"custom.googleapis.com/my_test_metric"`.
    *     name: "",
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *   monitoring.projects.metricDescriptors.delete(request, function(err,
    * result) { if (err) { console.log(err); } else { console.log(result);
    *     }
    *   });
    * });
    * @alias monitoring.projects.metricDescriptors.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The metric descriptor on which to execute the request. The format is "projects/{project_id_or_number}/metricDescriptors/{metric_id}". An example of {metric_id} is: "custom.googleapis.com/my_test_metric".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsMetricdescriptorsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsMetricdescriptorsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsMetricdescriptorsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsMetricdescriptorsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsMetricdescriptorsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * monitoring.projects.metricDescriptors.get
    * @desc Gets a single metric descriptor. This method does not require a
    * Stackdriver account.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'get' method:
    *
    *     // The metric descriptor on which to execute the request. The format
    * is
    *     // `"projects/{project_id_or_number}/metricDescriptors/{metric_id}"`.
    * An example value of `{metric_id}`
    *     // is `"compute.googleapis.com/instance/disk/read_bytes_count"`.
    *     name: "",
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *   monitoring.projects.metricDescriptors.get(request, function(err,
    * result) { if (err) { console.log(err); } else { console.log(result);
    *     }
    *   });
    * });
    * @alias monitoring.projects.metricDescriptors.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The metric descriptor on which to execute the request. The format is "projects/{project_id_or_number}/metricDescriptors/{metric_id}". An example value of {metric_id} is "compute.googleapis.com/instance/disk/read_bytes_count".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def get(callback: BodyResponseCallback[SchemaMetricDescriptor]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def get(params: ParamsResourceProjectsMetricdescriptorsGet): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsMetricdescriptorsGet,
    callback: BodyResponseCallback[SchemaMetricDescriptor]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsMetricdescriptorsGet,
    options: BodyResponseCallback[SchemaMetricDescriptor],
    callback: BodyResponseCallback[SchemaMetricDescriptor]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsMetricdescriptorsGet, options: MethodOptions): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsMetricdescriptorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetricDescriptor]
  ): Unit = js.native
  
  /**
    * monitoring.projects.metricDescriptors.list
    * @desc Lists metric descriptors that match a filter. This method does not
    * require a Stackdriver account.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'list' method:
    *
    *     // The project on which to execute the request. The format is
    * `"projects/{project_id_or_number}"`. name: "projects/{MY-PROJECT}",
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *
    *   var recur = function(err, result) {
    *     if (err) {
    *       console.log(err);
    *     } else {
    *       console.log(result);
    *       if (result.nextPageToken) {
    *         request.pageToken = result.nextPageToken;
    *         monitoring.projects.metricDescriptors.list(request, recur);
    *       }
    *     }
    *   };
    *
    *   monitoring.projects.metricDescriptors.list(request, recur);
    * });
    * @alias monitoring.projects.metricDescriptors.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter If this field is empty, all custom and system-defined metric descriptors are returned. Otherwise, the filter specifies which metric descriptors are to be returned. For example, the following filter matches all custom metrics: metric.type = starts_with("custom.googleapis.com/")
    * @param {string} params.name The project on which to execute the request. The format is "projects/{project_id_or_number}".
    * @param {integer=} params.pageSize A positive number that is the maximum number of results to return.
    * @param {string=} params.pageToken If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListMetricDescriptorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMetricDescriptorsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListMetricDescriptorsResponse] = js.native
  def list(params: ParamsResourceProjectsMetricdescriptorsList): GaxiosPromise[SchemaListMetricDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMetricdescriptorsList,
    callback: BodyResponseCallback[SchemaListMetricDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsMetricdescriptorsList,
    options: BodyResponseCallback[SchemaListMetricDescriptorsResponse],
    callback: BodyResponseCallback[SchemaListMetricDescriptorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsMetricdescriptorsList, options: MethodOptions): GaxiosPromise[SchemaListMetricDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMetricdescriptorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMetricDescriptorsResponse]
  ): Unit = js.native
}
