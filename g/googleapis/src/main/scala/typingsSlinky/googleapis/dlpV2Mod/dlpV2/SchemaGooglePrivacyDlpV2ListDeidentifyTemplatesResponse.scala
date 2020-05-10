package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListDeidentifyTemplates.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse extends js.Object {
  /**
    * List of deidentify templates, up to page_size in
    * ListDeidentifyTemplatesRequest.
    */
  var deidentifyTemplates: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DeidentifyTemplate]] = js.native
  /**
    * If the next page is available then the next page token to be used in
    * following ListDeidentifyTemplates request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponseOps[Self <: SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeidentifyTemplates(value: js.Array[SchemaGooglePrivacyDlpV2DeidentifyTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deidentifyTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeidentifyTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deidentifyTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

