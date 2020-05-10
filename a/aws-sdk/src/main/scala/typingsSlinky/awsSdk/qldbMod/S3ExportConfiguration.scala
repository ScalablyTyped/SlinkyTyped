package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ExportConfiguration extends js.Object {
  /**
    * The Amazon S3 bucket name in which a journal export job writes the journal contents. The bucket name must comply with the Amazon S3 bucket naming conventions. For more information, see Bucket Restrictions and Limitations in the Amazon S3 Developer Guide.
    */
  var Bucket: S3Bucket = js.native
  /**
    * The encryption settings that are used by a journal export job to write data in an Amazon S3 bucket.
    */
  var EncryptionConfiguration: S3EncryptionConfiguration = js.native
  /**
    * The prefix for the Amazon S3 bucket in which a journal export job writes the journal contents. The prefix must comply with Amazon S3 key naming rules and restrictions. For more information, see Object Key and Metadata in the Amazon S3 Developer Guide. The following are examples of valid Prefix values:    JournalExports-ForMyLedger/Testing/     JournalExports     My:Tests/   
    */
  var Prefix: S3Prefix = js.native
}

object S3ExportConfiguration {
  @scala.inline
  def apply(Bucket: S3Bucket, EncryptionConfiguration: S3EncryptionConfiguration, Prefix: S3Prefix): S3ExportConfiguration = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], EncryptionConfiguration = EncryptionConfiguration.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ExportConfiguration]
  }
  @scala.inline
  implicit class S3ExportConfigurationOps[Self <: S3ExportConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: S3Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionConfiguration(value: S3EncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: S3Prefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

