package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Conditions extends js.Object {
  var conditions: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Condition]] = js.native
}

object GooglePrivacyDlpV2beta1Conditions {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Conditions]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ConditionsOps[Self <: GooglePrivacyDlpV2beta1Conditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[GooglePrivacyDlpV2beta1Condition]): Self = {
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

