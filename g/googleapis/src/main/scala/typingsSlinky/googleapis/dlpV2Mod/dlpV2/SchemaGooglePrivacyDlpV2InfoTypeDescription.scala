package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InfoType description.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeDescription extends js.Object {
  /**
    * Description of the infotype. Translated when language is provided in the
    * request.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Human readable form of the infoType name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Internal name of the infoType.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Which parts of the API supports this InfoType.
    */
  var supportedBy: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGooglePrivacyDlpV2InfoTypeDescription {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeDescription]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeDescriptionOps[Self <: SchemaGooglePrivacyDlpV2InfoTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedBy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedBy")(js.undefined)
        ret
    }
  }
  
}

