package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container structure for the content to inspect.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ContentItem extends js.Object {
  /**
    * Content data to inspect or redact. Replaces `type` and `data`.
    */
  var byteItem: js.UndefOr[SchemaGooglePrivacyDlpV2ByteContentItem] = js.native
  /**
    * Structured content for inspection. See
    * https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
    * learn more.
    */
  var table: js.UndefOr[SchemaGooglePrivacyDlpV2Table] = js.native
  /**
    * String data to inspect or redact.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ContentItem {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ContentItem]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ContentItemOps[Self <: SchemaGooglePrivacyDlpV2ContentItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteItem(value: SchemaGooglePrivacyDlpV2ByteContentItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteItem")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: SchemaGooglePrivacyDlpV2Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

