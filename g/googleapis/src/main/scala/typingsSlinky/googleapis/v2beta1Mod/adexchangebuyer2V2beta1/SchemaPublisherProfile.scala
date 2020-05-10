package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note: this resource requires whitelisting for access. Please contact your
  * account manager for access to Marketplace resources.  Represents a
  * publisher profile in Marketplace.  All fields are read only. All string
  * fields are free-form text entered by the publisher unless noted otherwise.
  */
@js.native
trait SchemaPublisherProfile extends js.Object {
  /**
    * Description on the publisher&#39;s audience.
    */
  var audienceDescription: js.UndefOr[String] = js.native
  /**
    * Statement explaining what&#39;s unique about publisher&#39;s business,
    * and why buyers should partner with the publisher.
    */
  var buyerPitchStatement: js.UndefOr[String] = js.native
  /**
    * Contact information for direct reservation deals. This is free text
    * entered by the publisher and may include information like names, phone
    * numbers and email addresses.
    */
  var directDealsContact: js.UndefOr[String] = js.native
  /**
    * Name of the publisher profile.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The list of domains represented in this publisher profile. Empty if this
    * is a parent profile. These are top private domains, meaning that these
    * will not contain a string like &quot;photos.google.co.uk/123&quot;, but
    * will instead contain &quot;google.co.uk&quot;.
    */
  var domains: js.UndefOr[js.Array[String]] = js.native
  /**
    * URL to publisher&#39;s Google+ page.
    */
  var googlePlusUrl: js.UndefOr[String] = js.native
  /**
    * A Google public URL to the logo for this publisher profile. The logo is
    * stored as a PNG, JPG, or GIF image.
    */
  var logoUrl: js.UndefOr[String] = js.native
  /**
    * URL to additional marketing and sales materials.
    */
  var mediaKitUrl: js.UndefOr[String] = js.native
  /**
    * Overview of the publisher.
    */
  var overview: js.UndefOr[String] = js.native
  /**
    * Contact information for programmatic deals. This is free text entered by
    * the publisher and may include information like names, phone numbers and
    * email addresses.
    */
  var programmaticDealsContact: js.UndefOr[String] = js.native
  /**
    * Unique ID for publisher profile.
    */
  var publisherProfileId: js.UndefOr[String] = js.native
  /**
    * URL to a publisher rate card.
    */
  var rateCardInfoUrl: js.UndefOr[String] = js.native
  /**
    * URL to a sample content page.
    */
  var samplePageUrl: js.UndefOr[String] = js.native
  /**
    * Seller of the publisher profile.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  /**
    * Up to three key metrics and rankings. Max 100 characters each. For
    * example &quot;#1 Mobile News Site for 20 Straight Months&quot;.
    */
  var topHeadlines: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPublisherProfile {
  @scala.inline
  def apply(): SchemaPublisherProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherProfile]
  }
  @scala.inline
  implicit class SchemaPublisherProfileOps[Self <: SchemaPublisherProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudienceDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudienceDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyerPitchStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerPitchStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerPitchStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerPitchStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectDealsContact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directDealsContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectDealsContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directDealsContact")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(js.undefined)
        ret
    }
    @scala.inline
    def withGooglePlusUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlusUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePlusUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlusUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaKitUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaKitUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaKitUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaKitUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOverview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
    @scala.inline
    def withProgrammaticDealsContact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programmaticDealsContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgrammaticDealsContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programmaticDealsContact")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withRateCardInfoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateCardInfoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateCardInfoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateCardInfoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplePageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplePageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplePageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplePageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSeller(value: SchemaSeller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(js.undefined)
        ret
    }
    @scala.inline
    def withTopHeadlines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topHeadlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopHeadlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topHeadlines")(js.undefined)
        ret
    }
  }
  
}

