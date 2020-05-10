package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structured content to inspect. Up to 50,000 `Value`s per request allowed.
  * See https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
  * learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Table extends js.Object {
  var headers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  var rows: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Row]] = js.native
}

object SchemaGooglePrivacyDlpV2Table {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Table]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TableOps[Self <: SchemaGooglePrivacyDlpV2Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[SchemaGooglePrivacyDlpV2Row]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

