package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDestinationBucketEncryption extends js.Object {
  /**
    * Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
    */
  var sseKms: js.UndefOr[Input[InventoryDestinationBucketEncryptionSseKms]] = js.native
  /**
    * Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
    */
  var sseS3: js.UndefOr[Input[InventoryDestinationBucketEncryptionSseS3]] = js.native
}

object InventoryDestinationBucketEncryption {
  @scala.inline
  def apply(): InventoryDestinationBucketEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDestinationBucketEncryption]
  }
  @scala.inline
  implicit class InventoryDestinationBucketEncryptionOps[Self <: InventoryDestinationBucketEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSseKms(value: Input[InventoryDestinationBucketEncryptionSseKms]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sseKms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSseKms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sseKms")(js.undefined)
        ret
    }
    @scala.inline
    def withSseS3(value: Input[InventoryDestinationBucketEncryptionSseS3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sseS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSseS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sseS3")(js.undefined)
        ret
    }
  }
  
}

