package typingsSlinky.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for PrivateCatalog.SearchProducts.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to SearchProducts that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Product` resources computed from the resource context.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Product]] = js.native
}

object SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponseOps[Self <: SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProducts(value: js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Product]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(js.undefined)
        ret
    }
  }
  
}

