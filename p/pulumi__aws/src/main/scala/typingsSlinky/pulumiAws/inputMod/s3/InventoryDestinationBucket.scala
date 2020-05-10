package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDestinationBucket extends js.Object {
  /**
    * The ID of the account that owns the destination bucket. Recommended to be set to prevent problems if the destination bucket ownership changes.
    */
  var accountId: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon S3 bucket ARN of the destination.
    */
  var bucketArn: Input[String] = js.native
  /**
    * Contains the type of server-side encryption to use to encrypt the inventory (documented below).
    */
  var encryption: js.UndefOr[Input[InventoryDestinationBucketEncryption]] = js.native
  /**
    * Specifies the output format of the inventory results. Can be `CSV`, [`ORC`](https://orc.apache.org/) or [`Parquet`](https://parquet.apache.org/).
    */
  var format: Input[String] = js.native
  /**
    * The prefix that is prepended to all inventory results.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
}

object InventoryDestinationBucket {
  @scala.inline
  def apply(bucketArn: Input[String], format: Input[String]): InventoryDestinationBucket = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestinationBucket]
  }
  @scala.inline
  implicit class InventoryDestinationBucketOps[Self <: InventoryDestinationBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: Input[InventoryDestinationBucketEncryption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

