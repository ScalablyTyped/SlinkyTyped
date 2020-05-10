package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListStoredInfoTypes.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse extends js.Object {
  /**
    * If the next page is available then the next page token to be used in
    * following ListStoredInfoTypes request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
    */
  var storedInfoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StoredInfoType]] = js.native
}

object SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponseOps[Self <: SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withStoredInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2StoredInfoType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedInfoTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoredInfoTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedInfoTypes")(js.undefined)
        ret
    }
  }
  
}

