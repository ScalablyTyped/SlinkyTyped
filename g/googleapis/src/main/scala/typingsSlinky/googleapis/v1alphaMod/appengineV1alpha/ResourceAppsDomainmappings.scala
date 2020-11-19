package typingsSlinky.googleapis.v1alphaMod.appengineV1alpha

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1alpha", "appengine_v1alpha.Resource$Apps$Domainmappings")
@js.native
class ResourceAppsDomainmappings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * appengine.apps.domainMappings.create
    * @desc Maps a domain to an application. A user must be authorized to
    * administer a domain in order to map it to an application. For a list of
    * available authorized domains, see
    * AuthorizedDomains.ListAuthorizedDomains.
    * @alias appengine.apps.domainMappings.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    * @param {boolean=} params.noManagedCertificate Whether a managed certificate should be provided by App Engine. If true, a certificate ID must be manaually set in the DomainMapping resource to configure SSL for this domain. If false, a managed certificate will be provisioned and a certificate ID will be automatically populated.
    * @param {string=} params.overrideStrategy Whether the domain creation should override any existing mappings for this domain. By default, overrides are rejected.
    * @param {().DomainMapping} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAppsDomainmappingsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAppsDomainmappingsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceAppsDomainmappingsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceAppsDomainmappingsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceAppsDomainmappingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * appengine.apps.domainMappings.delete
    * @desc Deletes the specified domain mapping. A user must be authorized to
    * administer the associated domain in order to delete a DomainMapping
    * resource.
    * @alias appengine.apps.domainMappings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource to delete. Example: apps/myapp/domainMappings/example.com.
    * @param {string} params.domainMappingsId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAppsDomainmappingsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAppsDomainmappingsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceAppsDomainmappingsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceAppsDomainmappingsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAppsDomainmappingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * appengine.apps.domainMappings.get
    * @desc Gets the specified domain mapping.
    * @alias appengine.apps.domainMappings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource requested. Example: apps/myapp/domainMappings/example.com.
    * @param {string} params.domainMappingsId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDomainMapping] = js.native
  def get(callback: BodyResponseCallback[SchemaDomainMapping]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDomainMapping] = js.native
  def get(params: ParamsResourceAppsDomainmappingsGet): GaxiosPromise[SchemaDomainMapping] = js.native
  def get(params: ParamsResourceAppsDomainmappingsGet, callback: BodyResponseCallback[SchemaDomainMapping]): Unit = js.native
  def get(
    params: ParamsResourceAppsDomainmappingsGet,
    options: BodyResponseCallback[SchemaDomainMapping],
    callback: BodyResponseCallback[SchemaDomainMapping]
  ): Unit = js.native
  def get(params: ParamsResourceAppsDomainmappingsGet, options: MethodOptions): GaxiosPromise[SchemaDomainMapping] = js.native
  def get(
    params: ParamsResourceAppsDomainmappingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomainMapping]
  ): Unit = js.native
  
  /**
    * appengine.apps.domainMappings.list
    * @desc Lists the domain mappings on an application.
    * @alias appengine.apps.domainMappings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    * @param {integer=} params.pageSize Maximum results to return per page.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDomainMappingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDomainMappingsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDomainMappingsResponse] = js.native
  def list(params: ParamsResourceAppsDomainmappingsList): GaxiosPromise[SchemaListDomainMappingsResponse] = js.native
  def list(
    params: ParamsResourceAppsDomainmappingsList,
    callback: BodyResponseCallback[SchemaListDomainMappingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsDomainmappingsList,
    options: BodyResponseCallback[SchemaListDomainMappingsResponse],
    callback: BodyResponseCallback[SchemaListDomainMappingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsDomainmappingsList, options: MethodOptions): GaxiosPromise[SchemaListDomainMappingsResponse] = js.native
  def list(
    params: ParamsResourceAppsDomainmappingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDomainMappingsResponse]
  ): Unit = js.native
  
  /**
    * appengine.apps.domainMappings.patch
    * @desc Updates the specified domain mapping. To map an SSL certificate to
    * a domain mapping, update certificate_id to point to an
    * AuthorizedCertificate resource. A user must be authorized to administer
    * the associated domain in order to update a DomainMapping resource.
    * @alias appengine.apps.domainMappings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource to update. Example: apps/myapp/domainMappings/example.com.
    * @param {string} params.domainMappingsId Part of `name`. See documentation of `appsId`.
    * @param {boolean=} params.noManagedCertificate Whether a managed certificate should be provided by App Engine. If true, a certificate ID must be manually set in the DomainMapping resource to configure SSL for this domain. If false, a managed certificate will be provisioned and a certificate ID will be automatically populated. Only applicable if ssl_settings.certificate_id is specified in the update mask.
    * @param {string=} params.updateMask Standard field mask for the set of fields to be updated.
    * @param {().DomainMapping} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsDomainmappingsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsDomainmappingsPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceAppsDomainmappingsPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceAppsDomainmappingsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAppsDomainmappingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
