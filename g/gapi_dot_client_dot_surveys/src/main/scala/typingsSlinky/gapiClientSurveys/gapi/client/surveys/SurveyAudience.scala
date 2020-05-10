package typingsSlinky.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyAudience extends js.Object {
  /** Optional list of age buckets to target. Supported age buckets are: ['18-24', '25-34', '35-44', '45-54', '55-64', '65+'] */
  var ages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required country code that surveys should be targeted to. Accepts standard ISO 3166-1 2 character language codes. For instance, 'US' for the United
    * States, and 'GB' for the United Kingdom.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Country subdivision (states/provinces/etc) that surveys should be targeted to. For all countries except GB, ISO-3166-2 subdivision code is required
    * (eg. 'US-OH' for Ohio, United States). For GB, NUTS 1 statistical region codes for the United Kingdom is required (eg. 'UK-UKC' for North East
    * England).
    */
  var countrySubdivision: js.UndefOr[String] = js.native
  /** Optional gender to target. */
  var gender: js.UndefOr[String] = js.native
  /**
    * Language code that surveys should be targeted to. For instance, 'en-US'. Surveys may target bilingual users by specifying a list of language codes (for
    * example, 'de' and 'en-US'). In that case, all languages will be used for targeting users but the survey content (which is displayed) must match the
    * first language listed. Accepts standard BCP47 language codes. See specification.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Key for predefined panel that causes survey to be sent to a predefined set of Opinion Rewards App users. You must set PopulationSource to
    * ANDROID_APP_PANEL to use this field.
    */
  var mobileAppPanelId: js.UndefOr[String] = js.native
  /** Online population source where the respondents are sampled from. */
  var populationSource: js.UndefOr[String] = js.native
}

object SurveyAudience {
  @scala.inline
  def apply(): SurveyAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveyAudience]
  }
  @scala.inline
  implicit class SurveyAudienceOps[Self <: SurveyAudience] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ages")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCountrySubdivision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countrySubdivision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountrySubdivision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countrySubdivision")(js.undefined)
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
    def withLanguages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileAppPanelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppPanelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileAppPanelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppPanelId")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulationSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulationSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populationSource")(js.undefined)
        ret
    }
  }
  
}

