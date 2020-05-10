package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates a single SKU in Google Cloud Platform
  */
@js.native
trait SchemaSku extends js.Object {
  /**
    * The category hierarchy of this SKU, purely for organizational purpose.
    */
  var category: js.UndefOr[SchemaCategory] = js.native
  /**
    * A human readable description of the SKU, has a maximum length of 256
    * characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The resource name for the SKU. Example:
    * &quot;services/DA34-426B-A397/skus/AA95-CD31-42FE&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A timeline of pricing info for this SKU in chronological order.
    */
  var pricingInfo: js.UndefOr[js.Array[SchemaPricingInfo]] = js.native
  /**
    * Identifies the service provider. This is &#39;Google&#39; for first party
    * services in Google Cloud Platform.
    */
  var serviceProviderName: js.UndefOr[String] = js.native
  /**
    * List of service regions this SKU is offered at. Example:
    * &quot;asia-east1&quot; Service regions can be found at
    * https://cloud.google.com/about/locations/
    */
  var serviceRegions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The identifier for the SKU. Example: &quot;AA95-CD31-42FE&quot;
    */
  var skuId: js.UndefOr[String] = js.native
}

object SchemaSku {
  @scala.inline
  def apply(): SchemaSku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSku]
  }
  @scala.inline
  implicit class SchemaSkuOps[Self <: SchemaSku] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: SchemaCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingInfo(value: js.Array[SchemaPricingInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceProviderName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRegions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRegions")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(js.undefined)
        ret
    }
  }
  
}

