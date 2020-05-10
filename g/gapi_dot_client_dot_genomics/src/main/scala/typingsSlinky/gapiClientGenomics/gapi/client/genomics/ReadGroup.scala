package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadGroup extends js.Object {
  /** The dataset to which this read group belongs. */
  var datasetId: js.UndefOr[String] = js.native
  /** A free-form text description of this read group. */
  var description: js.UndefOr[String] = js.native
  /** The experiment used to generate this read group. */
  var experiment: js.UndefOr[Experiment] = js.native
  /**
    * The server-generated read group ID, unique for all read groups.
    * Note: This is different than the @RG ID field in the SAM spec. For that
    * value, see name.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of additional read group information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /** The read group name. This corresponds to the @RG ID field in the SAM spec. */
  var name: js.UndefOr[String] = js.native
  /**
    * The predicted insert size of this read group. The insert size is the length
    * the sequenced DNA fragment from end-to-end, not including the adapters.
    */
  var predictedInsertSize: js.UndefOr[Double] = js.native
  /**
    * The programs used to generate this read group. Programs are always
    * identical for all read groups within a read group set. For this reason,
    * only the first read group in a returned set will have this field
    * populated.
    */
  var programs: js.UndefOr[js.Array[Program]] = js.native
  /** The reference set the reads in this read group are aligned to. */
  var referenceSetId: js.UndefOr[String] = js.native
  /** A client-supplied sample identifier for the reads in this read group. */
  var sampleId: js.UndefOr[String] = js.native
}

object ReadGroup {
  @scala.inline
  def apply(): ReadGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadGroup]
  }
  @scala.inline
  implicit class ReadGroupOps[Self <: ReadGroup] (val x: Self) extends AnyVal {
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
    def withExperiment(value: Experiment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experiment")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: Record[String, js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
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
    def withPredictedInsertSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictedInsertSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictedInsertSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictedInsertSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPrograms(value: js.Array[Program]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrograms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programs")(js.undefined)
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
    def withSampleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleId")(js.undefined)
        ret
    }
  }
  
}

