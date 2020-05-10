package typingsSlinky.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attributes of the product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116.
  */
@js.native
trait SchemaAttributes extends js.Object {
  /**
    * The additional images of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#addlimage.
    */
  var additionalImageLink: js.UndefOr[js.Array[SchemaImage]] = js.native
  /**
    * The target age group of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#agegroup.
    */
  var ageGroup: js.UndefOr[String] = js.native
  /**
    * The brand name of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#brand.
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * The capacity of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#capacity.
    */
  var capacity: js.UndefOr[SchemaCapacity] = js.native
  /**
    * The color of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#color.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The count of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#count.
    */
  var count: js.UndefOr[SchemaCount] = js.native
  /**
    * The description of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The disclosure date of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#disclosure.
    */
  var disclosureDate: js.UndefOr[String] = js.native
  /**
    * A list of excluded destinations.
    */
  var excludedDestination: js.UndefOr[js.Array[String]] = js.native
  /**
    * The rich format description of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#featuredesc.
    */
  var featureDescription: js.UndefOr[js.Array[SchemaFeatureDescription]] = js.native
  /**
    * The flavor of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#flavor.
    */
  var flavor: js.UndefOr[String] = js.native
  /**
    * The format of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#format.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The target gender of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#gender.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * The Global Trade Item Number (GTIN) of the product. For more information,
    * see https://support.google.com/manufacturers/answer/6124116#gtin.
    */
  var gtin: js.UndefOr[js.Array[String]] = js.native
  /**
    * The image of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#image.
    */
  var imageLink: js.UndefOr[SchemaImage] = js.native
  /**
    * A list of included destinations.
    */
  var includedDestination: js.UndefOr[js.Array[String]] = js.native
  /**
    * The item group id of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#itemgroupid.
    */
  var itemGroupId: js.UndefOr[String] = js.native
  /**
    * The material of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#material.
    */
  var material: js.UndefOr[String] = js.native
  /**
    * The Manufacturer Part Number (MPN) of the product. For more information,
    * see https://support.google.com/manufacturers/answer/6124116#mpn.
    */
  var mpn: js.UndefOr[String] = js.native
  /**
    * The pattern of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#pattern.
    */
  var pattern: js.UndefOr[String] = js.native
  /**
    * The details of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#productdetail.
    */
  var productDetail: js.UndefOr[js.Array[SchemaProductDetail]] = js.native
  /**
    * The name of the group of products related to the product. For more
    * information, see
    * https://support.google.com/manufacturers/answer/6124116#productline.
    */
  var productLine: js.UndefOr[String] = js.native
  /**
    * The canonical name of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#productname.
    */
  var productName: js.UndefOr[String] = js.native
  /**
    * The URL of the detail page of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#productpage.
    */
  var productPageUrl: js.UndefOr[String] = js.native
  /**
    * The type or category of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#producttype.
    */
  var productType: js.UndefOr[js.Array[String]] = js.native
  /**
    * The release date of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#release.
    */
  var releaseDate: js.UndefOr[String] = js.native
  /**
    * The scent of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#scent.
    */
  var scent: js.UndefOr[String] = js.native
  /**
    * The size of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#size.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * The size system of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#sizesystem.
    */
  var sizeSystem: js.UndefOr[String] = js.native
  /**
    * The size type of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#sizetype.
    */
  var sizeType: js.UndefOr[String] = js.native
  /**
    * The suggested retail price (MSRP) of the product. For more information,
    * see https://support.google.com/manufacturers/answer/6124116#price.
    */
  var suggestedRetailPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * The target client id. Should only be used in the accounts of the data
    * partners.
    */
  var targetClientId: js.UndefOr[String] = js.native
  /**
    * The theme of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#theme.
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * The title of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#title.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The videos of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#video.
    */
  var videoLink: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAttributes {
  @scala.inline
  def apply(): SchemaAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributes]
  }
  @scala.inline
  implicit class SchemaAttributesOps[Self <: SchemaAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalImageLink(value: js.Array[SchemaImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalImageLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalImageLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalImageLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAgeGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacity(value: SchemaCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: SchemaCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
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
    def withDisclosureDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclosureDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisclosureDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclosureDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedDestination(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureDescription(value: js.Array[SchemaFeatureDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withFlavor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flavor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlavor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flavor")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withGtin(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGtin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtin")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLink(value: SchemaImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLink")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedDestination(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withItemGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(js.undefined)
        ret
    }
    @scala.inline
    def withMpn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpn")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withProductDetail(value: js.Array[SchemaProductDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withProductLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productLine")(js.undefined)
        ret
    }
    @scala.inline
    def withProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(js.undefined)
        ret
    }
    @scala.inline
    def withProductPageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productPageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductPageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productPageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withProductType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productType")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withScent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scent")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeType")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedRetailPrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedRetailPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedRetailPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedRetailPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
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
    @scala.inline
    def withVideoLink(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoLink")(js.undefined)
        ret
    }
  }
  
}

