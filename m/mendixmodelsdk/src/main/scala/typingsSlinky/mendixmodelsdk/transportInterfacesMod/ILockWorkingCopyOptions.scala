package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockWorkingCopyOptions extends js.Object {
  /**
    * The duration in seconds after which the lock will expire. Only applicable for lock type "edit".
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Locks the working copy, regardless if it is locked by another user. Only applicable for lock type "edit".
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * The lock ID to use. Only applicable for lock type "edit".
    */
  var lockId: js.UndefOr[String] = js.native
  /**
    * The lock type, which indicates the purpose for which the working copy is locked.
    */
  var lockType: LockType = js.native
}

object ILockWorkingCopyOptions {
  @scala.inline
  def apply(lockType: LockType): ILockWorkingCopyOptions = {
    val __obj = js.Dynamic.literal(lockType = lockType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockWorkingCopyOptions]
  }
  @scala.inline
  implicit class ILockWorkingCopyOptionsOps[Self <: ILockWorkingCopyOptions] (val x: Self) extends AnyVal {
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
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
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

