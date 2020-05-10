package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lifecycle extends js.Object {
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus MoveToColdStorageAfterDays.
    */
  var DeleteAfterDays: js.UndefOr[Long_] = js.native
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage.
    */
  var MoveToColdStorageAfterDays: js.UndefOr[Long_] = js.native
}

object Lifecycle {
  @scala.inline
  def apply(): Lifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lifecycle]
  }
  @scala.inline
  implicit class LifecycleOps[Self <: Lifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteAfterDays(value: Long_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteAfterDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAfterDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteAfterDays")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveToColdStorageAfterDays(value: Long_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveToColdStorageAfterDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveToColdStorageAfterDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveToColdStorageAfterDays")(js.undefined)
        ret
    }
  }
  
}

