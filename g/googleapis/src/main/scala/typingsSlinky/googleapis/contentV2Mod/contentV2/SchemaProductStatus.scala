package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a product, i.e., information about a product computed
  * asynchronously.
  */
@js.native
trait SchemaProductStatus extends js.Object {
  /**
    * Date on which the item has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.native
  /**
    * DEPRECATED - never populated
    */
  var dataQualityIssues: js.UndefOr[js.Array[SchemaProductStatusDataQualityIssue]] = js.native
  /**
    * The intended destinations for the product.
    */
  var destinationStatuses: js.UndefOr[js.Array[SchemaProductStatusDestinationStatus]] = js.native
  /**
    * Date on which the item expires in Google Shopping, in ISO 8601 format.
    */
  var googleExpirationDate: js.UndefOr[String] = js.native
  /**
    * A list of all issues associated with the product.
    */
  var itemLevelIssues: js.UndefOr[js.Array[SchemaProductStatusItemLevelIssue]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Date on which the item has been last updated, in ISO 8601 format.
    */
  var lastUpdateDate: js.UndefOr[String] = js.native
  /**
    * The link to the product.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Product data after applying all the join inputs.
    */
  var product: js.UndefOr[SchemaProduct] = js.native
  /**
    * The ID of the product for which status is reported.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The title of the product.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaProductStatus {
  @scala.inline
  def apply(): SchemaProductStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductStatus]
  }
  @scala.inline
  implicit class SchemaProductStatusOps[Self <: SchemaProductStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDataQualityIssues(value: js.Array[SchemaProductStatusDataQualityIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataQualityIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataQualityIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataQualityIssues")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationStatuses(value: js.Array[SchemaProductStatusDestinationStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleExpirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withItemLevelIssues(value: js.Array[SchemaProductStatusItemLevelIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLevelIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemLevelIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLevelIssues")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: SchemaProduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

