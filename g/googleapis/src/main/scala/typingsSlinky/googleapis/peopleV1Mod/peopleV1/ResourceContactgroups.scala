package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$Contactgroups")
@js.native
class ResourceContactgroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * people.contactGroups.batchGet
    * @desc Get a list of contact groups owned by the authenticated user by
    * specifying a list of contact group resource names.
    * @alias people.contactGroups.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxMembers Specifies the maximum number of members to return for each group.
    * @param {string=} params.resourceNames The resource names of the contact groups to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[SchemaBatchGetContactGroupsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaBatchGetContactGroupsResponse]): Unit = js.native
  def batchGet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBatchGetContactGroupsResponse] = js.native
  def batchGet(params: ParamsResourceContactgroupsBatchget): GaxiosPromise[SchemaBatchGetContactGroupsResponse] = js.native
  def batchGet(
    params: ParamsResourceContactgroupsBatchget,
    callback: BodyResponseCallback[SchemaBatchGetContactGroupsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceContactgroupsBatchget,
    options: BodyResponseCallback[SchemaBatchGetContactGroupsResponse],
    callback: BodyResponseCallback[SchemaBatchGetContactGroupsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceContactgroupsBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetContactGroupsResponse] = js.native
  def batchGet(
    params: ParamsResourceContactgroupsBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetContactGroupsResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * people.contactGroups.create
    * @desc Create a new contact group owned by the authenticated user.
    * @alias people.contactGroups.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().CreateContactGroupRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaContactGroup] = js.native
  def create(callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def create(params: ParamsResourceContactgroupsCreate): GaxiosPromise[SchemaContactGroup] = js.native
  def create(params: ParamsResourceContactgroupsCreate, callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def create(
    params: ParamsResourceContactgroupsCreate,
    options: BodyResponseCallback[SchemaContactGroup],
    callback: BodyResponseCallback[SchemaContactGroup]
  ): Unit = js.native
  def create(params: ParamsResourceContactgroupsCreate, options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def create(
    params: ParamsResourceContactgroupsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContactGroup]
  ): Unit = js.native
  
  /**
    * people.contactGroups.delete
    * @desc Delete an existing contact group owned by the authenticated user by
    * specifying a contact group resource name.
    * @alias people.contactGroups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.deleteContacts Set to true to also delete the contacts in the specified group.
    * @param {string} params.resourceName The resource name of the contact group to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceContactgroupsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceContactgroupsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceContactgroupsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceContactgroupsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceContactgroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * people.contactGroups.get
    * @desc Get a specific contact group owned by the authenticated user by
    * specifying a contact group resource name.
    * @alias people.contactGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxMembers Specifies the maximum number of members to return.
    * @param {string} params.resourceName The resource name of the contact group to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaContactGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def get(params: ParamsResourceContactgroupsGet): GaxiosPromise[SchemaContactGroup] = js.native
  def get(params: ParamsResourceContactgroupsGet, callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def get(
    params: ParamsResourceContactgroupsGet,
    options: BodyResponseCallback[SchemaContactGroup],
    callback: BodyResponseCallback[SchemaContactGroup]
  ): Unit = js.native
  def get(params: ParamsResourceContactgroupsGet, options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def get(
    params: ParamsResourceContactgroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContactGroup]
  ): Unit = js.native
  
  /**
    * people.contactGroups.list
    * @desc List all contact groups owned by the authenticated user. Members of
    * the contact groups are not populated.
    * @alias people.contactGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of resources to return.
    * @param {string=} params.pageToken The next_page_token value returned from a previous call to [ListContactGroups](/people/api/rest/v1/contactgroups/list). Requests the next page of resources.
    * @param {string=} params.syncToken A sync token, returned by a previous call to `contactgroups.list`. Only resources changed since the sync token was created will be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListContactGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListContactGroupsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListContactGroupsResponse] = js.native
  def list(params: ParamsResourceContactgroupsList): GaxiosPromise[SchemaListContactGroupsResponse] = js.native
  def list(
    params: ParamsResourceContactgroupsList,
    callback: BodyResponseCallback[SchemaListContactGroupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceContactgroupsList,
    options: BodyResponseCallback[SchemaListContactGroupsResponse],
    callback: BodyResponseCallback[SchemaListContactGroupsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceContactgroupsList, options: MethodOptions): GaxiosPromise[SchemaListContactGroupsResponse] = js.native
  def list(
    params: ParamsResourceContactgroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListContactGroupsResponse]
  ): Unit = js.native
  
  var members: ResourceContactgroupsMembers = js.native
  
  /**
    * people.contactGroups.update
    * @desc Update the name of an existing contact group owned by the
    * authenticated user.
    * @alias people.contactGroups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName The resource name for the contact group, assigned by the server. An ASCII string, in the form of `contactGroups/`<var>contact_group_id</var>.
    * @param {().UpdateContactGroupRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaContactGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def update(params: ParamsResourceContactgroupsUpdate): GaxiosPromise[SchemaContactGroup] = js.native
  def update(params: ParamsResourceContactgroupsUpdate, callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def update(
    params: ParamsResourceContactgroupsUpdate,
    options: BodyResponseCallback[SchemaContactGroup],
    callback: BodyResponseCallback[SchemaContactGroup]
  ): Unit = js.native
  def update(params: ParamsResourceContactgroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def update(
    params: ParamsResourceContactgroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContactGroup]
  ): Unit = js.native
}
