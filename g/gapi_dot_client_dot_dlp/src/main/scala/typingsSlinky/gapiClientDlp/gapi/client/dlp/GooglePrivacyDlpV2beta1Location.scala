package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Location extends js.Object {
  /** Zero-based byte offsets within a content item. */
  var byteRange: js.UndefOr[GooglePrivacyDlpV2beta1Range] = js.native
  /**
    * Character offsets within a content item, included when content type
    * is a text. Default charset assumed to be UTF-8.
    */
  var codepointRange: js.UndefOr[GooglePrivacyDlpV2beta1Range] = js.native
  /** Field id of the field containing the finding. */
  var fieldId: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
  /** Location within an image's pixels. */
  var imageBoxes: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ImageLocation]] = js.native
  /** Key of the finding. */
  var recordKey: js.UndefOr[GooglePrivacyDlpV2beta1RecordKey] = js.native
  /** Location within a `ContentItem.Table`. */
  var tableLocation: js.UndefOr[GooglePrivacyDlpV2beta1TableLocation] = js.native
}

object GooglePrivacyDlpV2beta1Location {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Location]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1LocationOps[Self <: GooglePrivacyDlpV2beta1Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteRange(value: GooglePrivacyDlpV2beta1Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteRange")(js.undefined)
        ret
    }
    @scala.inline
    def withCodepointRange(value: GooglePrivacyDlpV2beta1Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepointRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodepointRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepointRange")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldId(value: GooglePrivacyDlpV2beta1FieldId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldId")(js.undefined)
        ret
    }
    @scala.inline
    def withImageBoxes(value: js.Array[GooglePrivacyDlpV2beta1ImageLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageBoxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBoxes")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordKey(value: GooglePrivacyDlpV2beta1RecordKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTableLocation(value: GooglePrivacyDlpV2beta1TableLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLocation")(js.undefined)
        ret
    }
  }
  
}

