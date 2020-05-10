package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Regional inventory resource. contains the regional name and all attributes
  * which are overridden for the specified region.
  */
@js.native
trait SchemaRegionalInventory extends js.Object {
  /**
    * The availability of the product.
    */
  var availability: js.UndefOr[String] = js.native
  /**
    * A list of custom (merchant-provided) attributes. It can also be used for
    * submitting any attribute of the feed specification in its generic form.
    */
  var customAttributes: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#regionalInventory&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The price of the product.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  /**
    * The ID (name) of the region.
    */
  var regionId: js.UndefOr[String] = js.native
  /**
    * The sale price of the product. Mandatory if sale_price_effective_date is
    * defined.
    */
  var salePrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * A date range represented by a pair of ISO 8601 dates separated by a
    * space, comma, or slash. Both dates might be specified as &#39;null&#39;
    * if undecided.
    */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
}

object SchemaRegionalInventory {
  @scala.inline
  def apply(): SchemaRegionalInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalInventory]
  }
  @scala.inline
  implicit class SchemaRegionalInventoryOps[Self <: SchemaRegionalInventory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttributes(value: js.Array[SchemaCustomAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(js.undefined)
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
    def withPrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSalePrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalePrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePrice")(js.undefined)
        ret
    }
    @scala.inline
    def withSalePriceEffectiveDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePriceEffectiveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalePriceEffectiveDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePriceEffectiveDate")(js.undefined)
        ret
    }
  }
  
}

