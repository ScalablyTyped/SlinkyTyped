package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data disk assignment for a given VM instance.
  */
@js.native
trait SchemaDataDiskAssignment extends js.Object {
  /**
    * Mounted data disks. The order is important a data disk&#39;s 0-based
    * index in this list defines which persistent directory the disk is mounted
    * to, for example the list of {
    * &quot;myproject-1014-104817-4c2-harness-0-disk-0&quot; }, {
    * &quot;myproject-1014-104817-4c2-harness-0-disk-1&quot; }.
    */
  var dataDisks: js.UndefOr[js.Array[String]] = js.native
  /**
    * VM instance name the data disks mounted to, for example
    * &quot;myproject-1014-104817-4c2-harness-0&quot;.
    */
  var vmInstance: js.UndefOr[String] = js.native
}

object SchemaDataDiskAssignment {
  @scala.inline
  def apply(): SchemaDataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataDiskAssignment]
  }
  @scala.inline
  implicit class SchemaDataDiskAssignmentOps[Self <: SchemaDataDiskAssignment] (val x: Self) extends AnyVal {
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

