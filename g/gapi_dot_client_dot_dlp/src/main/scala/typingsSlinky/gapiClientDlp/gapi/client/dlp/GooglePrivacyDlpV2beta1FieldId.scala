package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1FieldId extends js.Object {
  /** Name describing the field. */
  var columnName: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1FieldId {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1FieldId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1FieldId]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1FieldIdOps[Self <: GooglePrivacyDlpV2beta1FieldId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(js.undefined)
        ret
    }
  }
  
}

