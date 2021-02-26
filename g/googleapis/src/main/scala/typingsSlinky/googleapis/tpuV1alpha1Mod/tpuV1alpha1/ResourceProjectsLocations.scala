package typingsSlinky.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tpu/v1alpha1", "tpu_v1alpha1.Resource$Projects$Locations")
@js.native
class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var acceleratorTypes: ResourceProjectsLocationsAcceleratortypes = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * tpu.projects.locations.get
    * @desc Gets information about a location.
    * @alias tpu.projects.locations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for the location.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLocation] = js.native
  def get(callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceProjectsLocationsGet): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceProjectsLocationsGet, callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: BodyResponseCallback[SchemaLocation],
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGet, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  
  /**
    * tpu.projects.locations.list
    * @desc Lists information about the supported locations for this service.
    * @alias tpu.projects.locations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The standard list filter.
    * @param {string} params.name The resource that owns the locations collection, if applicable.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLocationsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsList): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: BodyResponseCallback[SchemaListLocationsResponse],
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsList, options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  
  var nodes: ResourceProjectsLocationsNodes = js.native
  
  var operations: ResourceProjectsLocationsOperations = js.native
  
  var tensorflowVersions: ResourceProjectsLocationsTensorflowversions = js.native
}
