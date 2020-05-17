package typingsSlinky.gapiClientPagespeedonline.anon

import typingsSlinky.gapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  /** List of rule groups that this rule belongs to. Each entry in the list is one of "SPEED" or "USABILITY". */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /** Localized name of the rule, intended for presentation to a user. */
  var localizedRuleName: js.UndefOr[String] = js.native
  /**
    * The impact (unbounded floating point value) that implementing the suggestions for this rule would have on making the page faster. Impact is comparable
    * between rules to determine which rule's suggestions would have a higher or lower impact on making a page faster. For instance, if enabling compression
    * would save 1MB, while optimizing images would save 500kB, the enable compression rule would have 2x the impact of the image optimization rule, all
    * other things being equal.
    */
  var ruleImpact: js.UndefOr[Double] = js.native
  /** A brief summary description for the rule, indicating at a high level what should be done to follow the rule and what benefit can be gained by doing so. */
  var summary: js.UndefOr[PagespeedApiFormatStringV2] = js.native
  /** List of blocks of URLs. Each block may contain a heading and a list of URLs. Each URL may optionally include additional details. */
  var urlBlocks: js.UndefOr[js.Array[Header]] = js.native
}

object Groups {
  @scala.inline
  def apply(): Groups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groups]
  }
  @scala.inline
  implicit class GroupsOps[Self <: Groups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizedRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedRuleName")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleImpact(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleImpact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleImpact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleImpact")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: PagespeedApiFormatStringV2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlBlocks(value: js.Array[Header]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlBlocks")(js.undefined)
        ret
    }
  }
  
}

