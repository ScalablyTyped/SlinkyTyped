package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerEncryptionKeyProtectedDisk extends js.Object {
  /** Decrypts data associated with the disk with a customer-supplied encryption key. */
  var diskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.native
  /** Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. */
  var source: js.UndefOr[String] = js.native
}

object CustomerEncryptionKeyProtectedDisk {
  @scala.inline
  def apply(): CustomerEncryptionKeyProtectedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerEncryptionKeyProtectedDisk]
  }
  @scala.inline
  implicit class CustomerEncryptionKeyProtectedDiskOps[Self <: CustomerEncryptionKeyProtectedDisk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskEncryptionKey(value: CustomerEncryptionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskEncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskEncryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

