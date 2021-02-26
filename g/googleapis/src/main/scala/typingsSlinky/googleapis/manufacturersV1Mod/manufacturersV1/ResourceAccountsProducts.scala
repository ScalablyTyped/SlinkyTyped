package typingsSlinky.googleapis.manufacturersV1Mod.manufacturersV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/manufacturers/v1", "manufacturers_v1.Resource$Accounts$Products")
@js.native
class ResourceAccountsProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * manufacturers.accounts.products.delete
    * @desc Deletes the product from a Manufacturer Center account.
    * @alias manufacturers.accounts.products.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name in the format `{target_country}:{content_language}:{product_id}`.  `target_country`   - The target country of the product as a CLDR territory                      code (for example, US).  `content_language` - The content language of the product as a two-letter                      ISO 639-1 language code (for example, en).  `product_id`     -   The ID of the product. For more information, see                      https://support.google.com/manufacturers/answer/6124116#id.
    * @param {string} params.parent Parent ID in the format `accounts/{account_id}`.  `account_id` - The ID of the Manufacturer Center account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAccountsProductsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAccountsProductsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsProductsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsProductsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsProductsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * manufacturers.accounts.products.get
    * @desc Gets the product from a Manufacturer Center account, including
    * product issues.  A recently updated product takes around 15 minutes to
    * process. Changes are only visible after it has been processed. While some
    * issues may be available once the product has been processed, other issues
    * may take days to appear.
    * @alias manufacturers.accounts.products.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.include The information to be included in the response. Only sections listed here will be returned.
    * @param {string} params.name Name in the format `{target_country}:{content_language}:{product_id}`.  `target_country`   - The target country of the product as a CLDR territory                      code (for example, US).  `content_language` - The content language of the product as a two-letter                      ISO 639-1 language code (for example, en).  `product_id`     -   The ID of the product. For more information, see                      https://support.google.com/manufacturers/answer/6124116#id.
    * @param {string} params.parent Parent ID in the format `accounts/{account_id}`.  `account_id` - The ID of the Manufacturer Center account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceAccountsProductsGet): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceAccountsProductsGet, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(
    params: ParamsResourceAccountsProductsGet,
    options: BodyResponseCallback[SchemaProduct],
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsProductsGet, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(
    params: ParamsResourceAccountsProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  
  /**
    * manufacturers.accounts.products.list
    * @desc Lists all the products in a Manufacturer Center account.
    * @alias manufacturers.accounts.products.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.include The information to be included in the response. Only sections listed here will be returned.
    * @param {integer=} params.pageSize Maximum number of product statuses to return in the response, used for paging.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.parent Parent ID in the format `accounts/{account_id}`.  `account_id` - The ID of the Manufacturer Center account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProductsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(params: ParamsResourceAccountsProductsList): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    callback: BodyResponseCallback[SchemaListProductsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    options: BodyResponseCallback[SchemaListProductsResponse],
    callback: BodyResponseCallback[SchemaListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsProductsList, options: MethodOptions): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProductsResponse]
  ): Unit = js.native
  
  /**
    * manufacturers.accounts.products.update
    * @desc Inserts or updates the attributes of the product in a Manufacturer
    * Center account.  Creates a product with the provided attributes. If the
    * product already exists, then all attributes are replaced with the new
    * ones. The checks at upload time are minimal. All required attributes need
    * to be present for a product to be valid. Issues may show up later after
    * the API has accepted a new upload for a product and it is possible to
    * overwrite an existing valid product with an invalid product. To detect
    * this, you should retrieve the product and check it for issues once the
    * new version is available.  Uploaded attributes first need to be processed
    * before they can be retrieved. Until then, new products will be
    * unavailable, and retrieval of previously uploaded products will return
    * the original state of the product.
    * @alias manufacturers.accounts.products.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name in the format `{target_country}:{content_language}:{product_id}`.  `target_country`   - The target country of the product as a CLDR territory                      code (for example, US).  `content_language` - The content language of the product as a two-letter                      ISO 639-1 language code (for example, en).  `product_id`     -   The ID of the product. For more information, see                      https://support.google.com/manufacturers/answer/6124116#id.
    * @param {string} params.parent Parent ID in the format `accounts/{account_id}`.  `account_id` - The ID of the Manufacturer Center account.
    * @param {().Attributes} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaEmpty] = js.native
  def update(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def update(params: ParamsResourceAccountsProductsUpdate): GaxiosPromise[SchemaEmpty] = js.native
  def update(params: ParamsResourceAccountsProductsUpdate, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def update(
    params: ParamsResourceAccountsProductsUpdate,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsProductsUpdate, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def update(
    params: ParamsResourceAccountsProductsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}
