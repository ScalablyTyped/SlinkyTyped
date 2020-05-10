package typingsSlinky.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiPageSpeedOnlineRuleResource extends js.Object {
  /**
    * Localized name of the rule, intended for presentation to a user.
    */
  var localizedRuleName: String = js.native
  /**
    * The impact (unbounded floating point value) that implementing the suggestions for this rule would have on making the page faster.
    */
  var ruleImpact: Double = js.native
  /**
    * The score (0-100) for this rule. The rule score indicates how well a page implements the recommendations for the given rule.
    */
  var ruleScore: Double = js.native
  /**
    * List of blocks of URLs. Each block may contain a heading and a list of URLs. Each URL may optionally include additional details.
    */
  var urlBlocks: js.Array[AnonHeader] = js.native
}

object GoogleApiPageSpeedOnlineRuleResource {
  @scala.inline
  def apply(localizedRuleName: String, ruleImpact: Double, ruleScore: Double, urlBlocks: js.Array[AnonHeader]): GoogleApiPageSpeedOnlineRuleResource = {
    val __obj = js.Dynamic.literal(localizedRuleName = localizedRuleName.asInstanceOf[js.Any], ruleImpact = ruleImpact.asInstanceOf[js.Any], ruleScore = ruleScore.asInstanceOf[js.Any], urlBlocks = urlBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiPageSpeedOnlineRuleResource]
  }
  @scala.inline
  implicit class GoogleApiPageSpeedOnlineRuleResourceOps[Self <: GoogleApiPageSpeedOnlineRuleResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalizedRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleImpact(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleImpact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlBlocks(value: js.Array[AnonHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlBlocks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

