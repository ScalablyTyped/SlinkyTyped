package typingsSlinky.gapiClientManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  /**
    * The content language of the product as a two-letter ISO 639-1 language code
    * (for example, en).
    * @OutputOnly
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * Final attributes of the product. The final attributes are obtained by
    * overriding the uploaded attributes with the manually provided and deleted
    * attributes. Google systems only process, evaluate, review, and/or use final
    * attributes.
    * @OutputOnly
    */
  var finalAttributes: js.UndefOr[Attributes] = js.native
  /**
    * A server-generated list of issues associated with the product.
    * @OutputOnly
    */
  var issues: js.UndefOr[js.Array[Issue]] = js.native
  /**
    * Names of the attributes of the product deleted manually via the
    * Manufacturer Center UI.
    * @OutputOnly
    */
  var manuallyDeletedAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Attributes of the product provided manually via the Manufacturer Center UI.
    * @OutputOnly
    */
  var manuallyProvidedAttributes: js.UndefOr[Attributes] = js.native
  /**
    * Name in the format `{target_country}:{content_language}:{product_id}`.
    *
    * `target_country`   - The target country of the product as a CLDR territory
    * code (for example, US).
    *
    * `content_language` - The content language of the product as a two-letter
    * ISO 639-1 language code (for example, en).
    *
    * `product_id`     -   The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    * @OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent ID in the format `accounts/{account_id}`.
    *
    * `account_id` - The ID of the Manufacturer Center account.
    * @OutputOnly
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    * @OutputOnly
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The target country of the product as a CLDR territory code (for example,
    * US).
    * @OutputOnly
    */
  var targetCountry: js.UndefOr[String] = js.native
  /**
    * Attributes of the product uploaded via the Manufacturer Center API or via
    * feeds.
    */
  var uploadedAttributes: js.UndefOr[Attributes] = js.native
}

object Product {
  @scala.inline
  def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFinalAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIssues(value: js.Array[Issue]): Self = {
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
    def withManuallyDeletedAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manuallyDeletedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManuallyDeletedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manuallyDeletedAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withManuallyProvidedAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manuallyProvidedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManuallyProvidedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manuallyProvidedAttributes")(js.undefined)
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
    @scala.inline
    def withUploadedAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadedAttributes")(js.undefined)
        ret
    }
  }
  
}

