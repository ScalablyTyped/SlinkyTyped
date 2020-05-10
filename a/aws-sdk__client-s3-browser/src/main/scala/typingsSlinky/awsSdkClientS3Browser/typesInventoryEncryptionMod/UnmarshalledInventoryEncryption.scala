package typingsSlinky.awsSdkClientS3Browser.typesInventoryEncryptionMod

import typingsSlinky.awsSdkClientS3Browser.typesSsekmsMod.UnmarshalledSSEKMS
import typingsSlinky.awsSdkClientS3Browser.typesSses3Mod.UnmarshalledSSES3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledInventoryEncryption extends InventoryEncryption {
  /**
    * <p>Specifies the use of SSE-KMS to encrypt delievered Inventory reports.</p>
    */
  @JSName("SSEKMS")
  var SSEKMS_UnmarshalledInventoryEncryption: js.UndefOr[UnmarshalledSSEKMS] = js.native
  /**
    * <p>Specifies the use of SSE-S3 to encrypt delievered Inventory reports.</p>
    */
  @JSName("SSES3")
  var SSES3_UnmarshalledInventoryEncryption: js.UndefOr[UnmarshalledSSES3] = js.native
}

object UnmarshalledInventoryEncryption {
  @scala.inline
  def apply(): UnmarshalledInventoryEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledInventoryEncryption]
  }
  @scala.inline
  implicit class UnmarshalledInventoryEncryptionOps[Self <: UnmarshalledInventoryEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSSEKMS(value: UnmarshalledSSEKMS): Self = {
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
    def withSSES3(value: UnmarshalledSSES3): Self = {
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

