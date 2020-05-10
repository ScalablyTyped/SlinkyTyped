package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPublisherProfileApiProto extends js.Object {
  /**
    * Publisher provided info on its audience.
    */
  var audience: js.UndefOr[String] = js.native
  /**
    * A pitch statement for the buyer
    */
  var buyerPitchStatement: js.UndefOr[String] = js.native
  /**
    * Direct contact for the publisher profile.
    */
  var directContact: js.UndefOr[String] = js.native
  /**
    * Exchange where this publisher profile is from. E.g. AdX, Rubicon etc...
    */
  var exchange: js.UndefOr[String] = js.native
  /**
    * Link to publisher&#39;s Google+ page.
    */
  var googlePlusLink: js.UndefOr[String] = js.native
  /**
    * True, if this is the parent profile, which represents all domains owned
    * by the publisher.
    */
  var isParent: js.UndefOr[Boolean] = js.native
  /**
    * True, if this profile is published. Deprecated for state.
    */
  var isPublished: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;adexchangebuyer#publisherProfileApiProto&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The url to the logo for the publisher.
    */
  var logoUrl: js.UndefOr[String] = js.native
  /**
    * The url for additional marketing and sales materials.
    */
  var mediaKitLink: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  /**
    * Publisher provided overview.
    */
  var overview: js.UndefOr[String] = js.native
  /**
    * The pair of (seller.account_id, profile_id) uniquely identifies a
    * publisher profile for a given publisher.
    */
  var profileId: js.UndefOr[Double] = js.native
  /**
    * Programmatic contact for the publisher profile.
    */
  var programmaticContact: js.UndefOr[String] = js.native
  /**
    * The list of domains represented in this publisher profile. Empty if this
    * is a parent profile.
    */
  var publisherDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Unique Id for publisher profile.
    */
  var publisherProfileId: js.UndefOr[String] = js.native
  /**
    * Publisher provided forecasting information.
    */
  var publisherProvidedForecast: js.UndefOr[SchemaPublisherProvidedForecast] = js.native
  /**
    * Link to publisher rate card
    */
  var rateCardInfoLink: js.UndefOr[String] = js.native
  /**
    * Link for a sample content page.
    */
  var samplePageLink: js.UndefOr[String] = js.native
  /**
    * Seller of the publisher profile.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  /**
    * State of the publisher profile.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Publisher provided key metrics and rankings.
    */
  var topHeadlines: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPublisherProfileApiProto {
  @scala.inline
  def apply(): SchemaPublisherProfileApiProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherProfileApiProto]
  }
  @scala.inline
  implicit class SchemaPublisherProfileApiProtoOps[Self <: SchemaPublisherProfileApiProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudience(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
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
    def withDirectContact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directContact")(js.undefined)
        ret
    }
    @scala.inline
    def withExchange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange")(js.undefined)
        ret
    }
    @scala.inline
    def withGooglePlusLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlusLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePlusLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlusLink")(js.undefined)
        ret
    }
    @scala.inline
    def withIsParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isParent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPublished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPublished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublished")(js.undefined)
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
    def withMediaKitLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaKitLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaKitLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaKitLink")(js.undefined)
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
    def withProfileId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(js.undefined)
        ret
    }
    @scala.inline
    def withProgrammaticContact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programmaticContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgrammaticContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programmaticContact")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherDomains")(js.undefined)
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
    def withPublisherProvidedForecast(value: SchemaPublisherProvidedForecast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProvidedForecast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherProvidedForecast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProvidedForecast")(js.undefined)
        ret
    }
    @scala.inline
    def withRateCardInfoLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateCardInfoLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateCardInfoLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateCardInfoLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplePageLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplePageLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplePageLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplePageLink")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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

