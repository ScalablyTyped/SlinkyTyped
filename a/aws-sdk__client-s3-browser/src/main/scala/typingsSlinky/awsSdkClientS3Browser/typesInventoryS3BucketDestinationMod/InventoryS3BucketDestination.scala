package typingsSlinky.awsSdkClientS3Browser.typesInventoryS3BucketDestinationMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.CSV
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ORC
import typingsSlinky.awsSdkClientS3Browser.typesInventoryEncryptionMod.InventoryEncryption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryS3BucketDestination extends js.Object {
  /**
    * <p>The ID of the account that owns the destination bucket.</p>
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * <p>The Amazon resource name (ARN) of the bucket where inventory results will be published.</p>
    */
  var Bucket: String = js.native
  /**
    * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
    */
  var Encryption: js.UndefOr[InventoryEncryption] = js.native
  /**
    * <p>Specifies the output format of the inventory results.</p>
    */
  var Format: CSV | ORC | String = js.native
  /**
    * <p>The prefix that is prepended to all inventory results.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
}

object InventoryS3BucketDestination {
  @scala.inline
  def apply(Bucket: String, Format: CSV | ORC | String): InventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryS3BucketDestination]
  }
  @scala.inline
  implicit class InventoryS3BucketDestinationOps[Self <: InventoryS3BucketDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: CSV | ORC | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: InventoryEncryption): Self = {
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
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
  }
  
}

