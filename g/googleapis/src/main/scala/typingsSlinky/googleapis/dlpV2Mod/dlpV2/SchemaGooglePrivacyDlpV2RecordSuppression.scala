package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration to suppress records whose suppression conditions evaluate to
  * true.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordSuppression extends js.Object {
  /**
    * A condition that when it evaluates to true will result in the record
    * being evaluated to be suppressed from the transformed content.
    */
  var condition: js.UndefOr[SchemaGooglePrivacyDlpV2RecordCondition] = js.native
}

object SchemaGooglePrivacyDlpV2RecordSuppression {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordSuppression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordSuppression]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordSuppressionOps[Self <: SchemaGooglePrivacyDlpV2RecordSuppression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: SchemaGooglePrivacyDlpV2RecordCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
  }
  
}

