package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountedDataDisk extends js.Object {
  /**
    * The name of the data disk.
    * This name is local to the Google Cloud Platform project and uniquely
    * identifies the disk within that project, for example
    * "myproject-1014-104817-4c2-harness-0-disk-1".
    */
  var dataDisk: js.UndefOr[String] = js.native
}

object MountedDataDisk {
  @scala.inline
  def apply(): MountedDataDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountedDataDisk]
  }
  @scala.inline
  implicit class MountedDataDiskOps[Self <: MountedDataDisk] (val x: Self) extends AnyVal {
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
  }
  
}

