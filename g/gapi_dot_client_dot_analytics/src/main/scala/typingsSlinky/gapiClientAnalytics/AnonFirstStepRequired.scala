package typingsSlinky.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFirstStepRequired extends js.Object {
  /** Determines if the goal URL must exactly match the capitalization of visited URLs. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /** Determines if the first step in this goal is required. */
  var firstStepRequired: js.UndefOr[Boolean] = js.native
  /** Match type for the goal URL. Possible values are HEAD, EXACT, or REGEX. */
  var matchType: js.UndefOr[String] = js.native
  /** List of steps configured for this goal funnel. */
  var steps: js.UndefOr[js.Array[AnonNumber]] = js.native
  /** URL for this goal. */
  var url: js.UndefOr[String] = js.native
}

object AnonFirstStepRequired {
  @scala.inline
  def apply(): AnonFirstStepRequired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFirstStepRequired]
  }
  @scala.inline
  implicit class AnonFirstStepRequiredOps[Self <: AnonFirstStepRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstStepRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstStepRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstStepRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstStepRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchType")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[AnonNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

