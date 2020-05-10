package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskUtilization extends js.Object {
  /** Target bytes read per second. */
  var targetReadBytesPerSecond: js.UndefOr[Double] = js.native
  /** Target ops read per seconds. */
  var targetReadOpsPerSecond: js.UndefOr[Double] = js.native
  /** Target bytes written per second. */
  var targetWriteBytesPerSecond: js.UndefOr[Double] = js.native
  /** Target ops written per second. */
  var targetWriteOpsPerSecond: js.UndefOr[Double] = js.native
}

object DiskUtilization {
  @scala.inline
  def apply(): DiskUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskUtilization]
  }
  @scala.inline
  implicit class DiskUtilizationOps[Self <: DiskUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetReadBytesPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetReadBytesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetReadBytesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetReadBytesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetReadOpsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetReadOpsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetReadOpsPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetReadOpsPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetWriteBytesPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWriteBytesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetWriteBytesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWriteBytesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetWriteOpsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWriteOpsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetWriteOpsPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWriteOpsPerSecond")(js.undefined)
        ret
    }
  }
  
}

