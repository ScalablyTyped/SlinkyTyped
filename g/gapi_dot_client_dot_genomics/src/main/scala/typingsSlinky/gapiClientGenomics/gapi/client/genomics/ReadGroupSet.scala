package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadGroupSet extends js.Object {
  /** The dataset to which this read group set belongs. */
  var datasetId: js.UndefOr[String] = js.native
  /** The filename of the original source file for this read group set, if any. */
  var filename: js.UndefOr[String] = js.native
  /** The server-generated read group set ID, unique for all read group sets. */
  var id: js.UndefOr[String] = js.native
  /** A map of additional read group set information. */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /**
    * The read group set name. By default this will be initialized to the sample
    * name of the sequenced data contained in this set.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The read groups in this set. There are typically 1-10 read groups in a read
    * group set.
    */
  var readGroups: js.UndefOr[js.Array[ReadGroup]] = js.native
  /** The reference set to which the reads in this read group set are aligned. */
  var referenceSetId: js.UndefOr[String] = js.native
}

object ReadGroupSet {
  @scala.inline
  def apply(): ReadGroupSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadGroupSet]
  }
  @scala.inline
  implicit class ReadGroupSetOps[Self <: ReadGroupSet] (val x: Self) extends AnyVal {
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
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
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
    def withReadGroups(value: js.Array[ReadGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGroups")(js.undefined)
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
  }
  
}

