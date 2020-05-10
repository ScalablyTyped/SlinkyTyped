package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of conditions.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Conditions extends js.Object {
  var conditions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Condition]] = js.native
}

object SchemaGooglePrivacyDlpV2Conditions {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Conditions]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ConditionsOps[Self <: SchemaGooglePrivacyDlpV2Conditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[SchemaGooglePrivacyDlpV2Condition]): Self = {
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
  }
  
}

