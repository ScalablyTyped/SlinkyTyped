package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataDiskAssignment extends js.Object {
  /**
    * Mounted data disks. The order is important a data disk's 0-based index in
    * this list defines which persistent directory the disk is mounted to, for
    * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
    * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
    */
  var dataDisks: js.UndefOr[js.Array[String]] = js.native
  /**
    * VM instance name the data disks mounted to, for example
    * "myproject-1014-104817-4c2-harness-0".
    */
  var vmInstance: js.UndefOr[String] = js.native
}

object DataDiskAssignment {
  @scala.inline
  def apply(): DataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataDiskAssignment]
  }
  @scala.inline
  implicit class DataDiskAssignmentOps[Self <: DataDiskAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataDisks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDisks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDisks")(js.undefined)
        ret
    }
    @scala.inline
    def withVmInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmInstance")(js.undefined)
        ret
    }
  }
  
}

