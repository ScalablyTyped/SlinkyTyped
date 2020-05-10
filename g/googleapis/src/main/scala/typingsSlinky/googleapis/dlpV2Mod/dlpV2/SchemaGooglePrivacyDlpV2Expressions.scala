package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An expression, consisting or an operator and conditions.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Expressions extends js.Object {
  var conditions: js.UndefOr[SchemaGooglePrivacyDlpV2Conditions] = js.native
  /**
    * The operator to apply to the result of conditions. Default and currently
    * only supported value is `AND`.
    */
  var logicalOperator: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2Expressions {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Expressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Expressions]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ExpressionsOps[Self <: SchemaGooglePrivacyDlpV2Expressions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: SchemaGooglePrivacyDlpV2Conditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withLogicalOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalOperator")(js.undefined)
        ret
    }
  }
  
}

