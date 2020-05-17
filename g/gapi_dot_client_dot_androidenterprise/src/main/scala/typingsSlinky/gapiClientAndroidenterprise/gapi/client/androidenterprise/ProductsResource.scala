package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidenterprise.anon.Approved
import typingsSlinky.gapiClientAndroidenterprise.anon.LanguageCode
import typingsSlinky.gapiClientAndroidenterprise.anon.ProductId
import typingsSlinky.gapiClientAndroidenterprise.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductsResource extends js.Object {
  /**
    * Approves the specified product and the relevant app permissions, if any. The maximum number of products that you can approve per enterprise customer is
    * 1,000.
    *
    * To learn how to use managed Google Play to design and create a store layout to display approved products to your users, see Store Layout Design.
    */
  def approve(request: ProductId): Request[Unit] = js.native
  /**
    * Generates a URL that can be rendered in an iframe to display the permissions (if any) of a product. An enterprise admin must view these permissions and
    * accept them on behalf of their organization in order to approve that product.
    *
    * Admins should accept the displayed permissions by interacting with a separate UI element in the EMM console, which in turn should trigger the use of
    * this URL as the approvalUrlInfo.approvalUrl property in a Products.approve call to approve the product. This URL can only be used to display
    * permissions for up to 1 day.
    */
  def generateApprovalUrl(request: LanguageCode): Request[ProductsGenerateApprovalUrlResponse] = js.native
  /** Retrieves details of a product for display to an enterprise admin. */
  def get(request: QuotaUser): Request[Product] = js.native
  /**
    * Retrieves the schema that defines the configurable properties for this product. All products have a schema, but this schema may be empty if no managed
    * configurations have been defined. This schema can be used to populate a UI that allows an admin to configure the product. To apply a managed
    * configuration based on the schema obtained using this API, see Managed Configurations through Play.
    */
  def getAppRestrictionsSchema(request: QuotaUser): Request[AppRestrictionsSchema] = js.native
  /** Retrieves the Android app permissions required by this app. */
  def getPermissions(request: ProductId): Request[ProductPermissions] = js.native
  /** Finds approved products that match a query, or all approved products if there is no query. */
  def list(request: Approved): Request[ProductsListResponse] = js.native
  /** Unapproves the specified product (and the relevant app permissions, if any) */
  def unapprove(request: ProductId): Request[Unit] = js.native
}

object ProductsResource {
  @scala.inline
  def apply(
    approve: ProductId => Request[Unit],
    generateApprovalUrl: LanguageCode => Request[ProductsGenerateApprovalUrlResponse],
    get: QuotaUser => Request[Product],
    getAppRestrictionsSchema: QuotaUser => Request[AppRestrictionsSchema],
    getPermissions: ProductId => Request[ProductPermissions],
    list: Approved => Request[ProductsListResponse],
    unapprove: ProductId => Request[Unit]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(approve = js.Any.fromFunction1(approve), generateApprovalUrl = js.Any.fromFunction1(generateApprovalUrl), get = js.Any.fromFunction1(get), getAppRestrictionsSchema = js.Any.fromFunction1(getAppRestrictionsSchema), getPermissions = js.Any.fromFunction1(getPermissions), list = js.Any.fromFunction1(list), unapprove = js.Any.fromFunction1(unapprove))
    __obj.asInstanceOf[ProductsResource]
  }
  @scala.inline
  implicit class ProductsResourceOps[Self <: ProductsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprove(value: ProductId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateApprovalUrl(value: LanguageCode => Request[ProductsGenerateApprovalUrlResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateApprovalUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: QuotaUser => Request[Product]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAppRestrictionsSchema(value: QuotaUser => Request[AppRestrictionsSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppRestrictionsSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPermissions(value: ProductId => Request[ProductPermissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Approved => Request[ProductsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnapprove(value: ProductId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unapprove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

