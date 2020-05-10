package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1RecordSuppression extends js.Object {
  var condition: js.UndefOr[GooglePrivacyDlpV2beta1RecordCondition] = js.native
}

object GooglePrivacyDlpV2beta1RecordSuppression {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1RecordSuppression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RecordSuppression]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1RecordSuppressionOps[Self <: GooglePrivacyDlpV2beta1RecordSuppression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: GooglePrivacyDlpV2beta1RecordCondition): Self = {
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

