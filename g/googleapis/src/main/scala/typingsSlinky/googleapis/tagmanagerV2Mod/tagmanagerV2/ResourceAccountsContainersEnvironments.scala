package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Environments")
@js.native
class ResourceAccountsContainersEnvironments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.environments.create
    * @desc Creates a GTM Environment.
    * @alias tagmanager.accounts.containers.environments.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaEnvironment] = js.native
  def create(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def create(params: ParamsResourceAccountsContainersEnvironmentsCreate): GaxiosPromise[SchemaEnvironment] = js.native
  def create(
    params: ParamsResourceAccountsContainersEnvironmentsCreate,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersEnvironmentsCreate,
    options: BodyResponseCallback[SchemaEnvironment],
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersEnvironmentsCreate, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def create(
    params: ParamsResourceAccountsContainersEnvironmentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.environments.delete
    * @desc Deletes a GTM Environment.
    * @alias tagmanager.accounts.containers.environments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Environment's API relative path. Example: accounts/{account_id}/containers/{container_id}/environments/{environment_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersEnvironmentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersEnvironmentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersEnvironmentsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersEnvironmentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersEnvironmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.environments.get
    * @desc Gets a GTM Environment.
    * @alias tagmanager.accounts.containers.environments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Environment's API relative path. Example: accounts/{account_id}/containers/{container_id}/environments/{environment_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaEnvironment] = js.native
  def get(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def get(params: ParamsResourceAccountsContainersEnvironmentsGet): GaxiosPromise[SchemaEnvironment] = js.native
  def get(
    params: ParamsResourceAccountsContainersEnvironmentsGet,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersEnvironmentsGet,
    options: BodyResponseCallback[SchemaEnvironment],
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersEnvironmentsGet, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def get(
    params: ParamsResourceAccountsContainersEnvironmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.environments.list
    * @desc Lists all GTM Environments of a GTM Container.
    * @alias tagmanager.accounts.containers.environments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEnvironmentsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersEnvironmentsList): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersEnvironmentsList,
    callback: BodyResponseCallback[SchemaListEnvironmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersEnvironmentsList,
    options: BodyResponseCallback[SchemaListEnvironmentsResponse],
    callback: BodyResponseCallback[SchemaListEnvironmentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersEnvironmentsList, options: MethodOptions): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersEnvironmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEnvironmentsResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.environments.reauthorize
    * @desc Re-generates the authorization code for a GTM Environment.
    * @alias tagmanager.accounts.containers.environments.reauthorize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Environment's API relative path. Example: accounts/{account_id}/containers/{container_id}/environments/{environment_id}
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reauthorize(): GaxiosPromise[SchemaEnvironment] = js.native
  def reauthorize(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def reauthorize(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def reauthorize(params: ParamsResourceAccountsContainersEnvironmentsReauthorize): GaxiosPromise[SchemaEnvironment] = js.native
  def reauthorize(
    params: ParamsResourceAccountsContainersEnvironmentsReauthorize,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def reauthorize(
    params: ParamsResourceAccountsContainersEnvironmentsReauthorize,
    options: BodyResponseCallback[SchemaEnvironment],
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def reauthorize(params: ParamsResourceAccountsContainersEnvironmentsReauthorize, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def reauthorize(
    params: ParamsResourceAccountsContainersEnvironmentsReauthorize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.environments.update
    * @desc Updates a GTM Environment.
    * @alias tagmanager.accounts.containers.environments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the environment in storage.
    * @param {string} params.path GTM Environment's API relative path. Example: accounts/{account_id}/containers/{container_id}/environments/{environment_id}
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaEnvironment] = js.native
  def update(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def update(params: ParamsResourceAccountsContainersEnvironmentsUpdate): GaxiosPromise[SchemaEnvironment] = js.native
  def update(
    params: ParamsResourceAccountsContainersEnvironmentsUpdate,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersEnvironmentsUpdate,
    options: BodyResponseCallback[SchemaEnvironment],
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersEnvironmentsUpdate, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def update(
    params: ParamsResourceAccountsContainersEnvironmentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
}
