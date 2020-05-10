package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  /** App versions currently available for this product. */
  var appVersion: js.UndefOr[js.Array[AppVersion]] = js.native
  /** The name of the author of the product (for example, the app developer). */
  var authorName: js.UndefOr[String] = js.native
  /** The tracks that are visible to the enterprise. */
  var availableTracks: js.UndefOr[js.Array[String]] = js.native
  /** A link to the (consumer) Google Play details page for the product. */
  var detailsUrl: js.UndefOr[String] = js.native
  /**
    * How and to whom the package is made available. The value publicGoogleHosted means that the package is available through the Play store and not
    * restricted to a specific enterprise. The value privateGoogleHosted means that the package is a private app (restricted to an enterprise) but hosted by
    * Google. The value privateSelfHosted means that the package is a private app (restricted to an enterprise) and is privately hosted.
    */
  var distributionChannel: js.UndefOr[String] = js.native
  /** A link to an image that can be used as an icon for the product. This image is suitable for use at up to 512px x 512px. */
  var iconUrl: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#product". */
  var kind: js.UndefOr[String] = js.native
  /** A string of the form app:<package name>. For example, app:com.google.android.gm represents the Gmail app. */
  var productId: js.UndefOr[String] = js.native
  /**
    * Whether this product is free, free with in-app purchases, or paid. If the pricing is unknown, this means the product is not generally available anymore
    * (even though it might still be available to people who own it).
    */
  var productPricing: js.UndefOr[String] = js.native
  /** Deprecated. */
  var requiresContainerApp: js.UndefOr[Boolean] = js.native
  /** The certificate used to sign this product. */
  var signingCertificate: js.UndefOr[ProductSigningCertificate] = js.native
  /** A link to a smaller image that can be used as an icon for the product. This image is suitable for use at up to 128px x 128px. */
  var smallIconUrl: js.UndefOr[String] = js.native
  /** The name of the product. */
  var title: js.UndefOr[String] = js.native
  /** A link to the managed Google Play details page for the product, for use by an Enterprise admin. */
  var workDetailsUrl: js.UndefOr[String] = js.native
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
    def withAppVersion(value: js.Array[AppVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorName")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableTracks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableTracks")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributionChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
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
    def withProductPricing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productPricing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductPricing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productPricing")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresContainerApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresContainerApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresContainerApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresContainerApp")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningCertificate(value: ProductSigningCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIconUrl")(js.undefined)
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
    def withWorkDetailsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workDetailsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkDetailsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workDetailsUrl")(js.undefined)
        ret
    }
  }
  
}

