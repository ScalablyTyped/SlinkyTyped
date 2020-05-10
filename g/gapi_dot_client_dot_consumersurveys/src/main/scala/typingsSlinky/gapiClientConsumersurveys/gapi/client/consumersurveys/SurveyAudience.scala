package typingsSlinky.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyAudience extends js.Object {
  var ages: js.UndefOr[js.Array[String]] = js.native
  var country: js.UndefOr[String] = js.native
  var countrySubdivision: js.UndefOr[String] = js.native
  var gender: js.UndefOr[String] = js.native
  var languages: js.UndefOr[js.Array[String]] = js.native
  var mobileAppPanelId: js.UndefOr[String] = js.native
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

