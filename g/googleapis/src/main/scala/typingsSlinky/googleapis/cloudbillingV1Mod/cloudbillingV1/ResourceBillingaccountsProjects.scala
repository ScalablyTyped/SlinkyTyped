package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbilling/v1", "cloudbilling_v1.Resource$Billingaccounts$Projects")
@js.native
class ResourceBillingaccountsProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudbilling.billingAccounts.projects.list
    * @desc Lists the projects associated with a billing account. The current
    * authenticated user must have the `billing.resourceAssociations.list` IAM
    * permission, which is often given to billing account
    * [viewers](https://cloud.google.com/billing/docs/how-to/billing-access).
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Billing API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudbilling
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudbilling = google.cloudbilling('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The resource name of the billing account associated with the
    * projects that
    *     // you want to list. For example,
    * `billingAccounts/012345-567890-ABCDEF`. name:
    * 'billingAccounts/my-billing-account',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var projectBillingInfoPage = response['projectBillingInfo'];
    *     if (!projectBillingInfoPage) {
    *       return;
    *     }
    *     for (var i = 0; i < projectBillingInfoPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `projectBillingInfoPage`:
    *       console.log(JSON.stringify(projectBillingInfoPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       cloudbilling.billingAccounts.projects.list(request, handlePage);
    *     }
    *   };
    *
    *   cloudbilling.billingAccounts.projects.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudbilling.billingAccounts.projects.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the billing account associated with the projects that you want to list. For example, `billingAccounts/012345-567890-ABCDEF`.
    * @param {integer=} params.pageSize Requested page size. The maximum page size is 100; this is also the default.
    * @param {string=} params.pageToken A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous `ListProjectBillingInfo` call. If unspecified, the first page of results is returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListProjectBillingInfoResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProjectBillingInfoResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListProjectBillingInfoResponse] = js.native
  def list(params: ParamsResourceBillingaccountsProjectsList): GaxiosPromise[SchemaListProjectBillingInfoResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsProjectsList,
    callback: BodyResponseCallback[SchemaListProjectBillingInfoResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBillingaccountsProjectsList,
    options: BodyResponseCallback[SchemaListProjectBillingInfoResponse],
    callback: BodyResponseCallback[SchemaListProjectBillingInfoResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBillingaccountsProjectsList, options: MethodOptions): GaxiosPromise[SchemaListProjectBillingInfoResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsProjectsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProjectBillingInfoResponse]
  ): Unit = js.native
}
