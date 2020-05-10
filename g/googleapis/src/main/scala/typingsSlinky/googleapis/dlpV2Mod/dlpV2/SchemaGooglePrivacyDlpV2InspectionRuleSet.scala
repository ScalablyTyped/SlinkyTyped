package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rule set for modifying a set of infoTypes to alter behavior under certain
  * circumstances, depending on the specific details of the rules within the
  * set.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectionRuleSet extends js.Object {
  /**
    * List of infoTypes this rule set is applied to.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.native
  /**
    * Set of rules to be applied to infoTypes. The rules are applied in order.
    */
  var rules: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InspectionRule]] = js.native
}

object SchemaGooglePrivacyDlpV2InspectionRuleSet {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectionRuleSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectionRuleSet]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectionRuleSetOps[Self <: SchemaGooglePrivacyDlpV2InspectionRuleSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[SchemaGooglePrivacyDlpV2InspectionRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

