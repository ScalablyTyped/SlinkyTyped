package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatistics3 extends js.Object {
  /**
    * [Output-only] The number of bad records encountered. Note that if the job has failed because of more bad records encountered than the maximum allowed
    * in the load job configuration, then this number can be less than the total number of bad records present in the input data.
    */
  var badRecords: js.UndefOr[String] = js.native
  /** [Output-only] Number of bytes of source data in a load job. */
  var inputFileBytes: js.UndefOr[String] = js.native
  /** [Output-only] Number of source files in a load job. */
  var inputFiles: js.UndefOr[String] = js.native
  /** [Output-only] Size of the loaded data in bytes. Note that while a load job is in the running state, this value may change. */
  var outputBytes: js.UndefOr[String] = js.native
  /** [Output-only] Number of rows imported in a load job. Note that while an import job is in the running state, this value may change. */
  var outputRows: js.UndefOr[String] = js.native
}

object JobStatistics3 {
  @scala.inline
  def apply(): JobStatistics3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics3]
  }
  @scala.inline
  implicit class JobStatistics3Ops[Self <: JobStatistics3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadRecords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFileBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFileBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFiles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputRows")(js.undefined)
        ret
    }
  }
  
}

