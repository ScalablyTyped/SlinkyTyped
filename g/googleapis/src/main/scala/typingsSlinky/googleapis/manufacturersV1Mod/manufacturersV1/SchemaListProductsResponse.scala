package typingsSlinky.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListProductsResponse extends js.Object {
  /**
    * The token for the retrieval of the next page of product statuses.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of the products.
    */
  var products: js.UndefOr[js.Array[SchemaProduct]] = js.native
}

object SchemaListProductsResponse {
  @scala.inline
  def apply(): SchemaListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProductsResponse]
  }
  @scala.inline
  implicit class SchemaListProductsResponseOps[Self <: SchemaListProductsResponse] (val x: Self) extends AnyVal {
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
    def withProducts(value: js.Array[SchemaProduct]): Self = {
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

