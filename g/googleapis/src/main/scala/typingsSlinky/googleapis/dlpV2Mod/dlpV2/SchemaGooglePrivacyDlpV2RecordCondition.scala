package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition for determining whether a transformation should be applied to a
  * field.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordCondition extends js.Object {
  /**
    * An expression.
    */
  var expressions: js.UndefOr[SchemaGooglePrivacyDlpV2Expressions] = js.native
}

object SchemaGooglePrivacyDlpV2RecordCondition {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordCondition]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordConditionOps[Self <: SchemaGooglePrivacyDlpV2RecordCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpressions(value: SchemaGooglePrivacyDlpV2Expressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(js.undefined)
        ret
    }
  }
  
}

