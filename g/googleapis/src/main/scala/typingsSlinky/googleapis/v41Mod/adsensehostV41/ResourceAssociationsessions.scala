package typingsSlinky.googleapis.v41Mod.adsensehostV41

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Associationsessions")
@js.native
class ResourceAssociationsessions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsensehost.associationsessions.start
    * @desc Create an association session for initiating an association with an
    * AdSense user.
    * @alias adsensehost.associationsessions.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productCode Products to associate with the user.
    * @param {string=} params.userLocale The preferred locale of the user.
    * @param {string=} params.websiteLocale The locale of the user's hosted website.
    * @param {string} params.websiteUrl The URL of the user's hosted website.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[SchemaAssociationSession] = js.native
  def start(callback: BodyResponseCallback[SchemaAssociationSession]): Unit = js.native
  def start(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAssociationSession] = js.native
  def start(params: ParamsResourceAssociationsessionsStart): GaxiosPromise[SchemaAssociationSession] = js.native
  def start(
    params: ParamsResourceAssociationsessionsStart,
    callback: BodyResponseCallback[SchemaAssociationSession]
  ): Unit = js.native
  def start(
    params: ParamsResourceAssociationsessionsStart,
    options: BodyResponseCallback[SchemaAssociationSession],
    callback: BodyResponseCallback[SchemaAssociationSession]
  ): Unit = js.native
  def start(params: ParamsResourceAssociationsessionsStart, options: MethodOptions): GaxiosPromise[SchemaAssociationSession] = js.native
  def start(
    params: ParamsResourceAssociationsessionsStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssociationSession]
  ): Unit = js.native
  
  /**
    * adsensehost.associationsessions.verify
    * @desc Verify an association session after the association callback
    * returns from AdSense signup.
    * @alias adsensehost.associationsessions.verify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.token The token returned to the association callback URL.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verify(): GaxiosPromise[SchemaAssociationSession] = js.native
  def verify(callback: BodyResponseCallback[SchemaAssociationSession]): Unit = js.native
  def verify(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAssociationSession] = js.native
  def verify(params: ParamsResourceAssociationsessionsVerify): GaxiosPromise[SchemaAssociationSession] = js.native
  def verify(
    params: ParamsResourceAssociationsessionsVerify,
    callback: BodyResponseCallback[SchemaAssociationSession]
  ): Unit = js.native
  def verify(
    params: ParamsResourceAssociationsessionsVerify,
    options: BodyResponseCallback[SchemaAssociationSession],
    callback: BodyResponseCallback[SchemaAssociationSession]
  ): Unit = js.native
  def verify(params: ParamsResourceAssociationsessionsVerify, options: MethodOptions): GaxiosPromise[SchemaAssociationSession] = js.native
  def verify(
    params: ParamsResourceAssociationsessionsVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssociationSession]
  ): Unit = js.native
}
