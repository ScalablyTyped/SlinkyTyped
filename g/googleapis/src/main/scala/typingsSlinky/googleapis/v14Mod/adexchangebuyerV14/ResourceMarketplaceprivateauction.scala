package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Marketplaceprivateauction")
@js.native
class ResourceMarketplaceprivateauction protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer.marketplaceprivateauction.updateproposal
    * @desc Update a given private auction proposal
    * @alias adexchangebuyer.marketplaceprivateauction.updateproposal
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.privateAuctionId The private auction id to be updated.
    * @param {().UpdatePrivateAuctionProposalRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateproposal(): GaxiosPromise[Unit] = js.native
  def updateproposal(callback: BodyResponseCallback[Unit]): Unit = js.native
  def updateproposal(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def updateproposal(params: ParamsResourceMarketplaceprivateauctionUpdateproposal): GaxiosPromise[Unit] = js.native
  def updateproposal(
    params: ParamsResourceMarketplaceprivateauctionUpdateproposal,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def updateproposal(
    params: ParamsResourceMarketplaceprivateauctionUpdateproposal,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def updateproposal(params: ParamsResourceMarketplaceprivateauctionUpdateproposal, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def updateproposal(
    params: ParamsResourceMarketplaceprivateauctionUpdateproposal,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
