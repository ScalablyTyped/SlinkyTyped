package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single inspection rule to be applied to infoTypes, specified in
  * `InspectionRuleSet`.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectionRule extends js.Object {
  /**
    * Exclusion rule.
    */
  var exclusionRule: js.UndefOr[SchemaGooglePrivacyDlpV2ExclusionRule] = js.native
  /**
    * Hotword-based detection rule.
    */
  var hotwordRule: js.UndefOr[SchemaGooglePrivacyDlpV2HotwordRule] = js.native
}

object SchemaGooglePrivacyDlpV2InspectionRule {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectionRule]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectionRuleOps[Self <: SchemaGooglePrivacyDlpV2InspectionRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusionRule(value: SchemaGooglePrivacyDlpV2ExclusionRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusionRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusionRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusionRule")(js.undefined)
        ret
    }
    @scala.inline
    def withHotwordRule(value: SchemaGooglePrivacyDlpV2HotwordRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotwordRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotwordRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotwordRule")(js.undefined)
        ret
    }
  }
  
}

