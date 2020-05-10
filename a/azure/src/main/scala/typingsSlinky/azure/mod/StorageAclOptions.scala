package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageAclOptions extends TimeoutIntervalOptions {
  var leaseId: js.UndefOr[String] = js.native
  var signedIdentifiers: js.Array[SignedIdentifier] = js.native
}

object StorageAclOptions {
  @scala.inline
  def apply(signedIdentifiers: js.Array[SignedIdentifier]): StorageAclOptions = {
    val __obj = js.Dynamic.literal(signedIdentifiers = signedIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAclOptions]
  }
  @scala.inline
  implicit class StorageAclOptionsOps[Self <: StorageAclOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignedIdentifiers(value: js.Array[SignedIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeaseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseId")(js.undefined)
        ret
    }
  }
  
}

