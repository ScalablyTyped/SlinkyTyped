package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportReadGroupSetsRequest extends js.Object {
  /**
    * Required. The ID of the dataset these read group sets will belong to. The
    * caller must have WRITE permissions to this dataset.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * The partition strategy describes how read groups are partitioned into read
    * group sets.
    */
  var partitionStrategy: js.UndefOr[String] = js.native
  /**
    * The reference set to which the imported read group sets are aligned to, if
    * any. The reference names of this reference set must be a superset of those
    * found in the imported file headers. If no reference set id is provided, a
    * best effort is made to associate with a matching reference set.
    */
  var referenceSetId: js.UndefOr[String] = js.native
  /**
    * A list of URIs pointing at [BAM
    * files](https://samtools.github.io/hts-specs/SAMv1.pdf)
    * in Google Cloud Storage.
    * Those URIs can include wildcards (&#42;), but do not add or remove
    * matching files before import has completed.
    *
    * Note that Google Cloud Storage object listing is only eventually
    * consistent: files added may be not be immediately visible to
    * everyone. Thus, if using a wildcard it is preferable not to start
    * the import immediately after the files are created.
    */
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
}

object ImportReadGroupSetsRequest {
  @scala.inline
  def apply(): ImportReadGroupSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportReadGroupSetsRequest]
  }
  @scala.inline
  implicit class ImportReadGroupSetsRequestOps[Self <: ImportReadGroupSetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUris")(js.undefined)
        ret
    }
  }
  
}

