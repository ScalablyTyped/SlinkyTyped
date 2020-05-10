package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resources extends js.Object {
  /** Number of CPU cores needed. */
  var cpu: js.UndefOr[Double] = js.native
  /** Disk size (GB) needed. */
  var diskGb: js.UndefOr[Double] = js.native
  /** Memory (GB) needed. */
  var memoryGb: js.UndefOr[Double] = js.native
  /** User specified volumes. */
  var volumes: js.UndefOr[js.Array[Volume]] = js.native
}

object Resources {
  @scala.inline
  def apply(): Resources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resources]
  }
  @scala.inline
  implicit class ResourcesOps[Self <: Resources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskGb")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryGb")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: js.Array[Volume]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(js.undefined)
        ret
    }
  }
  
}

