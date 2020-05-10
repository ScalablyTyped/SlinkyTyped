package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the location of the finding.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Location extends js.Object {
  /**
    * Zero-based byte offsets delimiting the finding. These are relative to the
    * finding&#39;s containing element. Note that when the content is not
    * textual, this references the UTF-8 encoded textual representation of the
    * content. Omitted if content is an image.
    */
  var byteRange: js.UndefOr[SchemaGooglePrivacyDlpV2Range] = js.native
  /**
    * Unicode character offsets delimiting the finding. These are relative to
    * the finding&#39;s containing element. Provided when the content is text.
    */
  var codepointRange: js.UndefOr[SchemaGooglePrivacyDlpV2Range] = js.native
  /**
    * List of nested objects pointing to the precise location of the finding
    * within the file or record.
    */
  var contentLocations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ContentLocation]] = js.native
}

object SchemaGooglePrivacyDlpV2Location {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Location]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2LocationOps[Self <: SchemaGooglePrivacyDlpV2Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteRange(value: SchemaGooglePrivacyDlpV2Range): Self = {
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
    def withCodepointRange(value: SchemaGooglePrivacyDlpV2Range): Self = {
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
    def withContentLocations(value: js.Array[SchemaGooglePrivacyDlpV2ContentLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLocations")(js.undefined)
        ret
    }
  }
  
}

