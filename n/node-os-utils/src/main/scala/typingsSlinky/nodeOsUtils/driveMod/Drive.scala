package typingsSlinky.nodeOsUtils.driveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drive extends js.Object {
  def free(diskName: String): js.Promise[DriveFreeInfo] = js.native
  def info(diskName: String): js.Promise[DriveInfo] = js.native
  def used(diskName: String): js.Promise[DriveUsedInfo] = js.native
}

object Drive {
  @scala.inline
  def apply(
    free: String => js.Promise[DriveFreeInfo],
    info: String => js.Promise[DriveInfo],
    used: String => js.Promise[DriveUsedInfo]
  ): Drive = {
    val __obj = js.Dynamic.literal(free = js.Any.fromFunction1(free), info = js.Any.fromFunction1(info), used = js.Any.fromFunction1(used))
    __obj.asInstanceOf[Drive]
  }
  @scala.inline
  implicit class DriveOps[Self <: Drive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFree(value: String => js.Promise[DriveFreeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfo(value: String => js.Promise[DriveInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUsed(value: String => js.Promise[DriveUsedInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

