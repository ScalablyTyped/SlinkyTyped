package typingsSlinky.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Product data.
  */
@js.native
trait SchemaProduct extends js.Object {
  /**
    * Attributes of the product uploaded to the Manufacturer Center. Manually
    * edited attributes are taken into account.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.native
  /**
    * The content language of the product as a two-letter ISO 639-1 language
    * code (for example, en).
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * The status of the destinations.
    */
  var destinationStatuses: js.UndefOr[js.Array[SchemaDestinationStatus]] = js.native
  /**
    * A server-generated list of issues associated with the product.
    */
  var issues: js.UndefOr[js.Array[SchemaIssue]] = js.native
  /**
    * Name in the format `{target_country}:{content_language}:{product_id}`.
    * `target_country`   - The target country of the product as a CLDR
    * territory                      code (for example, US). `content_language`
    * - The content language of the product as a two-letter ISO 639-1 language
    * code (for example, en).  `product_id`     -   The ID of the product. For
    * more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent ID in the format `accounts/{account_id}`.  `account_id` - The ID
    * of the Manufacturer Center account.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The target country of the product as a CLDR territory code (for example,
    * US).
    */
  var targetCountry: js.UndefOr[String] = js.native
}

object SchemaProduct {
  @scala.inline
  def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  @scala.inline
  implicit class SchemaProductOps[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: SchemaAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationStatuses(value: js.Array[SchemaDestinationStatus]): Self = {
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
    def withIssues(value: js.Array[SchemaIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(js.undefined)
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
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
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
    def withTargetCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCountry")(js.undefined)
        ret
    }
  }
  
}

