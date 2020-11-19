package typingsSlinky.googleapis.v24Mod.analyticsV24

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Management$Webproperties")
@js.native
class ResourceManagementWebproperties protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analytics.management.webproperties.list
    * @desc Lists web properties to which the user has access.
    * @alias analytics.management.webproperties.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve web properties for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    * @param {integer=} params.max-results The maximum number of web properties to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Unit] = js.native
  def list(callback: BodyResponseCallback[Unit]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def list(params: ParamsResourceManagementWebpropertiesList): GaxiosPromise[Unit] = js.native
  def list(params: ParamsResourceManagementWebpropertiesList, callback: BodyResponseCallback[Unit]): Unit = js.native
  def list(
    params: ParamsResourceManagementWebpropertiesList,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def list(params: ParamsResourceManagementWebpropertiesList, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def list(
    params: ParamsResourceManagementWebpropertiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
