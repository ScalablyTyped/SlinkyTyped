package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to the ListInfoTypes request.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListInfoTypesResponse extends js.Object {
  /**
    * Set of sensitive infoTypes.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeDescription]] = js.native
}

object SchemaGooglePrivacyDlpV2ListInfoTypesResponse {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListInfoTypesResponseOps[Self <: SchemaGooglePrivacyDlpV2ListInfoTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(js.undefined)
        ret
    }
  }
  
}

