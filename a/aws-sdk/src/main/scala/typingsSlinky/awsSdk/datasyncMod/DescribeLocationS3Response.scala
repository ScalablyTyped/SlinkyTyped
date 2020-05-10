package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationS3Response extends js.Object {
  /**
    * The time that the Amazon S3 bucket location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket location.
    */
  var LocationArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationArn] = js.native
  /**
    * The URL of the Amazon S3 location that was described.
    */
  var LocationUri: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationUri] = js.native
  var S3Config: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.S3Config] = js.native
  /**
    * The Amazon S3 storage class that you chose to store your files in when this location is used as a task destination. For more information about S3 storage classes, see Amazon S3 Storage Classes in the Amazon Simple Storage Service Developer Guide. Some storage classes have behaviors that can affect your S3 storage cost. For detailed information, see using-storage-classes.
    */
  var S3StorageClass: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.S3StorageClass] = js.native
}

object DescribeLocationS3Response {
  @scala.inline
  def apply(): DescribeLocationS3Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationS3Response]
  }
  @scala.inline
  implicit class DescribeLocationS3ResponseOps[Self <: DescribeLocationS3Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationArn(value: LocationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationUri(value: LocationUri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationUri")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Config(value: S3Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Config: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Config")(js.undefined)
        ret
    }
    @scala.inline
    def withS3StorageClass(value: S3StorageClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3StorageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3StorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3StorageClass")(js.undefined)
        ret
    }
  }
  
}

