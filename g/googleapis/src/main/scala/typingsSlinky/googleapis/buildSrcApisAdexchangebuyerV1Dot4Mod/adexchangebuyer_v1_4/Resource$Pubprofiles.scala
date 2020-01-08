package typingsSlinky.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Pubprofiles")
@js.native
class Resource$Pubprofiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.pubprofiles.list
    * @desc Gets the requested publisher profile(s) by publisher accountId.
    * @alias adexchangebuyer.pubprofiles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The accountId of the publisher to get profiles for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GetPublisherProfilesByAccountIdResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GetPublisherProfilesByAccountIdResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPubprofilesDollarList): GaxiosPromise[Schema$GetPublisherProfilesByAccountIdResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPubprofilesDollarList,
    callback: BodyResponseCallback[Schema$GetPublisherProfilesByAccountIdResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPubprofilesDollarList,
    options: BodyResponseCallback[Schema$GetPublisherProfilesByAccountIdResponse],
    callback: BodyResponseCallback[Schema$GetPublisherProfilesByAccountIdResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPubprofilesDollarList, options: MethodOptions): GaxiosPromise[Schema$GetPublisherProfilesByAccountIdResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPubprofilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetPublisherProfilesByAccountIdResponse]
  ): Unit = js.native
}

