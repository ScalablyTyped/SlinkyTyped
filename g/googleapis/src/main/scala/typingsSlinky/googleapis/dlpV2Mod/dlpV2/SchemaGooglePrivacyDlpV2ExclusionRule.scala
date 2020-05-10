package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The rule that specifies conditions when findings of infoTypes specified in
  * `InspectionRuleSet` are removed from results.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ExclusionRule extends js.Object {
  /**
    * Dictionary which defines the rule.
    */
  var dictionary: js.UndefOr[SchemaGooglePrivacyDlpV2Dictionary] = js.native
  /**
    * Set of infoTypes for which findings would affect this rule.
    */
  var excludeInfoTypes: js.UndefOr[SchemaGooglePrivacyDlpV2ExcludeInfoTypes] = js.native
  /**
    * How the rule is applied, see MatchingType documentation for details.
    */
  var matchingType: js.UndefOr[String] = js.native
  /**
    * Regular expression which defines the rule.
    */
  var regex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.native
}

object SchemaGooglePrivacyDlpV2ExclusionRule {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ExclusionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ExclusionRule]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ExclusionRuleOps[Self <: SchemaGooglePrivacyDlpV2ExclusionRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDictionary(value: SchemaGooglePrivacyDlpV2Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeInfoTypes(value: SchemaGooglePrivacyDlpV2ExcludeInfoTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeInfoTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeInfoTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeInfoTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingType")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: SchemaGooglePrivacyDlpV2Regex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
  }
  
}

