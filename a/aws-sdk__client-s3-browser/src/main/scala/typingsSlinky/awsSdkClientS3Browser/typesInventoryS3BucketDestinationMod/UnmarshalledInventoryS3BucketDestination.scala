package typingsSlinky.awsSdkClientS3Browser.typesInventoryS3BucketDestinationMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.CSV
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ORC
import typingsSlinky.awsSdkClientS3Browser.typesInventoryEncryptionMod.UnmarshalledInventoryEncryption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledInventoryS3BucketDestination extends InventoryS3BucketDestination {
  /**
    * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
    */
  @JSName("Encryption")
  var Encryption_UnmarshalledInventoryS3BucketDestination: js.UndefOr[UnmarshalledInventoryEncryption] = js.native
}

object UnmarshalledInventoryS3BucketDestination {
  @scala.inline
  def apply(Bucket: String, Format: CSV | ORC | String): UnmarshalledInventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInventoryS3BucketDestination]
  }
  @scala.inline
  implicit class UnmarshalledInventoryS3BucketDestinationOps[Self <: UnmarshalledInventoryS3BucketDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryption(value: UnmarshalledInventoryEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
        ret
    }
  }
  
}

