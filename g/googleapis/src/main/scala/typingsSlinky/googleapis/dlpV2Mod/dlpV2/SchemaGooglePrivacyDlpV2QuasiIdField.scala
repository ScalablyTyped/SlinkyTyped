package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A quasi-identifier column has a custom_tag, used to know which column in
  * the data corresponds to which column in the statistical model.
  */
@js.native
trait SchemaGooglePrivacyDlpV2QuasiIdField extends js.Object {
  var customTag: js.UndefOr[String] = js.native
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}

object SchemaGooglePrivacyDlpV2QuasiIdField {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2QuasiIdField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuasiIdField]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2QuasiIdFieldOps[Self <: SchemaGooglePrivacyDlpV2QuasiIdField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTag")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: SchemaGooglePrivacyDlpV2FieldId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
  }
  
}

