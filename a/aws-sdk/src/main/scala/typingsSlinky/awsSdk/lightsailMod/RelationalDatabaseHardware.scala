package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseHardware extends js.Object {
  /**
    * The number of vCPUs for the database.
    */
  var cpuCount: js.UndefOr[integer] = js.native
  /**
    * The size of the disk for the database.
    */
  var diskSizeInGb: js.UndefOr[integer] = js.native
  /**
    * The amount of RAM in GB for the database.
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
}

object RelationalDatabaseHardware {
  @scala.inline
  def apply(): RelationalDatabaseHardware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseHardware]
  }
  @scala.inline
  implicit class RelationalDatabaseHardwareOps[Self <: RelationalDatabaseHardware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskSizeInGb(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeInGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSizeInGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeInGb")(js.undefined)
        ret
    }
    @scala.inline
    def withRamSizeInGb(value: float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramSizeInGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamSizeInGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramSizeInGb")(js.undefined)
        ret
    }
  }
  
}

