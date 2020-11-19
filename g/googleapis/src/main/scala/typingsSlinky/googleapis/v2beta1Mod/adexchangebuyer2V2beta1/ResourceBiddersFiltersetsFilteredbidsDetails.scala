package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Bidders$Filtersets$Filteredbids$Details")
@js.native
class ResourceBiddersFiltersetsFilteredbidsDetails protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer2.bidders.filterSets.filteredBids.details.list
    * @desc List all details associated with a specific reason for which bids
    * were filtered, with the number of bids filtered for each detail.
    * @alias adexchangebuyer2.bidders.filterSets.filteredBids.details.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.creativeStatusId The ID of the creative status for which to retrieve a breakdown by detail. See [creative-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/creative-status-codes). Details are only available for statuses 10, 14, 15, 17, 18, 19, 86, and 87.
    * @param {string} params.filterSetName Name of the filter set that should be applied to the requested metrics. For example:  - For a bidder-level filter set for bidder 123:   `bidders/123/filterSets/abc`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123/filterSets/abc`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    * @param {integer=} params.pageSize Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListCreativeStatusBreakdownByDetailResponse.nextPageToken returned from the previous call to the filteredBids.details.list method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListCreativeStatusBreakdownByDetailResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCreativeStatusBreakdownByDetailResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListCreativeStatusBreakdownByDetailResponse] = js.native
  def list(params: ParamsResourceBiddersFiltersetsFilteredbidsDetailsList): GaxiosPromise[SchemaListCreativeStatusBreakdownByDetailResponse] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsFilteredbidsDetailsList,
    callback: BodyResponseCallback[SchemaListCreativeStatusBreakdownByDetailResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsFilteredbidsDetailsList,
    options: BodyResponseCallback[SchemaListCreativeStatusBreakdownByDetailResponse],
    callback: BodyResponseCallback[SchemaListCreativeStatusBreakdownByDetailResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersFiltersetsFilteredbidsDetailsList, options: MethodOptions): GaxiosPromise[SchemaListCreativeStatusBreakdownByDetailResponse] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsFilteredbidsDetailsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCreativeStatusBreakdownByDetailResponse]
  ): Unit = js.native
}
