package typingsSlinky.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to the current results for a given survey.
  */
@js.native
trait SchemaSurveyResults extends js.Object {
  /**
    * Human readable string describing the status of the request.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * External survey ID as viewable by survey owners in the editor view.
    */
  var surveyUrlId: js.UndefOr[String] = js.native
}

object SchemaSurveyResults {
  @scala.inline
  def apply(): SchemaSurveyResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyResults]
  }
  @scala.inline
  implicit class SchemaSurveyResultsOps[Self <: SchemaSurveyResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
  }
  
}

