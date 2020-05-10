package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DestinationDescription extends js.Object {
  /**
    * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var BucketARN: typingsSlinky.awsSdk.firehoseMod.BucketARN = js.native
  /**
    * The buffering option. If no value is specified, BufferingHints object default values are used.
    */
  var BufferingHints: typingsSlinky.awsSdk.firehoseMod.BufferingHints = js.native
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED.
    */
  var CompressionFormat: typingsSlinky.awsSdk.firehoseMod.CompressionFormat = js.native
  /**
    * The encryption configuration. If no value is specified, the default is no encryption.
    */
  var EncryptionConfiguration: typingsSlinky.awsSdk.firehoseMod.EncryptionConfiguration = js.native
  /**
    * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see Custom Prefixes for Amazon S3 Objects.
    */
  var ErrorOutputPrefix: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ErrorOutputPrefix] = js.native
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can also specify a custom prefix, as described in Custom Prefixes for Amazon S3 Objects.
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.Prefix] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: typingsSlinky.awsSdk.firehoseMod.RoleARN = js.native
}

object S3DestinationDescription {
  @scala.inline
  def apply(
    BucketARN: BucketARN,
    BufferingHints: BufferingHints,
    CompressionFormat: CompressionFormat,
    EncryptionConfiguration: EncryptionConfiguration,
    RoleARN: RoleARN
  ): S3DestinationDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], BufferingHints = BufferingHints.asInstanceOf[js.Any], CompressionFormat = CompressionFormat.asInstanceOf[js.Any], EncryptionConfiguration = EncryptionConfiguration.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationDescription]
  }
  @scala.inline
  implicit class S3DestinationDescriptionOps[Self <: S3DestinationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketARN(value: BucketARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferingHints(value: BufferingHints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferingHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressionFormat(value: CompressionFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompressionFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionConfiguration(value: EncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLoggingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorOutputPrefix(value: ErrorOutputPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorOutputPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorOutputPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorOutputPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Prefix): Self = {
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

