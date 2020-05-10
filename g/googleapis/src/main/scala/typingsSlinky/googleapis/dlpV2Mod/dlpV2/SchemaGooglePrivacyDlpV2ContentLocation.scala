package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Findings container location data.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ContentLocation extends js.Object {
  /**
    * Name of the container where the finding is located. The top level name is
    * the source file name or table name. Names of some common storage
    * containers are formatted as follows:  * BigQuery tables:
    * `&lt;project_id&gt;:&lt;dataset_id&gt;.&lt;table_id&gt;` * Cloud Storage
    * files: `gs://&lt;bucket&gt;/&lt;path&gt;` * Datastore namespace:
    * &lt;namespace&gt;  Nested names could be absent if the embedded object
    * has no string identifier (for an example an image contained within a
    * document).
    */
  var containerName: js.UndefOr[String] = js.native
  /**
    * Findings container modification timestamp, if applicable. For Google
    * Cloud Storage contains last file modification timestamp. For BigQuery
    * table contains last_modified_time property. For Datastore - not
    * populated.
    */
  var containerTimestamp: js.UndefOr[String] = js.native
  /**
    * Findings container version, if available (&quot;generation&quot; for
    * Google Cloud Storage).
    */
  var containerVersion: js.UndefOr[String] = js.native
  /**
    * Location data for document files.
    */
  var documentLocation: js.UndefOr[SchemaGooglePrivacyDlpV2DocumentLocation] = js.native
  /**
    * Location within an image&#39;s pixels.
    */
  var imageLocation: js.UndefOr[SchemaGooglePrivacyDlpV2ImageLocation] = js.native
  /**
    * Location within a row or record of a database table.
    */
  var recordLocation: js.UndefOr[SchemaGooglePrivacyDlpV2RecordLocation] = js.native
}

object SchemaGooglePrivacyDlpV2ContentLocation {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ContentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ContentLocation]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ContentLocationOps[Self <: SchemaGooglePrivacyDlpV2ContentLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentLocation(value: SchemaGooglePrivacyDlpV2DocumentLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLocation(value: SchemaGooglePrivacyDlpV2ImageLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordLocation(value: SchemaGooglePrivacyDlpV2RecordLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordLocation")(js.undefined)
        ret
    }
  }
  
}

