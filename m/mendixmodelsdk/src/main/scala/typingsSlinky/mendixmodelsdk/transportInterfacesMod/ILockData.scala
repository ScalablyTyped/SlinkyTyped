package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockData extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var lockId: js.UndefOr[String] = js.native
  var lockType: LockType = js.native
  var requestedBy: String = js.native
  var timestamp: Double = js.native
}

object ILockData {
  @scala.inline
  def apply(lockType: LockType, requestedBy: String, timestamp: Double): ILockData = {
    val __obj = js.Dynamic.literal(lockType = lockType.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockData]
  }
  @scala.inline
  implicit class ILockDataOps[Self <: ILockData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLockType(value: LockType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withLockId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockId")(js.undefined)
        ret
    }
  }
  
}

