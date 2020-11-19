package typingsSlinky.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudprivatecatalog/v1beta1", "cloudprivatecatalog_v1beta1.Resource$Folders$Catalogs")
@js.native
class ResourceFoldersCatalogs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudprivatecatalog.folders.catalogs.search
    * @desc Search Catalog resources that consumers have access to, within the
    * scope of the consumer cloud resource hierarchy context.
    * @alias cloudprivatecatalog.folders.catalogs.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of entries that are requested.
    * @param {string=} params.pageToken A pagination token returned from a previous call to SearchCatalogs that indicates where this listing should continue from. This field is optional.
    * @param {string=} params.query The query to filter the catalogs. The supported queries are:  * Get a single catalog: `name=catalogs/{catalog_id}`
    * @param {string} params.resource_ Required. The name of the resource context. It can be in following formats:  * `projects/{project_id}` * `folders/{folder_id}` * `organizations/{organization_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse]): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse] = js.native
  def search(params: ParamsResourceFoldersCatalogsSearch): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse] = js.native
  def search(
    params: ParamsResourceFoldersCatalogsSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceFoldersCatalogsSearch,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceFoldersCatalogsSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse] = js.native
  def search(
    params: ParamsResourceFoldersCatalogsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse]
  ): Unit = js.native
}
