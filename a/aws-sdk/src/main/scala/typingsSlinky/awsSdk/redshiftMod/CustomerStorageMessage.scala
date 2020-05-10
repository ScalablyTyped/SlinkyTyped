package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerStorageMessage extends js.Object {
  /**
    * The total amount of storage currently used for snapshots.
    */
  var TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.native
  /**
    * The total amount of storage currently provisioned.
    */
  var TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.native
}

object CustomerStorageMessage {
  @scala.inline
  def apply(): CustomerStorageMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerStorageMessage]
  }
  @scala.inline
  implicit class CustomerStorageMessageOps[Self <: CustomerStorageMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalBackupSizeInMegaBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalBackupSizeInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBackupSizeInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalBackupSizeInMegaBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalProvisionedStorageInMegaBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalProvisionedStorageInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalProvisionedStorageInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalProvisionedStorageInMegaBytes")(js.undefined)
        ret
    }
  }
  
}

