package typingsSlinky.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of an individual survey object.
  */
@js.native
trait SchemaSurvey extends js.Object {
  /**
    * Targeting-criteria message containing demographic information
    */
  var audience: js.UndefOr[SchemaSurveyAudience] = js.native
  /**
    * Cost to run the survey and collect the necessary number of responses.
    */
  var cost: js.UndefOr[SchemaSurveyCost] = js.native
  /**
    * Additional information to store on behalf of the API consumer and
    * associate with this question. This binary blob is treated as opaque. This
    * field is limited to 64K bytes.
    */
  var customerData: js.UndefOr[String] = js.native
  /**
    * Text description of the survey.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * List of email addresses for survey owners. Must contain at least the
    * address of the user making the API call.
    */
  var owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of questions defining the survey.
    */
  var questions: js.UndefOr[js.Array[SchemaSurveyQuestion]] = js.native
  /**
    * Reason for the survey being rejected. Only present if the survey state is
    * rejected.
    */
  var rejectionReason: js.UndefOr[SchemaSurveyRejection] = js.native
  /**
    * State that the survey is in.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Unique survey ID, that is viewable in the URL of the Survey Creator UI
    */
  var surveyUrlId: js.UndefOr[String] = js.native
  /**
    * Optional name that will be given to the survey.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Number of responses desired for the survey.
    */
  var wantedResponseCount: js.UndefOr[Double] = js.native
}

object SchemaSurvey {
  @scala.inline
  def apply(): SchemaSurvey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurvey]
  }
  @scala.inline
  implicit class SchemaSurveyOps[Self <: SchemaSurvey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudience(value: SchemaSurveyAudience): Self = {
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
    def withCost(value: SchemaSurveyCost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerData")(js.undefined)
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
    def withOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
        ret
    }
    @scala.inline
    def withQuestions(value: js.Array[SchemaSurveyQuestion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questions")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectionReason(value: SchemaSurveyRejection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionReason")(js.undefined)
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
    def withSurveyUrlId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surveyUrlId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurveyUrlId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surveyUrlId")(js.undefined)
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
    def withWantedResponseCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wantedResponseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWantedResponseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wantedResponseCount")(js.undefined)
        ret
    }
  }
  
}

