package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedLifecycle extends js.Object {
  /**
    * A timestamp that specifies when to delete a recovery point.
    */
  var DeleteAt: js.UndefOr[js.Date] = js.native
  /**
    * A timestamp that specifies when to transition a recovery point to cold storage.
    */
  var MoveToColdStorageAt: js.UndefOr[js.Date] = js.native
}

object CalculatedLifecycle {
  @scala.inline
  def apply(): CalculatedLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculatedLifecycle]
  }
  @scala.inline
  implicit class CalculatedLifecycleOps[Self <: CalculatedLifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveToColdStorageAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveToColdStorageAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveToColdStorageAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveToColdStorageAt")(js.undefined)
        ret
    }
  }
  
}

