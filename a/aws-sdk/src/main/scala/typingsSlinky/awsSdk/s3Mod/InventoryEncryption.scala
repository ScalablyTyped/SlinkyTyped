package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryEncryption extends js.Object {
  /**
    * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
    */
  var SSEKMS: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSEKMS] = js.native
  /**
    * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
    */
  var SSES3: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSES3] = js.native
}

object InventoryEncryption {
  @scala.inline
  def apply(): InventoryEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryEncryption]
  }
  @scala.inline
  implicit class InventoryEncryptionOps[Self <: InventoryEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSSEKMS(value: SSEKMS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEKMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEKMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEKMS")(js.undefined)
        ret
    }
    @scala.inline
    def withSSES3(value: SSES3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSES3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSES3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSES3")(js.undefined)
        ret
    }
  }
  
}

