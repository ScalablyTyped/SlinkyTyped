package typingsSlinky.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Privileges")
@js.native
class Resource$Privileges protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.privileges.list
    * @desc Retrieves a paginated list of all privileges for a customer.
    * @alias directory.privileges.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Privileges] = js.native
  def list(callback: BodyResponseCallback[Schema$Privileges]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPrivilegesDollarList): GaxiosPromise[Schema$Privileges] = js.native
  def list(
    params: ParamsDollarResourceDollarPrivilegesDollarList,
    callback: BodyResponseCallback[Schema$Privileges]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPrivilegesDollarList,
    options: BodyResponseCallback[Schema$Privileges],
    callback: BodyResponseCallback[Schema$Privileges]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPrivilegesDollarList, options: MethodOptions): GaxiosPromise[Schema$Privileges] = js.native
  def list(
    params: ParamsDollarResourceDollarPrivilegesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Privileges]
  ): Unit = js.native
}

