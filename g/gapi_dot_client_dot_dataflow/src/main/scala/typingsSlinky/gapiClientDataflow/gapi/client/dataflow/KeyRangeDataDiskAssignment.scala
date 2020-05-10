package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyRangeDataDiskAssignment extends js.Object {
  /**
    * The name of the data disk where data for this range is stored.
    * This name is local to the Google Cloud Platform project and uniquely
    * identifies the disk within that project, for example
    * "myproject-1014-104817-4c2-harness-0-disk-1".
    */
  var dataDisk: js.UndefOr[String] = js.native
  /** The end (exclusive) of the key range. */
  var end: js.UndefOr[String] = js.native
  /** The start (inclusive) of the key range. */
  var start: js.UndefOr[String] = js.native
}

object KeyRangeDataDiskAssignment {
  @scala.inline
  def apply(): KeyRangeDataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRangeDataDiskAssignment]
  }
  @scala.inline
  implicit class KeyRangeDataDiskAssignmentOps[Self <: KeyRangeDataDiskAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataDisk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDisk")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

