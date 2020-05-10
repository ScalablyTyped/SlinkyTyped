package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata available primarily for filtering jobs. Will be included in the
  * ListJob response and Job SUMMARY view.
  */
@js.native
trait SchemaJobMetadata extends js.Object {
  /**
    * Identification of a BigTable source used in the Dataflow job.
    */
  var bigTableDetails: js.UndefOr[js.Array[SchemaBigTableIODetails]] = js.native
  /**
    * Identification of a BigQuery source used in the Dataflow job.
    */
  var bigqueryDetails: js.UndefOr[js.Array[SchemaBigQueryIODetails]] = js.native
  /**
    * Identification of a Datastore source used in the Dataflow job.
    */
  var datastoreDetails: js.UndefOr[js.Array[SchemaDatastoreIODetails]] = js.native
  /**
    * Identification of a File source used in the Dataflow job.
    */
  var fileDetails: js.UndefOr[js.Array[SchemaFileIODetails]] = js.native
  /**
    * Identification of a PubSub source used in the Dataflow job.
    */
  var pubsubDetails: js.UndefOr[js.Array[SchemaPubSubIODetails]] = js.native
  /**
    * The SDK version used to run the job.
    */
  var sdkVersion: js.UndefOr[SchemaSdkVersion] = js.native
  /**
    * Identification of a Spanner source used in the Dataflow job.
    */
  var spannerDetails: js.UndefOr[js.Array[SchemaSpannerIODetails]] = js.native
}

object SchemaJobMetadata {
  @scala.inline
  def apply(): SchemaJobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMetadata]
  }
  @scala.inline
  implicit class SchemaJobMetadataOps[Self <: SchemaJobMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigTableDetails(value: js.Array[SchemaBigTableIODetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigTableDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigTableDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigTableDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withBigqueryDetails(value: js.Array[SchemaBigQueryIODetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigqueryDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigqueryDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigqueryDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withDatastoreDetails(value: js.Array[SchemaDatastoreIODetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatastoreDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withFileDetails(value: js.Array[SchemaFileIODetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPubsubDetails(value: js.Array[SchemaPubSubIODetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsubDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubsubDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsubDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSdkVersion(value: SchemaSdkVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSpannerDetails(value: js.Array[SchemaSpannerIODetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spannerDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpannerDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spannerDetails")(js.undefined)
        ret
    }
  }
  
}

