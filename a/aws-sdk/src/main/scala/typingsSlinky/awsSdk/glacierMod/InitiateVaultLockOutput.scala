package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateVaultLockOutput extends js.Object {
  /**
    * The lock ID, which is used to complete the vault locking process.
    */
  var lockId: js.UndefOr[String] = js.native
}

object InitiateVaultLockOutput {
  @scala.inline
  def apply(): InitiateVaultLockOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateVaultLockOutput]
  }
  @scala.inline
  implicit class InitiateVaultLockOutputOps[Self <: InitiateVaultLockOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

