package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskResult extends js.Object {
  /**
    * An object containing information about the disk.
    */
  var disk: js.UndefOr[Disk] = js.native
}

object GetDiskResult {
  @scala.inline
  def apply(): GetDiskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskResult]
  }
  @scala.inline
  implicit class GetDiskResultOps[Self <: GetDiskResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisk(value: Disk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk")(js.undefined)
        ret
    }
  }
  
}

