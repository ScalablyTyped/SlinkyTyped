package typingsSlinky.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicebroker/v1alpha1", "servicebroker_v1alpha1.Resource$Projects$Brokers$V2$Service_instances$Service_bindings")
@js.native
class ResourceProjectsBrokersV2ServiceInstancesServiceBindings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.create
    * @desc CreateBinding generates a service binding to an existing service
    * instance. See ProviServiceInstance for async operation details.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete See CreateServiceInstanceRequest for details.
    * @param {string} params.binding_id The id of the binding. Must be unique within GCP project. Maximum length is 64, GUID recommended. Required.
    * @param {string} params.instanceId The service instance to which to bind.
    * @param {string} params.parent The GCP container. Must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {().GoogleCloudServicebrokerV1alpha1__Binding} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse] = js.native
  def create(params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse] = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse] = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1CreateBindingResponse]
  ): Unit = js.native
  
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.delete
    * @desc Unbinds from a service instance. For synchronous/asynchronous
    * request details see CreateServiceInstance method. If binding does not
    * exist HTTP 410 status will be returned.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete See CreateServiceInstanceRequest for details.
    * @param {string} params.bindingId The id of the binding to delete.
    * @param {string} params.instanceId The service instance id that deleted binding is bound to.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {string=} params.planId The plan id of the service instance.
    * @param {string=} params.serviceId Additional query parameter hints. The service id of the service instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse] = js.native
  def delete(params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse] = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse] = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse]
  ): Unit = js.native
  
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.get
    * @desc GetBinding returns the binding information.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bindingId The binding id.
    * @param {string} params.instanceId Instance id to which the binding is bound.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {string=} params.planId Plan id.
    * @param {string=} params.serviceId Service id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse] = js.native
  def get(params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGet): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse] = js.native
  def get(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGet,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse] = js.native
  def get(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse]
  ): Unit = js.native
  
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.getLast_operation
    * @desc Returns the state of the last operation for the binding. Only last
    * (or current) operation can be polled.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.getLast_operation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bindingId The binding id for which to return the last operation
    * @param {string} params.instanceId The instance id that the binding is bound to.
    * @param {string=} params.operation If `operation` was returned during mutation operation, this field must be populated with the provided value.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {string=} params.planId Plan id.
    * @param {string=} params.serviceId Service id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getLast_operation(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1Operation] = js.native
  def getLast_operation(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1Operation]): Unit = js.native
  def getLast_operation(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1Operation] = js.native
  def getLast_operation(params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGetlastOperation): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1Operation] = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGetlastOperation,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGetlastOperation,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1Operation],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGetlastOperation,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1Operation] = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGetlastOperation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1Operation]
  ): Unit = js.native
}
