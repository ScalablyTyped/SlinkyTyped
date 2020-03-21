package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsProductsList extends StandardParameters {
  /**
    * Account ID of the buyer.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * An optional PQL query used to query for products. See
    * https://developers.google.com/ad-manager/docs/pqlreference for
    * documentation about PQL and examples.  Nested repeated fields, such as
    * product.targetingCriterion.inclusions, cannot be filtered.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Requested page size. The server may return fewer results than requested.
    * If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The page token as returned from ListProductsResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
}

